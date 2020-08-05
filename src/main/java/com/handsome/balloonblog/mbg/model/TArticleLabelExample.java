package com.handsome.balloonblog.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TArticleLabelExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_article_label
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_article_label
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_article_label
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_article_label
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    public TArticleLabelExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_article_label
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_article_label
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_article_label
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_article_label
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_article_label
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_article_label
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_article_label
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
     * This method corresponds to the database table t_article_label
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
     * This method corresponds to the database table t_article_label
     *
     * @mbg.generated Wed Aug 05 19:30:20 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_article_label
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
     * This class corresponds to the database table t_article_label
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

        public Criteria andLabelIdIsNull() {
            addCriterion("label_id is null");
            return (Criteria) this;
        }

        public Criteria andLabelIdIsNotNull() {
            addCriterion("label_id is not null");
            return (Criteria) this;
        }

        public Criteria andLabelIdEqualTo(Long value) {
            addCriterion("label_id =", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotEqualTo(Long value) {
            addCriterion("label_id <>", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdGreaterThan(Long value) {
            addCriterion("label_id >", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("label_id >=", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLessThan(Long value) {
            addCriterion("label_id <", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLessThanOrEqualTo(Long value) {
            addCriterion("label_id <=", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdIn(List<Long> values) {
            addCriterion("label_id in", values, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotIn(List<Long> values) {
            addCriterion("label_id not in", values, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdBetween(Long value1, Long value2) {
            addCriterion("label_id between", value1, value2, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotBetween(Long value1, Long value2) {
            addCriterion("label_id not between", value1, value2, "labelId");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtCreateIsNull() {
            addCriterion("article_label_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtCreateIsNotNull() {
            addCriterion("article_label_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtCreateEqualTo(Date value) {
            addCriterion("article_label_gmt_create =", value, "articleLabelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtCreateNotEqualTo(Date value) {
            addCriterion("article_label_gmt_create <>", value, "articleLabelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtCreateGreaterThan(Date value) {
            addCriterion("article_label_gmt_create >", value, "articleLabelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("article_label_gmt_create >=", value, "articleLabelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtCreateLessThan(Date value) {
            addCriterion("article_label_gmt_create <", value, "articleLabelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("article_label_gmt_create <=", value, "articleLabelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtCreateIn(List<Date> values) {
            addCriterion("article_label_gmt_create in", values, "articleLabelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtCreateNotIn(List<Date> values) {
            addCriterion("article_label_gmt_create not in", values, "articleLabelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtCreateBetween(Date value1, Date value2) {
            addCriterion("article_label_gmt_create between", value1, value2, "articleLabelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("article_label_gmt_create not between", value1, value2, "articleLabelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtModifiedIsNull() {
            addCriterion("article_label_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtModifiedIsNotNull() {
            addCriterion("article_label_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtModifiedEqualTo(Date value) {
            addCriterion("article_label_gmt_modified =", value, "articleLabelGmtModified");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtModifiedNotEqualTo(Date value) {
            addCriterion("article_label_gmt_modified <>", value, "articleLabelGmtModified");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtModifiedGreaterThan(Date value) {
            addCriterion("article_label_gmt_modified >", value, "articleLabelGmtModified");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("article_label_gmt_modified >=", value, "articleLabelGmtModified");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtModifiedLessThan(Date value) {
            addCriterion("article_label_gmt_modified <", value, "articleLabelGmtModified");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("article_label_gmt_modified <=", value, "articleLabelGmtModified");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtModifiedIn(List<Date> values) {
            addCriterion("article_label_gmt_modified in", values, "articleLabelGmtModified");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtModifiedNotIn(List<Date> values) {
            addCriterion("article_label_gmt_modified not in", values, "articleLabelGmtModified");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("article_label_gmt_modified between", value1, value2, "articleLabelGmtModified");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("article_label_gmt_modified not between", value1, value2, "articleLabelGmtModified");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_article_label
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
     * This class corresponds to the database table t_article_label
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