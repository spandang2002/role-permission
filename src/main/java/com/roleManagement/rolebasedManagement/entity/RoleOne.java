package com.roleManagement.rolebasedManagement.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roleOne")
public class RoleOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "roleOneName", nullable = false, length = 50)
    private String roleOneName;
    @ManyToMany(fetch=FetchType.LAZY ,cascade=CascadeType.ALL)
    @JoinTable(name="permissionOne_roleOne",
    joinColumns = {@JoinColumn(name="roleOne_id")},
            inverseJoinColumns = {@JoinColumn(name="permissionOne_id")}
    )
   private Set<PermissionOne>permissionOne=new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public RoleOne(){}

    public RoleOne(String roleOneName ) {
//
        super();
        this.roleOneName = roleOneName;
//        this.permissionOne = permissionOne;
    }

    public String getRoleOneName() {
        return roleOneName;
    }

    public void setRoleOneName(String roleOneName) {
        this.roleOneName = roleOneName;
    }

    public Set<PermissionOne> getPermissionOne() {
        return permissionOne;
    }

    public void setPermissionOne(Set<PermissionOne> permissionOne) {
        this.permissionOne = permissionOne;
    }
}
