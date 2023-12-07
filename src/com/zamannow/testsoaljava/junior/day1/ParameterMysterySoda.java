package com.zamannow.testsoaljava.junior.day1;

public class ParameterMysterySoda {
    public static void main(String[] args) {
        String soda = "coke";
        String pop = "pepsi";
        String coke = "pop";
        String pepsi = "soda";
        String say = pop;

        carbonated(coke, soda, pop);
        carbonated(pop, pepsi, pepsi);
        carbonated("pop", pop, "koolaid");
        carbonated(say, "say", pop);
    }

    private static void carbonated(String a, String b, String c) {
        System.out.println("say " + b + " not " + c + " or " + a);
    }
}
