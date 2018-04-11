package com.bd.model.entity;

import com.bd.infrastructure.domain.EntityBase;

import java.io.Serializable;
import java.sql.Timestamp;

public class DataEntity extends EntityBase {

    private String data;

    public DataEntity() {
        super();
    }

    public DataEntity(int id, String data, Timestamp create_at, Timestamp update_at, boolean is_deleted) {
        super(id, create_at, update_at, is_deleted);
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
