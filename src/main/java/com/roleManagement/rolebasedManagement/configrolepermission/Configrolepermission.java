package com.roleManagement.rolebasedManagement.configrolepermission;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "configrolepermission")
public class Configrolepermission {
    @Id
    @Column(name = "configrolepermission_id", nullable = false)
    private Integer id;

    @Column(name = "configrolepermission_name", nullable = false, length = 50)
    private String configrolepermissionName;

    public String getConfigrolepermissionName() {
        return configrolepermissionName;
    }

    public void setConfigrolepermissionName(String configrolepermissionName) {
        this.configrolepermissionName = configrolepermissionName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}