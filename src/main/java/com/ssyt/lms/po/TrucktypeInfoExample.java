package com.ssyt.lms.po;

import java.util.ArrayList;
import java.util.List;

public class TrucktypeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrucktypeInfoExample() {
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

        public Criteria andTrucktypeIdIsNull() {
            addCriterion("truckType_Id is null");
            return (Criteria) this;
        }

        public Criteria andTrucktypeIdIsNotNull() {
            addCriterion("truckType_Id is not null");
            return (Criteria) this;
        }

        public Criteria andTrucktypeIdEqualTo(Integer value) {
            addCriterion("truckType_Id =", value, "trucktypeId");
            return (Criteria) this;
        }

        public Criteria andTrucktypeIdNotEqualTo(Integer value) {
            addCriterion("truckType_Id <>", value, "trucktypeId");
            return (Criteria) this;
        }

        public Criteria andTrucktypeIdGreaterThan(Integer value) {
            addCriterion("truckType_Id >", value, "trucktypeId");
            return (Criteria) this;
        }

        public Criteria andTrucktypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("truckType_Id >=", value, "trucktypeId");
            return (Criteria) this;
        }

        public Criteria andTrucktypeIdLessThan(Integer value) {
            addCriterion("truckType_Id <", value, "trucktypeId");
            return (Criteria) this;
        }

        public Criteria andTrucktypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("truckType_Id <=", value, "trucktypeId");
            return (Criteria) this;
        }

        public Criteria andTrucktypeIdIn(List<Integer> values) {
            addCriterion("truckType_Id in", values, "trucktypeId");
            return (Criteria) this;
        }

        public Criteria andTrucktypeIdNotIn(List<Integer> values) {
            addCriterion("truckType_Id not in", values, "trucktypeId");
            return (Criteria) this;
        }

        public Criteria andTrucktypeIdBetween(Integer value1, Integer value2) {
            addCriterion("truckType_Id between", value1, value2, "trucktypeId");
            return (Criteria) this;
        }

        public Criteria andTrucktypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("truckType_Id not between", value1, value2, "trucktypeId");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNameIsNull() {
            addCriterion("truckType_Name is null");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNameIsNotNull() {
            addCriterion("truckType_Name is not null");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNameEqualTo(String value) {
            addCriterion("truckType_Name =", value, "trucktypeName");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNameNotEqualTo(String value) {
            addCriterion("truckType_Name <>", value, "trucktypeName");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNameGreaterThan(String value) {
            addCriterion("truckType_Name >", value, "trucktypeName");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("truckType_Name >=", value, "trucktypeName");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNameLessThan(String value) {
            addCriterion("truckType_Name <", value, "trucktypeName");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNameLessThanOrEqualTo(String value) {
            addCriterion("truckType_Name <=", value, "trucktypeName");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNameLike(String value) {
            addCriterion("truckType_Name like", value, "trucktypeName");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNameNotLike(String value) {
            addCriterion("truckType_Name not like", value, "trucktypeName");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNameIn(List<String> values) {
            addCriterion("truckType_Name in", values, "trucktypeName");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNameNotIn(List<String> values) {
            addCriterion("truckType_Name not in", values, "trucktypeName");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNameBetween(String value1, String value2) {
            addCriterion("truckType_Name between", value1, value2, "trucktypeName");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNameNotBetween(String value1, String value2) {
            addCriterion("truckType_Name not between", value1, value2, "trucktypeName");
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