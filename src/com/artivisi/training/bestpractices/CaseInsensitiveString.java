package com.artivisi.training.bestpractices;

import java.util.Objects;

public class CaseInsensitiveString {
    private final String x;

    public CaseInsensitiveString(String x) {
        this.x = x;
    }

    public String getX() {
        return x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CaseInsensitiveString that = (CaseInsensitiveString) o;
        return Objects.equals(x, that.x);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(x);
    }


}
