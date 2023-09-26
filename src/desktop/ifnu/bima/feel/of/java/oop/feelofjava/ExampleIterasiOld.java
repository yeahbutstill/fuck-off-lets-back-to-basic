package desktop.ifnu.bima.feel.of.java.oop.feelofjava;

public class ExampleIterasiOld {
  public static void main(String[] args) {
    String[] arr = {"Makanan", "Barang", "Hewan"};

    // OLD
    for (int idx = 0; idx < arr.length; idx++) {
      System.out.println(arr[idx]);
    }

    // bandingkan kode di atas dengan kode yang sama untuk PHP:
    // $arr = array("a","b","c"});
    // foreach($val in $arr) {
    // echo $val;
    // }
    // Kode PHP mempunyai jumlah kode lebih sedikit dan lebih sederhana.

    System.out.println();

    // NEW
    for (String current : arr) {
      System.out.println("current: " + current);
    }
  }
}
