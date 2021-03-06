package xsl.erp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XslMasterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XslMasterExample() {
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

        public Criteria andMasteridIsNull() {
            addCriterion("masterId is null");
            return (Criteria) this;
        }

        public Criteria andMasteridIsNotNull() {
            addCriterion("masterId is not null");
            return (Criteria) this;
        }

        public Criteria andMasteridEqualTo(String value) {
            addCriterion("masterId =", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridNotEqualTo(String value) {
            addCriterion("masterId <>", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridGreaterThan(String value) {
            addCriterion("masterId >", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridGreaterThanOrEqualTo(String value) {
            addCriterion("masterId >=", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridLessThan(String value) {
            addCriterion("masterId <", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridLessThanOrEqualTo(String value) {
            addCriterion("masterId <=", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridLike(String value) {
            addCriterion("masterId like", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridNotLike(String value) {
            addCriterion("masterId not like", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridIn(List<String> values) {
            addCriterion("masterId in", values, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridNotIn(List<String> values) {
            addCriterion("masterId not in", values, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridBetween(String value1, String value2) {
            addCriterion("masterId between", value1, value2, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridNotBetween(String value1, String value2) {
            addCriterion("masterId not between", value1, value2, "masterid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Short value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Short value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Short value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Short value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Short value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Short> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Short> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Short value1, Short value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Short value1, Short value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andEmpiricalIsNull() {
            addCriterion("empirical is null");
            return (Criteria) this;
        }

        public Criteria andEmpiricalIsNotNull() {
            addCriterion("empirical is not null");
            return (Criteria) this;
        }

        public Criteria andEmpiricalEqualTo(Integer value) {
            addCriterion("empirical =", value, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalNotEqualTo(Integer value) {
            addCriterion("empirical <>", value, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalGreaterThan(Integer value) {
            addCriterion("empirical >", value, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalGreaterThanOrEqualTo(Integer value) {
            addCriterion("empirical >=", value, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalLessThan(Integer value) {
            addCriterion("empirical <", value, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalLessThanOrEqualTo(Integer value) {
            addCriterion("empirical <=", value, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalIn(List<Integer> values) {
            addCriterion("empirical in", values, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalNotIn(List<Integer> values) {
            addCriterion("empirical not in", values, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalBetween(Integer value1, Integer value2) {
            addCriterion("empirical between", value1, value2, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalNotBetween(Integer value1, Integer value2) {
            addCriterion("empirical not between", value1, value2, "empirical");
            return (Criteria) this;
        }

        public Criteria andTaskaccnumIsNull() {
            addCriterion("taskAccNum is null");
            return (Criteria) this;
        }

        public Criteria andTaskaccnumIsNotNull() {
            addCriterion("taskAccNum is not null");
            return (Criteria) this;
        }

        public Criteria andTaskaccnumEqualTo(Integer value) {
            addCriterion("taskAccNum =", value, "taskaccnum");
            return (Criteria) this;
        }

        public Criteria andTaskaccnumNotEqualTo(Integer value) {
            addCriterion("taskAccNum <>", value, "taskaccnum");
            return (Criteria) this;
        }

        public Criteria andTaskaccnumGreaterThan(Integer value) {
            addCriterion("taskAccNum >", value, "taskaccnum");
            return (Criteria) this;
        }

        public Criteria andTaskaccnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskAccNum >=", value, "taskaccnum");
            return (Criteria) this;
        }

        public Criteria andTaskaccnumLessThan(Integer value) {
            addCriterion("taskAccNum <", value, "taskaccnum");
            return (Criteria) this;
        }

        public Criteria andTaskaccnumLessThanOrEqualTo(Integer value) {
            addCriterion("taskAccNum <=", value, "taskaccnum");
            return (Criteria) this;
        }

        public Criteria andTaskaccnumIn(List<Integer> values) {
            addCriterion("taskAccNum in", values, "taskaccnum");
            return (Criteria) this;
        }

        public Criteria andTaskaccnumNotIn(List<Integer> values) {
            addCriterion("taskAccNum not in", values, "taskaccnum");
            return (Criteria) this;
        }

        public Criteria andTaskaccnumBetween(Integer value1, Integer value2) {
            addCriterion("taskAccNum between", value1, value2, "taskaccnum");
            return (Criteria) this;
        }

        public Criteria andTaskaccnumNotBetween(Integer value1, Integer value2) {
            addCriterion("taskAccNum not between", value1, value2, "taskaccnum");
            return (Criteria) this;
        }

        public Criteria andTaskrevokenumIsNull() {
            addCriterion("taskRevokeNum is null");
            return (Criteria) this;
        }

        public Criteria andTaskrevokenumIsNotNull() {
            addCriterion("taskRevokeNum is not null");
            return (Criteria) this;
        }

        public Criteria andTaskrevokenumEqualTo(Integer value) {
            addCriterion("taskRevokeNum =", value, "taskrevokenum");
            return (Criteria) this;
        }

        public Criteria andTaskrevokenumNotEqualTo(Integer value) {
            addCriterion("taskRevokeNum <>", value, "taskrevokenum");
            return (Criteria) this;
        }

        public Criteria andTaskrevokenumGreaterThan(Integer value) {
            addCriterion("taskRevokeNum >", value, "taskrevokenum");
            return (Criteria) this;
        }

        public Criteria andTaskrevokenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskRevokeNum >=", value, "taskrevokenum");
            return (Criteria) this;
        }

        public Criteria andTaskrevokenumLessThan(Integer value) {
            addCriterion("taskRevokeNum <", value, "taskrevokenum");
            return (Criteria) this;
        }

        public Criteria andTaskrevokenumLessThanOrEqualTo(Integer value) {
            addCriterion("taskRevokeNum <=", value, "taskrevokenum");
            return (Criteria) this;
        }

        public Criteria andTaskrevokenumIn(List<Integer> values) {
            addCriterion("taskRevokeNum in", values, "taskrevokenum");
            return (Criteria) this;
        }

        public Criteria andTaskrevokenumNotIn(List<Integer> values) {
            addCriterion("taskRevokeNum not in", values, "taskrevokenum");
            return (Criteria) this;
        }

        public Criteria andTaskrevokenumBetween(Integer value1, Integer value2) {
            addCriterion("taskRevokeNum between", value1, value2, "taskrevokenum");
            return (Criteria) this;
        }

        public Criteria andTaskrevokenumNotBetween(Integer value1, Integer value2) {
            addCriterion("taskRevokeNum not between", value1, value2, "taskrevokenum");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Short value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Short value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Short value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Short value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Short value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Short value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Short> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Short> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Short value1, Short value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Short value1, Short value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andDescrIsNull() {
            addCriterion("descr is null");
            return (Criteria) this;
        }

        public Criteria andDescrIsNotNull() {
            addCriterion("descr is not null");
            return (Criteria) this;
        }

        public Criteria andDescrEqualTo(String value) {
            addCriterion("descr =", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotEqualTo(String value) {
            addCriterion("descr <>", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrGreaterThan(String value) {
            addCriterion("descr >", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrGreaterThanOrEqualTo(String value) {
            addCriterion("descr >=", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLessThan(String value) {
            addCriterion("descr <", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLessThanOrEqualTo(String value) {
            addCriterion("descr <=", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLike(String value) {
            addCriterion("descr like", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotLike(String value) {
            addCriterion("descr not like", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrIn(List<String> values) {
            addCriterion("descr in", values, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotIn(List<String> values) {
            addCriterion("descr not in", values, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrBetween(String value1, String value2) {
            addCriterion("descr between", value1, value2, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotBetween(String value1, String value2) {
            addCriterion("descr not between", value1, value2, "descr");
            return (Criteria) this;
        }

        public Criteria andLastaccdateIsNull() {
            addCriterion("lastAccDate is null");
            return (Criteria) this;
        }

        public Criteria andLastaccdateIsNotNull() {
            addCriterion("lastAccDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastaccdateEqualTo(Date value) {
            addCriterion("lastAccDate =", value, "lastaccdate");
            return (Criteria) this;
        }

        public Criteria andLastaccdateNotEqualTo(Date value) {
            addCriterion("lastAccDate <>", value, "lastaccdate");
            return (Criteria) this;
        }

        public Criteria andLastaccdateGreaterThan(Date value) {
            addCriterion("lastAccDate >", value, "lastaccdate");
            return (Criteria) this;
        }

        public Criteria andLastaccdateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastAccDate >=", value, "lastaccdate");
            return (Criteria) this;
        }

        public Criteria andLastaccdateLessThan(Date value) {
            addCriterion("lastAccDate <", value, "lastaccdate");
            return (Criteria) this;
        }

        public Criteria andLastaccdateLessThanOrEqualTo(Date value) {
            addCriterion("lastAccDate <=", value, "lastaccdate");
            return (Criteria) this;
        }

        public Criteria andLastaccdateIn(List<Date> values) {
            addCriterion("lastAccDate in", values, "lastaccdate");
            return (Criteria) this;
        }

        public Criteria andLastaccdateNotIn(List<Date> values) {
            addCriterion("lastAccDate not in", values, "lastaccdate");
            return (Criteria) this;
        }

        public Criteria andLastaccdateBetween(Date value1, Date value2) {
            addCriterion("lastAccDate between", value1, value2, "lastaccdate");
            return (Criteria) this;
        }

        public Criteria andLastaccdateNotBetween(Date value1, Date value2) {
            addCriterion("lastAccDate not between", value1, value2, "lastaccdate");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Boolean value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Boolean value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Boolean value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Boolean value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Boolean value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Boolean> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Boolean> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Boolean value1, Boolean value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("state not between", value1, value2, "state");
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