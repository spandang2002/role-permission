package com.roleManagement.rolebasedManagement.pojo;

import com.roleManagement.rolebasedManagement.permission.Permission;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleRequest {
    public String roleName;
    public Set<String> permission;

}
