package com.handsome.balloonblog.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TRole implements Serializable {
    @ApiModelProperty(value = "后台角色id")
    private Long roleId;

    @ApiModelProperty(value = "后台角色名称")
    private String name;

    @ApiModelProperty(value = "后台角色描述")
    private String description;

    @ApiModelProperty(value = "后台角色创建时间")
    private Date roleGmtCreate;

    @ApiModelProperty(value = "后台角色更新时间")
    private Date roleGmtModified;

    private static final long serialVersionUID = 1L;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRoleGmtCreate() {
        return roleGmtCreate;
    }

    public void setRoleGmtCreate(Date roleGmtCreate) {
        this.roleGmtCreate = roleGmtCreate;
    }

    public Date getRoleGmtModified() {
        return roleGmtModified;
    }

    public void setRoleGmtModified(Date roleGmtModified) {
        this.roleGmtModified = roleGmtModified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", roleGmtCreate=").append(roleGmtCreate);
        sb.append(", roleGmtModified=").append(roleGmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}