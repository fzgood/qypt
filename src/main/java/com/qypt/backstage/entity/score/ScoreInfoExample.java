package com.qypt.backstage.entity.score;

import java.util.ArrayList;
import java.util.List;

public class ScoreInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreInfoExample() {
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

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(String value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(String value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(String value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(String value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(String value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(String value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLike(String value) {
            addCriterion("student_id like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotLike(String value) {
            addCriterion("student_id not like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<String> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<String> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(String value1, String value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(String value1, String value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andCiIdIsNull() {
            addCriterion("ci_id is null");
            return (Criteria) this;
        }

        public Criteria andCiIdIsNotNull() {
            addCriterion("ci_id is not null");
            return (Criteria) this;
        }

        public Criteria andCiIdEqualTo(Integer value) {
            addCriterion("ci_id =", value, "ciId");
            return (Criteria) this;
        }

        public Criteria andCiIdNotEqualTo(Integer value) {
            addCriterion("ci_id <>", value, "ciId");
            return (Criteria) this;
        }

        public Criteria andCiIdGreaterThan(Integer value) {
            addCriterion("ci_id >", value, "ciId");
            return (Criteria) this;
        }

        public Criteria andCiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ci_id >=", value, "ciId");
            return (Criteria) this;
        }

        public Criteria andCiIdLessThan(Integer value) {
            addCriterion("ci_id <", value, "ciId");
            return (Criteria) this;
        }

        public Criteria andCiIdLessThanOrEqualTo(Integer value) {
            addCriterion("ci_id <=", value, "ciId");
            return (Criteria) this;
        }

        public Criteria andCiIdIn(List<Integer> values) {
            addCriterion("ci_id in", values, "ciId");
            return (Criteria) this;
        }

        public Criteria andCiIdNotIn(List<Integer> values) {
            addCriterion("ci_id not in", values, "ciId");
            return (Criteria) this;
        }

        public Criteria andCiIdBetween(Integer value1, Integer value2) {
            addCriterion("ci_id between", value1, value2, "ciId");
            return (Criteria) this;
        }

        public Criteria andCiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ci_id not between", value1, value2, "ciId");
            return (Criteria) this;
        }

        public Criteria andFractionIsNull() {
            addCriterion("fraction is null");
            return (Criteria) this;
        }

        public Criteria andFractionIsNotNull() {
            addCriterion("fraction is not null");
            return (Criteria) this;
        }

        public Criteria andFractionEqualTo(Double value) {
            addCriterion("fraction =", value, "fraction");
            return (Criteria) this;
        }

        public Criteria andFractionNotEqualTo(Double value) {
            addCriterion("fraction <>", value, "fraction");
            return (Criteria) this;
        }

        public Criteria andFractionGreaterThan(Double value) {
            addCriterion("fraction >", value, "fraction");
            return (Criteria) this;
        }

        public Criteria andFractionGreaterThanOrEqualTo(Double value) {
            addCriterion("fraction >=", value, "fraction");
            return (Criteria) this;
        }

        public Criteria andFractionLessThan(Double value) {
            addCriterion("fraction <", value, "fraction");
            return (Criteria) this;
        }

        public Criteria andFractionLessThanOrEqualTo(Double value) {
            addCriterion("fraction <=", value, "fraction");
            return (Criteria) this;
        }

        public Criteria andFractionIn(List<Double> values) {
            addCriterion("fraction in", values, "fraction");
            return (Criteria) this;
        }

        public Criteria andFractionNotIn(List<Double> values) {
            addCriterion("fraction not in", values, "fraction");
            return (Criteria) this;
        }

        public Criteria andFractionBetween(Double value1, Double value2) {
            addCriterion("fraction between", value1, value2, "fraction");
            return (Criteria) this;
        }

        public Criteria andFractionNotBetween(Double value1, Double value2) {
            addCriterion("fraction not between", value1, value2, "fraction");
            return (Criteria) this;
        }

        public Criteria andScoreIdIsNull() {
            addCriterion("score_id is null");
            return (Criteria) this;
        }

        public Criteria andScoreIdIsNotNull() {
            addCriterion("score_id is not null");
            return (Criteria) this;
        }

        public Criteria andScoreIdEqualTo(Integer value) {
            addCriterion("score_id =", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdNotEqualTo(Integer value) {
            addCriterion("score_id <>", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdGreaterThan(Integer value) {
            addCriterion("score_id >", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_id >=", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdLessThan(Integer value) {
            addCriterion("score_id <", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("score_id <=", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdIn(List<Integer> values) {
            addCriterion("score_id in", values, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdNotIn(List<Integer> values) {
            addCriterion("score_id not in", values, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdBetween(Integer value1, Integer value2) {
            addCriterion("score_id between", value1, value2, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("score_id not between", value1, value2, "scoreId");
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