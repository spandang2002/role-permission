package com.roleManagement.rolebasedManagement.service;
import com.roleManagement.rolebasedManagement.entity.Action;
import com.roleManagement.rolebasedManagement.entity.Resource;
import com.roleManagement.rolebasedManagement.permission.Permission;
import com.roleManagement.rolebasedManagement.permission.PermissionRepository;
import com.roleManagement.rolebasedManagement.pojo.PermissionRequest;
import com.roleManagement.rolebasedManagement.repository.ActionRepository;
import com.roleManagement.rolebasedManagement.repository.ResourceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
@ComponentScan
@Service

public class PermissionService {
    @Autowired
    PermissionRepository permissionRepository;
@Autowired
    ActionRepository actionRepository;
@Autowired
ResourceRepository resourceRepository;
    Logger logger=  LoggerFactory.getLogger(PermissionService.class);
    public List<Permission> listAllPermission() {
       logger.info("Inside get all permission service");

        return permissionRepository.findAll();

    }

    public void savePermission(PermissionRequest permissionRequest) {
        Permission permission=new Permission();
        try{
            String actionName=permissionRequest.getActionName();
            String resourceName=permissionRequest.getResourceName();
            Action action = actionRepository.findByActionName(actionName);
            Resource resource = resourceRepository.findByResourceName(resourceName);
            permission.setAction(action);
            permission.setResource(resource);
            permission.setPermissionName(resourceName + "." + actionName);
            permissionRepository.save(permission);
            logger.info("Inside save permission method in permission service");
        }
        catch (Exception e){
            e.printStackTrace();
            logger.error("error inside save permission service " + e.getMessage());
        }
    }

}
