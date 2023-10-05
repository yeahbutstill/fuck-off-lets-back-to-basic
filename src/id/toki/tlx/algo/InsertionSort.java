package id.toki.tlx.algo;

public class InsertionSort {
  public static void main(String[] args) {
    int[] data = {5, 2, 4, 3, 1};
    System.out.print("Data awal : ");
    cetak(data);
    sort(data);
    System.out.print("\n\nData urut : ");
    cetak(data);
  }

  public static void sort(int[] data) {
    int key;
    int step;
    int index;

    for (step = 1; step < data.length; step++) {
      key = data[step];
      index = step;
      System.out.println("\n\nStep ke " + step);
      System.out.println("key: " + key);
      cetak(data);
      while ((index > 0) && (data[index - 1] > key)) {
        data[index] = data[index - 1];
        System.out.print(
            " Bandingkan "
                + key
                + " dengan "
                + data[index - 1]
                + " ("
                + key
                + " < "
                + data[index - 1]
                + ")");
        index = index - 1;
        System.out.println(" -> Tukar " + key + " dengan " + data[index]);
        data[index] = key;
        cetak(data);
      }

      if (index > 0) {
        System.out.print(
            " Bandingkan "
                + key
                + " dengan "
                + data[index - 1]
                + " ("
                + key
                + " > "
                + data[index - 1]
                + ") -> tetap");
      }
    }
  }

  public static void cetak(int[] data) {
    for (int i = 0; i < data.length; i++) {
      System.out.print(data[i] + " ");
    }
  }
}
