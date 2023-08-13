package id.toki.tlx.kuis.percabangan;

public class Test3 {
    public static void main(String[] args) {
        int nilai = 85;
        char ch = 0;
        if (nilai >= 80) {
            ch = 'A';
        }
        if (nilai >= 70) {
            ch = 'B';
        }
        if (nilai >= 60) {
            ch = 'C';
        }
        if (nilai >= 50) {
            ch = 'D';
        }
        if (nilai >= 40) {
            ch = 'E';
        }
        System.out.println(ch);
    }
}
