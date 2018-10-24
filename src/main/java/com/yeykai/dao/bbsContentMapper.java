package com.yeykai.dao;

import com.yeykai.bean.bbsContent;

public interface bbsContentMapper {
    int deleteByPrimaryKey(String id);

    int insert(bbsContent record);

    int insertSelective(bbsContent record);

    bbsContent selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(bbsContent record);

    int updateByPrimaryKey(bbsContent record);
}