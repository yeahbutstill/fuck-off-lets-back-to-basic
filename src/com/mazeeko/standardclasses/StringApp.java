package com.mazeeko.standardclasses;

import java.util.Arrays;


public class StringApp {
    public static void main(String[] args) {
        String name = "Yeah But Still";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        char data[] = {'Y', 'e', 'a', 'h', 'B', 'u', 't', 'S', 't', 'i', 'l', 'l'};
        String str = new String(data);

        System.out.println(name);
        System.out.println(str);

        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);

        // ingat space pun diitung character
        System.out.println(name.length());

        // diambi index 2, terus hapus dari index 3
        System.out.println(nameUpperCase.substring(2, 3));
        System.out.println(nameLowerCase.substring(1, 2));

        System.out.println(name.startsWith("Dani"));
        System.out.println(name.endsWith("Maya"));

        System.out.println(name.startsWith("yeah"));
        System.out.println(name.startsWith("y"));

        System.out.println(nameLowerCase.startsWith("yeah"));
        System.out.println(nameUpperCase.startsWith("YEAH"));

        String[] names = Arrays.toString(data).split(" ");
        System.out.println(Arrays.toString(names));

        System.out.println("".isEmpty());
        System.out.println(" ".isBlank());


    }
}
