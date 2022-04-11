package com.roleManagement.rolebasedManagement.entity;

import com.roleManagement.rolebasedManagement.pojo.PermissionRequest;
import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "resource")
public class Resource {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resource resource = (Resource) o;
        return Objects.equals(id, resource.id) && Objects.equals(resourceName, resource.resourceName) && Objects.equals(resourceDesc, resource.resourceDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resourceName, resourceDesc);
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", resourceName='" + resourceName + '\'' +
                ", resourceDesc='" + resourceDesc + '\'' +
                '}';
    }

    @Id
    @Column(name = "resource_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "resource_name", nullable = false, length = 50)
    private String resourceName;

    public Resource(String resourceName, String resourceDesc) {
        this.resourceName = resourceName;
        this.resourceDesc = resourceDesc;
    }

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


    public void add(Resource resource) {
         this.add(resource);
    }
}