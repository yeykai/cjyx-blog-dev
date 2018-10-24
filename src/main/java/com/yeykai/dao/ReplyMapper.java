package com.yeykai.dao;

import com.yeykai.bean.Reply;

public interface ReplyMapper {
    int deleteByPrimaryKey(String id);

    int insert(Reply record);

    int insertSelective(Reply record);

    Reply selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKey(Reply record);
}