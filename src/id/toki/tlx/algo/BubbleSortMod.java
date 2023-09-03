package id.toki.tlx.algo;

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
