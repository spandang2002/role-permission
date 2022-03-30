package com.roleManagement.rolebasedManagement.permission;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Integer> {
    public Permission findById(int id);

    void findAllById(Integer id);
}