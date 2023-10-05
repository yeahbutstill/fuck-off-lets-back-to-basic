package id.toki.tlx.algo;

public class SelectionSort {
  public static void main(String[] args) {
    int[] data = {6, 8, 5, 9, 7};
    System.out.print("\nData Acak: ");
    cetak(data);
    sort(data);
    System.out.print("\n\nData Urut: ");
    cetak(data);
  }

  public static void sort(int[] data) {
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
        int temp = data[pos];
        data[pos] = data[ulang];
        data[ulang] = temp;
        System.out.print("\nTukar " + data[pos] + " & " + data[ulang] + ": [ ");
        cetak(data);
        System.out.print("]");
      }
    }
  }

  public static void cetak(int[] data) {
    for (int i = 0; i < data.length; i++) {
      System.out.print(data[i] + " ");
    }
  }
}
