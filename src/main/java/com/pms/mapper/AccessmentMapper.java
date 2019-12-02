package com.pms.mapper;

import com.pms.po.Accessment;
import com.pms.po.AccessmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccessmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accessment
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    long countByExample(AccessmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accessment
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    int deleteByExample(AccessmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accessment
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    int deleteByPrimaryKey(Integer a_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accessment
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    int insert(Accessment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accessment
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    int insertSelective(Accessment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accessment
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    List<Accessment> selectByExample(AccessmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accessment
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    Accessment selectByPrimaryKey(Integer a_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accessment
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") Accessment record, @Param("example") AccessmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accessment
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    int updateByExample(@Param("record") Accessment record, @Param("example") AccessmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accessment
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    int updateByPrimaryKeySelective(Accessment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accessment
     *
     * @mbg.generated Thu Nov 28 15:10:10 CST 2019
     */
    int updateByPrimaryKey(Accessment record);
}