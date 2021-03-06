package xsl.erp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class XslCollecthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XslCollecthExample() {
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

        public Criteria andHunteridIsNull() {
            addCriterion("hunterId is null");
            return (Criteria) this;
        }

        public Criteria andHunteridIsNotNull() {
            addCriterion("hunterId is not null");
            return (Criteria) this;
        }

        public Criteria andHunteridEqualTo(String value) {
            addCriterion("hunterId =", value, "hunterid");
            return (Criteria) this;
        }

        public Criteria andHunteridNotEqualTo(String value) {
            addCriterion("hunterId <>", value, "hunterid");
            return (Criteria) this;
        }

        public Criteria andHunteridGreaterThan(String value) {
            addCriterion("hunterId >", value, "hunterid");
            return (Criteria) this;
        }

        public Criteria andHunteridGreaterThanOrEqualTo(String value) {
            addCriterion("hunterId >=", value, "hunterid");
            return (Criteria) this;
        }

        public Criteria andHunteridLessThan(String value) {
            addCriterion("hunterId <", value, "hunterid");
            return (Criteria) this;
        }

        public Criteria andHunteridLessThanOrEqualTo(String value) {
            addCriterion("hunterId <=", value, "hunterid");
            return (Criteria) this;
        }

        public Criteria andHunteridLike(String value) {
            addCriterion("hunterId like", value, "hunterid");
            return (Criteria) this;
        }

        public Criteria andHunteridNotLike(String value) {
            addCriterion("hunterId not like", value, "hunterid");
            return (Criteria) this;
        }

        public Criteria andHunteridIn(List<String> values) {
            addCriterion("hunterId in", values, "hunterid");
            return (Criteria) this;
        }

        public Criteria andHunteridNotIn(List<String> values) {
            addCriterion("hunterId not in", values, "hunterid");
            return (Criteria) this;
        }

        public Criteria andHunteridBetween(String value1, String value2) {
            addCriterion("hunterId between", value1, value2, "hunterid");
            return (Criteria) this;
        }

        public Criteria andHunteridNotBetween(String value1, String value2) {
            addCriterion("hunterId not between", value1, value2, "hunterid");
            return (Criteria) this;
        }

        public Criteria andCollectdateIsNull() {
            addCriterion("collectDate is null");
            return (Criteria) this;
        }

        public Criteria andCollectdateIsNotNull() {
            addCriterion("collectDate is not null");
            return (Criteria) this;
        }

        public Criteria andCollectdateEqualTo(Date value) {
            addCriterionForJDBCDate("collectDate =", value, "collectdate");
            return (Criteria) this;
        }

        public Criteria andCollectdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("collectDate <>", value, "collectdate");
            return (Criteria) this;
        }

        public Criteria andCollectdateGreaterThan(Date value) {
            addCriterionForJDBCDate("collectDate >", value, "collectdate");
            return (Criteria) this;
        }

        public Criteria andCollectdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("collectDate >=", value, "collectdate");
            return (Criteria) this;
        }

        public Criteria andCollectdateLessThan(Date value) {
            addCriterionForJDBCDate("collectDate <", value, "collectdate");
            return (Criteria) this;
        }

        public Criteria andCollectdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("collectDate <=", value, "collectdate");
            return (Criteria) this;
        }

        public Criteria andCollectdateIn(List<Date> values) {
            addCriterionForJDBCDate("collectDate in", values, "collectdate");
            return (Criteria) this;
        }

        public Criteria andCollectdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("collectDate not in", values, "collectdate");
            return (Criteria) this;
        }

        public Criteria andCollectdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("collectDate between", value1, value2, "collectdate");
            return (Criteria) this;
        }

        public Criteria andCollectdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("collectDate not between", value1, value2, "collectdate");
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