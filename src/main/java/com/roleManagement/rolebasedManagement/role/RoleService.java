package com.roleManagement.rolebasedManagement.role;

import com.roleManagement.rolebasedManagement.permission.Permission;
import com.roleManagement.rolebasedManagement.permission.PermissionRepository;
import com.roleManagement.rolebasedManagement.pojo.RoleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
 class RoleService {
    @Autowired
     RoleRepository roleRepository;
    @Autowired
    PermissionRepository permissionRepository;
//Creating a constructor non parametarised constructor
    public RoleService(){}
    public Role addRoleWithPermission(RoleRequest roleRequest){
        Role role=new Role();
        role.setId(roleRequest.id);
        role.setRoleName(roleRequest.roleName);
//        setPermission doesnot have the initialization so wehave to do this explicitily
        role.setPermission(roleRequest.permission
                .stream().map(
                        permission -> {
                            Permission permission1=permission;
                            if(permission1.getId()>0){
                                permissionRepository.findAllById(permission1.getId());
                            }
                            permission1.addRole(role);
                            return permission1;
                        }
                )
                .collect(Collectors.toSet())
        );
        return roleRepository.save(role);
    }
    public List<Role> listAllRole() {
        return roleRepository.findAll();
    }




}
