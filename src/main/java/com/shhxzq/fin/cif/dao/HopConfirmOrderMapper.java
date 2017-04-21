package com.shhxzq.fin.cif.dao;

import com.shhxzq.fin.cif.model.HopConfirmOrder;

public interface HopConfirmOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HopConfirmOrder record);

    int insertSelective(HopConfirmOrder record);

    HopConfirmOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HopConfirmOrder record);

    int updateByPrimaryKey(HopConfirmOrder record);
}