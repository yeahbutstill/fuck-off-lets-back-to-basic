package com.tij4awesome.operator;

import static com.tij4awesome.net.mindview.util.Print.print;

/***
 * Assignment with objects is a bit tricky
 * Penugasan dengan objek agak rumit
 */
public class Assignment {
    public static void main(String[] args) {
        int a = 4;
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;

        print(a);
        print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        // t2 ditetapkan ke t1 (aliasing)
        t1 = t2;
        print("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
        // t1 diubah nilai levelnya
        t1.level = 27;
        print("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
}
// Dalam banyak bahasa pemrograman, anda mengharapkan t1 dan t2 independen sepanjang waktu
// namun karena anda telah menetapkan referensi, mengubah object t1 tampaknya juga mengubah t2
// Hal ini karena baik t1 maupun t2 mengandung referensi yang sama, yaitu menunjuk pada object
// yang sama (Referensi asli yang ada di t1, yang menunjukan ke object yang memiliki nilai 9,
// ditimpah selama penugasan dan hilang secara efektif, objectnya akan dibersihkan oleh GC)

class Tank {
    int level;
}