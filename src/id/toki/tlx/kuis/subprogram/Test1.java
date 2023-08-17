package id.toki.tlx.kuis.subprogram;

public class Test1 {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.hitung(5, 3);
        System.out.print("x");
        t1.hitung(2, 1);
    }

    void hitung(int a, int b) {
        for (int i = a; i >= b; i--) {
            System.out.print(i);
        }
    }
}
