package id.toki.tlx.kuis.analisiskompleksitas;

// N2(N+1)
public class Test {
    public static void main(String[] args) {
        int x = 0;
        int n = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j; k < n; k++) {
                    x = x + 2;
                }
            }
        }
    }
}
