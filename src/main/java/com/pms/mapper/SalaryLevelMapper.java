package com.pms.mapper;

import com.pms.po.SalaryLevel;

public interface SalaryLevelMapper {
    int deleteByPrimaryKey(Integer salaryLevel);

    int insert(SalaryLevel record);

    int insertSelective(SalaryLevel record);

    SalaryLevel selectByPrimaryKey(Integer salaryLevel);

    int updateByPrimaryKeySelective(SalaryLevel record);

    int updateByPrimaryKey(SalaryLevel record);
}