package com.roleManagement.rolebasedManagement.action;

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
@Table(name = "action")
public class Action {
    @Id
    @Column(name = "action_id", nullable = false)
    private Integer id;

    @Column(name = "action_name", nullable = false, length = 50)
    private String actionName;

    @Column(name = "action_desc", nullable = false, length = 50)
    private String actionDesc;

    public String getActionDesc() {
        return actionDesc;
    }

    public void setActionDesc(String actionDesc) {
        this.actionDesc = actionDesc;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}