package id.toki.tlx.kuis.rekursi;

public class Test2 {
    static int n = 5;
    static int[] arr = new int[5];

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.batang(3);
        test2.rindang(3);

        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 8;
        arr[4] = 11;
        System.out.printf(String.valueOf(wow(0, 2)));
        System.out.printf(String.valueOf(wow(0, 6)));
        System.out.printf(String.valueOf(wow(0, 9)));
        System.out.println("==================================");
        test2.gali(4);
    }

    static boolean wow(int i, int t) {

        if (i >= n) {
            return t == 0;
        } else {
            return wow(i + 1, t - arr[i]) || wow(i + 1, t);
        }
    }

    void batang(int x) {
        if (x == 0) {
            System.out.print("daun\n");
        } else {
            batang(x - 1);
            batang(x - 1);
        }
    }

    void rindang(int x) {
        if (x > 0) {
            for (int i = 0; i < x; i++) {
                rindang(x - 1);
            }
        }
    }

    void gali(int x) {
        System.out.printf("%d_", x);
        if (x > 1) {
            gali(x / 4);
            gali(x / 2);
        }
        System.out.printf("%d_", -x);
    }
}
