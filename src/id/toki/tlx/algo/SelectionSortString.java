package id.toki.tlx.algo;

public class SelectionSortString {
    public static void main(String[] args) {
        Character[] data = {'d', 'c', 'g', 'h', 'b', 'a', 'f', 'i', 'e', 'c'}; // data aray acak
        System.out.print("\nData Acak: ");
        cetak(data);
        sort(data);
        System.out.print("\n\nData Urut: ");
        cetak(data);
    }

    public static void sort(Character[] data) {
        // perulangan sebanyak data
        for (int ulang = 0; ulang < data.length - 1; ulang++) {
            int pos = ulang; // posisi tukar
            int min = data[ulang]; // nilai minimum
            System.out.print("\n\nMin: " + min + ", Pos: " + pos);
            // perulangan membandingkan data
            for (int index = ulang + 1; index < data.length; index++) {
                System.out.print("\nIterasi-" + (ulang + 1) + "." + index + " [ ");
                cetak(data);
                System.out.print("] cek " + data[index] + " < " + min);
                if (data[index] < min) { // kondisi untuk membandingkan data
                    min = data[index];
                    pos = index;
                    System.out.print(", Min: " + min + ", Pos: " + pos);
                }
            }

            if (pos != ulang) { // kondisi pertukaran data
                Character temp = data[pos];
                data[pos] = data[ulang];
                data[ulang] = temp;
                System.out.print("\nTukar " + data[pos] + " & " + data[ulang] + ": [ ");
                cetak(data);
                System.out.print("]");
            }
        }
    }

    public static void cetak(Character[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
