package com.elite.commoditymanagement.bean;

import java.util.ArrayList;
import java.util.List;

public class ItemInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemInfoExample() {
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
            addCriterion("item_id like binary", value, "itemId");
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

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like binary", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }


        public Criteria andUnitNameLike(String value) {
            addCriterion("unit_name like binary", value, "unitName");
            return (Criteria) this;
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
        
        public Criteria andCataNameLike(String value) {
            addCriterion("cata_name like binary", value, "cataName");
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
        

        public Criteria andRetailPriceIsNull() {
            addCriterion("retail_price is null");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIsNotNull() {
            addCriterion("retail_price is not null");
            return (Criteria) this;
        }

        public Criteria andRetailPriceEqualTo(Double value) {
            addCriterion("retail_price =", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotEqualTo(Double value) {
            addCriterion("retail_price <>", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceGreaterThan(Double value) {
            addCriterion("retail_price >", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("retail_price >=", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceLessThan(Double value) {
            addCriterion("retail_price <", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceLessThanOrEqualTo(Double value) {
            addCriterion("retail_price <=", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIn(List<Double> values) {
            addCriterion("retail_price in", values, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotIn(List<Double> values) {
            addCriterion("retail_price not in", values, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceBetween(Double value1, Double value2) {
            addCriterion("retail_price between", value1, value2, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotBetween(Double value1, Double value2) {
            addCriterion("retail_price not between", value1, value2, "retailPrice");
            return (Criteria) this;
        }
        
        public Criteria andRetailPriceLike(String value) {
        	addCriterion("retail_price like binary", value, "retailPrice");
        	return (Criteria) this;
        }
        

        public Criteria andItemPicIsNull() {
            addCriterion("item_pic is null");
            return (Criteria) this;
        }

        public Criteria andItemPicIsNotNull() {
            addCriterion("item_pic is not null");
            return (Criteria) this;
        }

        public Criteria andItemPicEqualTo(String value) {
            addCriterion("item_pic =", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicNotEqualTo(String value) {
            addCriterion("item_pic <>", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicGreaterThan(String value) {
            addCriterion("item_pic >", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicGreaterThanOrEqualTo(String value) {
            addCriterion("item_pic >=", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicLessThan(String value) {
            addCriterion("item_pic <", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicLessThanOrEqualTo(String value) {
            addCriterion("item_pic <=", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicLike(String value) {
            addCriterion("item_pic like", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicNotLike(String value) {
            addCriterion("item_pic not like", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicIn(List<String> values) {
            addCriterion("item_pic in", values, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicNotIn(List<String> values) {
            addCriterion("item_pic not in", values, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicBetween(String value1, String value2) {
            addCriterion("item_pic between", value1, value2, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicNotBetween(String value1, String value2) {
            addCriterion("item_pic not between", value1, value2, "itemPic");
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
            addCriterion("note like binary", value, "note");
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

        public Criteria andContactPersonLike(String value) {
            addCriterion("contact_person like binary", value, "contactPerson");
            return (Criteria) this;
        }
        public Criteria andPhoneLike(String value) {
        	addCriterion("phone like binary", value, "phone");
        	return (Criteria) this;
        }
        public Criteria andStocksLike(String value) {
        	addCriterion("stocks like binary", value, "stocks");
        	return (Criteria) this;
        }
        
        public Criteria andStocksEquals(String value) {
        	addCriterion("stocks =", value, "stocks");
        	return (Criteria) this;
        }
        
        public Criteria andSuppNameLike(String value) {
        	addCriterion("supp_name like binary", value, "suppName");
        	return (Criteria) this;
        }
        public Criteria andImportPriceLike(String value) {
        	addCriterion("import_price like binary", value, "importPrice");
        	return (Criteria) this;
        }
        
        public Criteria andImportPriceEquals(String value) {
        	addCriterion("import_price =", value, "importPrice");
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