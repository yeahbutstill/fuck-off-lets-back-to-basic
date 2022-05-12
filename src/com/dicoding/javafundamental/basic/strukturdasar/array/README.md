# Array

Array adalah obyek yang bisa digunakan untuk menyimpan kumpulan data lebih dari satu dengan tipe sama. Array memiliki
jumlah data yang fixed (tetap).

# Deklarasi Array

Untuk mendeklarasikan suatu array kita bisa menuliskannya seperti berikut ini.

```java
void cobaArray(){
        double[]arrA;
        arrA=new double[10];
        }
```

Tanda [] menunjukkan bahwa obyek tersebut adalah sebuah array. Kemudian, setelah membuat suatu objek array yang memiliki
tipe data double, kita harus mendefinisikan length (panjang) dari array tersebut. Untuk mendefinisikan panjangnya, kita
harus menuliskan jumlahnya dalam nominal integer di dalam tanda [].

Perlu Anda ketahui juga bahwa hanya terdapat 2 jenis penulisan array yang diperbolehkan di dalam Java, yakni:

```java
void cobaArray(){
        // Cara pertama
        double[]arrA=new double[10];

        // Cara kedua
        double arrB[]=new double[10];
        }
```

Keduanya diperkenankan, akan tetapi cara pertama lebih lazim digunakan. Oleh karena itu pada materi ini kita akan
menggunakan cara pertama dalam penulisannya.

# Inisiasi Array

Untuk inisiasi suatu array, ada 2 cara yang bisa digunakan.

Pertama, menggunakan tanda {} (sepasang urung kurawal atau braces/curly brackets) dan memisahkan nilai antar elemen
dengan tanda koma.

Lalu apa kegunaan utama dari suatu array? Seperti yang sudah dijelaskan sebelumnya, array berupa kumpulan data. Ini
berarti bahwa satu objek array dapat menyimpan beberapa data sekaligus.

Jika dibandingkan dengan variabel primitif maka untuk membuat 6 buah variabel integer kita bisa menuliskannya seperti
berikut:

```java
int int1=1;
        int int2=2;
        int int3=3;
        int int4=3;
        int int5=5;
        int int6=6;
```

Penulisan kode di atas bisa kita konversi dengan menggunakan sebuah array yang memiliki 6 elemen, seperti ini:

```java
int[]arrInt=new int[6];
```

Bayangkan jika program kita mengharuskan penulisan obyek sebanyak 1 juta? Tentu kita dapat menghemat banyak energi dalam
menulis baris kode dengan array!.

Namun sebenarnya proses konversi kode di atas belum selesai karena kita belum memberikan nilai pada setiap elemennya.
Mari masuk ke bab selanjutnya.

# Akses Array

Pada latihan sebelumnya Anda sudah mengetahi bagaimana cara mengakses elemen dari suatu array, yaitu dengan menggunakan
tanda [] (tanda kurung siku atau square backets) dan indeksnya. Perhatikan kode di bawah ini untuk akses array.

```java
int[]arrInt={1,2,3,4,5,6};

        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);
```

# Proses Array

Sebelumnya telah dijelaskan mengenai beberapa poin penting mengenai array, tapi yang tidak kalah penting adalah hubungan
antara array dengan looping. Kenapa looping? Kembali ke pertanyaan bagaimana jika array-nya memiliki 1 juta panjang
elemen, maka kita harus menggunakan looping untuk melakukan proses elemennya.

Jika kita ingin menampilkan nilai array yang memiliki panjang 1 juta dengan menggunakan akses, tiap indeksnya akan
kurang lebih seperti ini.

```java
public class LoopingArray {
    public static void main(String[] args) {
        int[] arrInt = new int[]{1, 2, 3, 4, 5, ...,999998, 999999, 1000000};
        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
 
        ...

        System.out.println(arrInt[999998]);
        System.out.println(arrInt[999999]);
    }
}
```

# Multi Dimensional Array

Seperti dengan namanya “multi dimensional” berarti array bisa memiliki lebih dari 1 dimensi. Pada penjelasan sebelumnya
kita baru hanya menggunakan array yang memiliki 1 dimensi. Jika diilustrasikan dengan dimensi maka 1 dimensi array baru
hanya menggunakan sumbu x, seperti ini.
Untuk 2 dimensi array kita bisa menambahkan sumbu y, dengan ilustrasi seperti berikut.

