package desktop.ifnu.bima.feel.of.java.array;

public class ArrayError {
  public static void main(String[] args) {
    /**
     * Kalau index yang dimasukkan diluar jangkauan yang benar, akan muncul
     * ArrayIndexOfBoundException. Mari kita simulasikan bagaimana error ArrayIndexOfBoundException
     * terjadi :
     */
    int[] data = new int[4];
    data[1] = 10;
    data[3] = 8;
    data[4] = 9;
    /**
     * Terlihat bahwa array mempunyai panjang 4, index terbesar adalah 3 karena index array
     * dimulai dari 0, kemudian kode data[4] berusaha mengakses index 4 yang berada di luar
     * jangkauan.
     */
  }
}
