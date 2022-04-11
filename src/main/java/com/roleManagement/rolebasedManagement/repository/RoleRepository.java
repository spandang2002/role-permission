package com.roleManagement.rolebasedManagement.role;

import com.roleManagement.rolebasedManagement.permission.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    List<Role> findRolesByPermissionId(Long permissionId);
    public Role findById(int Id);
//    Set<Permission> findByPermissionName(Set<Permission> permissions);


}