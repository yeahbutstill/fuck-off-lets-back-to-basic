package com.artivisi.training.bestpractices.serializable;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Category implements Serializable {
    @Serial
    private static final long serialVersionUID = 6475378681477033638L;

    private String code;
    private String name;

    public Category() {
    }

    public Category(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(code, category.code) && Objects.equals(name, category.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }

    @Override
    public String toString() {
        return "Category{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
