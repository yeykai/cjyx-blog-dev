package com.yeykai.bean;

import java.util.Date;

public class Bbscontent {
    /** 帖子Id*/
    private String id;

    /** 发帖者Id*/
    private String publisherId;

    /** 帖子标题*/
    private String title;

    /** 帖子内容*/
    private String content;

    /** 访问数量*/
    private Integer visitCount;

    /** 回复数量*/
    private Integer replyCount;

    /** 发布时间*/
    private Date publishTime;

    /** 悬赏*/
    private Integer reward;

    /** 状态*/
    private String status;

    /** 所属专栏*/
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Integer visitCount) {
        this.visitCount = visitCount;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getReward() {
        return reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}