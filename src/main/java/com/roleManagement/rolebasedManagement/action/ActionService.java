package com.roleManagement.rolebasedManagement.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionService {
    @
            Autowired
    private ActionRepository actionRepository;

    public List<Action> listAllAction() {
        return actionRepository.findAll();
    }

    public void saveAction(Action action) {
        actionRepository.save(action);
    }
}
