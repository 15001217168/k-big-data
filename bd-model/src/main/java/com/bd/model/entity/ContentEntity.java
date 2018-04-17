package com.bd.model.entity;

import com.bd.infrastructure.domain.EntityBase;

import java.io.Serializable;
import java.sql.Timestamp;

public class ContentEntity extends EntityBase {

    private int site_id;
    private  String title;
    private  String sub_title;
    private  String auther;
    private  String tag;
    private  String content;

    public ContentEntity() {
        super();
    }

    public ContentEntity(int id, Timestamp create_at, Timestamp update_at, boolean deleted, int site_id, String title, String sub_title, String auther, String tag, String content) {
        super(id, create_at, update_at, deleted);
        this.site_id = site_id;
        this.title = title;
        this.sub_title = sub_title;
        this.auther = auther;
        this.tag = tag;
        this.content = content;
    }

    public int getSite_id() {
        return site_id;
    }

    public void setSite_id(int site_id) {
        this.site_id = site_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSub_title() {
        return sub_title;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
