package com.mazeeko.dasar;
public class TipeDataString {
    public static void main(String[] args){
        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";
        String e = "E";
        String f = "F";
        String g = "G";
        String h = "H";
        String i = "I";
        String j = "J";
        String k = "K";
        String l = "L";
        String m = "M";
        String n = "N";
        String o = "O";
        String p = "P";
        String q = "Q";
        String r = "R";
        String s = "S";
        String t = "T";


        String test = "TEST";
        String makan = "Makan";

        char data[] = {'s', 'a', 'y', 'a'};
        String str = new String(data);

        System.out.println("abc");
        String kl = "KudaLaut";
        System.out.println("abc" + kl);

        String c1 = "maya TRIYANTI".substring(8, 13);
        String d2 = kl.substring(1, 2);

        System.out.println(test.length());
        System.out.println(makan.toCharArray());
        System.out.println(str);
        System.out.println(c1);
        System.out.println(d2);
    }
}
