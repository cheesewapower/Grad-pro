package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseExample() {
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

        public Criteria andHousesnIsNull() {
            addCriterion("houseSn is null");
            return (Criteria) this;
        }

        public Criteria andHousesnIsNotNull() {
            addCriterion("houseSn is not null");
            return (Criteria) this;
        }

        public Criteria andHousesnEqualTo(String value) {
            addCriterion("houseSn =", value, "housesn");
            return (Criteria) this;
        }

        public Criteria andHousesnNotEqualTo(String value) {
            addCriterion("houseSn <>", value, "housesn");
            return (Criteria) this;
        }

        public Criteria andHousesnGreaterThan(String value) {
            addCriterion("houseSn >", value, "housesn");
            return (Criteria) this;
        }

        public Criteria andHousesnGreaterThanOrEqualTo(String value) {
            addCriterion("houseSn >=", value, "housesn");
            return (Criteria) this;
        }

        public Criteria andHousesnLessThan(String value) {
            addCriterion("houseSn <", value, "housesn");
            return (Criteria) this;
        }

        public Criteria andHousesnLessThanOrEqualTo(String value) {
            addCriterion("houseSn <=", value, "housesn");
            return (Criteria) this;
        }

        public Criteria andHousesnLike(String value) {
            addCriterion("houseSn like", value, "housesn");
            return (Criteria) this;
        }

        public Criteria andHousesnNotLike(String value) {
            addCriterion("houseSn not like", value, "housesn");
            return (Criteria) this;
        }

        public Criteria andHousesnIn(List<String> values) {
            addCriterion("houseSn in", values, "housesn");
            return (Criteria) this;
        }

        public Criteria andHousesnNotIn(List<String> values) {
            addCriterion("houseSn not in", values, "housesn");
            return (Criteria) this;
        }

        public Criteria andHousesnBetween(String value1, String value2) {
            addCriterion("houseSn between", value1, value2, "housesn");
            return (Criteria) this;
        }

        public Criteria andHousesnNotBetween(String value1, String value2) {
            addCriterion("houseSn not between", value1, value2, "housesn");
            return (Criteria) this;
        }

        public Criteria andBuyidIsNull() {
            addCriterion("buyId is null");
            return (Criteria) this;
        }

        public Criteria andBuyidIsNotNull() {
            addCriterion("buyId is not null");
            return (Criteria) this;
        }

        public Criteria andBuyidEqualTo(Integer value) {
            addCriterion("buyId =", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidNotEqualTo(Integer value) {
            addCriterion("buyId <>", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidGreaterThan(Integer value) {
            addCriterion("buyId >", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyId >=", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidLessThan(Integer value) {
            addCriterion("buyId <", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidLessThanOrEqualTo(Integer value) {
            addCriterion("buyId <=", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidIn(List<Integer> values) {
            addCriterion("buyId in", values, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidNotIn(List<Integer> values) {
            addCriterion("buyId not in", values, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidBetween(Integer value1, Integer value2) {
            addCriterion("buyId between", value1, value2, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidNotBetween(Integer value1, Integer value2) {
            addCriterion("buyId not between", value1, value2, "buyid");
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

        public Criteria andHouseselldateIsNull() {
            addCriterion("houseSellDate is null");
            return (Criteria) this;
        }

        public Criteria andHouseselldateIsNotNull() {
            addCriterion("houseSellDate is not null");
            return (Criteria) this;
        }

        public Criteria andHouseselldateEqualTo(Date value) {
            addCriterion("houseSellDate =", value, "houseselldate");
            return (Criteria) this;
        }

        public Criteria andHouseselldateNotEqualTo(Date value) {
            addCriterion("houseSellDate <>", value, "houseselldate");
            return (Criteria) this;
        }

        public Criteria andHouseselldateGreaterThan(Date value) {
            addCriterion("houseSellDate >", value, "houseselldate");
            return (Criteria) this;
        }

        public Criteria andHouseselldateGreaterThanOrEqualTo(Date value) {
            addCriterion("houseSellDate >=", value, "houseselldate");
            return (Criteria) this;
        }

        public Criteria andHouseselldateLessThan(Date value) {
            addCriterion("houseSellDate <", value, "houseselldate");
            return (Criteria) this;
        }

        public Criteria andHouseselldateLessThanOrEqualTo(Date value) {
            addCriterion("houseSellDate <=", value, "houseselldate");
            return (Criteria) this;
        }

        public Criteria andHouseselldateIn(List<Date> values) {
            addCriterion("houseSellDate in", values, "houseselldate");
            return (Criteria) this;
        }

        public Criteria andHouseselldateNotIn(List<Date> values) {
            addCriterion("houseSellDate not in", values, "houseselldate");
            return (Criteria) this;
        }

        public Criteria andHouseselldateBetween(Date value1, Date value2) {
            addCriterion("houseSellDate between", value1, value2, "houseselldate");
            return (Criteria) this;
        }

        public Criteria andHouseselldateNotBetween(Date value1, Date value2) {
            addCriterion("houseSellDate not between", value1, value2, "houseselldate");
            return (Criteria) this;
        }

        public Criteria andHousestrucIsNull() {
            addCriterion("houseStruc is null");
            return (Criteria) this;
        }

        public Criteria andHousestrucIsNotNull() {
            addCriterion("houseStruc is not null");
            return (Criteria) this;
        }

        public Criteria andHousestrucEqualTo(String value) {
            addCriterion("houseStruc =", value, "housestruc");
            return (Criteria) this;
        }

        public Criteria andHousestrucNotEqualTo(String value) {
            addCriterion("houseStruc <>", value, "housestruc");
            return (Criteria) this;
        }

        public Criteria andHousestrucGreaterThan(String value) {
            addCriterion("houseStruc >", value, "housestruc");
            return (Criteria) this;
        }

        public Criteria andHousestrucGreaterThanOrEqualTo(String value) {
            addCriterion("houseStruc >=", value, "housestruc");
            return (Criteria) this;
        }

        public Criteria andHousestrucLessThan(String value) {
            addCriterion("houseStruc <", value, "housestruc");
            return (Criteria) this;
        }

        public Criteria andHousestrucLessThanOrEqualTo(String value) {
            addCriterion("houseStruc <=", value, "housestruc");
            return (Criteria) this;
        }

        public Criteria andHousestrucLike(String value) {
            addCriterion("houseStruc like", value, "housestruc");
            return (Criteria) this;
        }

        public Criteria andHousestrucNotLike(String value) {
            addCriterion("houseStruc not like", value, "housestruc");
            return (Criteria) this;
        }

        public Criteria andHousestrucIn(List<String> values) {
            addCriterion("houseStruc in", values, "housestruc");
            return (Criteria) this;
        }

        public Criteria andHousestrucNotIn(List<String> values) {
            addCriterion("houseStruc not in", values, "housestruc");
            return (Criteria) this;
        }

        public Criteria andHousestrucBetween(String value1, String value2) {
            addCriterion("houseStruc between", value1, value2, "housestruc");
            return (Criteria) this;
        }

        public Criteria andHousestrucNotBetween(String value1, String value2) {
            addCriterion("houseStruc not between", value1, value2, "housestruc");
            return (Criteria) this;
        }

        public Criteria andHouseaddIsNull() {
            addCriterion("houseAdd is null");
            return (Criteria) this;
        }

        public Criteria andHouseaddIsNotNull() {
            addCriterion("houseAdd is not null");
            return (Criteria) this;
        }

        public Criteria andHouseaddEqualTo(String value) {
            addCriterion("houseAdd =", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddNotEqualTo(String value) {
            addCriterion("houseAdd <>", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddGreaterThan(String value) {
            addCriterion("houseAdd >", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddGreaterThanOrEqualTo(String value) {
            addCriterion("houseAdd >=", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddLessThan(String value) {
            addCriterion("houseAdd <", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddLessThanOrEqualTo(String value) {
            addCriterion("houseAdd <=", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddLike(String value) {
            addCriterion("houseAdd like", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddNotLike(String value) {
            addCriterion("houseAdd not like", value, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddIn(List<String> values) {
            addCriterion("houseAdd in", values, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddNotIn(List<String> values) {
            addCriterion("houseAdd not in", values, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddBetween(String value1, String value2) {
            addCriterion("houseAdd between", value1, value2, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseaddNotBetween(String value1, String value2) {
            addCriterion("houseAdd not between", value1, value2, "houseadd");
            return (Criteria) this;
        }

        public Criteria andHouseyearIsNull() {
            addCriterion("houseYear is null");
            return (Criteria) this;
        }

        public Criteria andHouseyearIsNotNull() {
            addCriterion("houseYear is not null");
            return (Criteria) this;
        }

        public Criteria andHouseyearEqualTo(String value) {
            addCriterion("houseYear =", value, "houseyear");
            return (Criteria) this;
        }

        public Criteria andHouseyearNotEqualTo(String value) {
            addCriterion("houseYear <>", value, "houseyear");
            return (Criteria) this;
        }

        public Criteria andHouseyearGreaterThan(String value) {
            addCriterion("houseYear >", value, "houseyear");
            return (Criteria) this;
        }

        public Criteria andHouseyearGreaterThanOrEqualTo(String value) {
            addCriterion("houseYear >=", value, "houseyear");
            return (Criteria) this;
        }

        public Criteria andHouseyearLessThan(String value) {
            addCriterion("houseYear <", value, "houseyear");
            return (Criteria) this;
        }

        public Criteria andHouseyearLessThanOrEqualTo(String value) {
            addCriterion("houseYear <=", value, "houseyear");
            return (Criteria) this;
        }

        public Criteria andHouseyearLike(String value) {
            addCriterion("houseYear like", value, "houseyear");
            return (Criteria) this;
        }

        public Criteria andHouseyearNotLike(String value) {
            addCriterion("houseYear not like", value, "houseyear");
            return (Criteria) this;
        }

        public Criteria andHouseyearIn(List<String> values) {
            addCriterion("houseYear in", values, "houseyear");
            return (Criteria) this;
        }

        public Criteria andHouseyearNotIn(List<String> values) {
            addCriterion("houseYear not in", values, "houseyear");
            return (Criteria) this;
        }

        public Criteria andHouseyearBetween(String value1, String value2) {
            addCriterion("houseYear between", value1, value2, "houseyear");
            return (Criteria) this;
        }

        public Criteria andHouseyearNotBetween(String value1, String value2) {
            addCriterion("houseYear not between", value1, value2, "houseyear");
            return (Criteria) this;
        }

        public Criteria andHousesizeIsNull() {
            addCriterion("houseSize is null");
            return (Criteria) this;
        }

        public Criteria andHousesizeIsNotNull() {
            addCriterion("houseSize is not null");
            return (Criteria) this;
        }

        public Criteria andHousesizeEqualTo(Double value) {
            addCriterion("houseSize =", value, "housesize");
            return (Criteria) this;
        }

        public Criteria andHousesizeNotEqualTo(Double value) {
            addCriterion("houseSize <>", value, "housesize");
            return (Criteria) this;
        }

        public Criteria andHousesizeGreaterThan(Double value) {
            addCriterion("houseSize >", value, "housesize");
            return (Criteria) this;
        }

        public Criteria andHousesizeGreaterThanOrEqualTo(Double value) {
            addCriterion("houseSize >=", value, "housesize");
            return (Criteria) this;
        }

        public Criteria andHousesizeLessThan(Double value) {
            addCriterion("houseSize <", value, "housesize");
            return (Criteria) this;
        }

        public Criteria andHousesizeLessThanOrEqualTo(Double value) {
            addCriterion("houseSize <=", value, "housesize");
            return (Criteria) this;
        }

        public Criteria andHousesizeIn(List<Double> values) {
            addCriterion("houseSize in", values, "housesize");
            return (Criteria) this;
        }

        public Criteria andHousesizeNotIn(List<Double> values) {
            addCriterion("houseSize not in", values, "housesize");
            return (Criteria) this;
        }

        public Criteria andHousesizeBetween(Double value1, Double value2) {
            addCriterion("houseSize between", value1, value2, "housesize");
            return (Criteria) this;
        }

        public Criteria andHousesizeNotBetween(Double value1, Double value2) {
            addCriterion("houseSize not between", value1, value2, "housesize");
            return (Criteria) this;
        }

        public Criteria andHosuecqIsNull() {
            addCriterion("hosueCq is null");
            return (Criteria) this;
        }

        public Criteria andHosuecqIsNotNull() {
            addCriterion("hosueCq is not null");
            return (Criteria) this;
        }

        public Criteria andHosuecqEqualTo(Integer value) {
            addCriterion("hosueCq =", value, "hosuecq");
            return (Criteria) this;
        }

        public Criteria andHosuecqNotEqualTo(Integer value) {
            addCriterion("hosueCq <>", value, "hosuecq");
            return (Criteria) this;
        }

        public Criteria andHosuecqGreaterThan(Integer value) {
            addCriterion("hosueCq >", value, "hosuecq");
            return (Criteria) this;
        }

        public Criteria andHosuecqGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosueCq >=", value, "hosuecq");
            return (Criteria) this;
        }

        public Criteria andHosuecqLessThan(Integer value) {
            addCriterion("hosueCq <", value, "hosuecq");
            return (Criteria) this;
        }

        public Criteria andHosuecqLessThanOrEqualTo(Integer value) {
            addCriterion("hosueCq <=", value, "hosuecq");
            return (Criteria) this;
        }

        public Criteria andHosuecqIn(List<Integer> values) {
            addCriterion("hosueCq in", values, "hosuecq");
            return (Criteria) this;
        }

        public Criteria andHosuecqNotIn(List<Integer> values) {
            addCriterion("hosueCq not in", values, "hosuecq");
            return (Criteria) this;
        }

        public Criteria andHosuecqBetween(Integer value1, Integer value2) {
            addCriterion("hosueCq between", value1, value2, "hosuecq");
            return (Criteria) this;
        }

        public Criteria andHosuecqNotBetween(Integer value1, Integer value2) {
            addCriterion("hosueCq not between", value1, value2, "hosuecq");
            return (Criteria) this;
        }

        public Criteria andHousestatusIsNull() {
            addCriterion("houseStatus is null");
            return (Criteria) this;
        }

        public Criteria andHousestatusIsNotNull() {
            addCriterion("houseStatus is not null");
            return (Criteria) this;
        }

        public Criteria andHousestatusEqualTo(String value) {
            addCriterion("houseStatus =", value, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusNotEqualTo(String value) {
            addCriterion("houseStatus <>", value, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusGreaterThan(String value) {
            addCriterion("houseStatus >", value, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusGreaterThanOrEqualTo(String value) {
            addCriterion("houseStatus >=", value, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusLessThan(String value) {
            addCriterion("houseStatus <", value, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusLessThanOrEqualTo(String value) {
            addCriterion("houseStatus <=", value, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusLike(String value) {
            addCriterion("houseStatus like", value, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusNotLike(String value) {
            addCriterion("houseStatus not like", value, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusIn(List<String> values) {
            addCriterion("houseStatus in", values, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusNotIn(List<String> values) {
            addCriterion("houseStatus not in", values, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusBetween(String value1, String value2) {
            addCriterion("houseStatus between", value1, value2, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusNotBetween(String value1, String value2) {
            addCriterion("houseStatus not between", value1, value2, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousesellerIsNull() {
            addCriterion("houseSeller is null");
            return (Criteria) this;
        }

        public Criteria andHousesellerIsNotNull() {
            addCriterion("houseSeller is not null");
            return (Criteria) this;
        }

        public Criteria andHousesellerEqualTo(String value) {
            addCriterion("houseSeller =", value, "houseseller");
            return (Criteria) this;
        }

        public Criteria andHousesellerNotEqualTo(String value) {
            addCriterion("houseSeller <>", value, "houseseller");
            return (Criteria) this;
        }

        public Criteria andHousesellerGreaterThan(String value) {
            addCriterion("houseSeller >", value, "houseseller");
            return (Criteria) this;
        }

        public Criteria andHousesellerGreaterThanOrEqualTo(String value) {
            addCriterion("houseSeller >=", value, "houseseller");
            return (Criteria) this;
        }

        public Criteria andHousesellerLessThan(String value) {
            addCriterion("houseSeller <", value, "houseseller");
            return (Criteria) this;
        }

        public Criteria andHousesellerLessThanOrEqualTo(String value) {
            addCriterion("houseSeller <=", value, "houseseller");
            return (Criteria) this;
        }

        public Criteria andHousesellerLike(String value) {
            addCriterion("houseSeller like", value, "houseseller");
            return (Criteria) this;
        }

        public Criteria andHousesellerNotLike(String value) {
            addCriterion("houseSeller not like", value, "houseseller");
            return (Criteria) this;
        }

        public Criteria andHousesellerIn(List<String> values) {
            addCriterion("houseSeller in", values, "houseseller");
            return (Criteria) this;
        }

        public Criteria andHousesellerNotIn(List<String> values) {
            addCriterion("houseSeller not in", values, "houseseller");
            return (Criteria) this;
        }

        public Criteria andHousesellerBetween(String value1, String value2) {
            addCriterion("houseSeller between", value1, value2, "houseseller");
            return (Criteria) this;
        }

        public Criteria andHousesellerNotBetween(String value1, String value2) {
            addCriterion("houseSeller not between", value1, value2, "houseseller");
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