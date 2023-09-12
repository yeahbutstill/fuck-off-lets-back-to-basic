package desktop.ifnu.bima.feel.of.java.array;

/**
 * Sekarang kita lihat bagaimana cara memasukkan data ke dalam array multidimensi. Seperti yang
 * sudah kita bahas sebelumnya, cara menginisialisasi array multidimensi ada dua, yang pertama
 * adalah mengisi ukuran semua dimensi array, dan yang kedua adalah mengisi dimensipertama saja.
 * Kalau cara pertama yang kita pilih untuk menginisialisasi array, maka data bisa langsung
 * dimasukkan ke dalam array seperti contoh di bawah ini :
 */
public class DataDalamMultidimensi {
  public static void main(String[] args) {
    // 2D
    int[][] data = new int[3][3];
    data[0][0] = 1;
    data[0][1] = 2;
    data[0][2] = 3;

    data[1][0] = 1;
    data[1][1] = 1;
    data[1][2] = 1;

    data[2][0] = 1;
    data[2][1] = 2;
    data[2][2] = 3;

    // Kalau cara kedua yang dipilih, maka kita harus menginisialisasi array untuk dimasukkan ke
    // dalam
    // array dimensi pertama, bingung? Hmm mari kita lihat contoh saja agar lebih mudah.
    int[][] dataCaraKedua = new int[3][];
    dataCaraKedua[0] = new int[5]; // init array yang dimasukan ke array dimensi pertama
    dataCaraKedua[0][0] = 10;
    dataCaraKedua[0][1] = 12;
    dataCaraKedua[0][2] = 14;
    dataCaraKedua[0][3] = 16;
    dataCaraKedua[0][4] = 18;

    dataCaraKedua[1] = new int[2]; // init array yang dimasukan ke array dimensi pertama
    dataCaraKedua[1][0] = 100;
    dataCaraKedua[1][1] = 200;
    // Nah bisa kita lihat bahwa sebelum mengisi nilai ke dalam array dimensi yang kedua, maka array
    // dimensi pertamanya harus diisi dengan array. Dengan cara ini, maka ukuran dimensi array
    // menjadi tidak seragam.

    // Dari materi array yang sudah kita bahas di atas, sepertinya bekerja dengan array cukup
    // repot dan tidak praktis, terlalu banyak yang harus ditulis. Menyadari hal ini, Java
    // menyediakan cara
    // cepat untuk mendeklarasikan, menginisialisasi dan mengisi nilai array hanya dalam satu baris,
    // baik untuk aray satu dimensi maupun array dua dimensi. Berikut ini contoh sintaksnya :
    int[] dataSatuDimensiPraktis = {1, 2, 3, 4, 5};
    int[][] dataDuaDimensiPraktis = {{1, 2, 3}, {2, 3}, {3}};
    String[][] arrayDuaDimensi = {{"satu", "dua", "tiga"}, {"empat", "lima"}};
    int[][][] dataTigaDimensiPraktis = {{{1, 2, 3}, {2, 3}, {3}}};

    // Cara di atas sangat rapi dan mempersingkat banyak kode, tetapi ada satu kelemahan cara di
    // atas, bisa dilihat bahwa tidak ada tipe data yang eksplisit untuk operand di sebelah kanan.
    // Kelemahan di atas di atasi dengan adanya feature “anonymous array” dengan menyertakan tipe
    // data dari
    // array ketika diinisialisasi. Contohnya :
    int[] dataAnonArray = new int[] {1, 2, 3, 4, 5, 6};
    int[][] dataAnonDuaDimensi = new int[][] {{1, 2, 3}, {2, 3}, {3}};
    String[][] dataAnonDuaDimensiStr = new String[][] {{"satu", "dua", "tiga"}};
    // Walaupun ada keyword new, tidak perlu didefnisikan berapa panjang dari arraynya, karena
    // panjang dari array ditentukan dari nilai yang diletakkan di dalam kurung kurawal.
  }
}
