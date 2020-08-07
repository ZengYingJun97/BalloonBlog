package com.handsome.balloonblog.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserExample() {
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

        public Criteria andUserOpenIdIsNull() {
            addCriterion("user_open_id is null");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdIsNotNull() {
            addCriterion("user_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdEqualTo(String value) {
            addCriterion("user_open_id =", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotEqualTo(String value) {
            addCriterion("user_open_id <>", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdGreaterThan(String value) {
            addCriterion("user_open_id >", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_open_id >=", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdLessThan(String value) {
            addCriterion("user_open_id <", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdLessThanOrEqualTo(String value) {
            addCriterion("user_open_id <=", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdLike(String value) {
            addCriterion("user_open_id like", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotLike(String value) {
            addCriterion("user_open_id not like", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdIn(List<String> values) {
            addCriterion("user_open_id in", values, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotIn(List<String> values) {
            addCriterion("user_open_id not in", values, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdBetween(String value1, String value2) {
            addCriterion("user_open_id between", value1, value2, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotBetween(String value1, String value2) {
            addCriterion("user_open_id not between", value1, value2, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNull() {
            addCriterion("user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNotNull() {
            addCriterion("user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameEqualTo(String value) {
            addCriterion("user_nickname =", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotEqualTo(String value) {
            addCriterion("user_nickname <>", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThan(String value) {
            addCriterion("user_nickname >", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nickname >=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThan(String value) {
            addCriterion("user_nickname <", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("user_nickname <=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLike(String value) {
            addCriterion("user_nickname like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotLike(String value) {
            addCriterion("user_nickname not like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIn(List<String> values) {
            addCriterion("user_nickname in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotIn(List<String> values) {
            addCriterion("user_nickname not in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameBetween(String value1, String value2) {
            addCriterion("user_nickname between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotBetween(String value1, String value2) {
            addCriterion("user_nickname not between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(Byte value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(Byte value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(Byte value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(Byte value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(Byte value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<Byte> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<Byte> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(Byte value1, Byte value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(Byte value1, Byte value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIsNull() {
            addCriterion("user_province is null");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIsNotNull() {
            addCriterion("user_province is not null");
            return (Criteria) this;
        }

        public Criteria andUserProvinceEqualTo(String value) {
            addCriterion("user_province =", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotEqualTo(String value) {
            addCriterion("user_province <>", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceGreaterThan(String value) {
            addCriterion("user_province >", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("user_province >=", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLessThan(String value) {
            addCriterion("user_province <", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLessThanOrEqualTo(String value) {
            addCriterion("user_province <=", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLike(String value) {
            addCriterion("user_province like", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotLike(String value) {
            addCriterion("user_province not like", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIn(List<String> values) {
            addCriterion("user_province in", values, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotIn(List<String> values) {
            addCriterion("user_province not in", values, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceBetween(String value1, String value2) {
            addCriterion("user_province between", value1, value2, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotBetween(String value1, String value2) {
            addCriterion("user_province not between", value1, value2, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserCountryIsNull() {
            addCriterion("user_country is null");
            return (Criteria) this;
        }

        public Criteria andUserCountryIsNotNull() {
            addCriterion("user_country is not null");
            return (Criteria) this;
        }

        public Criteria andUserCountryEqualTo(String value) {
            addCriterion("user_country =", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryNotEqualTo(String value) {
            addCriterion("user_country <>", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryGreaterThan(String value) {
            addCriterion("user_country >", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryGreaterThanOrEqualTo(String value) {
            addCriterion("user_country >=", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryLessThan(String value) {
            addCriterion("user_country <", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryLessThanOrEqualTo(String value) {
            addCriterion("user_country <=", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryLike(String value) {
            addCriterion("user_country like", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryNotLike(String value) {
            addCriterion("user_country not like", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryIn(List<String> values) {
            addCriterion("user_country in", values, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryNotIn(List<String> values) {
            addCriterion("user_country not in", values, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryBetween(String value1, String value2) {
            addCriterion("user_country between", value1, value2, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryNotBetween(String value1, String value2) {
            addCriterion("user_country not between", value1, value2, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgurlIsNull() {
            addCriterion("user_headimgurl is null");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgurlIsNotNull() {
            addCriterion("user_headimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgurlEqualTo(String value) {
            addCriterion("user_headimgurl =", value, "userHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgurlNotEqualTo(String value) {
            addCriterion("user_headimgurl <>", value, "userHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgurlGreaterThan(String value) {
            addCriterion("user_headimgurl >", value, "userHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("user_headimgurl >=", value, "userHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgurlLessThan(String value) {
            addCriterion("user_headimgurl <", value, "userHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgurlLessThanOrEqualTo(String value) {
            addCriterion("user_headimgurl <=", value, "userHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgurlLike(String value) {
            addCriterion("user_headimgurl like", value, "userHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgurlNotLike(String value) {
            addCriterion("user_headimgurl not like", value, "userHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgurlIn(List<String> values) {
            addCriterion("user_headimgurl in", values, "userHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgurlNotIn(List<String> values) {
            addCriterion("user_headimgurl not in", values, "userHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgurlBetween(String value1, String value2) {
            addCriterion("user_headimgurl between", value1, value2, "userHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgurlNotBetween(String value1, String value2) {
            addCriterion("user_headimgurl not between", value1, value2, "userHeadimgurl");
            return (Criteria) this;
        }

        public Criteria andUserEmailStatusIsNull() {
            addCriterion("user_email_status is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailStatusIsNotNull() {
            addCriterion("user_email_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailStatusEqualTo(Byte value) {
            addCriterion("user_email_status =", value, "userEmailStatus");
            return (Criteria) this;
        }

        public Criteria andUserEmailStatusNotEqualTo(Byte value) {
            addCriterion("user_email_status <>", value, "userEmailStatus");
            return (Criteria) this;
        }

        public Criteria andUserEmailStatusGreaterThan(Byte value) {
            addCriterion("user_email_status >", value, "userEmailStatus");
            return (Criteria) this;
        }

        public Criteria andUserEmailStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_email_status >=", value, "userEmailStatus");
            return (Criteria) this;
        }

        public Criteria andUserEmailStatusLessThan(Byte value) {
            addCriterion("user_email_status <", value, "userEmailStatus");
            return (Criteria) this;
        }

        public Criteria andUserEmailStatusLessThanOrEqualTo(Byte value) {
            addCriterion("user_email_status <=", value, "userEmailStatus");
            return (Criteria) this;
        }

        public Criteria andUserEmailStatusIn(List<Byte> values) {
            addCriterion("user_email_status in", values, "userEmailStatus");
            return (Criteria) this;
        }

        public Criteria andUserEmailStatusNotIn(List<Byte> values) {
            addCriterion("user_email_status not in", values, "userEmailStatus");
            return (Criteria) this;
        }

        public Criteria andUserEmailStatusBetween(Byte value1, Byte value2) {
            addCriterion("user_email_status between", value1, value2, "userEmailStatus");
            return (Criteria) this;
        }

        public Criteria andUserEmailStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("user_email_status not between", value1, value2, "userEmailStatus");
            return (Criteria) this;
        }

        public Criteria andUserLastIpIsNull() {
            addCriterion("user_last_ip is null");
            return (Criteria) this;
        }

        public Criteria andUserLastIpIsNotNull() {
            addCriterion("user_last_ip is not null");
            return (Criteria) this;
        }

        public Criteria andUserLastIpEqualTo(String value) {
            addCriterion("user_last_ip =", value, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpNotEqualTo(String value) {
            addCriterion("user_last_ip <>", value, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpGreaterThan(String value) {
            addCriterion("user_last_ip >", value, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpGreaterThanOrEqualTo(String value) {
            addCriterion("user_last_ip >=", value, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpLessThan(String value) {
            addCriterion("user_last_ip <", value, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpLessThanOrEqualTo(String value) {
            addCriterion("user_last_ip <=", value, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpLike(String value) {
            addCriterion("user_last_ip like", value, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpNotLike(String value) {
            addCriterion("user_last_ip not like", value, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpIn(List<String> values) {
            addCriterion("user_last_ip in", values, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpNotIn(List<String> values) {
            addCriterion("user_last_ip not in", values, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpBetween(String value1, String value2) {
            addCriterion("user_last_ip between", value1, value2, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpNotBetween(String value1, String value2) {
            addCriterion("user_last_ip not between", value1, value2, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeIsNull() {
            addCriterion("user_last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeIsNotNull() {
            addCriterion("user_last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeEqualTo(Date value) {
            addCriterion("user_last_login_time =", value, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeNotEqualTo(Date value) {
            addCriterion("user_last_login_time <>", value, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeGreaterThan(Date value) {
            addCriterion("user_last_login_time >", value, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_last_login_time >=", value, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeLessThan(Date value) {
            addCriterion("user_last_login_time <", value, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_last_login_time <=", value, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeIn(List<Date> values) {
            addCriterion("user_last_login_time in", values, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeNotIn(List<Date> values) {
            addCriterion("user_last_login_time not in", values, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("user_last_login_time between", value1, value2, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_last_login_time not between", value1, value2, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserGmtCreateIsNull() {
            addCriterion("user_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andUserGmtCreateIsNotNull() {
            addCriterion("user_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andUserGmtCreateEqualTo(Date value) {
            addCriterion("user_gmt_create =", value, "userGmtCreate");
            return (Criteria) this;
        }

        public Criteria andUserGmtCreateNotEqualTo(Date value) {
            addCriterion("user_gmt_create <>", value, "userGmtCreate");
            return (Criteria) this;
        }

        public Criteria andUserGmtCreateGreaterThan(Date value) {
            addCriterion("user_gmt_create >", value, "userGmtCreate");
            return (Criteria) this;
        }

        public Criteria andUserGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("user_gmt_create >=", value, "userGmtCreate");
            return (Criteria) this;
        }

        public Criteria andUserGmtCreateLessThan(Date value) {
            addCriterion("user_gmt_create <", value, "userGmtCreate");
            return (Criteria) this;
        }

        public Criteria andUserGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("user_gmt_create <=", value, "userGmtCreate");
            return (Criteria) this;
        }

        public Criteria andUserGmtCreateIn(List<Date> values) {
            addCriterion("user_gmt_create in", values, "userGmtCreate");
            return (Criteria) this;
        }

        public Criteria andUserGmtCreateNotIn(List<Date> values) {
            addCriterion("user_gmt_create not in", values, "userGmtCreate");
            return (Criteria) this;
        }

        public Criteria andUserGmtCreateBetween(Date value1, Date value2) {
            addCriterion("user_gmt_create between", value1, value2, "userGmtCreate");
            return (Criteria) this;
        }

        public Criteria andUserGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("user_gmt_create not between", value1, value2, "userGmtCreate");
            return (Criteria) this;
        }

        public Criteria andUserGmtModifiedIsNull() {
            addCriterion("user_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andUserGmtModifiedIsNotNull() {
            addCriterion("user_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andUserGmtModifiedEqualTo(Date value) {
            addCriterion("user_gmt_modified =", value, "userGmtModified");
            return (Criteria) this;
        }

        public Criteria andUserGmtModifiedNotEqualTo(Date value) {
            addCriterion("user_gmt_modified <>", value, "userGmtModified");
            return (Criteria) this;
        }

        public Criteria andUserGmtModifiedGreaterThan(Date value) {
            addCriterion("user_gmt_modified >", value, "userGmtModified");
            return (Criteria) this;
        }

        public Criteria andUserGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("user_gmt_modified >=", value, "userGmtModified");
            return (Criteria) this;
        }

        public Criteria andUserGmtModifiedLessThan(Date value) {
            addCriterion("user_gmt_modified <", value, "userGmtModified");
            return (Criteria) this;
        }

        public Criteria andUserGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("user_gmt_modified <=", value, "userGmtModified");
            return (Criteria) this;
        }

        public Criteria andUserGmtModifiedIn(List<Date> values) {
            addCriterion("user_gmt_modified in", values, "userGmtModified");
            return (Criteria) this;
        }

        public Criteria andUserGmtModifiedNotIn(List<Date> values) {
            addCriterion("user_gmt_modified not in", values, "userGmtModified");
            return (Criteria) this;
        }

        public Criteria andUserGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("user_gmt_modified between", value1, value2, "userGmtModified");
            return (Criteria) this;
        }

        public Criteria andUserGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("user_gmt_modified not between", value1, value2, "userGmtModified");
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