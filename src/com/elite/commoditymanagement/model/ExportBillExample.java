package com.elite.commoditymanagement.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ExportBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExportBillExample() {
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

        public Criteria andExportIdIsNull() {
            addCriterion("export_id is null");
            return (Criteria) this;
        }

        public Criteria andExportIdIsNotNull() {
            addCriterion("export_id is not null");
            return (Criteria) this;
        }

        public Criteria andExportIdEqualTo(String value) {
            addCriterion("export_id =", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdNotEqualTo(String value) {
            addCriterion("export_id <>", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdGreaterThan(String value) {
            addCriterion("export_id >", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdGreaterThanOrEqualTo(String value) {
            addCriterion("export_id >=", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdLessThan(String value) {
            addCriterion("export_id <", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdLessThanOrEqualTo(String value) {
            addCriterion("export_id <=", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdLike(String value) {
            addCriterion("export_id like", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdNotLike(String value) {
            addCriterion("export_id not like", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdIn(List<String> values) {
            addCriterion("export_id in", values, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdNotIn(List<String> values) {
            addCriterion("export_id not in", values, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdBetween(String value1, String value2) {
            addCriterion("export_id between", value1, value2, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdNotBetween(String value1, String value2) {
            addCriterion("export_id not between", value1, value2, "exportId");
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

        public Criteria andExportPriceIsNull() {
            addCriterion("export_price is null");
            return (Criteria) this;
        }

        public Criteria andExportPriceIsNotNull() {
            addCriterion("export_price is not null");
            return (Criteria) this;
        }

        public Criteria andExportPriceEqualTo(Double value) {
            addCriterion("export_price =", value, "exportPrice");
            return (Criteria) this;
        }

        public Criteria andExportPriceNotEqualTo(Double value) {
            addCriterion("export_price <>", value, "exportPrice");
            return (Criteria) this;
        }

        public Criteria andExportPriceGreaterThan(Double value) {
            addCriterion("export_price >", value, "exportPrice");
            return (Criteria) this;
        }

        public Criteria andExportPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("export_price >=", value, "exportPrice");
            return (Criteria) this;
        }

        public Criteria andExportPriceLessThan(Double value) {
            addCriterion("export_price <", value, "exportPrice");
            return (Criteria) this;
        }

        public Criteria andExportPriceLessThanOrEqualTo(Double value) {
            addCriterion("export_price <=", value, "exportPrice");
            return (Criteria) this;
        }

        public Criteria andExportPriceIn(List<Double> values) {
            addCriterion("export_price in", values, "exportPrice");
            return (Criteria) this;
        }

        public Criteria andExportPriceNotIn(List<Double> values) {
            addCriterion("export_price not in", values, "exportPrice");
            return (Criteria) this;
        }

        public Criteria andExportPriceBetween(Double value1, Double value2) {
            addCriterion("export_price between", value1, value2, "exportPrice");
            return (Criteria) this;
        }

        public Criteria andExportPriceNotBetween(Double value1, Double value2) {
            addCriterion("export_price not between", value1, value2, "exportPrice");
            return (Criteria) this;
        }

        public Criteria andExportAmountIsNull() {
            addCriterion("export_amount is null");
            return (Criteria) this;
        }

        public Criteria andExportAmountIsNotNull() {
            addCriterion("export_amount is not null");
            return (Criteria) this;
        }

        public Criteria andExportAmountEqualTo(Integer value) {
            addCriterion("export_amount =", value, "exportAmount");
            return (Criteria) this;
        }

        public Criteria andExportAmountNotEqualTo(Integer value) {
            addCriterion("export_amount <>", value, "exportAmount");
            return (Criteria) this;
        }

        public Criteria andExportAmountGreaterThan(Integer value) {
            addCriterion("export_amount >", value, "exportAmount");
            return (Criteria) this;
        }

        public Criteria andExportAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("export_amount >=", value, "exportAmount");
            return (Criteria) this;
        }

        public Criteria andExportAmountLessThan(Integer value) {
            addCriterion("export_amount <", value, "exportAmount");
            return (Criteria) this;
        }

        public Criteria andExportAmountLessThanOrEqualTo(Integer value) {
            addCriterion("export_amount <=", value, "exportAmount");
            return (Criteria) this;
        }

        public Criteria andExportAmountIn(List<Integer> values) {
            addCriterion("export_amount in", values, "exportAmount");
            return (Criteria) this;
        }

        public Criteria andExportAmountNotIn(List<Integer> values) {
            addCriterion("export_amount not in", values, "exportAmount");
            return (Criteria) this;
        }

        public Criteria andExportAmountBetween(Integer value1, Integer value2) {
            addCriterion("export_amount between", value1, value2, "exportAmount");
            return (Criteria) this;
        }

        public Criteria andExportAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("export_amount not between", value1, value2, "exportAmount");
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

        public Criteria andExportDateIsNull() {
            addCriterion("export_date is null");
            return (Criteria) this;
        }

        public Criteria andExportDateIsNotNull() {
            addCriterion("export_date is not null");
            return (Criteria) this;
        }

        public Criteria andExportDateEqualTo(Date value) {
            addCriterionForJDBCDate("export_date =", value, "exportDate");
            return (Criteria) this;
        }

        public Criteria andExportDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("export_date <>", value, "exportDate");
            return (Criteria) this;
        }

        public Criteria andExportDateGreaterThan(Date value) {
            addCriterionForJDBCDate("export_date >", value, "exportDate");
            return (Criteria) this;
        }

        public Criteria andExportDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("export_date >=", value, "exportDate");
            return (Criteria) this;
        }

        public Criteria andExportDateLessThan(Date value) {
            addCriterionForJDBCDate("export_date <", value, "exportDate");
            return (Criteria) this;
        }

        public Criteria andExportDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("export_date <=", value, "exportDate");
            return (Criteria) this;
        }

        public Criteria andExportDateIn(List<Date> values) {
            addCriterionForJDBCDate("export_date in", values, "exportDate");
            return (Criteria) this;
        }

        public Criteria andExportDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("export_date not in", values, "exportDate");
            return (Criteria) this;
        }

        public Criteria andExportDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("export_date between", value1, value2, "exportDate");
            return (Criteria) this;
        }

        public Criteria andExportDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("export_date not between", value1, value2, "exportDate");
            return (Criteria) this;
        }

        public Criteria andExportPersonIsNull() {
            addCriterion("export_person is null");
            return (Criteria) this;
        }

        public Criteria andExportPersonIsNotNull() {
            addCriterion("export_person is not null");
            return (Criteria) this;
        }

        public Criteria andExportPersonEqualTo(String value) {
            addCriterion("export_person =", value, "exportPerson");
            return (Criteria) this;
        }

        public Criteria andExportPersonNotEqualTo(String value) {
            addCriterion("export_person <>", value, "exportPerson");
            return (Criteria) this;
        }

        public Criteria andExportPersonGreaterThan(String value) {
            addCriterion("export_person >", value, "exportPerson");
            return (Criteria) this;
        }

        public Criteria andExportPersonGreaterThanOrEqualTo(String value) {
            addCriterion("export_person >=", value, "exportPerson");
            return (Criteria) this;
        }

        public Criteria andExportPersonLessThan(String value) {
            addCriterion("export_person <", value, "exportPerson");
            return (Criteria) this;
        }

        public Criteria andExportPersonLessThanOrEqualTo(String value) {
            addCriterion("export_person <=", value, "exportPerson");
            return (Criteria) this;
        }

        public Criteria andExportPersonLike(String value) {
            addCriterion("export_person like", value, "exportPerson");
            return (Criteria) this;
        }

        public Criteria andExportPersonNotLike(String value) {
            addCriterion("export_person not like", value, "exportPerson");
            return (Criteria) this;
        }

        public Criteria andExportPersonIn(List<String> values) {
            addCriterion("export_person in", values, "exportPerson");
            return (Criteria) this;
        }

        public Criteria andExportPersonNotIn(List<String> values) {
            addCriterion("export_person not in", values, "exportPerson");
            return (Criteria) this;
        }

        public Criteria andExportPersonBetween(String value1, String value2) {
            addCriterion("export_person between", value1, value2, "exportPerson");
            return (Criteria) this;
        }

        public Criteria andExportPersonNotBetween(String value1, String value2) {
            addCriterion("export_person not between", value1, value2, "exportPerson");
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