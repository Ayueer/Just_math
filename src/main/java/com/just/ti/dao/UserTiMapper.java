package com.just.ti.dao;

import com.just.ti.entity.UserTi;
import com.just.ti.entity.UserTiWithBLOBs;

public interface UserTiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserTiWithBLOBs record);

    int insertSelective(UserTiWithBLOBs record);

    UserTiWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserTiWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserTiWithBLOBs record);

    int updateByPrimaryKey(UserTi record);
}