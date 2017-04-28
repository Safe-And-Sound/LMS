package com.ssyt.lms.po;

import java.util.ArrayList;
import java.util.List;

public class StateInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StateInfoExample() {
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

        public Criteria andStateIdIsNull() {
            addCriterion("state_Id is null");
            return (Criteria) this;
        }

        public Criteria andStateIdIsNotNull() {
            addCriterion("state_Id is not null");
            return (Criteria) this;
        }

        public Criteria andStateIdEqualTo(Integer value) {
            addCriterion("state_Id =", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdNotEqualTo(Integer value) {
            addCriterion("state_Id <>", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdGreaterThan(Integer value) {
            addCriterion("state_Id >", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("state_Id >=", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdLessThan(Integer value) {
            addCriterion("state_Id <", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdLessThanOrEqualTo(Integer value) {
            addCriterion("state_Id <=", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdIn(List<Integer> values) {
            addCriterion("state_Id in", values, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdNotIn(List<Integer> values) {
            addCriterion("state_Id not in", values, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdBetween(Integer value1, Integer value2) {
            addCriterion("state_Id between", value1, value2, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("state_Id not between", value1, value2, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateNameIsNull() {
            addCriterion("state_Name is null");
            return (Criteria) this;
        }

        public Criteria andStateNameIsNotNull() {
            addCriterion("state_Name is not null");
            return (Criteria) this;
        }

        public Criteria andStateNameEqualTo(String value) {
            addCriterion("state_Name =", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameNotEqualTo(String value) {
            addCriterion("state_Name <>", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameGreaterThan(String value) {
            addCriterion("state_Name >", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameGreaterThanOrEqualTo(String value) {
            addCriterion("state_Name >=", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameLessThan(String value) {
            addCriterion("state_Name <", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameLessThanOrEqualTo(String value) {
            addCriterion("state_Name <=", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameLike(String value) {
            addCriterion("state_Name like", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameNotLike(String value) {
            addCriterion("state_Name not like", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameIn(List<String> values) {
            addCriterion("state_Name in", values, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameNotIn(List<String> values) {
            addCriterion("state_Name not in", values, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameBetween(String value1, String value2) {
            addCriterion("state_Name between", value1, value2, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameNotBetween(String value1, String value2) {
            addCriterion("state_Name not between", value1, value2, "stateName");
            return (Criteria) this;
        }

        public Criteria andIdentiferIsNull() {
            addCriterion("identifer is null");
            return (Criteria) this;
        }

        public Criteria andIdentiferIsNotNull() {
            addCriterion("identifer is not null");
            return (Criteria) this;
        }

        public Criteria andIdentiferEqualTo(Integer value) {
            addCriterion("identifer =", value, "identifer");
            return (Criteria) this;
        }

        public Criteria andIdentiferNotEqualTo(Integer value) {
            addCriterion("identifer <>", value, "identifer");
            return (Criteria) this;
        }

        public Criteria andIdentiferGreaterThan(Integer value) {
            addCriterion("identifer >", value, "identifer");
            return (Criteria) this;
        }

        public Criteria andIdentiferGreaterThanOrEqualTo(Integer value) {
            addCriterion("identifer >=", value, "identifer");
            return (Criteria) this;
        }

        public Criteria andIdentiferLessThan(Integer value) {
            addCriterion("identifer <", value, "identifer");
            return (Criteria) this;
        }

        public Criteria andIdentiferLessThanOrEqualTo(Integer value) {
            addCriterion("identifer <=", value, "identifer");
            return (Criteria) this;
        }

        public Criteria andIdentiferIn(List<Integer> values) {
            addCriterion("identifer in", values, "identifer");
            return (Criteria) this;
        }

        public Criteria andIdentiferNotIn(List<Integer> values) {
            addCriterion("identifer not in", values, "identifer");
            return (Criteria) this;
        }

        public Criteria andIdentiferBetween(Integer value1, Integer value2) {
            addCriterion("identifer between", value1, value2, "identifer");
            return (Criteria) this;
        }

        public Criteria andIdentiferNotBetween(Integer value1, Integer value2) {
            addCriterion("identifer not between", value1, value2, "identifer");
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