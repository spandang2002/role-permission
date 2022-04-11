package com.roleManagement.rolebasedManagement;

import com.roleManagement.rolebasedManagement.permission.Permission;
import com.roleManagement.rolebasedManagement.permission.PermissionRepository;
import com.roleManagement.rolebasedManagement.entity.Role;
import com.roleManagement.rolebasedManagement.repository.RoleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;



@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class RoleTest {
    @Autowired
    PermissionRepository permissionRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    private TestEntityManager entityManager;
    @Test
    public void testCreateNewRole(){
        Permission permission1=entityManager.find(Permission.class,33);
        Permission permission2=entityManager.find(Permission.class,34);
//        Permission permission2=entityManager.find(Permission.class,3);
        Role role=new Role("EndUser");
        role.addPermission(permission1);
        role.addPermission(permission2);
        System.out.println(roleRepository.save(role));

    }
}
