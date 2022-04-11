package com.roleManagement.rolebasedManagement.repository;

import com.roleManagement.rolebasedManagement.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ResourceRepository extends JpaRepository<Resource, Integer> {

    public Resource findByResourceName(String resourceName);
}