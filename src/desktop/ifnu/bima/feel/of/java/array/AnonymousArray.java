package desktop.ifnu.bima.feel.of.java.array;

import java.util.Arrays;

public class AnonymousArray {
  // Walaupun ada keyword new, tidak perlu didefnisikan berapa panjang dari arraynya, karena
  // panjang dari array ditentukan dari nilai yang diletakkan di dalam kurung kurawal.
  // Tipe data array sangat penting ketika array akan digunakan sebagai perameter sebuah fungsi,
  // mari kita lihat kode di bawah ini :
  public static void printArray(String[] data) {
    System.out.println(Arrays.toString(Arrays.stream(data).toArray()));
  }

  public static void main(String[] args) {
    printArray(new String[] {"Satu", "Dua", "Tiga"});
    // Karena pada dasarnya array adalah object, maka array juga mempunyai method dan property.
    // Salah satu yang paling berguna adalah length. Properti ini digunakan untuk mengetahui berapa
    // panjang dari array tersebut. Contohnya sebagai berikut :
    int[] data = new int[] {1, 90, 200, 500, -1, -10, 10, 20, 5, 4, 3};
    System.out.println("panjang data: " + data.length);
    // Java juga mempunyai sebuah class yang berisi perkakas untuk mengolah data,
    // misalnya melakukan sorting, melakukan pencarian binary bahkan hingga mengeprint isi array
    // agar
    // bagus tampilanya. Class tersebut adalah java.util.Arrays. Silahkan lihat Java Documentation
    // bagaimana cara menggunakan perkakas yang ada dalam class java.util.Arrays ini.
    int[] arr = {5, 2, 9, 1, 5};
    System.out.println(Arrays.toString(Arrays.stream(arr).sorted().toArray()));
  }
}
