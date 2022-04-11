package com.roleManagement.rolebasedManagement.repository;

import com.roleManagement.rolebasedManagement.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    List<Role> findRolesByPermissionId(Long permissionId);
    public Role findById(int Id);
//    Set<Permission> findByPermissionName(Set<Permission> permissions);


}