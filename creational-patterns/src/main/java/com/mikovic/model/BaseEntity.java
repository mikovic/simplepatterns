package com.mikovic.model;

public class BaseEntity {
    protected Integer id;
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public boolean isNew() {
        return (this.id == null);
    }
}
