package com.zamannow.basic;

public class PlayingWScope {
    private Integer age;

    public static void main(String[] args) {
        PlayingWScope playingWScope = new PlayingWScope();
        System.out.println(playingWScope.helloName(""));
    }

    public String helloName(String name) {
        String hello = "Hello " + name; // Hello
        if (!name.isBlank()) {
            String hi = "Hi " + name; // Hi DNL
            return hi;
        } else {
            //System.out.println(hi); // error karena sudah di luar scope block
        }
        return hello; // kalau ini bisa karena masih di scope block yang sama variablenya
        //return hi; // error karena sudah di luar scope,
        //System.out.println(hello); // kalau sudah return itu tidak bisa lagi buat statement artinya method ini sudah berakhir
    }
}
