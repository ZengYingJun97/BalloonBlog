package com.handsome.balloonblog.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TPermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPermissionExample() {
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

        public Criteria andPermissionIdIsNull() {
            addCriterion("permission_id is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIsNotNull() {
            addCriterion("permission_id is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdEqualTo(Long value) {
            addCriterion("permission_id =", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotEqualTo(Long value) {
            addCriterion("permission_id <>", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThan(Long value) {
            addCriterion("permission_id >", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("permission_id >=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThan(Long value) {
            addCriterion("permission_id <", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThanOrEqualTo(Long value) {
            addCriterion("permission_id <=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIn(List<Long> values) {
            addCriterion("permission_id in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotIn(List<Long> values) {
            addCriterion("permission_id not in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdBetween(Long value1, Long value2) {
            addCriterion("permission_id between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotBetween(Long value1, Long value2) {
            addCriterion("permission_id not between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andUriIsNull() {
            addCriterion("uri is null");
            return (Criteria) this;
        }

        public Criteria andUriIsNotNull() {
            addCriterion("uri is not null");
            return (Criteria) this;
        }

        public Criteria andUriEqualTo(String value) {
            addCriterion("uri =", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotEqualTo(String value) {
            addCriterion("uri <>", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThan(String value) {
            addCriterion("uri >", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThanOrEqualTo(String value) {
            addCriterion("uri >=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThan(String value) {
            addCriterion("uri <", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThanOrEqualTo(String value) {
            addCriterion("uri <=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLike(String value) {
            addCriterion("uri like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotLike(String value) {
            addCriterion("uri not like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriIn(List<String> values) {
            addCriterion("uri in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotIn(List<String> values) {
            addCriterion("uri not in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriBetween(String value1, String value2) {
            addCriterion("uri between", value1, value2, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotBetween(String value1, String value2) {
            addCriterion("uri not between", value1, value2, "uri");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtCreateIsNull() {
            addCriterion("permission_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtCreateIsNotNull() {
            addCriterion("permission_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtCreateEqualTo(Date value) {
            addCriterion("permission_gmt_create =", value, "permissionGmtCreate");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtCreateNotEqualTo(Date value) {
            addCriterion("permission_gmt_create <>", value, "permissionGmtCreate");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtCreateGreaterThan(Date value) {
            addCriterion("permission_gmt_create >", value, "permissionGmtCreate");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("permission_gmt_create >=", value, "permissionGmtCreate");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtCreateLessThan(Date value) {
            addCriterion("permission_gmt_create <", value, "permissionGmtCreate");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("permission_gmt_create <=", value, "permissionGmtCreate");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtCreateIn(List<Date> values) {
            addCriterion("permission_gmt_create in", values, "permissionGmtCreate");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtCreateNotIn(List<Date> values) {
            addCriterion("permission_gmt_create not in", values, "permissionGmtCreate");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtCreateBetween(Date value1, Date value2) {
            addCriterion("permission_gmt_create between", value1, value2, "permissionGmtCreate");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("permission_gmt_create not between", value1, value2, "permissionGmtCreate");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtModifiedIsNull() {
            addCriterion("permission_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtModifiedIsNotNull() {
            addCriterion("permission_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtModifiedEqualTo(Date value) {
            addCriterion("permission_gmt_modified =", value, "permissionGmtModified");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtModifiedNotEqualTo(Date value) {
            addCriterion("permission_gmt_modified <>", value, "permissionGmtModified");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtModifiedGreaterThan(Date value) {
            addCriterion("permission_gmt_modified >", value, "permissionGmtModified");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("permission_gmt_modified >=", value, "permissionGmtModified");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtModifiedLessThan(Date value) {
            addCriterion("permission_gmt_modified <", value, "permissionGmtModified");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("permission_gmt_modified <=", value, "permissionGmtModified");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtModifiedIn(List<Date> values) {
            addCriterion("permission_gmt_modified in", values, "permissionGmtModified");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtModifiedNotIn(List<Date> values) {
            addCriterion("permission_gmt_modified not in", values, "permissionGmtModified");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("permission_gmt_modified between", value1, value2, "permissionGmtModified");
            return (Criteria) this;
        }

        public Criteria andPermissionGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("permission_gmt_modified not between", value1, value2, "permissionGmtModified");
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