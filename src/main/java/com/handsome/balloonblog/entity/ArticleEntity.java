package com.handsome.balloonblog.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @program: balloonblog
 * @description:
 * @author: handsome
 * @create: 2020-08-03 00:25
 **/
@Entity
@Table(name = "t_articles")
public class ArticleEntity implements Serializable {

    private static final long serialVersionUID = -8199888321148861590L;

    @Id
    @Column(name = "article_id")
    private String articleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Basic
    @Column(name = "article_title")
    private String articleTitle;

    @Basic
    @Column(name = "article_content")
    private String articleContent;

    @Basic
    @Column(name = "article_views")
    private Long articleViews;

    @Basic
    @Column(name = "article_comment_count")
    private Long articleCommentCount;

    @Basic
    @Column(name = "article_like_count")
    private Long articleLikeCount;

    @Basic
    @Column(name = "article_gmt_create")
    private Long articleGmtCreate;

    @Basic
    @Column(name = "article_gmt_modified")
    private Long articleGmtModified;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
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

    public Long getArticleGmtCreate() {
        return articleGmtCreate;
    }

    public void setArticleGmtCreate(Long articleGmtCreate) {
        this.articleGmtCreate = articleGmtCreate;
    }

    public Long getArticleGmtModified() {
        return articleGmtModified;
    }

    public void setArticleGmtModified(Long articleGmtModified) {
        this.articleGmtModified = articleGmtModified;
    }
}
