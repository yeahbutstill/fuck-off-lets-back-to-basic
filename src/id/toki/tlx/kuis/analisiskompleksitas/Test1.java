package id.toki.tlx.kuis.analisiskompleksitas;

public class Test1 {
    public static void main(String[] args) {
        int count = 0;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            count = count + (2 * i - 1);
        }
        System.out.println(count);
    }
}
