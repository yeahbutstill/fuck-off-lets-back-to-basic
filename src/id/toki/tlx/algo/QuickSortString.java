package id.toki.tlx.algo;

import java.util.Arrays;

public class QuickSortString {
    static int counter = 0;

    public static void main(String[] args) {
        Character[] data = {'d', 'c', 'g', 'h', 'b', 'a', 'f', 'i', 'e', 'c'};
        int n = data.length;
        System.out.println("\nData Acak: " + Arrays.toString(data));
        quick(data, 0, n - 1);
        System.out.print("\nData Urut: " + Arrays.toString(data));
    }

    public static int partisi(Character[] data, int start, int end) {
        int pivot = data[end]; // pivot data paling kanan
        int i = (start - 1);
        System.out.print("\nPivot = " + pivot + "\n" + Arrays.toString(data));

        for (int index = start; index <= (end - 1); index++) { // loop untuk membandingkan element data dengan pivot
            if (data[index] < pivot) { // kondisi membandingkan element yang lebih kecil dari pivot
                i++; // penanda posisi index
                if (data[index] == data[i] && (index == i)) {
                    System.out.println(" : " + data[index] + " < " + pivot + ", " + data[index] + " tetap di " +
                            "[" + index + "]");
                } else {
                    System.out.println(" : " + data[index] + " < " + pivot + ", tukar " + data[index] + " dengan " +
                            data[i] + "[" + i + "]");
                    Character temp = data[i]; // tukar element yang < pivot
                    data[i] = data[index]; // dengan data yang lebih
                    data[index] = temp; // besar pada index i
                }

                System.out.print(Arrays.toString(data));
            } else if (data[index] > pivot) {
                System.out.print(" : " + data[index] + " > " + pivot + ", " + data[index] + "[" + index + "]\n" +
                        Arrays.toString(data));
            }
        }

        if (data[end] == data[i + 1]) {
            System.out.println(" : end step, " + data[end] + " tetap (di kiri tidak ada yang > " +
                    data[end] + ")\n" + Arrays.toString(data));
        } else {
            System.out.println(" : end step, tukar " + data[end] + " dengan " + data[i+1] + "[" + (i + 1) + "]");
            Character temp = data[i+1]; // tukar pivot dengan
            data[i+1] = data[end]; // data yang >
            data[end] = temp; // pada index i
            System.out.print(Arrays.toString(data));
        }
        System.out.println();
        return (i + 1); // mengembalikan posisi
    }

    public static void quick(Character[] data, int start, int end) { // proses sorting
        if (start < end) {
            counter++;
            System.out.print("\nStep " + counter);
            int pIndex = partisi(data, start, end); // menentukan posisi partisi
            quick(data, start, pIndex - 1); // rekursif sisi kiri pivot
            quick(data, pIndex + 1, end); // rekursif sisi kanan pivot
        }
    }
}
