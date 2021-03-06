package com.yiyuan.pojo;

import java.util.ArrayList;
import java.util.List;

public class XueliExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XueliExample() {
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

        public Criteria andX_idIsNull() {
            addCriterion("x_id is null");
            return (Criteria) this;
        }

        public Criteria andX_idIsNotNull() {
            addCriterion("x_id is not null");
            return (Criteria) this;
        }

        public Criteria andX_idEqualTo(Integer value) {
            addCriterion("x_id =", value, "x_id");
            return (Criteria) this;
        }

        public Criteria andX_idNotEqualTo(Integer value) {
            addCriterion("x_id <>", value, "x_id");
            return (Criteria) this;
        }

        public Criteria andX_idGreaterThan(Integer value) {
            addCriterion("x_id >", value, "x_id");
            return (Criteria) this;
        }

        public Criteria andX_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("x_id >=", value, "x_id");
            return (Criteria) this;
        }

        public Criteria andX_idLessThan(Integer value) {
            addCriterion("x_id <", value, "x_id");
            return (Criteria) this;
        }

        public Criteria andX_idLessThanOrEqualTo(Integer value) {
            addCriterion("x_id <=", value, "x_id");
            return (Criteria) this;
        }

        public Criteria andX_idIn(List<Integer> values) {
            addCriterion("x_id in", values, "x_id");
            return (Criteria) this;
        }

        public Criteria andX_idNotIn(List<Integer> values) {
            addCriterion("x_id not in", values, "x_id");
            return (Criteria) this;
        }

        public Criteria andX_idBetween(Integer value1, Integer value2) {
            addCriterion("x_id between", value1, value2, "x_id");
            return (Criteria) this;
        }

        public Criteria andX_idNotBetween(Integer value1, Integer value2) {
            addCriterion("x_id not between", value1, value2, "x_id");
            return (Criteria) this;
        }

        public Criteria andX_nameIsNull() {
            addCriterion("x_name is null");
            return (Criteria) this;
        }

        public Criteria andX_nameIsNotNull() {
            addCriterion("x_name is not null");
            return (Criteria) this;
        }

        public Criteria andX_nameEqualTo(String value) {
            addCriterion("x_name =", value, "x_name");
            return (Criteria) this;
        }

        public Criteria andX_nameNotEqualTo(String value) {
            addCriterion("x_name <>", value, "x_name");
            return (Criteria) this;
        }

        public Criteria andX_nameGreaterThan(String value) {
            addCriterion("x_name >", value, "x_name");
            return (Criteria) this;
        }

        public Criteria andX_nameGreaterThanOrEqualTo(String value) {
            addCriterion("x_name >=", value, "x_name");
            return (Criteria) this;
        }

        public Criteria andX_nameLessThan(String value) {
            addCriterion("x_name <", value, "x_name");
            return (Criteria) this;
        }

        public Criteria andX_nameLessThanOrEqualTo(String value) {
            addCriterion("x_name <=", value, "x_name");
            return (Criteria) this;
        }

        public Criteria andX_nameLike(String value) {
            addCriterion("x_name like", value, "x_name");
            return (Criteria) this;
        }

        public Criteria andX_nameNotLike(String value) {
            addCriterion("x_name not like", value, "x_name");
            return (Criteria) this;
        }

        public Criteria andX_nameIn(List<String> values) {
            addCriterion("x_name in", values, "x_name");
            return (Criteria) this;
        }

        public Criteria andX_nameNotIn(List<String> values) {
            addCriterion("x_name not in", values, "x_name");
            return (Criteria) this;
        }

        public Criteria andX_nameBetween(String value1, String value2) {
            addCriterion("x_name between", value1, value2, "x_name");
            return (Criteria) this;
        }

        public Criteria andX_nameNotBetween(String value1, String value2) {
            addCriterion("x_name not between", value1, value2, "x_name");
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