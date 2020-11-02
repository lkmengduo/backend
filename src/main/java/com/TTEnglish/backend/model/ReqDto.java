package com.TTEnglish.backend.model;

import javax.servlet.http.HttpSession;

public class ReqDto {
    private HttpSession session;
    private String content_id;
    private String username;
    private String password;
    private String title;
    private String content;
    private String time;
    private String comment_content_id;
    private String comment_content;
    private String content_flag;

    public HttpSession getSession() {
        return session;
    }

    public void setSession(HttpSession session) {
        this.session = session;
    }

    public String getContent_id() {
        return content_id;
    }

    public void setContent_id(String content_id) {
        this.content_id = content_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getComment_content_id() {
        return comment_content_id;
    }

    public void setComment_content_id(String comment_content_id) {
        this.comment_content_id = comment_content_id;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public String getContent_flag() {
        return content_flag;
    }

    public void setContent_flag(String content_flag) {
        this.content_flag = content_flag;
    }
}