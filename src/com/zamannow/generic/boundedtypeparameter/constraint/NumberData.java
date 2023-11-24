package com.zamannow.generic.boundedtypeparameter.constraint;

import java.util.Objects;

/**
 * Saat kita bikin Generic Class lalu tambahkan generic parameter type (T), lalu extends Number.
 * Artinya cuman Number dan juga class turunannya saja yang boleh
 * Jika saat membuat object lalu disimpan di variable yang typenya String maka akan error
 * Defualtnya itu ada Object
 * Untuknya saat menggunakan constraint adalah, semua method yang diset extends constraintnya bisa kita access
 * Makannya cocok untuk generic type yang spesifik
 * @param <T> jadi method yang ada di Number bisa digunakan di generic parameter type
 */
public class NumberData<T extends Number> {
    private T data;

    public NumberData(T data) {
        this.data = data;
    }

    public NumberData() {
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

        NumberData<?> that = (NumberData<?>) o;

        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return data != null ? data.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "NumberData{" +
                "data=" + data +
                '}';
    }
}
