package com.roleManagement.rolebasedManagement.permission;

import com.roleManagement.rolebasedManagement.action.Action;
import com.roleManagement.rolebasedManagement.resource.Resource;
import com.roleManagement.rolebasedManagement.role.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "permission")
public class Permission {
    @Id
    @Column(name = "\"PERMISSION_ID\"", nullable = false)
    private Integer id;

    @Column(name = "\"PERMISSION_NAME\"", nullable = false, length = 50)
    private String permissionName;

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }

    //    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "action_id", nullable = false)
//    private Action action;
//
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "resource_id", nullable = false)
//    private Resource resource;
//
//    public Resource getResource() {
//        return resource;
//    }
//
//    public void setResource(Resource resource) {
//        this.resource = resource;
//    }
//
//    public Action getAction() {
//        return action;
//    }
//
//    public void setAction(Action action) {
//        this.action = action;
//    }
    @ManyToMany(mappedBy = "permission")

    private Set<Role> role=new HashSet<>();

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void addRole(Role role){
        this.role.add(role);
    }
}