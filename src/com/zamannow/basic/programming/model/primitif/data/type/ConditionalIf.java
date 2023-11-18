package com.zamannow.basic.programming.model.primitif.data.type;

public class ConditionalIf {
    public static void main(String[] args) {
        int x = -1;
        if (x < 0) {
            x = -x;
            System.out.println(x);
            System.out.println(-1 * -1);
        }
    }
}
