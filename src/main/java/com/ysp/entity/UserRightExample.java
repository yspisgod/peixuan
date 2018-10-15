package com.ysp.entity;

import java.util.ArrayList;
import java.util.List;

public class UserRightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public UserRightExample() {
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

        public Criteria andUserRightCodeIsNull() {
            addCriterion("USER_RIGHT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserRightCodeIsNotNull() {
            addCriterion("USER_RIGHT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserRightCodeEqualTo(Integer value) {
            addCriterion("USER_RIGHT_CODE =", value, "userRightCode");
            return (Criteria) this;
        }

        public Criteria andUserRightCodeNotEqualTo(Integer value) {
            addCriterion("USER_RIGHT_CODE <>", value, "userRightCode");
            return (Criteria) this;
        }

        public Criteria andUserRightCodeGreaterThan(Integer value) {
            addCriterion("USER_RIGHT_CODE >", value, "userRightCode");
            return (Criteria) this;
        }

        public Criteria andUserRightCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_RIGHT_CODE >=", value, "userRightCode");
            return (Criteria) this;
        }

        public Criteria andUserRightCodeLessThan(Integer value) {
            addCriterion("USER_RIGHT_CODE <", value, "userRightCode");
            return (Criteria) this;
        }

        public Criteria andUserRightCodeLessThanOrEqualTo(Integer value) {
            addCriterion("USER_RIGHT_CODE <=", value, "userRightCode");
            return (Criteria) this;
        }

        public Criteria andUserRightCodeIn(List<Integer> values) {
            addCriterion("USER_RIGHT_CODE in", values, "userRightCode");
            return (Criteria) this;
        }

        public Criteria andUserRightCodeNotIn(List<Integer> values) {
            addCriterion("USER_RIGHT_CODE not in", values, "userRightCode");
            return (Criteria) this;
        }

        public Criteria andUserRightCodeBetween(Integer value1, Integer value2) {
            addCriterion("USER_RIGHT_CODE between", value1, value2, "userRightCode");
            return (Criteria) this;
        }

        public Criteria andUserRightCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_RIGHT_CODE not between", value1, value2, "userRightCode");
            return (Criteria) this;
        }

        public Criteria andUserRightNameIsNull() {
            addCriterion("USER_RIGHT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserRightNameIsNotNull() {
            addCriterion("USER_RIGHT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserRightNameEqualTo(String value) {
            addCriterion("USER_RIGHT_NAME =", value, "userRightName");
            return (Criteria) this;
        }

        public Criteria andUserRightNameNotEqualTo(String value) {
            addCriterion("USER_RIGHT_NAME <>", value, "userRightName");
            return (Criteria) this;
        }

        public Criteria andUserRightNameGreaterThan(String value) {
            addCriterion("USER_RIGHT_NAME >", value, "userRightName");
            return (Criteria) this;
        }

        public Criteria andUserRightNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_RIGHT_NAME >=", value, "userRightName");
            return (Criteria) this;
        }

        public Criteria andUserRightNameLessThan(String value) {
            addCriterion("USER_RIGHT_NAME <", value, "userRightName");
            return (Criteria) this;
        }

        public Criteria andUserRightNameLessThanOrEqualTo(String value) {
            addCriterion("USER_RIGHT_NAME <=", value, "userRightName");
            return (Criteria) this;
        }

        public Criteria andUserRightNameLike(String value) {
            addCriterion("USER_RIGHT_NAME like", value, "userRightName");
            return (Criteria) this;
        }

        public Criteria andUserRightNameNotLike(String value) {
            addCriterion("USER_RIGHT_NAME not like", value, "userRightName");
            return (Criteria) this;
        }

        public Criteria andUserRightNameIn(List<String> values) {
            addCriterion("USER_RIGHT_NAME in", values, "userRightName");
            return (Criteria) this;
        }

        public Criteria andUserRightNameNotIn(List<String> values) {
            addCriterion("USER_RIGHT_NAME not in", values, "userRightName");
            return (Criteria) this;
        }

        public Criteria andUserRightNameBetween(String value1, String value2) {
            addCriterion("USER_RIGHT_NAME between", value1, value2, "userRightName");
            return (Criteria) this;
        }

        public Criteria andUserRightNameNotBetween(String value1, String value2) {
            addCriterion("USER_RIGHT_NAME not between", value1, value2, "userRightName");
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