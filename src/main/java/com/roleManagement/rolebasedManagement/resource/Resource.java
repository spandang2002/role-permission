package com.roleManagement.rolebasedManagement.resource;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "resource")
public class Resource {
    @Id
    @Column(name = "resource_id", nullable = false)
    private Integer id;

    @Column(name = "resource_name", nullable = false, length = 50)
    private String resourceName;

    @Column(name = "resource_desc", nullable = false, length = 50)
    private String resourceDesc;

    public String getResourceDesc() {
        return resourceDesc;
    }

    public void setResourceDesc(String resourceDesc) {
        this.resourceDesc = resourceDesc;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}