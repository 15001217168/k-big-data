package com.bd.infrastructure.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class EntityBase implements Serializable {
    private int id;
    private Timestamp create_at;
    private Timestamp update_at;
    private boolean is_deleted;

    public EntityBase() {

    }

    public EntityBase(int id, Timestamp create_at, Timestamp update_at, boolean is_deleted) {
        this.id = id;
        this.create_at = create_at;
        this.update_at = update_at;
        this.is_deleted = is_deleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Timestamp create_at) {
        this.create_at = create_at;
    }

    public Timestamp getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Timestamp update_at) {
        this.update_at = update_at;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }
}
