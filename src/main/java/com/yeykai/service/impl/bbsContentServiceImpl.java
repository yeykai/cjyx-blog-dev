package com.yeykai.service.impl;

import com.yeykai.bean.Bbscontent;
import com.yeykai.dao.BbscontentMapper;
import com.yeykai.service.bbsContentService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @desc：帖子内容相关接口
 * @author: YeYkai
 * @QQ：707443648
 * @时间: 2018/10/24 18:45:50
 */

@Service
public class bbsContentServiceImpl implements bbsContentService {

    @Autowired
    private BbscontentMapper bbscontentMapper;

    @Autowired
    private Sid sid;


    @Override
    public void saveContent(Bbscontent bbscontent) {
        if (bbscontent!=null){
            String contentId = sid.nextShort();
            bbscontent.setId(contentId);
            bbscontent.setPublishTime(new Date());
            bbscontent.setReplyCount(0);
            bbscontent.setVisitCount(0);
            bbscontent.setStatus("1");
            bbscontentMapper.insertSelective(bbscontent);
        }
    }
}