```java
void cobaArray2D(){
        int[][]arrInt=new int[][];
        }
```

Perhatikan bahwa ada 2 tanda [] (bracket) yaitu [][]. Tanda [] pertama adalah dimensi pertama dan tanda [] kedua adalah
dimensi kedua. Sama juga dengan dimensi yang lebih dari itu, misalnya 3 dimensi, maka ada 3 tanda [] yaitu [][][].

Kemudian untuk panjang elemen, pada dimensi kedua tiap panjang elemen-nya pun bisa bervariasi. Misalnya kita ingin
membuat array 2 dimensi, panjang elemen dimensi 1 nya adalah 2, kemudian panjang elemen pada dimensi keduanya adalah 2
dan 3 secara berurutan. Penasaran? Langsung kita praktikan!

# IndexOutOfBounds

Terakhir, selama menggunakan array Anda perlu berhati-hati. Jika tidak, Anda akan sering menemui eror indexOutOfBounds.
Ini adalah eror yang disebabkan oleh percobaan saat melakukan akses indeks yang tidak dimiliki oleh array. Misalnya kita
melakukan akses pada indeks 4 sedangkan array tersebut hanya memiliki 4 elemen. Ingatlah bahwa indeks dimulai dari 0 dan
indeks terakhir adalah panjang element - 1. Agar Anda semakin paham, mari kita coba praktikan!

Bedah Code IndexOutOfBounds
Pada kode di atas, kita melakukan perulangan dengan mengeluarkan seluruh isi array. Metode ini dapat kita sebut sebagai
iterasi. Cara di atas kita tidak perlu menginisalisasi angka awal dan akhir pada sebuah perulangan. Menggunakan cara ini
sangat direkomendasikan.

Selesai sudah materi tentang array yang akan sangat sering kita gunakan di dalam pemrograman. Pastikan Anda telah
menguasainya dengan baik!

Setelah Anda menguasai dasar dari bahasa Java, lanjut ke bagian selanjutnya yaitu Control Flow. Control flow dalam
bahasa Indonesia dapat diartikan sebagai aliran kendali. Maksud sebenarnya dari control flow adalah bagaimana urutan
eksekusi perintah di dalam program. Oleh karena itu kita perlu tahu control flow dalam Java yang dikemas dalam materi
berikut:

- Percabangan
  Jalannya suatu program pasti akan bergantung pada kondisi yang dipilih. Untuk itu kita memerlukan percabangan yang
  berfungsi sebagai control flow statement atau statement yang dapat mengontrol alur jalan suatu kode berdasarkan
  kondisinya. Contohnya adalah if-else dan switch.

- Perulangan
  Perulangan adalah kode yang bisa kita gunakan untuk mengulang beberapa instruksi kode, seperti for, while, dan
  do-while.

# Percabangan

Ada ungkapan “Seribu jalan ke Roma” yang bermakna ada beragam opsi jalan yang bisa dipilih untuk menuju ke Roma.
Demikian halnya dengan pemrograman. Terdapat berbagai pilihan dalam pemrograman. Kita memilih salah satu diantaranya. Di
tengah-tengah, kita akan menemui problem di mana berjalannya suatu program tergantung dari kondisi yang ditemui.
Percabangan bisa kita sebut sebagai control flow statement, di mana fungsi utamanya adalah mengontrol alur program.

If-Then
Percabangan if-then adalah control flow statement yang paling dasar di dalam pemrograman Java. Ini sangat simpel dengan
artian program akan menjalankan baris kode jika kondisinya adalah true.

```java
void ganti(){
        if(isOn)
        System.out.println("Menyalakan lampu");
        }
```

Dan ketika ada lebih dari 1 baris kode maka kita harus memasukkannya ke dalam {} (braces) seperti ini.

```java
void ganti(){
        if(isOn){
        System.out.println("Menyalakan lampu");
        System.out.println("Menyalakan lampu lain");
        }
        }

```

# If-Then-Else

Kita juga bisa menambahkan seleksi kondisi baru yaitu else. Ketika semua kondisi di dalam if bernilai false maka kode di
dalam else akan dijalankan. 


