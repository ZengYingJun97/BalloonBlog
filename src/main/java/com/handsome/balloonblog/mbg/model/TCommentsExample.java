package com.handsome.balloonblog.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCommentsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_comments
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_comments
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_comments
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comments
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    public TCommentsExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comments
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comments
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comments
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comments
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comments
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comments
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comments
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comments
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comments
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comments
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_comments
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Long value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Long value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Long value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Long value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Long value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Long> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Long> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Long value1, Long value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Long value1, Long value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Long value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Long value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Long value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Long value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Long value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Long> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Long> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Long value1, Long value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Long value1, Long value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andCommentLikeCountIsNull() {
            addCriterion("comment_like_count is null");
            return (Criteria) this;
        }

        public Criteria andCommentLikeCountIsNotNull() {
            addCriterion("comment_like_count is not null");
            return (Criteria) this;
        }

        public Criteria andCommentLikeCountEqualTo(Long value) {
            addCriterion("comment_like_count =", value, "commentLikeCount");
            return (Criteria) this;
        }

        public Criteria andCommentLikeCountNotEqualTo(Long value) {
            addCriterion("comment_like_count <>", value, "commentLikeCount");
            return (Criteria) this;
        }

        public Criteria andCommentLikeCountGreaterThan(Long value) {
            addCriterion("comment_like_count >", value, "commentLikeCount");
            return (Criteria) this;
        }

        public Criteria andCommentLikeCountGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_like_count >=", value, "commentLikeCount");
            return (Criteria) this;
        }

        public Criteria andCommentLikeCountLessThan(Long value) {
            addCriterion("comment_like_count <", value, "commentLikeCount");
            return (Criteria) this;
        }

        public Criteria andCommentLikeCountLessThanOrEqualTo(Long value) {
            addCriterion("comment_like_count <=", value, "commentLikeCount");
            return (Criteria) this;
        }

        public Criteria andCommentLikeCountIn(List<Long> values) {
            addCriterion("comment_like_count in", values, "commentLikeCount");
            return (Criteria) this;
        }

        public Criteria andCommentLikeCountNotIn(List<Long> values) {
            addCriterion("comment_like_count not in", values, "commentLikeCount");
            return (Criteria) this;
        }

        public Criteria andCommentLikeCountBetween(Long value1, Long value2) {
            addCriterion("comment_like_count between", value1, value2, "commentLikeCount");
            return (Criteria) this;
        }

        public Criteria andCommentLikeCountNotBetween(Long value1, Long value2) {
            addCriterion("comment_like_count not between", value1, value2, "commentLikeCount");
            return (Criteria) this;
        }

        public Criteria andParentCommentIdIsNull() {
            addCriterion("parent_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andParentCommentIdIsNotNull() {
            addCriterion("parent_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentCommentIdEqualTo(Long value) {
            addCriterion("parent_comment_id =", value, "parentCommentId");
            return (Criteria) this;
        }

        public Criteria andParentCommentIdNotEqualTo(Long value) {
            addCriterion("parent_comment_id <>", value, "parentCommentId");
            return (Criteria) this;
        }

        public Criteria andParentCommentIdGreaterThan(Long value) {
            addCriterion("parent_comment_id >", value, "parentCommentId");
            return (Criteria) this;
        }

        public Criteria andParentCommentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_comment_id >=", value, "parentCommentId");
            return (Criteria) this;
        }

        public Criteria andParentCommentIdLessThan(Long value) {
            addCriterion("parent_comment_id <", value, "parentCommentId");
            return (Criteria) this;
        }

        public Criteria andParentCommentIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_comment_id <=", value, "parentCommentId");
            return (Criteria) this;
        }

        public Criteria andParentCommentIdIn(List<Long> values) {
            addCriterion("parent_comment_id in", values, "parentCommentId");
            return (Criteria) this;
        }

        public Criteria andParentCommentIdNotIn(List<Long> values) {
            addCriterion("parent_comment_id not in", values, "parentCommentId");
            return (Criteria) this;
        }

        public Criteria andParentCommentIdBetween(Long value1, Long value2) {
            addCriterion("parent_comment_id between", value1, value2, "parentCommentId");
            return (Criteria) this;
        }

        public Criteria andParentCommentIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_comment_id not between", value1, value2, "parentCommentId");
            return (Criteria) this;
        }

        public Criteria andCommentGmtCreateIsNull() {
            addCriterion("comment_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andCommentGmtCreateIsNotNull() {
            addCriterion("comment_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andCommentGmtCreateEqualTo(Date value) {
            addCriterion("comment_gmt_create =", value, "commentGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCommentGmtCreateNotEqualTo(Date value) {
            addCriterion("comment_gmt_create <>", value, "commentGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCommentGmtCreateGreaterThan(Date value) {
            addCriterion("comment_gmt_create >", value, "commentGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCommentGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_gmt_create >=", value, "commentGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCommentGmtCreateLessThan(Date value) {
            addCriterion("comment_gmt_create <", value, "commentGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCommentGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("comment_gmt_create <=", value, "commentGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCommentGmtCreateIn(List<Date> values) {
            addCriterion("comment_gmt_create in", values, "commentGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCommentGmtCreateNotIn(List<Date> values) {
            addCriterion("comment_gmt_create not in", values, "commentGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCommentGmtCreateBetween(Date value1, Date value2) {
            addCriterion("comment_gmt_create between", value1, value2, "commentGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCommentGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("comment_gmt_create not between", value1, value2, "commentGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCommentGmtModifiedIsNull() {
            addCriterion("comment_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andCommentGmtModifiedIsNotNull() {
            addCriterion("comment_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andCommentGmtModifiedEqualTo(Date value) {
            addCriterion("comment_gmt_modified =", value, "commentGmtModified");
            return (Criteria) this;
        }

        public Criteria andCommentGmtModifiedNotEqualTo(Date value) {
            addCriterion("comment_gmt_modified <>", value, "commentGmtModified");
            return (Criteria) this;
        }

        public Criteria andCommentGmtModifiedGreaterThan(Date value) {
            addCriterion("comment_gmt_modified >", value, "commentGmtModified");
            return (Criteria) this;
        }

        public Criteria andCommentGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_gmt_modified >=", value, "commentGmtModified");
            return (Criteria) this;
        }

        public Criteria andCommentGmtModifiedLessThan(Date value) {
            addCriterion("comment_gmt_modified <", value, "commentGmtModified");
            return (Criteria) this;
        }

        public Criteria andCommentGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("comment_gmt_modified <=", value, "commentGmtModified");
            return (Criteria) this;
        }

        public Criteria andCommentGmtModifiedIn(List<Date> values) {
            addCriterion("comment_gmt_modified in", values, "commentGmtModified");
            return (Criteria) this;
        }

        public Criteria andCommentGmtModifiedNotIn(List<Date> values) {
            addCriterion("comment_gmt_modified not in", values, "commentGmtModified");
            return (Criteria) this;
        }

        public Criteria andCommentGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("comment_gmt_modified between", value1, value2, "commentGmtModified");
            return (Criteria) this;
        }

        public Criteria andCommentGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("comment_gmt_modified not between", value1, value2, "commentGmtModified");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_comments
     *
     * @mbg.generated do_not_delete_during_merge Wed Aug 05 19:30:20 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_comments
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}