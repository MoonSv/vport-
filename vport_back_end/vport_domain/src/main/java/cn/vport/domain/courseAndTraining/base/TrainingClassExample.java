package cn.vport.domain.courseAndTraining.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrainingClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainingClassExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andTraingTimeIsNull() {
            addCriterion("traing_time is null");
            return (Criteria) this;
        }

        public Criteria andTraingTimeIsNotNull() {
            addCriterion("traing_time is not null");
            return (Criteria) this;
        }

        public Criteria andTraingTimeEqualTo(String value) {
            addCriterion("traing_time =", value, "traingTime");
            return (Criteria) this;
        }

        public Criteria andTraingTimeNotEqualTo(String value) {
            addCriterion("traing_time <>", value, "traingTime");
            return (Criteria) this;
        }

        public Criteria andTraingTimeGreaterThan(String value) {
            addCriterion("traing_time >", value, "traingTime");
            return (Criteria) this;
        }

        public Criteria andTraingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("traing_time >=", value, "traingTime");
            return (Criteria) this;
        }

        public Criteria andTraingTimeLessThan(String value) {
            addCriterion("traing_time <", value, "traingTime");
            return (Criteria) this;
        }

        public Criteria andTraingTimeLessThanOrEqualTo(String value) {
            addCriterion("traing_time <=", value, "traingTime");
            return (Criteria) this;
        }

        public Criteria andTraingTimeLike(String value) {
            addCriterion("traing_time like", value, "traingTime");
            return (Criteria) this;
        }

        public Criteria andTraingTimeNotLike(String value) {
            addCriterion("traing_time not like", value, "traingTime");
            return (Criteria) this;
        }

        public Criteria andTraingTimeIn(List<String> values) {
            addCriterion("traing_time in", values, "traingTime");
            return (Criteria) this;
        }

        public Criteria andTraingTimeNotIn(List<String> values) {
            addCriterion("traing_time not in", values, "traingTime");
            return (Criteria) this;
        }

        public Criteria andTraingTimeBetween(String value1, String value2) {
            addCriterion("traing_time between", value1, value2, "traingTime");
            return (Criteria) this;
        }

        public Criteria andTraingTimeNotBetween(String value1, String value2) {
            addCriterion("traing_time not between", value1, value2, "traingTime");
            return (Criteria) this;
        }

        public Criteria andTrainingFrequentIsNull() {
            addCriterion("training_frequent is null");
            return (Criteria) this;
        }

        public Criteria andTrainingFrequentIsNotNull() {
            addCriterion("training_frequent is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingFrequentEqualTo(String value) {
            addCriterion("training_frequent =", value, "trainingFrequent");
            return (Criteria) this;
        }

        public Criteria andTrainingFrequentNotEqualTo(String value) {
            addCriterion("training_frequent <>", value, "trainingFrequent");
            return (Criteria) this;
        }

        public Criteria andTrainingFrequentGreaterThan(String value) {
            addCriterion("training_frequent >", value, "trainingFrequent");
            return (Criteria) this;
        }

        public Criteria andTrainingFrequentGreaterThanOrEqualTo(String value) {
            addCriterion("training_frequent >=", value, "trainingFrequent");
            return (Criteria) this;
        }

        public Criteria andTrainingFrequentLessThan(String value) {
            addCriterion("training_frequent <", value, "trainingFrequent");
            return (Criteria) this;
        }

        public Criteria andTrainingFrequentLessThanOrEqualTo(String value) {
            addCriterion("training_frequent <=", value, "trainingFrequent");
            return (Criteria) this;
        }

        public Criteria andTrainingFrequentLike(String value) {
            addCriterion("training_frequent like", value, "trainingFrequent");
            return (Criteria) this;
        }

        public Criteria andTrainingFrequentNotLike(String value) {
            addCriterion("training_frequent not like", value, "trainingFrequent");
            return (Criteria) this;
        }

        public Criteria andTrainingFrequentIn(List<String> values) {
            addCriterion("training_frequent in", values, "trainingFrequent");
            return (Criteria) this;
        }

        public Criteria andTrainingFrequentNotIn(List<String> values) {
            addCriterion("training_frequent not in", values, "trainingFrequent");
            return (Criteria) this;
        }

        public Criteria andTrainingFrequentBetween(String value1, String value2) {
            addCriterion("training_frequent between", value1, value2, "trainingFrequent");
            return (Criteria) this;
        }

        public Criteria andTrainingFrequentNotBetween(String value1, String value2) {
            addCriterion("training_frequent not between", value1, value2, "trainingFrequent");
            return (Criteria) this;
        }

        public Criteria andDeadLineIsNull() {
            addCriterion("dead_line is null");
            return (Criteria) this;
        }

        public Criteria andDeadLineIsNotNull() {
            addCriterion("dead_line is not null");
            return (Criteria) this;
        }

        public Criteria andDeadLineEqualTo(Date value) {
            addCriterion("dead_line =", value, "deadLine");
            return (Criteria) this;
        }

        public Criteria andDeadLineNotEqualTo(Date value) {
            addCriterion("dead_line <>", value, "deadLine");
            return (Criteria) this;
        }

        public Criteria andDeadLineGreaterThan(Date value) {
            addCriterion("dead_line >", value, "deadLine");
            return (Criteria) this;
        }

        public Criteria andDeadLineGreaterThanOrEqualTo(Date value) {
            addCriterion("dead_line >=", value, "deadLine");
            return (Criteria) this;
        }

        public Criteria andDeadLineLessThan(Date value) {
            addCriterion("dead_line <", value, "deadLine");
            return (Criteria) this;
        }

        public Criteria andDeadLineLessThanOrEqualTo(Date value) {
            addCriterion("dead_line <=", value, "deadLine");
            return (Criteria) this;
        }

        public Criteria andDeadLineIn(List<Date> values) {
            addCriterion("dead_line in", values, "deadLine");
            return (Criteria) this;
        }

        public Criteria andDeadLineNotIn(List<Date> values) {
            addCriterion("dead_line not in", values, "deadLine");
            return (Criteria) this;
        }

        public Criteria andDeadLineBetween(Date value1, Date value2) {
            addCriterion("dead_line between", value1, value2, "deadLine");
            return (Criteria) this;
        }

        public Criteria andDeadLineNotBetween(Date value1, Date value2) {
            addCriterion("dead_line not between", value1, value2, "deadLine");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCourseIsNull() {
            addCriterion("course is null");
            return (Criteria) this;
        }

        public Criteria andCourseIsNotNull() {
            addCriterion("course is not null");
            return (Criteria) this;
        }

        public Criteria andCourseEqualTo(Integer value) {
            addCriterion("course =", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotEqualTo(Integer value) {
            addCriterion("course <>", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThan(Integer value) {
            addCriterion("course >", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThanOrEqualTo(Integer value) {
            addCriterion("course >=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThan(Integer value) {
            addCriterion("course <", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThanOrEqualTo(Integer value) {
            addCriterion("course <=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseIn(List<Integer> values) {
            addCriterion("course in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotIn(List<Integer> values) {
            addCriterion("course not in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseBetween(Integer value1, Integer value2) {
            addCriterion("course between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotBetween(Integer value1, Integer value2) {
            addCriterion("course not between", value1, value2, "course");
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