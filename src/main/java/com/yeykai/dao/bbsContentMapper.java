package com.yeykai.dao;

import com.yeykai.bean.Bbscontent;

public interface BbscontentMapper {
    int deleteByPrimaryKey(String id);

    int insert(Bbscontent record);

    int insertSelective(Bbscontent record);

    Bbscontent selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Bbscontent record);

    int updateByPrimaryKey(Bbscontent record);
}