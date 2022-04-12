package com.roleManagement.rolebasedManagement;

import com.roleManagement.rolebasedManagement.entity.Action;
import com.roleManagement.rolebasedManagement.repository.ActionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ActionTest {
    @Autowired
    private ActionRepository actionRepository;

    @Test
    public void testCreateAction(){
        Action action=new Action("Tl","This is Tl action");
        Action action1=actionRepository.save(action);
        assertNotNull(action1);
    }
    @Test
    public void testTestActionAll(){
        List<Action>actions=actionRepository.findAll();
        for (Action action:actions){
            System.out.println(action);
        }

    }

}
