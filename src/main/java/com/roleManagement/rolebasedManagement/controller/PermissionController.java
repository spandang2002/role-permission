package com.roleManagement.rolebasedManagement.controller;

import com.roleManagement.rolebasedManagement.permission.Permission;
import com.roleManagement.rolebasedManagement.permission.PermissionRepository;
import com.roleManagement.rolebasedManagement.pojo.PermissionRequest;
import com.roleManagement.rolebasedManagement.service.PermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@ComponentScan
@RestController
public class PermissionController {
    @Autowired
    PermissionService permissionService;
    @Autowired
    PermissionRepository permissionRepository;
    Logger logger= LoggerFactory.getLogger(PermissionController.class);
@GetMapping("/permissions")
public List<Permission> getAllPermission(){
    logger.info("inside all permission method : " + permissionRepository.count() + " number of permission.");
    return permissionService.listAllPermission();
}
    @PostMapping("/savePermission")
    public void add(@RequestBody PermissionRequest permissionRequest){
    try {
        permissionService.savePermission(permissionRequest);
        logger.info("inside save action method");

    }
    catch (Exception e){
        e.printStackTrace();
        logger.error("Error inside save peermission method : " + e.getMessage());
    }
    }
}
