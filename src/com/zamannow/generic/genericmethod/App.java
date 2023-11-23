package com.zamannow.generic.genericmethod;

public class App {
    public static void main(String[] args) {
        String[] names = {"DNL", "Kurniawan", "HOHO", "HEHE"};
        Integer[] values = {1, 2, 3,3 ,4, 5, 6};
        ArrayHelper arrayHelper = new ArrayHelper();

        System.out.println(arrayHelper.count(values));
        System.out.println(ArrayHelper.staticCount(names));
        System.out.println(ArrayHelper.staticCount(values));
    }
}
