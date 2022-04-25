package chapter5moredatatypesandoperators.arrayonedimension.trythissortinganarray;

import java.util.Arrays;

public class QuickSort {

    // metode untuk menemukan posisi partisi ascending order
    static int partitionAsc(int[] array, int low, int high) {

        // pilih elemen paling kanan sebagai pivot
        int pivot = array[high];

        // penunjuk untuk elemen yang lebih besar
        int i = (low - 1);

    /*
     melintasi semua elemen
     bandingkan setiap elemen dengan pivot
    */
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {

        /*
         jika elemen yang lebih kecil dari pivot ditemukan
         tukar dengan elemen yang lebih besar yang ditunjukkan oleh i
        */
                i++;

                // menukar elemen di i dengan elemen di j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // menukar elemen pivot dengan elemen yang lebih besar yang ditentukan oleh i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // kembalikan posisi dari tempat partisi selesai
        return (i + 1);
    }

    // metode untuk menemukan posisi partisi descending order
    static int partitionDes(int[] array, int low, int high) {

        // pilih elemen paling kanan sebagai pivot
        int pivot = array[high];

        // penunjuk untuk elemen yang lebih besar
        int i = (low - 1);

    /*
     melintasi semua elemen
     bandingkan setiap elemen dengan pivot
    */
        for (int j = low; j < high; j++) {
            if (array[j] >= pivot) {

        /*
         jika elemen yang lebih besar dari pivot ditemukan
         tukar dengan elemen yang lebih kecil yang ditunjukkan oleh i
        */
                i++;

                // menukar elemen di i dengan elemen di j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // menukar elemen pivot dengan elemen yang lebih besar yang ditentukan oleh i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // kembalikan posisi dari tempat partisi selesai
        return (i + 1);
    }

    static void quicksortAsc(int[] array, int low, int high) {
        if (low < high) {

      /*
       temukan elemen pivot sedemikian rupa sehingga
       elemen yang lebih kecil dari pivot ada di sebelah kiri
       elemen yang lebih besar dari pivot berada di sebelah kanan
      */
            int pi = partitionAsc(array, low, high);

            // panggilan rekursif di sebelah kiri pivot
            quicksortAsc(array, low, pi - 1);

            // panggilan rekursif di sebelah kanan pivot
            quicksortAsc(array, pi + 1, high);
        }
    }

    static void quicksortDesc(int[] array, int low, int high) {
        if (low < high) {

      /*
       temukan elemen pivot sedemikian rupa sehingga
       elemen yang lebih kecil dari pivot ada di sebelah kiri
       elemen yang lebih besar dari pivot berada di sebelah kanan
      */
            int pi = partitionDes(array, low, high);

            // panggilan rekursif di sebelah kiri pivot
            quicksortDesc(array, low, pi - 1);

            // panggilan rekursif di sebelah kanan pivot
            quicksortDesc(array, pi + 1, high);
        }
    }
}

class Main {
    public static void main(String[] args) {
        int[] data = {8, 7, 2, 1, 0, 9, 6};
        System.out.println("Array yang tidak disortir");
        System.out.println(Arrays.toString(data));

        int size = data.length;

        // panggil quicksort() pada data array
        QuickSort.quicksortAsc(data, 0, size - 1);

        System.out.println("Array yang Diurutkan dalam Urutan Naik");
        System.out.println(Arrays.toString(data));

        // panggil quicksort() pada data array
        QuickSort.quicksortDesc(data, 0, size - 1);

        System.out.println("Array yang Diurutkan dalam Urutan Turun");
        System.out.println(Arrays.toString(data));
    }
}
