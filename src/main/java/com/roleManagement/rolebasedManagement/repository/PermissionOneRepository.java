package com.roleManagement.rolebasedManagement.repository;

import com.roleManagement.rolebasedManagement.entity.PermissionOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionOneRepository extends JpaRepository<PermissionOne,Integer> {

}
