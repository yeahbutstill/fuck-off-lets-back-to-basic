package id.toki.tlx.kuis.percabangan;

public class Test8 {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        x = x * y + 1;
        y = x * y - 1;
        x = y;

        if (x < y) {
            x = y - x;
        } else if (x > y) {
            x = x - y;
        } else {
            x = x / x;
        }

        System.out.println(x);
    }
}
