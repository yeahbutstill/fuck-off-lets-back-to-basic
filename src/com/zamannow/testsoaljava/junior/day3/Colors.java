package com.zamannow.testsoaljava.junior.day3;

import java.util.Scanner;

public class Colors {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("What color do you want? ");
        String color = console.next();
        if (color.equalsIgnoreCase("r")) {
            System.out.println("You have chosen Red.");
        } else if (color.equalsIgnoreCase("g")) {
            System.out.println("You have chosen Green.");
        } else if (color.equalsIgnoreCase("b")) {
            System.out.println("You have chosen Blue.");
        } else {
            System.out.println("Unknown color: " + color);
        }
    }
}
