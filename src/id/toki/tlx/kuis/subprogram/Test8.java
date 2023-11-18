package id.toki.tlx.kuis.subprogram;

public class Test8 {
    public static void main(String[] args) {
        Test8 test8 = new Test8();
        test8.printStatus(10, 12);
        test8.printStatus(11, 13);
    }

    String getStatus(int x) {
        if (x % 2 == 1) {
            return "a";
        } else {
            return "b";
        }
    }

    void printStatus(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}
