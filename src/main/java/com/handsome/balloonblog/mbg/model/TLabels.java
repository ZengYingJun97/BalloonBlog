package com.handsome.balloonblog.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TLabels implements Serializable {
    @ApiModelProperty(value = "标签id")
    private Long labelId;

    @ApiModelProperty(value = "标签名称")
    private String labelName;

    @ApiModelProperty(value = "标签创建时间")
    private Date labelGmtCreate;

    @ApiModelProperty(value = "标签更新时间")
    private Date labelGmtModified;

    @ApiModelProperty(value = "标签描述")
    private String labelDescription;

    private static final long serialVersionUID = 1L;

    public Long getLabelId() {
        return labelId;
    }

    public void setLabelId(Long labelId) {
        this.labelId = labelId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public Date getLabelGmtCreate() {
        return labelGmtCreate;
    }

    public void setLabelGmtCreate(Date labelGmtCreate) {
        this.labelGmtCreate = labelGmtCreate;
    }

    public Date getLabelGmtModified() {
        return labelGmtModified;
    }

    public void setLabelGmtModified(Date labelGmtModified) {
        this.labelGmtModified = labelGmtModified;
    }

    public String getLabelDescription() {
        return labelDescription;
    }

    public void setLabelDescription(String labelDescription) {
        this.labelDescription = labelDescription;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", labelId=").append(labelId);
        sb.append(", labelName=").append(labelName);
        sb.append(", labelGmtCreate=").append(labelGmtCreate);
        sb.append(", labelGmtModified=").append(labelGmtModified);
        sb.append(", labelDescription=").append(labelDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}