package com.yeykai.controller;


import com.yeykai.bean.Bbscontent;
import com.yeykai.common.ServerRespond;
import com.yeykai.service.bbsContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @desc：帖子内容相关接口
 * @author: YeYkai
 * @QQ：707443648
 * @时间: 2018/10/24 18:45:50
 */

@Controller
@RequestMapping("/bbs")
public class BbsController {

    @Autowired
    private bbsContentService bbsContentService;


    @PostMapping("/saveContent.do")
    public String saveContent(Bbscontent bbscontent)
    {
        if (bbscontent!=null){
            bbsContentService.saveContent(bbscontent);
            return "html/index";
        }
        System.out.println("收到的标题是"+bbscontent.getContent());
        System.out.println("收到的标题是"+bbscontent.getType());
        System.out.println("收到的标题是"+bbscontent.getTitle());
        return "html/index";
    }
}
