package com.pms.po;

public class Accessment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accessment.a_id
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    private Integer a_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accessment.a_name
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    private String a_name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accessment.a_id
     *
     * @return the value of accessment.a_id
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    public Integer getA_id() {
        return a_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accessment.a_id
     *
     * @param a_id the value for accessment.a_id
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accessment.a_name
     *
     * @return the value of accessment.a_name
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    public String getA_name() {
        return a_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accessment.a_name
     *
     * @param a_name the value for accessment.a_name
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    public void setA_name(String a_name) {
        this.a_name = a_name == null ? null : a_name.trim();
    }
}