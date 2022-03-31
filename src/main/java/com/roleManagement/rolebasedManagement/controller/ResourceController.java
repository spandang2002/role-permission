package com.roleManagement.rolebasedManagement.controller;

import com.roleManagement.rolebasedManagement.entity.Resource;
import com.roleManagement.rolebasedManagement.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResourceController {
    @Autowired
    private ResourceService resourceService;
    @GetMapping("/resources")
    public List<Resource> getAllResource(){

        return resourceService.listAllResource();
    }

    @PostMapping("/saveResource")
    public void add(@RequestBody Resource resource){

        resourceService.saveResource(resource);
    }

}
