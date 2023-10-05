package id.toki.tlx.algo;

public class ArrayDimensiDua {
  public static void main(String[] args) {
    // deklarasi array
    int[][] piksel = new int[2][3];

    // mengisi element tertentu
    piksel[0][0] = 70;
    piksel[0][1] = 10;
    piksel[0][2] = 40;
    piksel[1][0] = 75;
    piksel[1][1] = 77;
    piksel[1][2] = 20;

    // menampilkan element array
    int i;
    int j;
    for (i = 0; i < 2; i++) {
      System.out.println();
      for (j = 0; j < 3; j++) {
        System.out.print(piksel[i][j] + " ");
      }
    }
  }
}
