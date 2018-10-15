package com.ysp.entity;

import java.util.ArrayList;
import java.util.List;

public class UserAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public UserAccountExample() {
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

        public Criteria andSqeNoIsNull() {
            addCriterion("SQE_NO is null");
            return (Criteria) this;
        }

        public Criteria andSqeNoIsNotNull() {
            addCriterion("SQE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSqeNoEqualTo(Integer value) {
            addCriterion("SQE_NO =", value, "sqeNo");
            return (Criteria) this;
        }

        public Criteria andSqeNoNotEqualTo(Integer value) {
            addCriterion("SQE_NO <>", value, "sqeNo");
            return (Criteria) this;
        }

        public Criteria andSqeNoGreaterThan(Integer value) {
            addCriterion("SQE_NO >", value, "sqeNo");
            return (Criteria) this;
        }

        public Criteria andSqeNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SQE_NO >=", value, "sqeNo");
            return (Criteria) this;
        }

        public Criteria andSqeNoLessThan(Integer value) {
            addCriterion("SQE_NO <", value, "sqeNo");
            return (Criteria) this;
        }

        public Criteria andSqeNoLessThanOrEqualTo(Integer value) {
            addCriterion("SQE_NO <=", value, "sqeNo");
            return (Criteria) this;
        }

        public Criteria andSqeNoIn(List<Integer> values) {
            addCriterion("SQE_NO in", values, "sqeNo");
            return (Criteria) this;
        }

        public Criteria andSqeNoNotIn(List<Integer> values) {
            addCriterion("SQE_NO not in", values, "sqeNo");
            return (Criteria) this;
        }

        public Criteria andSqeNoBetween(Integer value1, Integer value2) {
            addCriterion("SQE_NO between", value1, value2, "sqeNo");
            return (Criteria) this;
        }

        public Criteria andSqeNoNotBetween(Integer value1, Integer value2) {
            addCriterion("SQE_NO not between", value1, value2, "sqeNo");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("ACCOUNT =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("ACCOUNT <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("ACCOUNT >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("ACCOUNT <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("ACCOUNT like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("ACCOUNT not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("ACCOUNT in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("ACCOUNT not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("ACCOUNT between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUserTyprIsNull() {
            addCriterion("USER_TYPR is null");
            return (Criteria) this;
        }

        public Criteria andUserTyprIsNotNull() {
            addCriterion("USER_TYPR is not null");
            return (Criteria) this;
        }

        public Criteria andUserTyprEqualTo(Integer value) {
            addCriterion("USER_TYPR =", value, "userTypr");
            return (Criteria) this;
        }

        public Criteria andUserTyprNotEqualTo(Integer value) {
            addCriterion("USER_TYPR <>", value, "userTypr");
            return (Criteria) this;
        }

        public Criteria andUserTyprGreaterThan(Integer value) {
            addCriterion("USER_TYPR >", value, "userTypr");
            return (Criteria) this;
        }

        public Criteria andUserTyprGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_TYPR >=", value, "userTypr");
            return (Criteria) this;
        }

        public Criteria andUserTyprLessThan(Integer value) {
            addCriterion("USER_TYPR <", value, "userTypr");
            return (Criteria) this;
        }

        public Criteria andUserTyprLessThanOrEqualTo(Integer value) {
            addCriterion("USER_TYPR <=", value, "userTypr");
            return (Criteria) this;
        }

        public Criteria andUserTyprIn(List<Integer> values) {
            addCriterion("USER_TYPR in", values, "userTypr");
            return (Criteria) this;
        }

        public Criteria andUserTyprNotIn(List<Integer> values) {
            addCriterion("USER_TYPR not in", values, "userTypr");
            return (Criteria) this;
        }

        public Criteria andUserTyprBetween(Integer value1, Integer value2) {
            addCriterion("USER_TYPR between", value1, value2, "userTypr");
            return (Criteria) this;
        }

        public Criteria andUserTyprNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_TYPR not between", value1, value2, "userTypr");
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