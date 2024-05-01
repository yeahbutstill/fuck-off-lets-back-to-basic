package com.tij4awesome.chapter1;

public class Car {
    // komposisi
    // objek anggota kelas baru anda biasanya bersifat private
    // membuatnya tidak dapat diakses oleh program client
    // yang menggunakan kelas tersebut
    private String name;
    private String price;
    private Engine engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", engine=" + engine +
                '}';
    }
}
