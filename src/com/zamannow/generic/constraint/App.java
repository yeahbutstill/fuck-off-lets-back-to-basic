package com.zamannow.generic.constraint;

public class App {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<>();
        integerNumberData.setData(100);
        System.out.println(integerNumberData.getData());

        // error
        //NumberData<String> numberNumberData = new NumberData<>();

    }
}
