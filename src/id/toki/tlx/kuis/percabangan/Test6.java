package id.toki.tlx.kuis.percabangan;

public class Test6 {
    public static void main(String[] args) {
        int a = -2;
        int b = a + a;
        int c = b * b;
        if (a > b) {
            if (c < b) {
                System.out.println(c);
            } else {
                System.out.println(b);
            }
        } else {
            if (c < a) {
                System.out.println(c);
            } else {
                System.out.println(a);
            }
        }
    }
}
