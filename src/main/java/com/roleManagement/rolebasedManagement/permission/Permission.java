package com.roleManagement.rolebasedManagement.permission;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.roleManagement.rolebasedManagement.entity.Role;
import com.roleManagement.rolebasedManagement.entity.Action;
import com.roleManagement.rolebasedManagement.entity.Resource;
import com.roleManagement.rolebasedManagement.entity.Role;
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
    @Column(name = "permission_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "permission_name", nullable = false, length = 50)
    private String permissionName;


//    public Set<Permission> getRole() {
//        return role;
//    }
//
//    public void setRole(Set<Permission> role) {
//        this.role = role;
//    }
    @JsonIgnore
//    @ManyToMany(fetch = FetchType.LAZY,cascade = {
//            CascadeType.PERSIST,
//            CascadeType.MERGE
//    },mappedBy = "permission")
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="configrolepermission",
            joinColumns = @JoinColumn(name="permission_id"),
            inverseJoinColumns = @JoinColumn(name="role_id")
    )
    private Set<Role> roles=new HashSet<Role>();
    @ManyToOne
    @JoinColumn(name = "action_id")
    private Action action;
    @ManyToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;




    public void addPermission(Role role) {
        this.roles.add(role);
    }

//    public Permission addPermissionName(Action action,Resource resource) {
//       return this.action.add(action);
//       return this.resource.add(resource);
//    }

    public void addPermissionName(String s) {
    }
//    public void add(Action action) {
//         this.add(action);
//
//    }
//    public void add(Resource resource) {
//         this.add(resource);
//    }

//    public void add(Action action,Resource resource) {
//        this.action.add(action);
//        this.resource.add(resource);
//    }

//    public void add(Resource resource) {
//        this.resource.add(resource);
//    }

//    public void add(Action action) {
//        this.action.add(action);
//    }

//    public void addAction(PermissionRequest action) {
//        this.action.add(action);
//    }
//    public void addResource(PermissionRequest resource) {
//        this.resource.add(resource);
//    }

//    public void add(Action action,Resource resource) {
//        this.add(action + " . " + resource);
//    }


//    public void getRole() {
//    }

//    public String getPermissionName() {
//        return permissionName;
//    }
//
//    public void setPermissionName(String permissionName) {
//        this.permissionName = permissionName;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public void add(Permission permission) {
//        role.add(permission);
//    }
}