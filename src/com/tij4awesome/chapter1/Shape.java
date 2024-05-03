package com.tij4awesome.chapter1;

public class Shape {
    private String color;

    public void draw() {
        System.out.println("Gambar");
    }

    public void erase() {
        System.out.println("Hapus");
    }

    public void move() {
        System.out.println("Bergerak");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    void doSomething(Shape shape) {
        /*
        Perhatikan bahwa tidak tertulis,
        “Jika Anda berbentuk Circle, lakukan ini, jika Anda berbentuk Square, lakukan itu, dll.”
        Jika Anda menulis kode semacam itu, yang memeriksa semua kemungkinan jenis Shape yang sebenarnya,
        itu berantakan dan Anda perlu mengubahnya setiap kali Anda menambahkan jenis Shape baru.
        Di sini, Anda hanya mengatakan, "Kamu adalah bentuk, saya tahu kamu dapat erase( ) dan draw( ) sendiri, melakukannya,
        dan mengurus detailnya dengan benar."
         */
        shape.erase();
        shape.draw();
    }
}
