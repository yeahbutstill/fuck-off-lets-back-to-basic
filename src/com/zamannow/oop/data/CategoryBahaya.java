package com.zamannow.oop.data;

public class CategoryBahaya {
    public String id;
    public Boolean expensive;

    public CategoryBahaya(String id, Boolean expensive) {
        this.id = id;
        this.expensive = expensive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(Boolean expensive) {
        this.expensive = expensive;
    }
}
