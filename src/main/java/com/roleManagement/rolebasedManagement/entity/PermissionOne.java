package com.roleManagement.rolebasedManagement.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "permissionOne")
public class PermissionOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "permissionName", nullable = false, length = 50)
    private String permissionName;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "permissionOne")
    private Set<RoleOne> roleOnes=new HashSet<>();

    public PermissionOne(){}
    public PermissionOne(String permissionName) {
        this.permissionName = permissionName;
    }

    public Integer getId() {
        return id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public Set<RoleOne> getRoleOnes() {
        return roleOnes;
    }
}
