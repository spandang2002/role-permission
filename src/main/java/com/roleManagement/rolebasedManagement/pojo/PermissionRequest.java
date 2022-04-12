package com.roleManagement.rolebasedManagement.pojo;

import com.roleManagement.rolebasedManagement.entity.Action;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PermissionRequest {
    public String actionName;
    public String resourceName;
    public void add(Action action){

    }

}
