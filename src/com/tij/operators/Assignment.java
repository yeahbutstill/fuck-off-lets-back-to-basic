package com.tij.operators;

public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        int a = 4;
        int b = a;
        int c = 2;
        t1.level = 9;
        t2.level = 47;

        System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);

        t1 = t2;
        System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);

        t1.level = 27;
        System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);

        System.out.println(++a);
        System.out.println(b);
        System.out.println("======================================================");

        int x = -a;
        System.out.println(x);

        int x1 = a * -c;
        System.out.println(x1);

        int x2 = a * (-c);
        System.out.println(x2);
    }
} /* Output:
1: t1.level: 9, t2.level: 47
2: t1.level: 47, t2.level: 47
3: t1.level: 27, t2.level: 27
*///:~

class Tank {
    int level;
}