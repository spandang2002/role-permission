package com.roleManagement.rolebasedManagement.repository;

import com.roleManagement.rolebasedManagement.entity.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepository extends JpaRepository<Action, Integer> {
    public Action findByActionName(String actionName);
}