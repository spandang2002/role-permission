package com.roleManagement.rolebasedManagement;

import com.roleManagement.rolebasedManagement.entity.Action;
import com.roleManagement.rolebasedManagement.entity.Resource;
import com.roleManagement.rolebasedManagement.permission.Permission;
import com.roleManagement.rolebasedManagement.permission.PermissionRepository;
import com.roleManagement.rolebasedManagement.pojo.PermissionRequest;
import com.roleManagement.rolebasedManagement.repository.ActionRepository;
import com.roleManagement.rolebasedManagement.repository.ResourceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PermissionTest {
    @Autowired
    PermissionRepository permissionRepository;
    @Autowired
    ActionRepository actionRepository;
    @Autowired
    ResourceRepository resourceRepository;
    @Autowired
    private TestEntityManager entityManager;
    @Test
    public void testaddPermission(){
        Permission permission=new Permission();
        Action action1=entityManager.find(Action.class,8);
        String actionName=action1.getActionName();
        Resource resource1=entityManager.find(Resource.class,11);
        String resourceName=resource1.getResourceName();
        permission.addPermissionName(actionName + " . " + resourceName);



    }
}
