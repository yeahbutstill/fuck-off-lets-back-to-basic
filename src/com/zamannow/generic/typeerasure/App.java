package com.zamannow.generic.typeerasure;

import com.zamannow.generic.genericclass.MyData;

public class App {
    public static void main(String[] args) {
        // Hati-hati ketika melakukan type erasure dimana kita menghilangkan info genericnya
        // apa lagi nanti kalau sudah berkerja dengan code-code yang sudah lama, yang info genericnya hilang
        // ini bisa bahaya kalau kita menghilangkan info genericnya
        MyData myData = new MyData();
        myData.setData("DNL");

        MyData<Integer> integerMyData = myData;
        Integer data = integerMyData.getData(); // error
    }
}
