package com.handsome.balloonblog.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TArticles implements Serializable {
    @ApiModelProperty(value = "博文id")
    private Long articleId;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "浏览量")
    private Long articleViews;

    @ApiModelProperty(value = "评论总数")
    private Long articleCommentCount;

    @ApiModelProperty(value = "点赞数")
    private Long articleLikeCount;

    @ApiModelProperty(value = "博文创建时间")
    private Date articleGmtCreate;

    @ApiModelProperty(value = "博文更新时间")
    private Date articleGmtModified;

    @ApiModelProperty(value = "博文标题")
    private String articleTitle;

    @ApiModelProperty(value = "博文内容")
    private String articleContent;

    private static final long serialVersionUID = 1L;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getArticleViews() {
        return articleViews;
    }

    public void setArticleViews(Long articleViews) {
        this.articleViews = articleViews;
    }

    public Long getArticleCommentCount() {
        return articleCommentCount;
    }

    public void setArticleCommentCount(Long articleCommentCount) {
        this.articleCommentCount = articleCommentCount;
    }

    public Long getArticleLikeCount() {
        return articleLikeCount;
    }

    public void setArticleLikeCount(Long articleLikeCount) {
        this.articleLikeCount = articleLikeCount;
    }

    public Date getArticleGmtCreate() {
        return articleGmtCreate;
    }

    public void setArticleGmtCreate(Date articleGmtCreate) {
        this.articleGmtCreate = articleGmtCreate;
    }

    public Date getArticleGmtModified() {
        return articleGmtModified;
    }

    public void setArticleGmtModified(Date articleGmtModified) {
        this.articleGmtModified = articleGmtModified;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", articleId=").append(articleId);
        sb.append(", userId=").append(userId);
        sb.append(", articleViews=").append(articleViews);
        sb.append(", articleCommentCount=").append(articleCommentCount);
        sb.append(", articleLikeCount=").append(articleLikeCount);
        sb.append(", articleGmtCreate=").append(articleGmtCreate);
        sb.append(", articleGmtModified=").append(articleGmtModified);
        sb.append(", articleTitle=").append(articleTitle);
        sb.append(", articleContent=").append(articleContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}