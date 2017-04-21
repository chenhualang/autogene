package com.shhxzq.fin.cif.dao;

import com.shhxzq.fin.cif.model.HopDailyProfit;

public interface HopDailyProfitMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HopDailyProfit record);

    int insertSelective(HopDailyProfit record);

    HopDailyProfit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HopDailyProfit record);

    int updateByPrimaryKey(HopDailyProfit record);
}