package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuildingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuildingExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBnameIsNull() {
            addCriterion("BName is null");
            return (Criteria) this;
        }

        public Criteria andBnameIsNotNull() {
            addCriterion("BName is not null");
            return (Criteria) this;
        }

        public Criteria andBnameEqualTo(String value) {
            addCriterion("BName =", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotEqualTo(String value) {
            addCriterion("BName <>", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThan(String value) {
            addCriterion("BName >", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThanOrEqualTo(String value) {
            addCriterion("BName >=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThan(String value) {
            addCriterion("BName <", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThanOrEqualTo(String value) {
            addCriterion("BName <=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLike(String value) {
            addCriterion("BName like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotLike(String value) {
            addCriterion("BName not like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameIn(List<String> values) {
            addCriterion("BName in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotIn(List<String> values) {
            addCriterion("BName not in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameBetween(String value1, String value2) {
            addCriterion("BName between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotBetween(String value1, String value2) {
            addCriterion("BName not between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBaddIsNull() {
            addCriterion("BAdd is null");
            return (Criteria) this;
        }

        public Criteria andBaddIsNotNull() {
            addCriterion("BAdd is not null");
            return (Criteria) this;
        }

        public Criteria andBaddEqualTo(String value) {
            addCriterion("BAdd =", value, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddNotEqualTo(String value) {
            addCriterion("BAdd <>", value, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddGreaterThan(String value) {
            addCriterion("BAdd >", value, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddGreaterThanOrEqualTo(String value) {
            addCriterion("BAdd >=", value, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddLessThan(String value) {
            addCriterion("BAdd <", value, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddLessThanOrEqualTo(String value) {
            addCriterion("BAdd <=", value, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddLike(String value) {
            addCriterion("BAdd like", value, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddNotLike(String value) {
            addCriterion("BAdd not like", value, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddIn(List<String> values) {
            addCriterion("BAdd in", values, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddNotIn(List<String> values) {
            addCriterion("BAdd not in", values, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddBetween(String value1, String value2) {
            addCriterion("BAdd between", value1, value2, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddNotBetween(String value1, String value2) {
            addCriterion("BAdd not between", value1, value2, "badd");
            return (Criteria) this;
        }

        public Criteria andBsizeIsNull() {
            addCriterion("BSize is null");
            return (Criteria) this;
        }

        public Criteria andBsizeIsNotNull() {
            addCriterion("BSize is not null");
            return (Criteria) this;
        }

        public Criteria andBsizeEqualTo(Double value) {
            addCriterion("BSize =", value, "bsize");
            return (Criteria) this;
        }

        public Criteria andBsizeNotEqualTo(Double value) {
            addCriterion("BSize <>", value, "bsize");
            return (Criteria) this;
        }

        public Criteria andBsizeGreaterThan(Double value) {
            addCriterion("BSize >", value, "bsize");
            return (Criteria) this;
        }

        public Criteria andBsizeGreaterThanOrEqualTo(Double value) {
            addCriterion("BSize >=", value, "bsize");
            return (Criteria) this;
        }

        public Criteria andBsizeLessThan(Double value) {
            addCriterion("BSize <", value, "bsize");
            return (Criteria) this;
        }

        public Criteria andBsizeLessThanOrEqualTo(Double value) {
            addCriterion("BSize <=", value, "bsize");
            return (Criteria) this;
        }

        public Criteria andBsizeIn(List<Double> values) {
            addCriterion("BSize in", values, "bsize");
            return (Criteria) this;
        }

        public Criteria andBsizeNotIn(List<Double> values) {
            addCriterion("BSize not in", values, "bsize");
            return (Criteria) this;
        }

        public Criteria andBsizeBetween(Double value1, Double value2) {
            addCriterion("BSize between", value1, value2, "bsize");
            return (Criteria) this;
        }

        public Criteria andBsizeNotBetween(Double value1, Double value2) {
            addCriterion("BSize not between", value1, value2, "bsize");
            return (Criteria) this;
        }

        public Criteria andBdateIsNull() {
            addCriterion("BDate is null");
            return (Criteria) this;
        }

        public Criteria andBdateIsNotNull() {
            addCriterion("BDate is not null");
            return (Criteria) this;
        }

        public Criteria andBdateEqualTo(Date value) {
            addCriterion("BDate =", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotEqualTo(Date value) {
            addCriterion("BDate <>", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateGreaterThan(Date value) {
            addCriterion("BDate >", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateGreaterThanOrEqualTo(Date value) {
            addCriterion("BDate >=", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateLessThan(Date value) {
            addCriterion("BDate <", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateLessThanOrEqualTo(Date value) {
            addCriterion("BDate <=", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateIn(List<Date> values) {
            addCriterion("BDate in", values, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotIn(List<Date> values) {
            addCriterion("BDate not in", values, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateBetween(Date value1, Date value2) {
            addCriterion("BDate between", value1, value2, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotBetween(Date value1, Date value2) {
            addCriterion("BDate not between", value1, value2, "bdate");
            return (Criteria) this;
        }

        public Criteria andBnumIsNull() {
            addCriterion("BNum is null");
            return (Criteria) this;
        }

        public Criteria andBnumIsNotNull() {
            addCriterion("BNum is not null");
            return (Criteria) this;
        }

        public Criteria andBnumEqualTo(Integer value) {
            addCriterion("BNum =", value, "bnum");
            return (Criteria) this;
        }

        public Criteria andBnumNotEqualTo(Integer value) {
            addCriterion("BNum <>", value, "bnum");
            return (Criteria) this;
        }

        public Criteria andBnumGreaterThan(Integer value) {
            addCriterion("BNum >", value, "bnum");
            return (Criteria) this;
        }

        public Criteria andBnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("BNum >=", value, "bnum");
            return (Criteria) this;
        }

        public Criteria andBnumLessThan(Integer value) {
            addCriterion("BNum <", value, "bnum");
            return (Criteria) this;
        }

        public Criteria andBnumLessThanOrEqualTo(Integer value) {
            addCriterion("BNum <=", value, "bnum");
            return (Criteria) this;
        }

        public Criteria andBnumIn(List<Integer> values) {
            addCriterion("BNum in", values, "bnum");
            return (Criteria) this;
        }

        public Criteria andBnumNotIn(List<Integer> values) {
            addCriterion("BNum not in", values, "bnum");
            return (Criteria) this;
        }

        public Criteria andBnumBetween(Integer value1, Integer value2) {
            addCriterion("BNum between", value1, value2, "bnum");
            return (Criteria) this;
        }

        public Criteria andBnumNotBetween(Integer value1, Integer value2) {
            addCriterion("BNum not between", value1, value2, "bnum");
            return (Criteria) this;
        }

        public Criteria andByearIsNull() {
            addCriterion("Byear is null");
            return (Criteria) this;
        }

        public Criteria andByearIsNotNull() {
            addCriterion("Byear is not null");
            return (Criteria) this;
        }

        public Criteria andByearEqualTo(Integer value) {
            addCriterion("Byear =", value, "byear");
            return (Criteria) this;
        }

        public Criteria andByearNotEqualTo(Integer value) {
            addCriterion("Byear <>", value, "byear");
            return (Criteria) this;
        }

        public Criteria andByearGreaterThan(Integer value) {
            addCriterion("Byear >", value, "byear");
            return (Criteria) this;
        }

        public Criteria andByearGreaterThanOrEqualTo(Integer value) {
            addCriterion("Byear >=", value, "byear");
            return (Criteria) this;
        }

        public Criteria andByearLessThan(Integer value) {
            addCriterion("Byear <", value, "byear");
            return (Criteria) this;
        }

        public Criteria andByearLessThanOrEqualTo(Integer value) {
            addCriterion("Byear <=", value, "byear");
            return (Criteria) this;
        }

        public Criteria andByearIn(List<Integer> values) {
            addCriterion("Byear in", values, "byear");
            return (Criteria) this;
        }

        public Criteria andByearNotIn(List<Integer> values) {
            addCriterion("Byear not in", values, "byear");
            return (Criteria) this;
        }

        public Criteria andByearBetween(Integer value1, Integer value2) {
            addCriterion("Byear between", value1, value2, "byear");
            return (Criteria) this;
        }

        public Criteria andByearNotBetween(Integer value1, Integer value2) {
            addCriterion("Byear not between", value1, value2, "byear");
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