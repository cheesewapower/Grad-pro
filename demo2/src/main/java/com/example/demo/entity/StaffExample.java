package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andStaffnameIsNull() {
            addCriterion("staffName is null");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNotNull() {
            addCriterion("staffName is not null");
            return (Criteria) this;
        }

        public Criteria andStaffnameEqualTo(String value) {
            addCriterion("staffName =", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotEqualTo(String value) {
            addCriterion("staffName <>", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThan(String value) {
            addCriterion("staffName >", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThanOrEqualTo(String value) {
            addCriterion("staffName >=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThan(String value) {
            addCriterion("staffName <", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThanOrEqualTo(String value) {
            addCriterion("staffName <=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLike(String value) {
            addCriterion("staffName like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotLike(String value) {
            addCriterion("staffName not like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameIn(List<String> values) {
            addCriterion("staffName in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotIn(List<String> values) {
            addCriterion("staffName not in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameBetween(String value1, String value2) {
            addCriterion("staffName between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotBetween(String value1, String value2) {
            addCriterion("staffName not between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffdeIsNull() {
            addCriterion("staffDe is null");
            return (Criteria) this;
        }

        public Criteria andStaffdeIsNotNull() {
            addCriterion("staffDe is not null");
            return (Criteria) this;
        }

        public Criteria andStaffdeEqualTo(String value) {
            addCriterion("staffDe =", value, "staffde");
            return (Criteria) this;
        }

        public Criteria andStaffdeNotEqualTo(String value) {
            addCriterion("staffDe <>", value, "staffde");
            return (Criteria) this;
        }

        public Criteria andStaffdeGreaterThan(String value) {
            addCriterion("staffDe >", value, "staffde");
            return (Criteria) this;
        }

        public Criteria andStaffdeGreaterThanOrEqualTo(String value) {
            addCriterion("staffDe >=", value, "staffde");
            return (Criteria) this;
        }

        public Criteria andStaffdeLessThan(String value) {
            addCriterion("staffDe <", value, "staffde");
            return (Criteria) this;
        }

        public Criteria andStaffdeLessThanOrEqualTo(String value) {
            addCriterion("staffDe <=", value, "staffde");
            return (Criteria) this;
        }

        public Criteria andStaffdeLike(String value) {
            addCriterion("staffDe like", value, "staffde");
            return (Criteria) this;
        }

        public Criteria andStaffdeNotLike(String value) {
            addCriterion("staffDe not like", value, "staffde");
            return (Criteria) this;
        }

        public Criteria andStaffdeIn(List<String> values) {
            addCriterion("staffDe in", values, "staffde");
            return (Criteria) this;
        }

        public Criteria andStaffdeNotIn(List<String> values) {
            addCriterion("staffDe not in", values, "staffde");
            return (Criteria) this;
        }

        public Criteria andStaffdeBetween(String value1, String value2) {
            addCriterion("staffDe between", value1, value2, "staffde");
            return (Criteria) this;
        }

        public Criteria andStaffdeNotBetween(String value1, String value2) {
            addCriterion("staffDe not between", value1, value2, "staffde");
            return (Criteria) this;
        }

        public Criteria andStaffmoneyIsNull() {
            addCriterion("staffMoney is null");
            return (Criteria) this;
        }

        public Criteria andStaffmoneyIsNotNull() {
            addCriterion("staffMoney is not null");
            return (Criteria) this;
        }

        public Criteria andStaffmoneyEqualTo(Integer value) {
            addCriterion("staffMoney =", value, "staffmoney");
            return (Criteria) this;
        }

        public Criteria andStaffmoneyNotEqualTo(Integer value) {
            addCriterion("staffMoney <>", value, "staffmoney");
            return (Criteria) this;
        }

        public Criteria andStaffmoneyGreaterThan(Integer value) {
            addCriterion("staffMoney >", value, "staffmoney");
            return (Criteria) this;
        }

        public Criteria andStaffmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("staffMoney >=", value, "staffmoney");
            return (Criteria) this;
        }

        public Criteria andStaffmoneyLessThan(Integer value) {
            addCriterion("staffMoney <", value, "staffmoney");
            return (Criteria) this;
        }

        public Criteria andStaffmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("staffMoney <=", value, "staffmoney");
            return (Criteria) this;
        }

        public Criteria andStaffmoneyIn(List<Integer> values) {
            addCriterion("staffMoney in", values, "staffmoney");
            return (Criteria) this;
        }

        public Criteria andStaffmoneyNotIn(List<Integer> values) {
            addCriterion("staffMoney not in", values, "staffmoney");
            return (Criteria) this;
        }

        public Criteria andStaffmoneyBetween(Integer value1, Integer value2) {
            addCriterion("staffMoney between", value1, value2, "staffmoney");
            return (Criteria) this;
        }

        public Criteria andStaffmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("staffMoney not between", value1, value2, "staffmoney");
            return (Criteria) this;
        }

        public Criteria andStaffleverIsNull() {
            addCriterion("staffLever is null");
            return (Criteria) this;
        }

        public Criteria andStaffleverIsNotNull() {
            addCriterion("staffLever is not null");
            return (Criteria) this;
        }

        public Criteria andStaffleverEqualTo(Integer value) {
            addCriterion("staffLever =", value, "stafflever");
            return (Criteria) this;
        }

        public Criteria andStaffleverNotEqualTo(Integer value) {
            addCriterion("staffLever <>", value, "stafflever");
            return (Criteria) this;
        }

        public Criteria andStaffleverGreaterThan(Integer value) {
            addCriterion("staffLever >", value, "stafflever");
            return (Criteria) this;
        }

        public Criteria andStaffleverGreaterThanOrEqualTo(Integer value) {
            addCriterion("staffLever >=", value, "stafflever");
            return (Criteria) this;
        }

        public Criteria andStaffleverLessThan(Integer value) {
            addCriterion("staffLever <", value, "stafflever");
            return (Criteria) this;
        }

        public Criteria andStaffleverLessThanOrEqualTo(Integer value) {
            addCriterion("staffLever <=", value, "stafflever");
            return (Criteria) this;
        }

        public Criteria andStaffleverIn(List<Integer> values) {
            addCriterion("staffLever in", values, "stafflever");
            return (Criteria) this;
        }

        public Criteria andStaffleverNotIn(List<Integer> values) {
            addCriterion("staffLever not in", values, "stafflever");
            return (Criteria) this;
        }

        public Criteria andStaffleverBetween(Integer value1, Integer value2) {
            addCriterion("staffLever between", value1, value2, "stafflever");
            return (Criteria) this;
        }

        public Criteria andStaffleverNotBetween(Integer value1, Integer value2) {
            addCriterion("staffLever not between", value1, value2, "stafflever");
            return (Criteria) this;
        }

        public Criteria andStaffdescIsNull() {
            addCriterion("staffDesc is null");
            return (Criteria) this;
        }

        public Criteria andStaffdescIsNotNull() {
            addCriterion("staffDesc is not null");
            return (Criteria) this;
        }

        public Criteria andStaffdescEqualTo(String value) {
            addCriterion("staffDesc =", value, "staffdesc");
            return (Criteria) this;
        }

        public Criteria andStaffdescNotEqualTo(String value) {
            addCriterion("staffDesc <>", value, "staffdesc");
            return (Criteria) this;
        }

        public Criteria andStaffdescGreaterThan(String value) {
            addCriterion("staffDesc >", value, "staffdesc");
            return (Criteria) this;
        }

        public Criteria andStaffdescGreaterThanOrEqualTo(String value) {
            addCriterion("staffDesc >=", value, "staffdesc");
            return (Criteria) this;
        }

        public Criteria andStaffdescLessThan(String value) {
            addCriterion("staffDesc <", value, "staffdesc");
            return (Criteria) this;
        }

        public Criteria andStaffdescLessThanOrEqualTo(String value) {
            addCriterion("staffDesc <=", value, "staffdesc");
            return (Criteria) this;
        }

        public Criteria andStaffdescLike(String value) {
            addCriterion("staffDesc like", value, "staffdesc");
            return (Criteria) this;
        }

        public Criteria andStaffdescNotLike(String value) {
            addCriterion("staffDesc not like", value, "staffdesc");
            return (Criteria) this;
        }

        public Criteria andStaffdescIn(List<String> values) {
            addCriterion("staffDesc in", values, "staffdesc");
            return (Criteria) this;
        }

        public Criteria andStaffdescNotIn(List<String> values) {
            addCriterion("staffDesc not in", values, "staffdesc");
            return (Criteria) this;
        }

        public Criteria andStaffdescBetween(String value1, String value2) {
            addCriterion("staffDesc between", value1, value2, "staffdesc");
            return (Criteria) this;
        }

        public Criteria andStaffdescNotBetween(String value1, String value2) {
            addCriterion("staffDesc not between", value1, value2, "staffdesc");
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