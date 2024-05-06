package com.zamannow.generic.wildcard;

import com.zamannow.generic.genericclass.MyData;

public class App {
    public static void main(String[] args) {
        App app = new App();
        MyData<Object> anggka = new MyData<>();
        anggka.setData(100);

        app.printLength(anggka);
        app.printLength(new MyData<>("DNL"));
        app.printLength(new MyData<>(true));
        app.printLength(new MyData<>());
    }

    /**
     * kalau generic parameternya wildcard, otomatis bisa memasukan data apapun
     * ketika getData dia jatohnya jadi object, jadi tidak akan bisa dikonversi ke mana-mana
     * dan bahkan kalau bisa jangan sekali-kali ngelakuin konversi ataupun ngelakuin setData kalau tipenya adalah wildcard
     *
     * @param data
     */
    public void printLength(MyData<?> data) {
        System.out.println(data.getData());
    }
}
