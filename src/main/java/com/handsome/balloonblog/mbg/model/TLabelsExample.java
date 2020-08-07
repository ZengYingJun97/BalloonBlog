package com.handsome.balloonblog.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TLabelsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLabelsExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andLabelNameIsNull() {
            addCriterion("label_name is null");
            return (Criteria) this;
        }

        public Criteria andLabelNameIsNotNull() {
            addCriterion("label_name is not null");
            return (Criteria) this;
        }

        public Criteria andLabelNameEqualTo(String value) {
            addCriterion("label_name =", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotEqualTo(String value) {
            addCriterion("label_name <>", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameGreaterThan(String value) {
            addCriterion("label_name >", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameGreaterThanOrEqualTo(String value) {
            addCriterion("label_name >=", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLessThan(String value) {
            addCriterion("label_name <", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLessThanOrEqualTo(String value) {
            addCriterion("label_name <=", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLike(String value) {
            addCriterion("label_name like", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotLike(String value) {
            addCriterion("label_name not like", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameIn(List<String> values) {
            addCriterion("label_name in", values, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotIn(List<String> values) {
            addCriterion("label_name not in", values, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameBetween(String value1, String value2) {
            addCriterion("label_name between", value1, value2, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotBetween(String value1, String value2) {
            addCriterion("label_name not between", value1, value2, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelGmtCreateIsNull() {
            addCriterion("label_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andLabelGmtCreateIsNotNull() {
            addCriterion("label_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andLabelGmtCreateEqualTo(Date value) {
            addCriterion("label_gmt_create =", value, "labelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andLabelGmtCreateNotEqualTo(Date value) {
            addCriterion("label_gmt_create <>", value, "labelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andLabelGmtCreateGreaterThan(Date value) {
            addCriterion("label_gmt_create >", value, "labelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andLabelGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("label_gmt_create >=", value, "labelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andLabelGmtCreateLessThan(Date value) {
            addCriterion("label_gmt_create <", value, "labelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andLabelGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("label_gmt_create <=", value, "labelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andLabelGmtCreateIn(List<Date> values) {
            addCriterion("label_gmt_create in", values, "labelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andLabelGmtCreateNotIn(List<Date> values) {
            addCriterion("label_gmt_create not in", values, "labelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andLabelGmtCreateBetween(Date value1, Date value2) {
            addCriterion("label_gmt_create between", value1, value2, "labelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andLabelGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("label_gmt_create not between", value1, value2, "labelGmtCreate");
            return (Criteria) this;
        }

        public Criteria andLabelGmtModifiedIsNull() {
            addCriterion("label_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andLabelGmtModifiedIsNotNull() {
            addCriterion("label_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andLabelGmtModifiedEqualTo(Date value) {
            addCriterion("label_gmt_modified =", value, "labelGmtModified");
            return (Criteria) this;
        }

        public Criteria andLabelGmtModifiedNotEqualTo(Date value) {
            addCriterion("label_gmt_modified <>", value, "labelGmtModified");
            return (Criteria) this;
        }

        public Criteria andLabelGmtModifiedGreaterThan(Date value) {
            addCriterion("label_gmt_modified >", value, "labelGmtModified");
            return (Criteria) this;
        }

        public Criteria andLabelGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("label_gmt_modified >=", value, "labelGmtModified");
            return (Criteria) this;
        }

        public Criteria andLabelGmtModifiedLessThan(Date value) {
            addCriterion("label_gmt_modified <", value, "labelGmtModified");
            return (Criteria) this;
        }

        public Criteria andLabelGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("label_gmt_modified <=", value, "labelGmtModified");
            return (Criteria) this;
        }

        public Criteria andLabelGmtModifiedIn(List<Date> values) {
            addCriterion("label_gmt_modified in", values, "labelGmtModified");
            return (Criteria) this;
        }

        public Criteria andLabelGmtModifiedNotIn(List<Date> values) {
            addCriterion("label_gmt_modified not in", values, "labelGmtModified");
            return (Criteria) this;
        }

        public Criteria andLabelGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("label_gmt_modified between", value1, value2, "labelGmtModified");
            return (Criteria) this;
        }

        public Criteria andLabelGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("label_gmt_modified not between", value1, value2, "labelGmtModified");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

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