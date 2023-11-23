package com.zamannow.generic;

import java.util.Objects;

public class DataBukanGeneric {
    private Object data;

    public DataBukanGeneric() {
    }

    public DataBukanGeneric(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataBukanGeneric that = (DataBukanGeneric) o;

        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return data != null ? data.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "DataBukanGeneric{" +
                "data=" + data +
                '}';
    }
}
