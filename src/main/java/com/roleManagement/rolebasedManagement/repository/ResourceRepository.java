package com.roleManagement.rolebasedManagement.repository;

import com.roleManagement.rolebasedManagement.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Integer> {
}