package com.roleManagement.rolebasedManagement.role;
import com.roleManagement.rolebasedManagement.entity.Role;
import com.roleManagement.rolebasedManagement.permission.PermissionRepository;
import com.roleManagement.rolebasedManagement.pojo.RoleRequest;
import com.roleManagement.rolebasedManagement.repository.RoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoleController {
    @Autowired
     RoleService roleService;
     @Autowired
     RoleRepository roleRepository;
     @Autowired
     PermissionRepository permissionRepository;
   Logger logger= LoggerFactory.getLogger(RoleController.class);
     @GetMapping("/roles")
     public List<Role> getAllRole(){
      logger.info("inside all role method : " + roleRepository.count() + " number of role.");
      return roleService.listAllRole();
     }
@PostMapping("/saveRole")
public Role add(@RequestBody RoleRequest roleRequest){
  return roleService.saveRole(roleRequest);
     }
}
