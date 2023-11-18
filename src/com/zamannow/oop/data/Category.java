package com.zamannow.oop.data;

public class Category {
    private String id;
    private Boolean expensive;

    public Category(String id, Boolean expensive) {
        this.id = id;
        this.expensive = expensive;
    }

    public Category() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) this.id = id;
    }

    public Boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(Boolean expensive) {
        this.expensive = expensive;
    }
}
