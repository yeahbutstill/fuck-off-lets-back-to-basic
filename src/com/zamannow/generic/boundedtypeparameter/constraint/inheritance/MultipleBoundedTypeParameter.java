package com.zamannow.generic.boundedtypeparameter.constraint.inheritance;

import java.util.Objects;

/**
 * nah Multiple bounded type ini, yang pertama itu harus class dan yang kedua itu interface.
 * Kalau kita tambahkan Class lagi, maka error, kenapa begitu? Ingat karena di Java cuman boleh punya 1 parent class
 * Jadi Class, Interface, Interface, Interface dan seterusnya Interface
 */
public class MultipleBoundedTypeParameter<T extends Employee & CanSayHello> {
    private T data;

    public MultipleBoundedTypeParameter(T data) {
        this.data = data;
    }

    public MultipleBoundedTypeParameter() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MultipleBoundedTypeParameter<?> that = (MultipleBoundedTypeParameter<?>) o;

        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return data != null ? data.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "MultipleBoundedTypeParameter{" +
                "data=" + data +
                '}';
    }
}
