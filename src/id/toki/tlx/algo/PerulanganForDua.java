package id.toki.tlx.algo;

public class PerulanganForDua {
    public static void main(String[] args) {
        System.out.println("Perulangan Menggunakan For");
        System.out.println("==============================");
        int i;
        int j;
        int k;

        /**
         * Perulangan pertama digunakan untuk menambah
         * baris dari 1 sampai 9, kemudian perulangan kedua digunakan untuk
         * mengatur spasi atau baris kosong, dan perulangan ketiga digunakan untuk
         * menampilkan karakter “*”.
         */
        for (i = 1; i <= 9; i++) {
            for (j = 9; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k < (2*i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
