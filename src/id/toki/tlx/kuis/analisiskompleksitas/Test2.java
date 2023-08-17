package id.toki.tlx.kuis.analisiskompleksitas;

public class Test2 {
    public static void main(String[] args) {
        int total = 0;
        int n = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = n -3; j >= i; j--) {
                total = total + 1;
            }
        }
    }
}
