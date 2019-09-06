package com.shangma.cn.entity;

import java.util.ArrayList;
import java.util.List;

public class BaseGameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseGameExample() {
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

        public Criteria andBaseIdIsNull() {
            addCriterion("base_id is null");
            return (Criteria) this;
        }

        public Criteria andBaseIdIsNotNull() {
            addCriterion("base_id is not null");
            return (Criteria) this;
        }

        public Criteria andBaseIdEqualTo(Integer value) {
            addCriterion("base_id =", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdNotEqualTo(Integer value) {
            addCriterion("base_id <>", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdGreaterThan(Integer value) {
            addCriterion("base_id >", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("base_id >=", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdLessThan(Integer value) {
            addCriterion("base_id <", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("base_id <=", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdIn(List<Integer> values) {
            addCriterion("base_id in", values, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdNotIn(List<Integer> values) {
            addCriterion("base_id not in", values, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdBetween(Integer value1, Integer value2) {
            addCriterion("base_id between", value1, value2, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("base_id not between", value1, value2, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseCodeIsNull() {
            addCriterion("base_code is null");
            return (Criteria) this;
        }

        public Criteria andBaseCodeIsNotNull() {
            addCriterion("base_code is not null");
            return (Criteria) this;
        }

        public Criteria andBaseCodeEqualTo(String value) {
            addCriterion("base_code =", value, "baseCode");
            return (Criteria) this;
        }

        public Criteria andBaseCodeNotEqualTo(String value) {
            addCriterion("base_code <>", value, "baseCode");
            return (Criteria) this;
        }

        public Criteria andBaseCodeGreaterThan(String value) {
            addCriterion("base_code >", value, "baseCode");
            return (Criteria) this;
        }

        public Criteria andBaseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("base_code >=", value, "baseCode");
            return (Criteria) this;
        }

        public Criteria andBaseCodeLessThan(String value) {
            addCriterion("base_code <", value, "baseCode");
            return (Criteria) this;
        }

        public Criteria andBaseCodeLessThanOrEqualTo(String value) {
            addCriterion("base_code <=", value, "baseCode");
            return (Criteria) this;
        }

        public Criteria andBaseCodeLike(String value) {
            addCriterion("base_code like", value, "baseCode");
            return (Criteria) this;
        }

        public Criteria andBaseCodeNotLike(String value) {
            addCriterion("base_code not like", value, "baseCode");
            return (Criteria) this;
        }

        public Criteria andBaseCodeIn(List<String> values) {
            addCriterion("base_code in", values, "baseCode");
            return (Criteria) this;
        }

        public Criteria andBaseCodeNotIn(List<String> values) {
            addCriterion("base_code not in", values, "baseCode");
            return (Criteria) this;
        }

        public Criteria andBaseCodeBetween(String value1, String value2) {
            addCriterion("base_code between", value1, value2, "baseCode");
            return (Criteria) this;
        }

        public Criteria andBaseCodeNotBetween(String value1, String value2) {
            addCriterion("base_code not between", value1, value2, "baseCode");
            return (Criteria) this;
        }

        public Criteria andBaseTypeIsNull() {
            addCriterion("base_type is null");
            return (Criteria) this;
        }

        public Criteria andBaseTypeIsNotNull() {
            addCriterion("base_type is not null");
            return (Criteria) this;
        }

        public Criteria andBaseTypeEqualTo(Integer value) {
            addCriterion("base_type =", value, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeNotEqualTo(Integer value) {
            addCriterion("base_type <>", value, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeGreaterThan(Integer value) {
            addCriterion("base_type >", value, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("base_type >=", value, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeLessThan(Integer value) {
            addCriterion("base_type <", value, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeLessThanOrEqualTo(Integer value) {
            addCriterion("base_type <=", value, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeIn(List<Integer> values) {
            addCriterion("base_type in", values, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeNotIn(List<Integer> values) {
            addCriterion("base_type not in", values, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeBetween(Integer value1, Integer value2) {
            addCriterion("base_type between", value1, value2, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("base_type not between", value1, value2, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseNameIsNull() {
            addCriterion("base_name is null");
            return (Criteria) this;
        }

        public Criteria andBaseNameIsNotNull() {
            addCriterion("base_name is not null");
            return (Criteria) this;
        }

        public Criteria andBaseNameEqualTo(String value) {
            addCriterion("base_name =", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameNotEqualTo(String value) {
            addCriterion("base_name <>", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameGreaterThan(String value) {
            addCriterion("base_name >", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("base_name >=", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameLessThan(String value) {
            addCriterion("base_name <", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameLessThanOrEqualTo(String value) {
            addCriterion("base_name <=", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameLike(String value) {
            addCriterion("base_name like", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameNotLike(String value) {
            addCriterion("base_name not like", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameIn(List<String> values) {
            addCriterion("base_name in", values, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameNotIn(List<String> values) {
            addCriterion("base_name not in", values, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameBetween(String value1, String value2) {
            addCriterion("base_name between", value1, value2, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameNotBetween(String value1, String value2) {
            addCriterion("base_name not between", value1, value2, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseContentIsNull() {
            addCriterion("base_content is null");
            return (Criteria) this;
        }

        public Criteria andBaseContentIsNotNull() {
            addCriterion("base_content is not null");
            return (Criteria) this;
        }

        public Criteria andBaseContentEqualTo(String value) {
            addCriterion("base_content =", value, "baseContent");
            return (Criteria) this;
        }

        public Criteria andBaseContentNotEqualTo(String value) {
            addCriterion("base_content <>", value, "baseContent");
            return (Criteria) this;
        }

        public Criteria andBaseContentGreaterThan(String value) {
            addCriterion("base_content >", value, "baseContent");
            return (Criteria) this;
        }

        public Criteria andBaseContentGreaterThanOrEqualTo(String value) {
            addCriterion("base_content >=", value, "baseContent");
            return (Criteria) this;
        }

        public Criteria andBaseContentLessThan(String value) {
            addCriterion("base_content <", value, "baseContent");
            return (Criteria) this;
        }

        public Criteria andBaseContentLessThanOrEqualTo(String value) {
            addCriterion("base_content <=", value, "baseContent");
            return (Criteria) this;
        }

        public Criteria andBaseContentLike(String value) {
            addCriterion("base_content like", value, "baseContent");
            return (Criteria) this;
        }

        public Criteria andBaseContentNotLike(String value) {
            addCriterion("base_content not like", value, "baseContent");
            return (Criteria) this;
        }

        public Criteria andBaseContentIn(List<String> values) {
            addCriterion("base_content in", values, "baseContent");
            return (Criteria) this;
        }

        public Criteria andBaseContentNotIn(List<String> values) {
            addCriterion("base_content not in", values, "baseContent");
            return (Criteria) this;
        }

        public Criteria andBaseContentBetween(String value1, String value2) {
            addCriterion("base_content between", value1, value2, "baseContent");
            return (Criteria) this;
        }

        public Criteria andBaseContentNotBetween(String value1, String value2) {
            addCriterion("base_content not between", value1, value2, "baseContent");
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