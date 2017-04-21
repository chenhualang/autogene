package com.shhxzq.fin.cif.dao;

import com.shhxzq.fin.cif.model.CtsTradeOrder;

public interface CtsTradeOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CtsTradeOrder record);

    int insertSelective(CtsTradeOrder record);

    CtsTradeOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CtsTradeOrder record);

    int updateByPrimaryKey(CtsTradeOrder record);
}