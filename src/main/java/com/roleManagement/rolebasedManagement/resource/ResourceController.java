package com.roleManagement.rolebasedManagement.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/resource")
public class ResourceController {
    @Autowired
    private ResourceService resourceService;
    @GetMapping("/resources")
    public List<Resource> getAllResource(){

        return resourceService.listAllResource();
    }

    @PostMapping("/save")
    public void add(@RequestBody Resource resource){

        resourceService.saveResource(resource);
    }

}
