package com.roleManagement.rolebasedManagement.controller;

import com.roleManagement.rolebasedManagement.entity.Resource;
import com.roleManagement.rolebasedManagement.service.ResourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResourceController {
    @Autowired
    private ResourceService resourceService;
    Logger logger=  LoggerFactory.getLogger(ActionController.class);
    @GetMapping("/resources")
    public List<Resource> getAllResource(){
        logger.info("Getting all the Action list");
        return resourceService.listAllResource();
    }

    @PostMapping("/saveResource")
    public void add(@RequestBody Resource resource){
        try {
            resourceService.saveResource(resource);
            logger.info("inside save resource method");
        }
        catch (Exception e){
            e.printStackTrace();
            logger.error("Error inside save resource method : " + e.getMessage());
        }
    }

}
