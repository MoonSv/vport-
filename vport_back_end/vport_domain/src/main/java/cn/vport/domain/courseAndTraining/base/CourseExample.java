package cn.vport.domain.courseAndTraining.base;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
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

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andBeginAgeIsNull() {
            addCriterion("begin_age is null");
            return (Criteria) this;
        }

        public Criteria andBeginAgeIsNotNull() {
            addCriterion("begin_age is not null");
            return (Criteria) this;
        }

        public Criteria andBeginAgeEqualTo(Integer value) {
            addCriterion("begin_age =", value, "beginAge");
            return (Criteria) this;
        }

        public Criteria andBeginAgeNotEqualTo(Integer value) {
            addCriterion("begin_age <>", value, "beginAge");
            return (Criteria) this;
        }

        public Criteria andBeginAgeGreaterThan(Integer value) {
            addCriterion("begin_age >", value, "beginAge");
            return (Criteria) this;
        }

        public Criteria andBeginAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("begin_age >=", value, "beginAge");
            return (Criteria) this;
        }

        public Criteria andBeginAgeLessThan(Integer value) {
            addCriterion("begin_age <", value, "beginAge");
            return (Criteria) this;
        }

        public Criteria andBeginAgeLessThanOrEqualTo(Integer value) {
            addCriterion("begin_age <=", value, "beginAge");
            return (Criteria) this;
        }

        public Criteria andBeginAgeIn(List<Integer> values) {
            addCriterion("begin_age in", values, "beginAge");
            return (Criteria) this;
        }

        public Criteria andBeginAgeNotIn(List<Integer> values) {
            addCriterion("begin_age not in", values, "beginAge");
            return (Criteria) this;
        }

        public Criteria andBeginAgeBetween(Integer value1, Integer value2) {
            addCriterion("begin_age between", value1, value2, "beginAge");
            return (Criteria) this;
        }

        public Criteria andBeginAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("begin_age not between", value1, value2, "beginAge");
            return (Criteria) this;
        }

        public Criteria andEndAgeIsNull() {
            addCriterion("end_age is null");
            return (Criteria) this;
        }

        public Criteria andEndAgeIsNotNull() {
            addCriterion("end_age is not null");
            return (Criteria) this;
        }

        public Criteria andEndAgeEqualTo(Integer value) {
            addCriterion("end_age =", value, "endAge");
            return (Criteria) this;
        }

        public Criteria andEndAgeNotEqualTo(Integer value) {
            addCriterion("end_age <>", value, "endAge");
            return (Criteria) this;
        }

        public Criteria andEndAgeGreaterThan(Integer value) {
            addCriterion("end_age >", value, "endAge");
            return (Criteria) this;
        }

        public Criteria andEndAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_age >=", value, "endAge");
            return (Criteria) this;
        }

        public Criteria andEndAgeLessThan(Integer value) {
            addCriterion("end_age <", value, "endAge");
            return (Criteria) this;
        }

        public Criteria andEndAgeLessThanOrEqualTo(Integer value) {
            addCriterion("end_age <=", value, "endAge");
            return (Criteria) this;
        }

        public Criteria andEndAgeIn(List<Integer> values) {
            addCriterion("end_age in", values, "endAge");
            return (Criteria) this;
        }

        public Criteria andEndAgeNotIn(List<Integer> values) {
            addCriterion("end_age not in", values, "endAge");
            return (Criteria) this;
        }

        public Criteria andEndAgeBetween(Integer value1, Integer value2) {
            addCriterion("end_age between", value1, value2, "endAge");
            return (Criteria) this;
        }

        public Criteria andEndAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("end_age not between", value1, value2, "endAge");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(Double value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(Double value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(Double value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(Double value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(Double value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<Double> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<Double> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(Double value1, Double value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(Double value1, Double value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andTrainingPeriodIsNull() {
            addCriterion("training_period is null");
            return (Criteria) this;
        }

        public Criteria andTrainingPeriodIsNotNull() {
            addCriterion("training_period is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingPeriodEqualTo(String value) {
            addCriterion("training_period =", value, "trainingPeriod");
            return (Criteria) this;
        }

        public Criteria andTrainingPeriodNotEqualTo(String value) {
            addCriterion("training_period <>", value, "trainingPeriod");
            return (Criteria) this;
        }

        public Criteria andTrainingPeriodGreaterThan(String value) {
            addCriterion("training_period >", value, "trainingPeriod");
            return (Criteria) this;
        }

        public Criteria andTrainingPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("training_period >=", value, "trainingPeriod");
            return (Criteria) this;
        }

        public Criteria andTrainingPeriodLessThan(String value) {
            addCriterion("training_period <", value, "trainingPeriod");
            return (Criteria) this;
        }

        public Criteria andTrainingPeriodLessThanOrEqualTo(String value) {
            addCriterion("training_period <=", value, "trainingPeriod");
            return (Criteria) this;
        }

        public Criteria andTrainingPeriodLike(String value) {
            addCriterion("training_period like", value, "trainingPeriod");
            return (Criteria) this;
        }

        public Criteria andTrainingPeriodNotLike(String value) {
            addCriterion("training_period not like", value, "trainingPeriod");
            return (Criteria) this;
        }

        public Criteria andTrainingPeriodIn(List<String> values) {
            addCriterion("training_period in", values, "trainingPeriod");
            return (Criteria) this;
        }

        public Criteria andTrainingPeriodNotIn(List<String> values) {
            addCriterion("training_period not in", values, "trainingPeriod");
            return (Criteria) this;
        }

        public Criteria andTrainingPeriodBetween(String value1, String value2) {
            addCriterion("training_period between", value1, value2, "trainingPeriod");
            return (Criteria) this;
        }

        public Criteria andTrainingPeriodNotBetween(String value1, String value2) {
            addCriterion("training_period not between", value1, value2, "trainingPeriod");
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