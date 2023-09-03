package id.toki.tlx.algo;

/**
 * Berdasarkan cara kerjanya Bubble Sort merupakan algoritma sorting
 * yang sangat sederhana untuk dipahami dan diimplementasikan, akan
 * tetapi jika diperhatikan secara seksama perbandingan data terdapat kemungkinan elemen yang sudah
 * dibandingkan dan sudah benar posisinya akan terus ikut dibandingkan,
 * hal ini menyebabkan inefisiensi ketika bubble sort digunakan untuk
 * mengurutkan array dengan elemen data yang banyak. Modifikasi
 * algoritma bubble sort untuk mengurangi inefisiensi dapat dilakukan dengan memberikan penanda status
 * pada saat perbandingan dan pertukaran elemen data sehingga dengan adanya penanda tersebut perulangan
 * dapat membedakan elemen yang sudah benar posisinya dengan elemen yang masih perlu untuk dilakukan perbandingan.
 * Penanda status dilakukan dengan menggunakan variabel boolean status=true;
 * Selama status==true perulangan akan terus dilakukan.
 * Perubahan status==true menjadi status==false dilakukan sebelum
 * program menjalankan perbandingan elemen perubahan
 * kembali dari status==false menjadi status==true terjadi jika kondisi
 * terpenuhi namun apabila kondisi (baris 17) tidak terpenuhi status akan
 * tetap false yang artinya elemen sudah berada diposisi yang tepat dan
 * perulangan tidak dilakukan.
 */
public class BubbleSortMod {
    public static void main(String[] args) {
        int[] data = {5,4,1,2,3}; // data aray acak
        sort(data); // method sort
    }

    public static void sort(int[] data) {
        int banyak = data.length;
        boolean status = true;
        System.out.print("\nData sebelum di sorting: ");
        cetak(data);
        for (int ulang = 0; ulang < (banyak - 1) && status; ulang++) { // perulangan luar
            System.out.print("\n\nIterasi ke-" + (ulang + 1));
            status = false;
            for (int index = 1; index < banyak - ulang; index++) { // perulangan dalam
                System.out.print("\n" + (ulang + 1) + "." + index + " [");
                cetak(data);
                System.out.print("] cek " + data[index - 1] + " > " + data[index] + ", ");
                if (data[index-1] > data[index]) { // element kiri < element kanan
                    System.out.print("Tukar " + data[index - 1] + " & " + data[index]);
                    int temp = data[index - 1]; // pertukaran data
                    data[index - 1] = data[index]; // pertukaran data
                    data[index] = temp; // pertukaran data
                    status = true;
                }
            }
        }
        System.out.print("\n\nData Setelah Sorting: ");
        cetak(data);
    }

    public static void cetak(int[] data) {
        for (int x = 0; x < data.length; x++) {
            System.out.print(data[x] + " ");
        }
    }
}
