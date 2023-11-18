package id.toki.tlx.kuis.percabangan;

public class Test4 {
    public static void main(String[] args) {
        int a = 26;
        if (!(a % 2 == 1)) {
            System.out.print("genap ");
        } else {
            System.out.print("ganjil ");
        }

        if (a > 0) {
            System.out.print("positif\n");
        } else if (a < 0) {
            System.out.print("negatif\n");
        } else {
            System.out.print("nol\n");
        }
    }
}
