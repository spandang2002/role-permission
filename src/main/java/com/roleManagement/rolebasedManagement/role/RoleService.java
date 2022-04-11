package com.roleManagement.rolebasedManagement.role;
import com.roleManagement.rolebasedManagement.entity.Role;
import com.roleManagement.rolebasedManagement.permission.Permission;
import com.roleManagement.rolebasedManagement.permission.PermissionRepository;
import com.roleManagement.rolebasedManagement.pojo.RoleRequest;
import com.roleManagement.rolebasedManagement.repository.RoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
@Service
 class RoleService {
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    PermissionRepository permissionRepository;
    Logger logger= LoggerFactory.getLogger(RoleService.class);
    public List<Role> listAllRole() {
        logger.info("Getting all all role : " + roleRepository.count());
        return roleRepository.findAll();
    }
    public Role saveRole(RoleRequest roleRequest) {
        Role role = new Role();
            role.setRoleName(roleRequest.getRoleName());
            Set<Permission> permissions = roleRequest.getPermission()
                    .stream().map(permissionName -> {
                                Permission permission = permissionRepository.findByPermissionName(permissionName);
                                return permission;
                            }
                    )
                    .collect(Collectors.toSet());
            role.setPermission(permissions);
            return roleRepository.save(role);
    }
}
