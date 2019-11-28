package com.pms.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SalaryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table salary
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table salary
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table salary
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    public SalaryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table salary
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
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

        public Criteria andE_idIsNull() {
            addCriterion("e_id is null");
            return (Criteria) this;
        }

        public Criteria andE_idIsNotNull() {
            addCriterion("e_id is not null");
            return (Criteria) this;
        }

        public Criteria andE_idEqualTo(Integer value) {
            addCriterion("e_id =", value, "e_id");
            return (Criteria) this;
        }

        public Criteria andE_idNotEqualTo(Integer value) {
            addCriterion("e_id <>", value, "e_id");
            return (Criteria) this;
        }

        public Criteria andE_idGreaterThan(Integer value) {
            addCriterion("e_id >", value, "e_id");
            return (Criteria) this;
        }

        public Criteria andE_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_id >=", value, "e_id");
            return (Criteria) this;
        }

        public Criteria andE_idLessThan(Integer value) {
            addCriterion("e_id <", value, "e_id");
            return (Criteria) this;
        }

        public Criteria andE_idLessThanOrEqualTo(Integer value) {
            addCriterion("e_id <=", value, "e_id");
            return (Criteria) this;
        }

        public Criteria andE_idIn(List<Integer> values) {
            addCriterion("e_id in", values, "e_id");
            return (Criteria) this;
        }

        public Criteria andE_idNotIn(List<Integer> values) {
            addCriterion("e_id not in", values, "e_id");
            return (Criteria) this;
        }

        public Criteria andE_idBetween(Integer value1, Integer value2) {
            addCriterion("e_id between", value1, value2, "e_id");
            return (Criteria) this;
        }

        public Criteria andE_idNotBetween(Integer value1, Integer value2) {
            addCriterion("e_id not between", value1, value2, "e_id");
            return (Criteria) this;
        }

        public Criteria andAttendance_salaryIsNull() {
            addCriterion("attendance_salary is null");
            return (Criteria) this;
        }

        public Criteria andAttendance_salaryIsNotNull() {
            addCriterion("attendance_salary is not null");
            return (Criteria) this;
        }

        public Criteria andAttendance_salaryEqualTo(Double value) {
            addCriterion("attendance_salary =", value, "attendance_salary");
            return (Criteria) this;
        }

        public Criteria andAttendance_salaryNotEqualTo(Double value) {
            addCriterion("attendance_salary <>", value, "attendance_salary");
            return (Criteria) this;
        }

        public Criteria andAttendance_salaryGreaterThan(Double value) {
            addCriterion("attendance_salary >", value, "attendance_salary");
            return (Criteria) this;
        }

        public Criteria andAttendance_salaryGreaterThanOrEqualTo(Double value) {
            addCriterion("attendance_salary >=", value, "attendance_salary");
            return (Criteria) this;
        }

        public Criteria andAttendance_salaryLessThan(Double value) {
            addCriterion("attendance_salary <", value, "attendance_salary");
            return (Criteria) this;
        }

        public Criteria andAttendance_salaryLessThanOrEqualTo(Double value) {
            addCriterion("attendance_salary <=", value, "attendance_salary");
            return (Criteria) this;
        }

        public Criteria andAttendance_salaryIn(List<Double> values) {
            addCriterion("attendance_salary in", values, "attendance_salary");
            return (Criteria) this;
        }

        public Criteria andAttendance_salaryNotIn(List<Double> values) {
            addCriterion("attendance_salary not in", values, "attendance_salary");
            return (Criteria) this;
        }

        public Criteria andAttendance_salaryBetween(Double value1, Double value2) {
            addCriterion("attendance_salary between", value1, value2, "attendance_salary");
            return (Criteria) this;
        }

        public Criteria andAttendance_salaryNotBetween(Double value1, Double value2) {
            addCriterion("attendance_salary not between", value1, value2, "attendance_salary");
            return (Criteria) this;
        }

        public Criteria andAchievement_salaryIsNull() {
            addCriterion("achievement_salary is null");
            return (Criteria) this;
        }

        public Criteria andAchievement_salaryIsNotNull() {
            addCriterion("achievement_salary is not null");
            return (Criteria) this;
        }

        public Criteria andAchievement_salaryEqualTo(Double value) {
            addCriterion("achievement_salary =", value, "achievement_salary");
            return (Criteria) this;
        }

        public Criteria andAchievement_salaryNotEqualTo(Double value) {
            addCriterion("achievement_salary <>", value, "achievement_salary");
            return (Criteria) this;
        }

        public Criteria andAchievement_salaryGreaterThan(Double value) {
            addCriterion("achievement_salary >", value, "achievement_salary");
            return (Criteria) this;
        }

        public Criteria andAchievement_salaryGreaterThanOrEqualTo(Double value) {
            addCriterion("achievement_salary >=", value, "achievement_salary");
            return (Criteria) this;
        }

        public Criteria andAchievement_salaryLessThan(Double value) {
            addCriterion("achievement_salary <", value, "achievement_salary");
            return (Criteria) this;
        }

        public Criteria andAchievement_salaryLessThanOrEqualTo(Double value) {
            addCriterion("achievement_salary <=", value, "achievement_salary");
            return (Criteria) this;
        }

        public Criteria andAchievement_salaryIn(List<Double> values) {
            addCriterion("achievement_salary in", values, "achievement_salary");
            return (Criteria) this;
        }

        public Criteria andAchievement_salaryNotIn(List<Double> values) {
            addCriterion("achievement_salary not in", values, "achievement_salary");
            return (Criteria) this;
        }

        public Criteria andAchievement_salaryBetween(Double value1, Double value2) {
            addCriterion("achievement_salary between", value1, value2, "achievement_salary");
            return (Criteria) this;
        }

        public Criteria andAchievement_salaryNotBetween(Double value1, Double value2) {
            addCriterion("achievement_salary not between", value1, value2, "achievement_salary");
            return (Criteria) this;
        }

        public Criteria andBenefit_salaryIsNull() {
            addCriterion("benefit_salary is null");
            return (Criteria) this;
        }

        public Criteria andBenefit_salaryIsNotNull() {
            addCriterion("benefit_salary is not null");
            return (Criteria) this;
        }

        public Criteria andBenefit_salaryEqualTo(Double value) {
            addCriterion("benefit_salary =", value, "benefit_salary");
            return (Criteria) this;
        }

        public Criteria andBenefit_salaryNotEqualTo(Double value) {
            addCriterion("benefit_salary <>", value, "benefit_salary");
            return (Criteria) this;
        }

        public Criteria andBenefit_salaryGreaterThan(Double value) {
            addCriterion("benefit_salary >", value, "benefit_salary");
            return (Criteria) this;
        }

        public Criteria andBenefit_salaryGreaterThanOrEqualTo(Double value) {
            addCriterion("benefit_salary >=", value, "benefit_salary");
            return (Criteria) this;
        }

        public Criteria andBenefit_salaryLessThan(Double value) {
            addCriterion("benefit_salary <", value, "benefit_salary");
            return (Criteria) this;
        }

        public Criteria andBenefit_salaryLessThanOrEqualTo(Double value) {
            addCriterion("benefit_salary <=", value, "benefit_salary");
            return (Criteria) this;
        }

        public Criteria andBenefit_salaryIn(List<Double> values) {
            addCriterion("benefit_salary in", values, "benefit_salary");
            return (Criteria) this;
        }

        public Criteria andBenefit_salaryNotIn(List<Double> values) {
            addCriterion("benefit_salary not in", values, "benefit_salary");
            return (Criteria) this;
        }

        public Criteria andBenefit_salaryBetween(Double value1, Double value2) {
            addCriterion("benefit_salary between", value1, value2, "benefit_salary");
            return (Criteria) this;
        }

        public Criteria andBenefit_salaryNotBetween(Double value1, Double value2) {
            addCriterion("benefit_salary not between", value1, value2, "benefit_salary");
            return (Criteria) this;
        }

        public Criteria andS_salaryIsNull() {
            addCriterion("s_salary is null");
            return (Criteria) this;
        }

        public Criteria andS_salaryIsNotNull() {
            addCriterion("s_salary is not null");
            return (Criteria) this;
        }

        public Criteria andS_salaryEqualTo(Double value) {
            addCriterion("s_salary =", value, "s_salary");
            return (Criteria) this;
        }

        public Criteria andS_salaryNotEqualTo(Double value) {
            addCriterion("s_salary <>", value, "s_salary");
            return (Criteria) this;
        }

        public Criteria andS_salaryGreaterThan(Double value) {
            addCriterion("s_salary >", value, "s_salary");
            return (Criteria) this;
        }

        public Criteria andS_salaryGreaterThanOrEqualTo(Double value) {
            addCriterion("s_salary >=", value, "s_salary");
            return (Criteria) this;
        }

        public Criteria andS_salaryLessThan(Double value) {
            addCriterion("s_salary <", value, "s_salary");
            return (Criteria) this;
        }

        public Criteria andS_salaryLessThanOrEqualTo(Double value) {
            addCriterion("s_salary <=", value, "s_salary");
            return (Criteria) this;
        }

        public Criteria andS_salaryIn(List<Double> values) {
            addCriterion("s_salary in", values, "s_salary");
            return (Criteria) this;
        }

        public Criteria andS_salaryNotIn(List<Double> values) {
            addCriterion("s_salary not in", values, "s_salary");
            return (Criteria) this;
        }

        public Criteria andS_salaryBetween(Double value1, Double value2) {
            addCriterion("s_salary between", value1, value2, "s_salary");
            return (Criteria) this;
        }

        public Criteria andS_salaryNotBetween(Double value1, Double value2) {
            addCriterion("s_salary not between", value1, value2, "s_salary");
            return (Criteria) this;
        }

        public Criteria andS_dateIsNull() {
            addCriterion("s_date is null");
            return (Criteria) this;
        }

        public Criteria andS_dateIsNotNull() {
            addCriterion("s_date is not null");
            return (Criteria) this;
        }

        public Criteria andS_dateEqualTo(Date value) {
            addCriterionForJDBCDate("s_date =", value, "s_date");
            return (Criteria) this;
        }

        public Criteria andS_dateNotEqualTo(Date value) {
            addCriterionForJDBCDate("s_date <>", value, "s_date");
            return (Criteria) this;
        }

        public Criteria andS_dateGreaterThan(Date value) {
            addCriterionForJDBCDate("s_date >", value, "s_date");
            return (Criteria) this;
        }

        public Criteria andS_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("s_date >=", value, "s_date");
            return (Criteria) this;
        }

        public Criteria andS_dateLessThan(Date value) {
            addCriterionForJDBCDate("s_date <", value, "s_date");
            return (Criteria) this;
        }

        public Criteria andS_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("s_date <=", value, "s_date");
            return (Criteria) this;
        }

        public Criteria andS_dateIn(List<Date> values) {
            addCriterionForJDBCDate("s_date in", values, "s_date");
            return (Criteria) this;
        }

        public Criteria andS_dateNotIn(List<Date> values) {
            addCriterionForJDBCDate("s_date not in", values, "s_date");
            return (Criteria) this;
        }

        public Criteria andS_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("s_date between", value1, value2, "s_date");
            return (Criteria) this;
        }

        public Criteria andS_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("s_date not between", value1, value2, "s_date");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table salary
     *
     * @mbg.generated do_not_delete_during_merge Thu Nov 28 15:10:10 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table salary
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
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