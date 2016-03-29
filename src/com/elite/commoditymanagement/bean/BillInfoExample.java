package com.elite.commoditymanagement.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BillInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andActionTagIsNull() {
            addCriterion("action_tag is null");
            return (Criteria) this;
        }

        public Criteria andActionTagIsNotNull() {
            addCriterion("action_tag is not null");
            return (Criteria) this;
        }

        public Criteria andActionTagEqualTo(String value) {
            addCriterion("action_tag =", value, "actionTag");
            return (Criteria) this;
        }

        public Criteria andActionTagNotEqualTo(String value) {
            addCriterion("action_tag <>", value, "actionTag");
            return (Criteria) this;
        }

        public Criteria andActionTagGreaterThan(String value) {
            addCriterion("action_tag >", value, "actionTag");
            return (Criteria) this;
        }

        public Criteria andActionTagGreaterThanOrEqualTo(String value) {
            addCriterion("action_tag >=", value, "actionTag");
            return (Criteria) this;
        }

        public Criteria andActionTagLessThan(String value) {
            addCriterion("action_tag <", value, "actionTag");
            return (Criteria) this;
        }

        public Criteria andActionTagLessThanOrEqualTo(String value) {
            addCriterion("action_tag <=", value, "actionTag");
            return (Criteria) this;
        }

        public Criteria andActionTagIn(List<String> values) {
            addCriterion("action_tag in", values, "actionTag");
            return (Criteria) this;
        }

        public Criteria andActionTagNotIn(List<String> values) {
            addCriterion("action_tag not in", values, "actionTag");
            return (Criteria) this;
        }

        public Criteria andActionTagBetween(String value1, String value2) {
            addCriterion("action_tag between", value1, value2, "actionTag");
            return (Criteria) this;
        }

        public Criteria andActionTagNotBetween(String value1, String value2) {
            addCriterion("action_tag not between", value1, value2, "actionTag");
            return (Criteria) this;
        }
        
        public Criteria andActionTagLike(String value) {
            addCriterion("action_tag like binary ", value, "actionTag");
            return (Criteria) this;
        }

        public Criteria andActionIdIsNull() {
            addCriterion("action_id is null");
            return (Criteria) this;
        }

        public Criteria andActionIdIsNotNull() {
            addCriterion("action_id is not null");
            return (Criteria) this;
        }

        public Criteria andActionIdEqualTo(String value) {
            addCriterion("action_id =", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotEqualTo(String value) {
            addCriterion("action_id <>", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdGreaterThan(String value) {
            addCriterion("action_id >", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdGreaterThanOrEqualTo(String value) {
            addCriterion("action_id >=", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdLessThan(String value) {
            addCriterion("action_id <", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdLessThanOrEqualTo(String value) {
            addCriterion("action_id <=", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdLike(String value) {
            addCriterion("action_id like binary ", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotLike(String value) {
            addCriterion("action_id not like", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdIn(List<String> values) {
            addCriterion("action_id in", values, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotIn(List<String> values) {
            addCriterion("action_id not in", values, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdBetween(String value1, String value2) {
            addCriterion("action_id between", value1, value2, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotBetween(String value1, String value2) {
            addCriterion("action_id not between", value1, value2, "actionId");
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

        public Criteria andActionPriceIsNull() {
            addCriterion("action_price is null");
            return (Criteria) this;
        }

        public Criteria andActionPriceIsNotNull() {
            addCriterion("action_price is not null");
            return (Criteria) this;
        }

        public Criteria andActionPriceEqualTo(Double value) {
            addCriterion("action_price =", value, "actionPrice");
            return (Criteria) this;
        }

        public Criteria andActionPriceNotEqualTo(Double value) {
            addCriterion("action_price <>", value, "actionPrice");
            return (Criteria) this;
        }

        public Criteria andActionPriceGreaterThan(Double value) {
            addCriterion("action_price >", value, "actionPrice");
            return (Criteria) this;
        }

        public Criteria andActionPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("action_price >=", value, "actionPrice");
            return (Criteria) this;
        }

        public Criteria andActionPriceLessThan(Double value) {
            addCriterion("action_price <", value, "actionPrice");
            return (Criteria) this;
        }

        public Criteria andActionPriceLessThanOrEqualTo(Double value) {
            addCriterion("action_price <=", value, "actionPrice");
            return (Criteria) this;
        }

        public Criteria andActionPriceIn(List<Double> values) {
            addCriterion("action_price in", values, "actionPrice");
            return (Criteria) this;
        }

        public Criteria andActionPriceNotIn(List<Double> values) {
            addCriterion("action_price not in", values, "actionPrice");
            return (Criteria) this;
        }

        public Criteria andActionPriceBetween(Double value1, Double value2) {
            addCriterion("action_price between", value1, value2, "actionPrice");
            return (Criteria) this;
        }

        public Criteria andActionPriceNotBetween(Double value1, Double value2) {
            addCriterion("action_price not between", value1, value2, "actionPrice");
            return (Criteria) this;
        }
        
        public Criteria andActionPriceLike(String value) {
            addCriterion("action_price like binary ", value, "actionPrice");
            return (Criteria) this;
        }

        public Criteria andActionAmountIsNull() {
            addCriterion("action_amount is null");
            return (Criteria) this;
        }

        public Criteria andActionAmountIsNotNull() {
            addCriterion("action_amount is not null");
            return (Criteria) this;
        }

        public Criteria andActionAmountEqualTo(Integer value) {
            addCriterion("action_amount =", value, "actionAmount");
            return (Criteria) this;
        }

        public Criteria andActionAmountNotEqualTo(Integer value) {
            addCriterion("action_amount <>", value, "actionAmount");
            return (Criteria) this;
        }

        public Criteria andActionAmountGreaterThan(Integer value) {
            addCriterion("action_amount >", value, "actionAmount");
            return (Criteria) this;
        }

        public Criteria andActionAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("action_amount >=", value, "actionAmount");
            return (Criteria) this;
        }

        public Criteria andActionAmountLessThan(Integer value) {
            addCriterion("action_amount <", value, "actionAmount");
            return (Criteria) this;
        }

        public Criteria andActionAmountLessThanOrEqualTo(Integer value) {
            addCriterion("action_amount <=", value, "actionAmount");
            return (Criteria) this;
        }

        public Criteria andActionAmountIn(List<Integer> values) {
            addCriterion("action_amount in", values, "actionAmount");
            return (Criteria) this;
        }

        public Criteria andActionAmountNotIn(List<Integer> values) {
            addCriterion("action_amount not in", values, "actionAmount");
            return (Criteria) this;
        }

        public Criteria andActionAmountBetween(Integer value1, Integer value2) {
            addCriterion("action_amount between", value1, value2, "actionAmount");
            return (Criteria) this;
        }

        public Criteria andActionAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("action_amount not between", value1, value2, "actionAmount");
            return (Criteria) this;
        }
        
        public Criteria andActionAmountLike(String value) {
            addCriterion("action_amount like binary ", value, "actionAmount");
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

        public Criteria andActionDateIsNull() {
            addCriterion("action_date is null");
            return (Criteria) this;
        }

        public Criteria andActionDateIsNotNull() {
            addCriterion("action_date is not null");
            return (Criteria) this;
        }

        public Criteria andActionDateEqualTo(Date value) {
            addCriterionForJDBCDate("action_date =", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("action_date <>", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateGreaterThan(Date value) {
            addCriterionForJDBCDate("action_date >", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("action_date >=", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateLessThan(Date value) {
            addCriterionForJDBCDate("action_date <", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("action_date <=", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateIn(List<Date> values) {
            addCriterionForJDBCDate("action_date in", values, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("action_date not in", values, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("action_date between", value1, value2, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("action_date not between", value1, value2, "actionDate");
            return (Criteria) this;
        }
        
        public Criteria andActionDateLike(String value) {
            addCriterion("action_date like binary ", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionPersonIsNull() {
            addCriterion("action_person is null");
            return (Criteria) this;
        }

        public Criteria andActionPersonIsNotNull() {
            addCriterion("action_person is not null");
            return (Criteria) this;
        }

        public Criteria andActionPersonEqualTo(String value) {
            addCriterion("action_person =", value, "actionPerson");
            return (Criteria) this;
        }

        public Criteria andActionPersonNotEqualTo(String value) {
            addCriterion("action_person <>", value, "actionPerson");
            return (Criteria) this;
        }

        public Criteria andActionPersonGreaterThan(String value) {
            addCriterion("action_person >", value, "actionPerson");
            return (Criteria) this;
        }

        public Criteria andActionPersonGreaterThanOrEqualTo(String value) {
            addCriterion("action_person >=", value, "actionPerson");
            return (Criteria) this;
        }

        public Criteria andActionPersonLessThan(String value) {
            addCriterion("action_person <", value, "actionPerson");
            return (Criteria) this;
        }

        public Criteria andActionPersonLessThanOrEqualTo(String value) {
            addCriterion("action_person <=", value, "actionPerson");
            return (Criteria) this;
        }

        public Criteria andActionPersonLike(String value) {
            addCriterion("action_person like binary ", value, "actionPerson");
            return (Criteria) this;
        }

        public Criteria andActionPersonNotLike(String value) {
            addCriterion("action_person not like", value, "actionPerson");
            return (Criteria) this;
        }

        public Criteria andActionPersonIn(List<String> values) {
            addCriterion("action_person in", values, "actionPerson");
            return (Criteria) this;
        }

        public Criteria andActionPersonNotIn(List<String> values) {
            addCriterion("action_person not in", values, "actionPerson");
            return (Criteria) this;
        }

        public Criteria andActionPersonBetween(String value1, String value2) {
            addCriterion("action_person between", value1, value2, "actionPerson");
            return (Criteria) this;
        }

        public Criteria andActionPersonNotBetween(String value1, String value2) {
            addCriterion("action_person not between", value1, value2, "actionPerson");
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
            addCriterion("note like binary ", value, "note");
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
        
        
        
        
        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like binary ", value, "itemName");
            return (Criteria) this;
        }
        
        public Criteria andSuppNameLike(String value) {
        	addCriterion("supp_name like binary ", value, "suppName");
        	return (Criteria) this;
        }
        
        public Criteria andCataNameLike(String value) {
        	addCriterion("cata_name like binary ", value, "cataName");
        	return (Criteria) this;
        }
        public Criteria andUnitNameLike(String value) {
        	addCriterion("unit_name like binary ", value, "unitName");
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