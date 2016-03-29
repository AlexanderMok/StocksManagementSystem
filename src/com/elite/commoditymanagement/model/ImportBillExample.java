package com.elite.commoditymanagement.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ImportBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImportBillExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andImportIdIsNull() {
            addCriterion("import_id is null");
            return (Criteria) this;
        }

        public Criteria andImportIdIsNotNull() {
            addCriterion("import_id is not null");
            return (Criteria) this;
        }

        public Criteria andImportIdEqualTo(String value) {
            addCriterion("import_id =", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdNotEqualTo(String value) {
            addCriterion("import_id <>", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdGreaterThan(String value) {
            addCriterion("import_id >", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdGreaterThanOrEqualTo(String value) {
            addCriterion("import_id >=", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdLessThan(String value) {
            addCriterion("import_id <", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdLessThanOrEqualTo(String value) {
            addCriterion("import_id <=", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdLike(String value) {
            addCriterion("import_id like", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdNotLike(String value) {
            addCriterion("import_id not like", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdIn(List<String> values) {
            addCriterion("import_id in", values, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdNotIn(List<String> values) {
            addCriterion("import_id not in", values, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdBetween(String value1, String value2) {
            addCriterion("import_id between", value1, value2, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdNotBetween(String value1, String value2) {
            addCriterion("import_id not between", value1, value2, "importId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(String value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(String value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(String value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(String value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(String value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLike(String value) {
            addCriterion("item_id like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotLike(String value) {
            addCriterion("item_id not like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<String> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<String> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(String value1, String value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(String value1, String value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andImportPriceIsNull() {
            addCriterion("import_price is null");
            return (Criteria) this;
        }

        public Criteria andImportPriceIsNotNull() {
            addCriterion("import_price is not null");
            return (Criteria) this;
        }

        public Criteria andImportPriceEqualTo(Double value) {
            addCriterion("import_price =", value, "importPrice");
            return (Criteria) this;
        }

        public Criteria andImportPriceNotEqualTo(Double value) {
            addCriterion("import_price <>", value, "importPrice");
            return (Criteria) this;
        }

        public Criteria andImportPriceGreaterThan(Double value) {
            addCriterion("import_price >", value, "importPrice");
            return (Criteria) this;
        }

        public Criteria andImportPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("import_price >=", value, "importPrice");
            return (Criteria) this;
        }

        public Criteria andImportPriceLessThan(Double value) {
            addCriterion("import_price <", value, "importPrice");
            return (Criteria) this;
        }

        public Criteria andImportPriceLessThanOrEqualTo(Double value) {
            addCriterion("import_price <=", value, "importPrice");
            return (Criteria) this;
        }

        public Criteria andImportPriceIn(List<Double> values) {
            addCriterion("import_price in", values, "importPrice");
            return (Criteria) this;
        }

        public Criteria andImportPriceNotIn(List<Double> values) {
            addCriterion("import_price not in", values, "importPrice");
            return (Criteria) this;
        }

        public Criteria andImportPriceBetween(Double value1, Double value2) {
            addCriterion("import_price between", value1, value2, "importPrice");
            return (Criteria) this;
        }

        public Criteria andImportPriceNotBetween(Double value1, Double value2) {
            addCriterion("import_price not between", value1, value2, "importPrice");
            return (Criteria) this;
        }

        public Criteria andImportAmountIsNull() {
            addCriterion("import_amount is null");
            return (Criteria) this;
        }

        public Criteria andImportAmountIsNotNull() {
            addCriterion("import_amount is not null");
            return (Criteria) this;
        }

        public Criteria andImportAmountEqualTo(Integer value) {
            addCriterion("import_amount =", value, "importAmount");
            return (Criteria) this;
        }

        public Criteria andImportAmountNotEqualTo(Integer value) {
            addCriterion("import_amount <>", value, "importAmount");
            return (Criteria) this;
        }

        public Criteria andImportAmountGreaterThan(Integer value) {
            addCriterion("import_amount >", value, "importAmount");
            return (Criteria) this;
        }

        public Criteria andImportAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("import_amount >=", value, "importAmount");
            return (Criteria) this;
        }

        public Criteria andImportAmountLessThan(Integer value) {
            addCriterion("import_amount <", value, "importAmount");
            return (Criteria) this;
        }

        public Criteria andImportAmountLessThanOrEqualTo(Integer value) {
            addCriterion("import_amount <=", value, "importAmount");
            return (Criteria) this;
        }

        public Criteria andImportAmountIn(List<Integer> values) {
            addCriterion("import_amount in", values, "importAmount");
            return (Criteria) this;
        }

        public Criteria andImportAmountNotIn(List<Integer> values) {
            addCriterion("import_amount not in", values, "importAmount");
            return (Criteria) this;
        }

        public Criteria andImportAmountBetween(Integer value1, Integer value2) {
            addCriterion("import_amount between", value1, value2, "importAmount");
            return (Criteria) this;
        }

        public Criteria andImportAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("import_amount not between", value1, value2, "importAmount");
            return (Criteria) this;
        }

        public Criteria andSuppIdIsNull() {
            addCriterion("supp_id is null");
            return (Criteria) this;
        }

        public Criteria andSuppIdIsNotNull() {
            addCriterion("supp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuppIdEqualTo(String value) {
            addCriterion("supp_id =", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdNotEqualTo(String value) {
            addCriterion("supp_id <>", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdGreaterThan(String value) {
            addCriterion("supp_id >", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdGreaterThanOrEqualTo(String value) {
            addCriterion("supp_id >=", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdLessThan(String value) {
            addCriterion("supp_id <", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdLessThanOrEqualTo(String value) {
            addCriterion("supp_id <=", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdLike(String value) {
            addCriterion("supp_id like", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdNotLike(String value) {
            addCriterion("supp_id not like", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdIn(List<String> values) {
            addCriterion("supp_id in", values, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdNotIn(List<String> values) {
            addCriterion("supp_id not in", values, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdBetween(String value1, String value2) {
            addCriterion("supp_id between", value1, value2, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdNotBetween(String value1, String value2) {
            addCriterion("supp_id not between", value1, value2, "suppId");
            return (Criteria) this;
        }

        public Criteria andImportDateIsNull() {
            addCriterion("import_date is null");
            return (Criteria) this;
        }

        public Criteria andImportDateIsNotNull() {
            addCriterion("import_date is not null");
            return (Criteria) this;
        }

        public Criteria andImportDateEqualTo(Date value) {
            addCriterionForJDBCDate("import_date =", value, "importDate");
            return (Criteria) this;
        }

        public Criteria andImportDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("import_date <>", value, "importDate");
            return (Criteria) this;
        }

        public Criteria andImportDateGreaterThan(Date value) {
            addCriterionForJDBCDate("import_date >", value, "importDate");
            return (Criteria) this;
        }

        public Criteria andImportDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("import_date >=", value, "importDate");
            return (Criteria) this;
        }

        public Criteria andImportDateLessThan(Date value) {
            addCriterionForJDBCDate("import_date <", value, "importDate");
            return (Criteria) this;
        }

        public Criteria andImportDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("import_date <=", value, "importDate");
            return (Criteria) this;
        }

        public Criteria andImportDateIn(List<Date> values) {
            addCriterionForJDBCDate("import_date in", values, "importDate");
            return (Criteria) this;
        }

        public Criteria andImportDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("import_date not in", values, "importDate");
            return (Criteria) this;
        }

        public Criteria andImportDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("import_date between", value1, value2, "importDate");
            return (Criteria) this;
        }

        public Criteria andImportDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("import_date not between", value1, value2, "importDate");
            return (Criteria) this;
        }

        public Criteria andImportPersonIsNull() {
            addCriterion("import_person is null");
            return (Criteria) this;
        }

        public Criteria andImportPersonIsNotNull() {
            addCriterion("import_person is not null");
            return (Criteria) this;
        }

        public Criteria andImportPersonEqualTo(String value) {
            addCriterion("import_person =", value, "importPerson");
            return (Criteria) this;
        }

        public Criteria andImportPersonNotEqualTo(String value) {
            addCriterion("import_person <>", value, "importPerson");
            return (Criteria) this;
        }

        public Criteria andImportPersonGreaterThan(String value) {
            addCriterion("import_person >", value, "importPerson");
            return (Criteria) this;
        }

        public Criteria andImportPersonGreaterThanOrEqualTo(String value) {
            addCriterion("import_person >=", value, "importPerson");
            return (Criteria) this;
        }

        public Criteria andImportPersonLessThan(String value) {
            addCriterion("import_person <", value, "importPerson");
            return (Criteria) this;
        }

        public Criteria andImportPersonLessThanOrEqualTo(String value) {
            addCriterion("import_person <=", value, "importPerson");
            return (Criteria) this;
        }

        public Criteria andImportPersonLike(String value) {
            addCriterion("import_person like", value, "importPerson");
            return (Criteria) this;
        }

        public Criteria andImportPersonNotLike(String value) {
            addCriterion("import_person not like", value, "importPerson");
            return (Criteria) this;
        }

        public Criteria andImportPersonIn(List<String> values) {
            addCriterion("import_person in", values, "importPerson");
            return (Criteria) this;
        }

        public Criteria andImportPersonNotIn(List<String> values) {
            addCriterion("import_person not in", values, "importPerson");
            return (Criteria) this;
        }

        public Criteria andImportPersonBetween(String value1, String value2) {
            addCriterion("import_person between", value1, value2, "importPerson");
            return (Criteria) this;
        }

        public Criteria andImportPersonNotBetween(String value1, String value2) {
            addCriterion("import_person not between", value1, value2, "importPerson");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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