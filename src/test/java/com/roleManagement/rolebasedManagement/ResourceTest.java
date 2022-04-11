package com.roleManagement.rolebasedManagement;

import com.roleManagement.rolebasedManagement.entity.Resource;
import com.roleManagement.rolebasedManagement.repository.ResourceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ResourceTest {
    @Autowired
    ResourceRepository resourceRepository;
    @Test
    public void testCreateResource(){
        Resource resource=new Resource("prod","This is prod resource");
        Resource resource1 =resourceRepository.save(resource);
        System.out.println(resource1);
        assertNotNull(resource1);
    }

}
