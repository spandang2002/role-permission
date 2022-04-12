package com.roleManagement.rolebasedManagement.permission;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@ComponentScan
@Repository
public interface PermissionRepository extends JpaRepository<Permission, Integer> {
    Permission findByPermissionName(String permissionName);
}