package com.elite.commoditymanagement.model;

import java.util.ArrayList;
import java.util.List;

public class CatagorgyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CatagorgyExample() {
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

        public Criteria andCatagorgyIdIsNull() {
            addCriterion("catagorgy_id is null");
            return (Criteria) this;
        }

        public Criteria andCatagorgyIdIsNotNull() {
            addCriterion("catagorgy_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatagorgyIdEqualTo(Integer value) {
            addCriterion("catagorgy_id =", value, "catagorgyId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyIdNotEqualTo(Integer value) {
            addCriterion("catagorgy_id <>", value, "catagorgyId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyIdGreaterThan(Integer value) {
            addCriterion("catagorgy_id >", value, "catagorgyId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("catagorgy_id >=", value, "catagorgyId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyIdLessThan(Integer value) {
            addCriterion("catagorgy_id <", value, "catagorgyId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyIdLessThanOrEqualTo(Integer value) {
            addCriterion("catagorgy_id <=", value, "catagorgyId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyIdIn(List<Integer> values) {
            addCriterion("catagorgy_id in", values, "catagorgyId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyIdNotIn(List<Integer> values) {
            addCriterion("catagorgy_id not in", values, "catagorgyId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyIdBetween(Integer value1, Integer value2) {
            addCriterion("catagorgy_id between", value1, value2, "catagorgyId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("catagorgy_id not between", value1, value2, "catagorgyId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyParentIdIsNull() {
            addCriterion("catagorgy_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andCatagorgyParentIdIsNotNull() {
            addCriterion("catagorgy_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatagorgyParentIdEqualTo(Integer value) {
            addCriterion("catagorgy_parent_id =", value, "catagorgyParentId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyParentIdNotEqualTo(Integer value) {
            addCriterion("catagorgy_parent_id <>", value, "catagorgyParentId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyParentIdGreaterThan(Integer value) {
            addCriterion("catagorgy_parent_id >", value, "catagorgyParentId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("catagorgy_parent_id >=", value, "catagorgyParentId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyParentIdLessThan(Integer value) {
            addCriterion("catagorgy_parent_id <", value, "catagorgyParentId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("catagorgy_parent_id <=", value, "catagorgyParentId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyParentIdIn(List<Integer> values) {
            addCriterion("catagorgy_parent_id in", values, "catagorgyParentId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyParentIdNotIn(List<Integer> values) {
            addCriterion("catagorgy_parent_id not in", values, "catagorgyParentId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyParentIdBetween(Integer value1, Integer value2) {
            addCriterion("catagorgy_parent_id between", value1, value2, "catagorgyParentId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("catagorgy_parent_id not between", value1, value2, "catagorgyParentId");
            return (Criteria) this;
        }

        public Criteria andCatagorgyNameIsNull() {
            addCriterion("catagorgy_name is null");
            return (Criteria) this;
        }

        public Criteria andCatagorgyNameIsNotNull() {
            addCriterion("catagorgy_name is not null");
            return (Criteria) this;
        }

        public Criteria andCatagorgyNameEqualTo(String value) {
            addCriterion("catagorgy_name =", value, "catagorgyName");
            return (Criteria) this;
        }

        public Criteria andCatagorgyNameNotEqualTo(String value) {
            addCriterion("catagorgy_name <>", value, "catagorgyName");
            return (Criteria) this;
        }

        public Criteria andCatagorgyNameGreaterThan(String value) {
            addCriterion("catagorgy_name >", value, "catagorgyName");
            return (Criteria) this;
        }

        public Criteria andCatagorgyNameGreaterThanOrEqualTo(String value) {
            addCriterion("catagorgy_name >=", value, "catagorgyName");
            return (Criteria) this;
        }

        public Criteria andCatagorgyNameLessThan(String value) {
            addCriterion("catagorgy_name <", value, "catagorgyName");
            return (Criteria) this;
        }

        public Criteria andCatagorgyNameLessThanOrEqualTo(String value) {
            addCriterion("catagorgy_name <=", value, "catagorgyName");
            return (Criteria) this;
        }

        public Criteria andCatagorgyNameLike(String value) {
            addCriterion("catagorgy_name like", value, "catagorgyName");
            return (Criteria) this;
        }

        public Criteria andCatagorgyNameNotLike(String value) {
            addCriterion("catagorgy_name not like", value, "catagorgyName");
            return (Criteria) this;
        }

        public Criteria andCatagorgyNameIn(List<String> values) {
            addCriterion("catagorgy_name in", values, "catagorgyName");
            return (Criteria) this;
        }

        public Criteria andCatagorgyNameNotIn(List<String> values) {
            addCriterion("catagorgy_name not in", values, "catagorgyName");
            return (Criteria) this;
        }

        public Criteria andCatagorgyNameBetween(String value1, String value2) {
            addCriterion("catagorgy_name between", value1, value2, "catagorgyName");
            return (Criteria) this;
        }

        public Criteria andCatagorgyNameNotBetween(String value1, String value2) {
            addCriterion("catagorgy_name not between", value1, value2, "catagorgyName");
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