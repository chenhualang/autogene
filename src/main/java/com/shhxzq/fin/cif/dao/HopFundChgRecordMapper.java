package com.shhxzq.fin.cif.dao;

import com.shhxzq.fin.cif.model.HopFundChgRecord;

public interface HopFundChgRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HopFundChgRecord record);

    int insertSelective(HopFundChgRecord record);

    HopFundChgRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HopFundChgRecord record);

    int updateByPrimaryKey(HopFundChgRecord record);
}