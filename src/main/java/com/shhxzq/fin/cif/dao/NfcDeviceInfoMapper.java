package com.shhxzq.fin.cif.dao;

import com.shhxzq.fin.cif.model.NfcDeviceInfo;

public interface NfcDeviceInfoMapper {
    int deleteByPrimaryKey(String deviceid);

    int insert(NfcDeviceInfo record);

    int insertSelective(NfcDeviceInfo record);

    NfcDeviceInfo selectByPrimaryKey(String deviceid);

    int updateByPrimaryKeySelective(NfcDeviceInfo record);

    int updateByPrimaryKey(NfcDeviceInfo record);
}