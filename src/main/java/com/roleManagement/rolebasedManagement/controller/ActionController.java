package com.roleManagement.rolebasedManagement.controller;


import com.roleManagement.rolebasedManagement.entity.Action;
import com.roleManagement.rolebasedManagement.repository.ActionRepository;
import com.roleManagement.rolebasedManagement.service.ActionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActionController {
   Logger logger=  LoggerFactory.getLogger(ActionController.class);
    @Autowired(required=true)
    ActionService actionService;
    @Autowired
    ActionRepository actionRepository;


    @GetMapping("/actions")
    public List<Action> getAllAction(){
        logger.info("Getting all the Action list");
        return actionService.listAllAction();
    }

    @PostMapping("/saveAction")
    public String add(@RequestBody Action action){
        try {
            logger.info("Inside save action method");
            actionService.saveAction(action);
        }
        catch (Exception e){
            e.printStackTrace();
            logger.error("Error inside save resource method : " + e.getMessage());
        }
        return action.getActionName();
    }
}
