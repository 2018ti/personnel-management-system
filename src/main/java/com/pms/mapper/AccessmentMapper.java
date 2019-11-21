package com.pms.mapper;

import com.pms.po.Accessment;

public interface AccessmentMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(Accessment record);

    int insertSelective(Accessment record);

    Accessment selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(Accessment record);

    int updateByPrimaryKey(Accessment record);
}