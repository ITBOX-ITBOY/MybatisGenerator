package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class CmsOnlineAccesscontrolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsOnlineAccesscontrolExample() {
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

        public Criteria andResourceIdIsNull() {
            addCriterion("RESOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("RESOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(String value) {
            addCriterion("RESOURCE_ID =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(String value) {
            addCriterion("RESOURCE_ID <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(String value) {
            addCriterion("RESOURCE_ID >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_ID >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(String value) {
            addCriterion("RESOURCE_ID <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_ID <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLike(String value) {
            addCriterion("RESOURCE_ID like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotLike(String value) {
            addCriterion("RESOURCE_ID not like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<String> values) {
            addCriterion("RESOURCE_ID in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<String> values) {
            addCriterion("RESOURCE_ID not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(String value1, String value2) {
            addCriterion("RESOURCE_ID between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_ID not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdIsNull() {
            addCriterion("PRINCIPAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdIsNotNull() {
            addCriterion("PRINCIPAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdEqualTo(String value) {
            addCriterion("PRINCIPAL_ID =", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdNotEqualTo(String value) {
            addCriterion("PRINCIPAL_ID <>", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdGreaterThan(String value) {
            addCriterion("PRINCIPAL_ID >", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRINCIPAL_ID >=", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdLessThan(String value) {
            addCriterion("PRINCIPAL_ID <", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdLessThanOrEqualTo(String value) {
            addCriterion("PRINCIPAL_ID <=", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdLike(String value) {
            addCriterion("PRINCIPAL_ID like", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdNotLike(String value) {
            addCriterion("PRINCIPAL_ID not like", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdIn(List<String> values) {
            addCriterion("PRINCIPAL_ID in", values, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdNotIn(List<String> values) {
            addCriterion("PRINCIPAL_ID not in", values, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdBetween(String value1, String value2) {
            addCriterion("PRINCIPAL_ID between", value1, value2, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdNotBetween(String value1, String value2) {
            addCriterion("PRINCIPAL_ID not between", value1, value2, "principalId");
            return (Criteria) this;
        }

        public Criteria andAccessAllowedIsNull() {
            addCriterion("ACCESS_ALLOWED is null");
            return (Criteria) this;
        }

        public Criteria andAccessAllowedIsNotNull() {
            addCriterion("ACCESS_ALLOWED is not null");
            return (Criteria) this;
        }

        public Criteria andAccessAllowedEqualTo(Integer value) {
            addCriterion("ACCESS_ALLOWED =", value, "accessAllowed");
            return (Criteria) this;
        }

        public Criteria andAccessAllowedNotEqualTo(Integer value) {
            addCriterion("ACCESS_ALLOWED <>", value, "accessAllowed");
            return (Criteria) this;
        }

        public Criteria andAccessAllowedGreaterThan(Integer value) {
            addCriterion("ACCESS_ALLOWED >", value, "accessAllowed");
            return (Criteria) this;
        }

        public Criteria andAccessAllowedGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCESS_ALLOWED >=", value, "accessAllowed");
            return (Criteria) this;
        }

        public Criteria andAccessAllowedLessThan(Integer value) {
            addCriterion("ACCESS_ALLOWED <", value, "accessAllowed");
            return (Criteria) this;
        }

        public Criteria andAccessAllowedLessThanOrEqualTo(Integer value) {
            addCriterion("ACCESS_ALLOWED <=", value, "accessAllowed");
            return (Criteria) this;
        }

        public Criteria andAccessAllowedIn(List<Integer> values) {
            addCriterion("ACCESS_ALLOWED in", values, "accessAllowed");
            return (Criteria) this;
        }

        public Criteria andAccessAllowedNotIn(List<Integer> values) {
            addCriterion("ACCESS_ALLOWED not in", values, "accessAllowed");
            return (Criteria) this;
        }

        public Criteria andAccessAllowedBetween(Integer value1, Integer value2) {
            addCriterion("ACCESS_ALLOWED between", value1, value2, "accessAllowed");
            return (Criteria) this;
        }

        public Criteria andAccessAllowedNotBetween(Integer value1, Integer value2) {
            addCriterion("ACCESS_ALLOWED not between", value1, value2, "accessAllowed");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedIsNull() {
            addCriterion("ACCESS_DENIED is null");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedIsNotNull() {
            addCriterion("ACCESS_DENIED is not null");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedEqualTo(Integer value) {
            addCriterion("ACCESS_DENIED =", value, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedNotEqualTo(Integer value) {
            addCriterion("ACCESS_DENIED <>", value, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedGreaterThan(Integer value) {
            addCriterion("ACCESS_DENIED >", value, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCESS_DENIED >=", value, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedLessThan(Integer value) {
            addCriterion("ACCESS_DENIED <", value, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedLessThanOrEqualTo(Integer value) {
            addCriterion("ACCESS_DENIED <=", value, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedIn(List<Integer> values) {
            addCriterion("ACCESS_DENIED in", values, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedNotIn(List<Integer> values) {
            addCriterion("ACCESS_DENIED not in", values, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedBetween(Integer value1, Integer value2) {
            addCriterion("ACCESS_DENIED between", value1, value2, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedNotBetween(Integer value1, Integer value2) {
            addCriterion("ACCESS_DENIED not between", value1, value2, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andAccessFlagsIsNull() {
            addCriterion("ACCESS_FLAGS is null");
            return (Criteria) this;
        }

        public Criteria andAccessFlagsIsNotNull() {
            addCriterion("ACCESS_FLAGS is not null");
            return (Criteria) this;
        }

        public Criteria andAccessFlagsEqualTo(Integer value) {
            addCriterion("ACCESS_FLAGS =", value, "accessFlags");
            return (Criteria) this;
        }

        public Criteria andAccessFlagsNotEqualTo(Integer value) {
            addCriterion("ACCESS_FLAGS <>", value, "accessFlags");
            return (Criteria) this;
        }

        public Criteria andAccessFlagsGreaterThan(Integer value) {
            addCriterion("ACCESS_FLAGS >", value, "accessFlags");
            return (Criteria) this;
        }

        public Criteria andAccessFlagsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCESS_FLAGS >=", value, "accessFlags");
            return (Criteria) this;
        }

        public Criteria andAccessFlagsLessThan(Integer value) {
            addCriterion("ACCESS_FLAGS <", value, "accessFlags");
            return (Criteria) this;
        }

        public Criteria andAccessFlagsLessThanOrEqualTo(Integer value) {
            addCriterion("ACCESS_FLAGS <=", value, "accessFlags");
            return (Criteria) this;
        }

        public Criteria andAccessFlagsIn(List<Integer> values) {
            addCriterion("ACCESS_FLAGS in", values, "accessFlags");
            return (Criteria) this;
        }

        public Criteria andAccessFlagsNotIn(List<Integer> values) {
            addCriterion("ACCESS_FLAGS not in", values, "accessFlags");
            return (Criteria) this;
        }

        public Criteria andAccessFlagsBetween(Integer value1, Integer value2) {
            addCriterion("ACCESS_FLAGS between", value1, value2, "accessFlags");
            return (Criteria) this;
        }

        public Criteria andAccessFlagsNotBetween(Integer value1, Integer value2) {
            addCriterion("ACCESS_FLAGS not between", value1, value2, "accessFlags");
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