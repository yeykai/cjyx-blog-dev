package com.yeykai.bean;

import java.util.Date;

public class Reply {
    private String id;

    /** 帖子Id*/
    private String contentId;

    /** 父级评论Id*/
    private String fatherReplyId;

    /** 被回复者Id*/
    private String toUserId;

    /** 回复内容*/
    private String replyContent;

    /** 回复时间*/
    private Date createTime;

    /** 回复者Id*/
    private String replyUserId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getFatherReplyId() {
        return fatherReplyId;
    }

    public void setFatherReplyId(String fatherReplyId) {
        this.fatherReplyId = fatherReplyId;
    }

    public String getToUserId() {
        return toUserId;
    }

    public void setToUserId(String toUserId) {
        this.toUserId = toUserId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(String replyUserId) {
        this.replyUserId = replyUserId;
    }
}