package com.handsome.balloonblog.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TPermission implements Serializable {
    @ApiModelProperty(value = "权限id")
    private Long permissionId;

    @ApiModelProperty(value = "权限描述")
    private String description;

    @ApiModelProperty(value = "权限资源")
    private String uri;

    @ApiModelProperty(value = "权限创建时间")
    private Date permissionGmtCreate;

    @ApiModelProperty(value = "权限更新时间")
    private Date permissionGmtModified;

    private static final long serialVersionUID = 1L;

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Date getPermissionGmtCreate() {
        return permissionGmtCreate;
    }

    public void setPermissionGmtCreate(Date permissionGmtCreate) {
        this.permissionGmtCreate = permissionGmtCreate;
    }

    public Date getPermissionGmtModified() {
        return permissionGmtModified;
    }

    public void setPermissionGmtModified(Date permissionGmtModified) {
        this.permissionGmtModified = permissionGmtModified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", permissionId=").append(permissionId);
        sb.append(", description=").append(description);
        sb.append(", uri=").append(uri);
        sb.append(", permissionGmtCreate=").append(permissionGmtCreate);
        sb.append(", permissionGmtModified=").append(permissionGmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}