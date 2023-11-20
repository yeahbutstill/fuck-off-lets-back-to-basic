package com.zamannow.oop.variablehiding;

public class DemoHiding {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Naruto";
        child.doit();
        System.out.println(child.name);
        System.out.println();

        // variable hiding vs method overriding
        // ketika kita melakukan method overriding itu pasti yang akan diakses adalah si method override nya, kucali kita bikin object baru dari parentnya
        Parent parent = child;
        parent.doit();
        // name ini yang diakses bukan yang ada di child nya, tapi yang diakses adalah name dari parentnya. karena di JAVA tidak ada field atau properti overriding. jadi yang ada adalah variable hiding
        // makannya tidak disarankan, bikin nama variable yang sama di inheritance
        System.out.println(parent.name);
        System.out.println();
    }
}
