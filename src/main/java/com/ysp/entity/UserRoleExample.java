package com.ysp.entity;

import java.util.ArrayList;
import java.util.List;

public class UserRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public UserRoleExample() {
        oredCriteria = new ArrayList<Criteria>();
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andUserRoleNameIsNull() {
            addCriterion("USER_ROLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameIsNotNull() {
            addCriterion("USER_ROLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameEqualTo(String value) {
            addCriterion("USER_ROLE_NAME =", value, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameNotEqualTo(String value) {
            addCriterion("USER_ROLE_NAME <>", value, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameGreaterThan(String value) {
            addCriterion("USER_ROLE_NAME >", value, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ROLE_NAME >=", value, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameLessThan(String value) {
            addCriterion("USER_ROLE_NAME <", value, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameLessThanOrEqualTo(String value) {
            addCriterion("USER_ROLE_NAME <=", value, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameLike(String value) {
            addCriterion("USER_ROLE_NAME like", value, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameNotLike(String value) {
            addCriterion("USER_ROLE_NAME not like", value, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameIn(List<String> values) {
            addCriterion("USER_ROLE_NAME in", values, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameNotIn(List<String> values) {
            addCriterion("USER_ROLE_NAME not in", values, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameBetween(String value1, String value2) {
            addCriterion("USER_ROLE_NAME between", value1, value2, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameNotBetween(String value1, String value2) {
            addCriterion("USER_ROLE_NAME not between", value1, value2, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserRoleCodeIsNull() {
            addCriterion("USER_ROLE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleCodeIsNotNull() {
            addCriterion("USER_ROLE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleCodeEqualTo(Integer value) {
            addCriterion("USER_ROLE_CODE =", value, "userRoleCode");
            return (Criteria) this;
        }

        public Criteria andUserRoleCodeNotEqualTo(Integer value) {
            addCriterion("USER_ROLE_CODE <>", value, "userRoleCode");
            return (Criteria) this;
        }

        public Criteria andUserRoleCodeGreaterThan(Integer value) {
            addCriterion("USER_ROLE_CODE >", value, "userRoleCode");
            return (Criteria) this;
        }

        public Criteria andUserRoleCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ROLE_CODE >=", value, "userRoleCode");
            return (Criteria) this;
        }

        public Criteria andUserRoleCodeLessThan(Integer value) {
            addCriterion("USER_ROLE_CODE <", value, "userRoleCode");
            return (Criteria) this;
        }

        public Criteria andUserRoleCodeLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ROLE_CODE <=", value, "userRoleCode");
            return (Criteria) this;
        }

        public Criteria andUserRoleCodeIn(List<Integer> values) {
            addCriterion("USER_ROLE_CODE in", values, "userRoleCode");
            return (Criteria) this;
        }

        public Criteria andUserRoleCodeNotIn(List<Integer> values) {
            addCriterion("USER_ROLE_CODE not in", values, "userRoleCode");
            return (Criteria) this;
        }

        public Criteria andUserRoleCodeBetween(Integer value1, Integer value2) {
            addCriterion("USER_ROLE_CODE between", value1, value2, "userRoleCode");
            return (Criteria) this;
        }

        public Criteria andUserRoleCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ROLE_CODE not between", value1, value2, "userRoleCode");
            return (Criteria) this;
        }
    }

    /**
     */
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