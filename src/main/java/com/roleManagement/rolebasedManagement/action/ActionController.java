package com.roleManagement.rolebasedManagement.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/action")
public class ActionController {
    @Autowired
    private ActionService actionService;

// Retriving all action from db using end point like http://localhost:8080/action/actions
    @GetMapping("/actions")
    public List<Action> getAllAction(){

        return actionService.listAllAction();
    }
////  Retriving single action from db using end point like http://localhost:8080/actions/{action_id}
//    @GetMapping("/actions/{action_id}")
//    public ResponseEntity<Action> singleAction(@PathVariable Integer action_id){
//        try{
//            Action action=actionService.getSingleAction(action_id);
//            return new ResponseEntity<Action>(action , HttpStatus.OK);
//        }
//        catch (NoSuchElementException e){
//            return new ResponseEntity<Action>(HttpStatus.NOT_FOUND);
//        }
//    }
//  saving action in db using end point like http://localhost:8080/action/save
    @PostMapping("/save")
    public void add(@RequestBody Action action){
        actionService.saveAction(action);
    }
////    updating action using end point like http://localhost:8080/action/actions/{3}
//    @PutMapping("/actions/{action_id}")
//    public ResponseEntity<?> updateAction(@RequestBody Action action , @PathVariable Integer action_id){
//        try{
//            Action exitAction=actionService.getSingleAction(action_id);
//            actionService.saveAction(action);
//            return new ResponseEntity<>(HttpStatus.OK);
//        }
//        catch (NoSuchElementException e){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//
//        }
//    }
////    delete single action using end point http://localhost:8080/action/actions/{2}.
//    @DeleteMapping("/actions/action_id")
//    public void delete(@PathVariable Integer action_id){
//        actionService.deleteAction(action_id);
//
//    }
}
