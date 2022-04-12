package com.roleManagement.rolebasedManagement.repository;

import com.roleManagement.rolebasedManagement.entity.RoleOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleOneRepository extends JpaRepository<RoleOne,Integer> {
}
