package com.shhxzq.fin.cif.dao;

import com.shhxzq.fin.cif.model.HopTradeApplicationCheck;

public interface HopTradeApplicationCheckMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HopTradeApplicationCheck record);

    int insertSelective(HopTradeApplicationCheck record);

    HopTradeApplicationCheck selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HopTradeApplicationCheck record);

    int updateByPrimaryKey(HopTradeApplicationCheck record);
}