package com.roleManagement.rolebasedManagement.controller;


import com.roleManagement.rolebasedManagement.entity.Action;
import com.roleManagement.rolebasedManagement.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActionController {
    @Autowired(required=true)
    ActionService actionService;

// Retriving all action from db using end point like http://localhost:8080/action/actions
    @GetMapping("/actions")
    public List<Action> getAllAction(){

        return actionService.listAllAction();
    }
//  saving action in db using end point like http://localhost:8080/action/save
    @PostMapping("/saveAction")
    public void add(@RequestBody Action action){
        actionService.saveAction(action);
    }
}
