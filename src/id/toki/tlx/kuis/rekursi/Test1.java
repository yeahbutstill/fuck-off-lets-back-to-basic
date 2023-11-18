package id.toki.tlx.kuis.rekursi;

public class Test1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.println(test1.banyak(5));
        test1.draw(4);
        System.out.println(test1.jabatan(2, 5));
        System.out.println(test1.kardus(12, 17));
        System.out.println(test1.ekor(3, 4, 2));
        test1.majuMundur("bebek", 0);
        System.out.println();
        System.out.println(test1.ping(5));
        System.out.println(test1.pong(5));
        System.out.println("============================");
        System.out.println(test1.wolo("dengklek", 0));
        System.out.println(test1.jdd(19823));
        System.out.println(test1.janji(10, 8, 0));
    }

    int banyak(int x) {
        if (x < 0) {
            return 0;
        } else {
            return x + banyak(x - 2);
        }
    }

    int jdd(int x) {
        if (x == 0) {
            return 0;
        } else {
            return jdd(x / 100) + (x % 100);
        }
    }

    void draw(int x) {
        if (x > 0) {
            draw(x - 1);
            for (int i = 0; i < x; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    int jabatan(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b % 2 == 1) {
            return a * jabatan(a, b - 1);
        } else {
            int temp = jabatan(a, b / 2);
            return temp * temp;
        }
    }

    int kardus(int a, int b) {
        if (a > b) {
            return 1 + kardus(a - 1, b);
        } else if (a < b) {
            return 1 + kardus(a, b - 1);
        } else {
            return a + b;
        }
    }

    int ekor(int a, int b, int t) {
        if (b == 0) {
            return t;
        } else {
            return ekor(a, b - 1, t * a);
        }
    }

    void majuMundur(String str, int i) {
        if (i == str.length() - 1) {
            System.out.printf("%c", str.charAt(i));
        } else {
            System.out.printf("%c", str.charAt(i));
            majuMundur(str, i + 1);
            System.out.printf("%c", str.charAt(i));
        }
    }

    int ping(int a) {
        if (a == 0) {
            return 0;
        } else {
            return 1 + pong(a - 1);
        }
    }

    int pong(int a) {
        if (a == 0) {
            return 0;
        } else {
            return 2 + ping(a - 1);
        }
    }

    String wolo(String s, int i) {
        if (s.length() == i) {
            return "";
        } else {
            return s.length() - i - 1 + wolo(s, i + 1);
        }
    }

    int janji(int p, int q, int t) {
        if (p == q) {
            return t;
        } else if (t % 2 == 1) {
            return 2 + janji(p + 1, q, t + 1);
        } else {
            return 2 + janji(p, q - 1, t + 1);
        }
    }
}
