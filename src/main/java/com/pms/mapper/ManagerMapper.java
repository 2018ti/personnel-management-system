package com.pms.mapper;

import com.pms.po.Manager;

public interface ManagerMapper {
    int deleteByPrimaryKey(Integer uId);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(Integer uId);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}