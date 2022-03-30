package com.roleManagement.rolebasedManagement.pojo;

import com.roleManagement.rolebasedManagement.permission.Permission;

import java.util.Set;

public class RoleRequest {
    public int id;
    public String roleName;
    public Set<Permission> permission;
}
