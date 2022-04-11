package com.roleManagement.rolebasedManagement.service;

import com.roleManagement.rolebasedManagement.entity.Action;
import com.roleManagement.rolebasedManagement.repository.ActionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActionService {
    @Autowired
    private ActionRepository actionRepository;
    Logger logger=  LoggerFactory.getLogger(ActionService.class);
    public  List<Action> listAllAction() {
        if (actionRepository.count()>0){
            logger.info("This action table has total : " + actionRepository.count() + " actions");
        }
        return actionRepository.findAll();
    }

    public String saveAction(Action action) {
        if(action==null || action.getActionName()==null){
            logger.info("Action is creating");
            actionRepository.save(action);
        }
        else
            logger.error("Action is already in db");
            return "Action is already in db";
    }
}
