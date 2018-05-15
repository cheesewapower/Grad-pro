package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuyerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuyerExample() {
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

        public Criteria andBuynameIsNull() {
            addCriterion("buyName is null");
            return (Criteria) this;
        }

        public Criteria andBuynameIsNotNull() {
            addCriterion("buyName is not null");
            return (Criteria) this;
        }

        public Criteria andBuynameEqualTo(String value) {
            addCriterion("buyName =", value, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameNotEqualTo(String value) {
            addCriterion("buyName <>", value, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameGreaterThan(String value) {
            addCriterion("buyName >", value, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameGreaterThanOrEqualTo(String value) {
            addCriterion("buyName >=", value, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameLessThan(String value) {
            addCriterion("buyName <", value, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameLessThanOrEqualTo(String value) {
            addCriterion("buyName <=", value, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameLike(String value) {
            addCriterion("buyName like", value, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameNotLike(String value) {
            addCriterion("buyName not like", value, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameIn(List<String> values) {
            addCriterion("buyName in", values, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameNotIn(List<String> values) {
            addCriterion("buyName not in", values, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameBetween(String value1, String value2) {
            addCriterion("buyName between", value1, value2, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameNotBetween(String value1, String value2) {
            addCriterion("buyName not between", value1, value2, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuystiIsNull() {
            addCriterion("buySti is null");
            return (Criteria) this;
        }

        public Criteria andBuystiIsNotNull() {
            addCriterion("buySti is not null");
            return (Criteria) this;
        }

        public Criteria andBuystiEqualTo(String value) {
            addCriterion("buySti =", value, "buysti");
            return (Criteria) this;
        }

        public Criteria andBuystiNotEqualTo(String value) {
            addCriterion("buySti <>", value, "buysti");
            return (Criteria) this;
        }

        public Criteria andBuystiGreaterThan(String value) {
            addCriterion("buySti >", value, "buysti");
            return (Criteria) this;
        }

        public Criteria andBuystiGreaterThanOrEqualTo(String value) {
            addCriterion("buySti >=", value, "buysti");
            return (Criteria) this;
        }

        public Criteria andBuystiLessThan(String value) {
            addCriterion("buySti <", value, "buysti");
            return (Criteria) this;
        }

        public Criteria andBuystiLessThanOrEqualTo(String value) {
            addCriterion("buySti <=", value, "buysti");
            return (Criteria) this;
        }

        public Criteria andBuystiLike(String value) {
            addCriterion("buySti like", value, "buysti");
            return (Criteria) this;
        }

        public Criteria andBuystiNotLike(String value) {
            addCriterion("buySti not like", value, "buysti");
            return (Criteria) this;
        }

        public Criteria andBuystiIn(List<String> values) {
            addCriterion("buySti in", values, "buysti");
            return (Criteria) this;
        }

        public Criteria andBuystiNotIn(List<String> values) {
            addCriterion("buySti not in", values, "buysti");
            return (Criteria) this;
        }

        public Criteria andBuystiBetween(String value1, String value2) {
            addCriterion("buySti between", value1, value2, "buysti");
            return (Criteria) this;
        }

        public Criteria andBuystiNotBetween(String value1, String value2) {
            addCriterion("buySti not between", value1, value2, "buysti");
            return (Criteria) this;
        }

        public Criteria andBuydateIsNull() {
            addCriterion("buyDate is null");
            return (Criteria) this;
        }

        public Criteria andBuydateIsNotNull() {
            addCriterion("buyDate is not null");
            return (Criteria) this;
        }

        public Criteria andBuydateEqualTo(Date value) {
            addCriterion("buyDate =", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotEqualTo(Date value) {
            addCriterion("buyDate <>", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateGreaterThan(Date value) {
            addCriterion("buyDate >", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateGreaterThanOrEqualTo(Date value) {
            addCriterion("buyDate >=", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateLessThan(Date value) {
            addCriterion("buyDate <", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateLessThanOrEqualTo(Date value) {
            addCriterion("buyDate <=", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateIn(List<Date> values) {
            addCriterion("buyDate in", values, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotIn(List<Date> values) {
            addCriterion("buyDate not in", values, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateBetween(Date value1, Date value2) {
            addCriterion("buyDate between", value1, value2, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotBetween(Date value1, Date value2) {
            addCriterion("buyDate not between", value1, value2, "buydate");
            return (Criteria) this;
        }

        public Criteria andHouseidIsNull() {
            addCriterion("houseId is null");
            return (Criteria) this;
        }

        public Criteria andHouseidIsNotNull() {
            addCriterion("houseId is not null");
            return (Criteria) this;
        }

        public Criteria andHouseidEqualTo(Integer value) {
            addCriterion("houseId =", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotEqualTo(Integer value) {
            addCriterion("houseId <>", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidGreaterThan(Integer value) {
            addCriterion("houseId >", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("houseId >=", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidLessThan(Integer value) {
            addCriterion("houseId <", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidLessThanOrEqualTo(Integer value) {
            addCriterion("houseId <=", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidIn(List<Integer> values) {
            addCriterion("houseId in", values, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotIn(List<Integer> values) {
            addCriterion("houseId not in", values, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidBetween(Integer value1, Integer value2) {
            addCriterion("houseId between", value1, value2, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotBetween(Integer value1, Integer value2) {
            addCriterion("houseId not between", value1, value2, "houseid");
            return (Criteria) this;
        }

        public Criteria andBuyincomeIsNull() {
            addCriterion("buyIncome is null");
            return (Criteria) this;
        }

        public Criteria andBuyincomeIsNotNull() {
            addCriterion("buyIncome is not null");
            return (Criteria) this;
        }

        public Criteria andBuyincomeEqualTo(Integer value) {
            addCriterion("buyIncome =", value, "buyincome");
            return (Criteria) this;
        }

        public Criteria andBuyincomeNotEqualTo(Integer value) {
            addCriterion("buyIncome <>", value, "buyincome");
            return (Criteria) this;
        }

        public Criteria andBuyincomeGreaterThan(Integer value) {
            addCriterion("buyIncome >", value, "buyincome");
            return (Criteria) this;
        }

        public Criteria andBuyincomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyIncome >=", value, "buyincome");
            return (Criteria) this;
        }

        public Criteria andBuyincomeLessThan(Integer value) {
            addCriterion("buyIncome <", value, "buyincome");
            return (Criteria) this;
        }

        public Criteria andBuyincomeLessThanOrEqualTo(Integer value) {
            addCriterion("buyIncome <=", value, "buyincome");
            return (Criteria) this;
        }

        public Criteria andBuyincomeIn(List<Integer> values) {
            addCriterion("buyIncome in", values, "buyincome");
            return (Criteria) this;
        }

        public Criteria andBuyincomeNotIn(List<Integer> values) {
            addCriterion("buyIncome not in", values, "buyincome");
            return (Criteria) this;
        }

        public Criteria andBuyincomeBetween(Integer value1, Integer value2) {
            addCriterion("buyIncome between", value1, value2, "buyincome");
            return (Criteria) this;
        }

        public Criteria andBuyincomeNotBetween(Integer value1, Integer value2) {
            addCriterion("buyIncome not between", value1, value2, "buyincome");
            return (Criteria) this;
        }

        public Criteria andBuytypeIsNull() {
            addCriterion("buyType is null");
            return (Criteria) this;
        }

        public Criteria andBuytypeIsNotNull() {
            addCriterion("buyType is not null");
            return (Criteria) this;
        }

        public Criteria andBuytypeEqualTo(String value) {
            addCriterion("buyType =", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeNotEqualTo(String value) {
            addCriterion("buyType <>", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeGreaterThan(String value) {
            addCriterion("buyType >", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeGreaterThanOrEqualTo(String value) {
            addCriterion("buyType >=", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeLessThan(String value) {
            addCriterion("buyType <", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeLessThanOrEqualTo(String value) {
            addCriterion("buyType <=", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeLike(String value) {
            addCriterion("buyType like", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeNotLike(String value) {
            addCriterion("buyType not like", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeIn(List<String> values) {
            addCriterion("buyType in", values, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeNotIn(List<String> values) {
            addCriterion("buyType not in", values, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeBetween(String value1, String value2) {
            addCriterion("buyType between", value1, value2, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeNotBetween(String value1, String value2) {
            addCriterion("buyType not between", value1, value2, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuyhjIsNull() {
            addCriterion("buyHJ is null");
            return (Criteria) this;
        }

        public Criteria andBuyhjIsNotNull() {
            addCriterion("buyHJ is not null");
            return (Criteria) this;
        }

        public Criteria andBuyhjEqualTo(String value) {
            addCriterion("buyHJ =", value, "buyhj");
            return (Criteria) this;
        }

        public Criteria andBuyhjNotEqualTo(String value) {
            addCriterion("buyHJ <>", value, "buyhj");
            return (Criteria) this;
        }

        public Criteria andBuyhjGreaterThan(String value) {
            addCriterion("buyHJ >", value, "buyhj");
            return (Criteria) this;
        }

        public Criteria andBuyhjGreaterThanOrEqualTo(String value) {
            addCriterion("buyHJ >=", value, "buyhj");
            return (Criteria) this;
        }

        public Criteria andBuyhjLessThan(String value) {
            addCriterion("buyHJ <", value, "buyhj");
            return (Criteria) this;
        }

        public Criteria andBuyhjLessThanOrEqualTo(String value) {
            addCriterion("buyHJ <=", value, "buyhj");
            return (Criteria) this;
        }

        public Criteria andBuyhjLike(String value) {
            addCriterion("buyHJ like", value, "buyhj");
            return (Criteria) this;
        }

        public Criteria andBuyhjNotLike(String value) {
            addCriterion("buyHJ not like", value, "buyhj");
            return (Criteria) this;
        }

        public Criteria andBuyhjIn(List<String> values) {
            addCriterion("buyHJ in", values, "buyhj");
            return (Criteria) this;
        }

        public Criteria andBuyhjNotIn(List<String> values) {
            addCriterion("buyHJ not in", values, "buyhj");
            return (Criteria) this;
        }

        public Criteria andBuyhjBetween(String value1, String value2) {
            addCriterion("buyHJ between", value1, value2, "buyhj");
            return (Criteria) this;
        }

        public Criteria andBuyhjNotBetween(String value1, String value2) {
            addCriterion("buyHJ not between", value1, value2, "buyhj");
            return (Criteria) this;
        }

        public Criteria andBuyphoneIsNull() {
            addCriterion("buyPhone is null");
            return (Criteria) this;
        }

        public Criteria andBuyphoneIsNotNull() {
            addCriterion("buyPhone is not null");
            return (Criteria) this;
        }

        public Criteria andBuyphoneEqualTo(String value) {
            addCriterion("buyPhone =", value, "buyphone");
            return (Criteria) this;
        }

        public Criteria andBuyphoneNotEqualTo(String value) {
            addCriterion("buyPhone <>", value, "buyphone");
            return (Criteria) this;
        }

        public Criteria andBuyphoneGreaterThan(String value) {
            addCriterion("buyPhone >", value, "buyphone");
            return (Criteria) this;
        }

        public Criteria andBuyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("buyPhone >=", value, "buyphone");
            return (Criteria) this;
        }

        public Criteria andBuyphoneLessThan(String value) {
            addCriterion("buyPhone <", value, "buyphone");
            return (Criteria) this;
        }

        public Criteria andBuyphoneLessThanOrEqualTo(String value) {
            addCriterion("buyPhone <=", value, "buyphone");
            return (Criteria) this;
        }

        public Criteria andBuyphoneLike(String value) {
            addCriterion("buyPhone like", value, "buyphone");
            return (Criteria) this;
        }

        public Criteria andBuyphoneNotLike(String value) {
            addCriterion("buyPhone not like", value, "buyphone");
            return (Criteria) this;
        }

        public Criteria andBuyphoneIn(List<String> values) {
            addCriterion("buyPhone in", values, "buyphone");
            return (Criteria) this;
        }

        public Criteria andBuyphoneNotIn(List<String> values) {
            addCriterion("buyPhone not in", values, "buyphone");
            return (Criteria) this;
        }

        public Criteria andBuyphoneBetween(String value1, String value2) {
            addCriterion("buyPhone between", value1, value2, "buyphone");
            return (Criteria) this;
        }

        public Criteria andBuyphoneNotBetween(String value1, String value2) {
            addCriterion("buyPhone not between", value1, value2, "buyphone");
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