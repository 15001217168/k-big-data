package com.bd.model.entity;

import com.bd.infrastructure.domain.EntityBase;

import java.sql.Timestamp;

public class SiteEntity extends EntityBase {
    private  String name;
    private String  url;

    public SiteEntity() {
    }

    public SiteEntity(int id, Timestamp create_at, Timestamp update_at, boolean deleted, String name, String url) {
        super(id, create_at, update_at, deleted);
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
