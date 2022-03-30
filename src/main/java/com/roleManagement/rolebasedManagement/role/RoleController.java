package com.roleManagement.rolebasedManagement.role;

import com.roleManagement.rolebasedManagement.pojo.RoleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
     RoleService roleService;


    @GetMapping("/roles")
    public List<Role> getAllRole(){

        return roleService.listAllRole();
    }
    @PostMapping("/save")
    public Role addRole(@RequestBody RoleRequest roleRequest){
        return roleService.addRoleWithPermission(roleRequest);
    }


}
