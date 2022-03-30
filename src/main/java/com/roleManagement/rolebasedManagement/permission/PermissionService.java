package com.roleManagement.rolebasedManagement.permission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionService {
    @Autowired
    private PermissionRepository permissionRepository;

    public List<Permission> listAllPermission(){

        return permissionRepository.findAll();
    }
}
