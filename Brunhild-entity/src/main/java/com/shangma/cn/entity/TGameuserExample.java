package com.shangma.cn.entity;

import java.util.ArrayList;
import java.util.List;

public class TGameuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TGameuserExample() {
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

        public Criteria andGameIdIsNull() {
            addCriterion("game_id is null");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNotNull() {
            addCriterion("game_id is not null");
            return (Criteria) this;
        }

        public Criteria andGameIdEqualTo(Integer value) {
            addCriterion("game_id =", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotEqualTo(Integer value) {
            addCriterion("game_id <>", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThan(Integer value) {
            addCriterion("game_id >", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_id >=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThan(Integer value) {
            addCriterion("game_id <", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThanOrEqualTo(Integer value) {
            addCriterion("game_id <=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdIn(List<Integer> values) {
            addCriterion("game_id in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotIn(List<Integer> values) {
            addCriterion("game_id not in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdBetween(Integer value1, Integer value2) {
            addCriterion("game_id between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("game_id not between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameNameIsNull() {
            addCriterion("game_name is null");
            return (Criteria) this;
        }

        public Criteria andGameNameIsNotNull() {
            addCriterion("game_name is not null");
            return (Criteria) this;
        }

        public Criteria andGameNameEqualTo(String value) {
            addCriterion("game_name =", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotEqualTo(String value) {
            addCriterion("game_name <>", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameGreaterThan(String value) {
            addCriterion("game_name >", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameGreaterThanOrEqualTo(String value) {
            addCriterion("game_name >=", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameLessThan(String value) {
            addCriterion("game_name <", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameLessThanOrEqualTo(String value) {
            addCriterion("game_name <=", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameLike(String value) {
            addCriterion("game_name like", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotLike(String value) {
            addCriterion("game_name not like", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameIn(List<String> values) {
            addCriterion("game_name in", values, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotIn(List<String> values) {
            addCriterion("game_name not in", values, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameBetween(String value1, String value2) {
            addCriterion("game_name between", value1, value2, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotBetween(String value1, String value2) {
            addCriterion("game_name not between", value1, value2, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameAddressIsNull() {
            addCriterion("game_address is null");
            return (Criteria) this;
        }

        public Criteria andGameAddressIsNotNull() {
            addCriterion("game_address is not null");
            return (Criteria) this;
        }

        public Criteria andGameAddressEqualTo(Integer value) {
            addCriterion("game_address =", value, "gameAddress");
            return (Criteria) this;
        }

        public Criteria andGameAddressNotEqualTo(Integer value) {
            addCriterion("game_address <>", value, "gameAddress");
            return (Criteria) this;
        }

        public Criteria andGameAddressGreaterThan(Integer value) {
            addCriterion("game_address >", value, "gameAddress");
            return (Criteria) this;
        }

        public Criteria andGameAddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_address >=", value, "gameAddress");
            return (Criteria) this;
        }

        public Criteria andGameAddressLessThan(Integer value) {
            addCriterion("game_address <", value, "gameAddress");
            return (Criteria) this;
        }

        public Criteria andGameAddressLessThanOrEqualTo(Integer value) {
            addCriterion("game_address <=", value, "gameAddress");
            return (Criteria) this;
        }

        public Criteria andGameAddressIn(List<Integer> values) {
            addCriterion("game_address in", values, "gameAddress");
            return (Criteria) this;
        }

        public Criteria andGameAddressNotIn(List<Integer> values) {
            addCriterion("game_address not in", values, "gameAddress");
            return (Criteria) this;
        }

        public Criteria andGameAddressBetween(Integer value1, Integer value2) {
            addCriterion("game_address between", value1, value2, "gameAddress");
            return (Criteria) this;
        }

        public Criteria andGameAddressNotBetween(Integer value1, Integer value2) {
            addCriterion("game_address not between", value1, value2, "gameAddress");
            return (Criteria) this;
        }

        public Criteria andGameJobIsNull() {
            addCriterion("game_job is null");
            return (Criteria) this;
        }

        public Criteria andGameJobIsNotNull() {
            addCriterion("game_job is not null");
            return (Criteria) this;
        }

        public Criteria andGameJobEqualTo(Integer value) {
            addCriterion("game_job =", value, "gameJob");
            return (Criteria) this;
        }

        public Criteria andGameJobNotEqualTo(Integer value) {
            addCriterion("game_job <>", value, "gameJob");
            return (Criteria) this;
        }

        public Criteria andGameJobGreaterThan(Integer value) {
            addCriterion("game_job >", value, "gameJob");
            return (Criteria) this;
        }

        public Criteria andGameJobGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_job >=", value, "gameJob");
            return (Criteria) this;
        }

        public Criteria andGameJobLessThan(Integer value) {
            addCriterion("game_job <", value, "gameJob");
            return (Criteria) this;
        }

        public Criteria andGameJobLessThanOrEqualTo(Integer value) {
            addCriterion("game_job <=", value, "gameJob");
            return (Criteria) this;
        }

        public Criteria andGameJobIn(List<Integer> values) {
            addCriterion("game_job in", values, "gameJob");
            return (Criteria) this;
        }

        public Criteria andGameJobNotIn(List<Integer> values) {
            addCriterion("game_job not in", values, "gameJob");
            return (Criteria) this;
        }

        public Criteria andGameJobBetween(Integer value1, Integer value2) {
            addCriterion("game_job between", value1, value2, "gameJob");
            return (Criteria) this;
        }

        public Criteria andGameJobNotBetween(Integer value1, Integer value2) {
            addCriterion("game_job not between", value1, value2, "gameJob");
            return (Criteria) this;
        }

        public Criteria andGameRaceIsNull() {
            addCriterion("game_race is null");
            return (Criteria) this;
        }

        public Criteria andGameRaceIsNotNull() {
            addCriterion("game_race is not null");
            return (Criteria) this;
        }

        public Criteria andGameRaceEqualTo(Integer value) {
            addCriterion("game_race =", value, "gameRace");
            return (Criteria) this;
        }

        public Criteria andGameRaceNotEqualTo(Integer value) {
            addCriterion("game_race <>", value, "gameRace");
            return (Criteria) this;
        }

        public Criteria andGameRaceGreaterThan(Integer value) {
            addCriterion("game_race >", value, "gameRace");
            return (Criteria) this;
        }

        public Criteria andGameRaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_race >=", value, "gameRace");
            return (Criteria) this;
        }

        public Criteria andGameRaceLessThan(Integer value) {
            addCriterion("game_race <", value, "gameRace");
            return (Criteria) this;
        }

        public Criteria andGameRaceLessThanOrEqualTo(Integer value) {
            addCriterion("game_race <=", value, "gameRace");
            return (Criteria) this;
        }

        public Criteria andGameRaceIn(List<Integer> values) {
            addCriterion("game_race in", values, "gameRace");
            return (Criteria) this;
        }

        public Criteria andGameRaceNotIn(List<Integer> values) {
            addCriterion("game_race not in", values, "gameRace");
            return (Criteria) this;
        }

        public Criteria andGameRaceBetween(Integer value1, Integer value2) {
            addCriterion("game_race between", value1, value2, "gameRace");
            return (Criteria) this;
        }

        public Criteria andGameRaceNotBetween(Integer value1, Integer value2) {
            addCriterion("game_race not between", value1, value2, "gameRace");
            return (Criteria) this;
        }

        public Criteria andGameRatingIsNull() {
            addCriterion("game_rating is null");
            return (Criteria) this;
        }

        public Criteria andGameRatingIsNotNull() {
            addCriterion("game_rating is not null");
            return (Criteria) this;
        }

        public Criteria andGameRatingEqualTo(Integer value) {
            addCriterion("game_rating =", value, "gameRating");
            return (Criteria) this;
        }

        public Criteria andGameRatingNotEqualTo(Integer value) {
            addCriterion("game_rating <>", value, "gameRating");
            return (Criteria) this;
        }

        public Criteria andGameRatingGreaterThan(Integer value) {
            addCriterion("game_rating >", value, "gameRating");
            return (Criteria) this;
        }

        public Criteria andGameRatingGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_rating >=", value, "gameRating");
            return (Criteria) this;
        }

        public Criteria andGameRatingLessThan(Integer value) {
            addCriterion("game_rating <", value, "gameRating");
            return (Criteria) this;
        }

        public Criteria andGameRatingLessThanOrEqualTo(Integer value) {
            addCriterion("game_rating <=", value, "gameRating");
            return (Criteria) this;
        }

        public Criteria andGameRatingIn(List<Integer> values) {
            addCriterion("game_rating in", values, "gameRating");
            return (Criteria) this;
        }

        public Criteria andGameRatingNotIn(List<Integer> values) {
            addCriterion("game_rating not in", values, "gameRating");
            return (Criteria) this;
        }

        public Criteria andGameRatingBetween(Integer value1, Integer value2) {
            addCriterion("game_rating between", value1, value2, "gameRating");
            return (Criteria) this;
        }

        public Criteria andGameRatingNotBetween(Integer value1, Integer value2) {
            addCriterion("game_rating not between", value1, value2, "gameRating");
            return (Criteria) this;
        }

        public Criteria andGameCampIsNull() {
            addCriterion("game_camp is null");
            return (Criteria) this;
        }

        public Criteria andGameCampIsNotNull() {
            addCriterion("game_camp is not null");
            return (Criteria) this;
        }

        public Criteria andGameCampEqualTo(Integer value) {
            addCriterion("game_camp =", value, "gameCamp");
            return (Criteria) this;
        }

        public Criteria andGameCampNotEqualTo(Integer value) {
            addCriterion("game_camp <>", value, "gameCamp");
            return (Criteria) this;
        }

        public Criteria andGameCampGreaterThan(Integer value) {
            addCriterion("game_camp >", value, "gameCamp");
            return (Criteria) this;
        }

        public Criteria andGameCampGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_camp >=", value, "gameCamp");
            return (Criteria) this;
        }

        public Criteria andGameCampLessThan(Integer value) {
            addCriterion("game_camp <", value, "gameCamp");
            return (Criteria) this;
        }

        public Criteria andGameCampLessThanOrEqualTo(Integer value) {
            addCriterion("game_camp <=", value, "gameCamp");
            return (Criteria) this;
        }

        public Criteria andGameCampIn(List<Integer> values) {
            addCriterion("game_camp in", values, "gameCamp");
            return (Criteria) this;
        }

        public Criteria andGameCampNotIn(List<Integer> values) {
            addCriterion("game_camp not in", values, "gameCamp");
            return (Criteria) this;
        }

        public Criteria andGameCampBetween(Integer value1, Integer value2) {
            addCriterion("game_camp between", value1, value2, "gameCamp");
            return (Criteria) this;
        }

        public Criteria andGameCampNotBetween(Integer value1, Integer value2) {
            addCriterion("game_camp not between", value1, value2, "gameCamp");
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