package desktop.ifnu.bima.feel.of.java.array;

public class ContohArray {
  /**
   * Array adalah object di java yang dapat menyimpan kumpulan data dengan tipe yang sama. Array
   * dapat menyimpan data dengan tipe primitif, wrapper class maupun reference. Walaupun array bisa
   * menyimpan tipe data primitif, tetapi array selalu berada di heap, atau bisa dibilang apapun
   * tipe arraynya, array itu sendiri adalah object. Untuk bisa bekerja dengan array, kita perlu
   * melakukan tiga langkah : • Mendeklarasikan variabel array • Menginisialisasi object array •
   * Mengisi array dengan data
   */

  // Array dideklarasikan dengan mendefnisikan tipe datanya diikuti dengan tanda kurung kotak buka
  // dan tutup kemudian diikuti nama variabelnya. Contohnya sebagai berikut :
  int[] data;

  // Cara deklarasi array di atas adalah cara yang dianjurkan. Semua variabel yang diletakkan
  // setelah int[] akan bertipe array, misalnya kita modifkasi sedikit deklarasi di atas agar
  // variabel yang
  // dideklarasikan lebih dari satu, seperti di bawah ini :
  int[] data1, key, values;

  // Cara kedua mendeklarasikan array adalah dengan menulis tipe data kemudian diikuti oleh nama
  // variabel serta kurung kotak buka dan tutup setelah nama variabel. Contohnya sebagai berikut :
  int data2[];

  // Cara ini tidak direkomendasikan, karena kalau ingin mendeklarasikan lebih dari satu variabel
  // array, maka kurung kotak buka tutup harus ditulis di setiap variabel. Jika kurung kotak buka
  // tutup tidak ditulis, maka variabel tersebut bertipe int, bukan array. Contohnya adalah :
  int data3[], key1[], values1;
  // variabel data dan key bertipe array int sedangkan variabel values bertipe int, bukan array.

  // Jumlah kurung kotak menentukan dimensi array, misalnya kita ingin membuat array dua dimensi
  // (di dalam array ada array) dan tiga dimensi (di dalam array ada array dari array). Contohnya :
  String[][] arrayDuaDimensi;
  String[][][] arrayTigaDimensi;

  // Setelah berhasil mendeklarasikan array, sekarang waktunya menginisialisasi object array.
  // Caranya sangat sederhana, menggunakan keyword new dan mendefnisikan panjang arraynya,contohnya
  // seperti berikut ini :
  int[] data4 = new int[10];
  // Kode di atas artinya : buat variabel data dengan tipe array int, inisialisasi arraynya dengan
  // panjang 10 dan isi dengan nilai 0; Kenapa diisi dengan nilai 0? hal ini dikarenakan tipe data
  // primitif tidak bisa bernilai null, harus ada nilai defaultnya. Dalam hal ini tipe data int akan
  // selalu mempunyai nilai default 0.

  // Kalau tipe data arraynya adalah wrapper class atau object, array akan berisi null, seperti
  // contoh di bawah ini :
  String[] data5 = new String[10];

  // Ukuran dari array bersifat wajib, kalau kita menginisialisasi array tanpa disertai ukuran
  // panjang array, maka kodenya akan gagal dicompile. Contohnya seperti di bawah ini :
  //  String[] data6 = new String[];

  // Inisalisasi array multidimensi sedikit berbeda dengan array satu dimensi. Kita bisa
  // mendeklarasikan array dua dimensi sekaligus dengan isinya, misalnya contoh di bawah ini
  // akan membuat matriks 10x10 sehingga bisa menampung 100 data.
  String[][] arrayDuaDimensi1 = new String[10][10];

  // Ketika menginisialisasi array multidimensi, ukuran array hanya wajib diisi di dimensi pertama,
  // sedangkan dimensi kedua tidak wajib disebutkan ukuranya. Hal ini mengakibatkan isi dari
  // array yang berupa array masih bernilai null dan harus diinisalisasi dahulu sebelum diisi
  // dengan nilai.
  String[][] getArrayDuaDimensi2 = new String[19][];

  // Memasukkan data ke dalam array dilakukan dengan menyebutkan index dimana data akan
  // diletakkan. Seperti contoh di bawah ini :
  public static void main(String[] args) {
    int[] example = new int[4];
    example[0] = 1;
    example[1] = 2;
    example[2] = 3;
    example[3] = 4;
    // Perhatikan bahwa index dari array dimulai dari 0 dan selalu bernilai positif.
  }
}
