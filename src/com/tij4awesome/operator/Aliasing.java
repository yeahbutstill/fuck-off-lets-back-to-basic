package com.tij4awesome.operator;

import static com.tij4awesome.net.mindview.util.Print.print;

public class Aliasing {
    public static void main(String[] args) {
        Tank1 t11 = new Tank1();
        Tank1 t22 = new Tank1();
        t11.level = 9;
        t22.level = 47;

        print("1: t11.level: " + t11.level + ", t22.level: " + t22.level);
        t11 = t22;
        print("2: t11.level: " + t11.level + ", t22.level: " + t22.level);
        t11.level = 27;
        print("3: t11.level: " + t11.level + ", t22.level: " + t22.level);

        // aliasing
        // Fenomena ini sering disebut aliasing, dan ini merupakan cara
        // mendasar Java bekerja dengan objek. Namun bagaimana jika Anda
        // tidak ingin aliasing terjadi pada kasus ini?
        // Anda dapat melepaskan tugas tersebut dan berkata:
        t11.level = t22.level;
        print(t11.level);
        print(t22.level);
    }
}

class Tank1 {
    int level;
}
