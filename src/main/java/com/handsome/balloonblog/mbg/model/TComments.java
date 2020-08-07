package com.handsome.balloonblog.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TComments implements Serializable {
    @ApiModelProperty(value = "评论id")
    private Long commentId;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "博文id")
    private Long articleId;

    @ApiModelProperty(value = "点赞数")
    private Long commentLikeCount;

    @ApiModelProperty(value = "父评论id")
    private Long parentCommentId;

    @ApiModelProperty(value = "评论创建时间")
    private Date commentGmtCreate;

    @ApiModelProperty(value = "评论更新时间")
    private Date commentGmtModified;

    @ApiModelProperty(value = "评论内容")
    private String commentContent;

    private static final long serialVersionUID = 1L;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getCommentLikeCount() {
        return commentLikeCount;
    }

    public void setCommentLikeCount(Long commentLikeCount) {
        this.commentLikeCount = commentLikeCount;
    }

    public Long getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(Long parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public Date getCommentGmtCreate() {
        return commentGmtCreate;
    }

    public void setCommentGmtCreate(Date commentGmtCreate) {
        this.commentGmtCreate = commentGmtCreate;
    }

    public Date getCommentGmtModified() {
        return commentGmtModified;
    }

    public void setCommentGmtModified(Date commentGmtModified) {
        this.commentGmtModified = commentGmtModified;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commentId=").append(commentId);
        sb.append(", userId=").append(userId);
        sb.append(", articleId=").append(articleId);
        sb.append(", commentLikeCount=").append(commentLikeCount);
        sb.append(", parentCommentId=").append(parentCommentId);
        sb.append(", commentGmtCreate=").append(commentGmtCreate);
        sb.append(", commentGmtModified=").append(commentGmtModified);
        sb.append(", commentContent=").append(commentContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}