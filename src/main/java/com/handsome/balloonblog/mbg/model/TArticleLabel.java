package com.handsome.balloonblog.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TArticleLabel implements Serializable {
    @ApiModelProperty(value = "博文id")
    private Long articleId;

    @ApiModelProperty(value = "标签id")
    private Long labelId;

    @ApiModelProperty(value = "博文标签创建时间")
    private Date articleLabelGmtCreate;

    @ApiModelProperty(value = "博文标签更新时间")
    private Date articleLabelGmtModified;

    private static final long serialVersionUID = 1L;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getLabelId() {
        return labelId;
    }

    public void setLabelId(Long labelId) {
        this.labelId = labelId;
    }

    public Date getArticleLabelGmtCreate() {
        return articleLabelGmtCreate;
    }

    public void setArticleLabelGmtCreate(Date articleLabelGmtCreate) {
        this.articleLabelGmtCreate = articleLabelGmtCreate;
    }

    public Date getArticleLabelGmtModified() {
        return articleLabelGmtModified;
    }

    public void setArticleLabelGmtModified(Date articleLabelGmtModified) {
        this.articleLabelGmtModified = articleLabelGmtModified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", articleId=").append(articleId);
        sb.append(", labelId=").append(labelId);
        sb.append(", articleLabelGmtCreate=").append(articleLabelGmtCreate);
        sb.append(", articleLabelGmtModified=").append(articleLabelGmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}