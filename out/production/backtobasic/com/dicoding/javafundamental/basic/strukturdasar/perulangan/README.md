# Perulangan

Sebagai Developer kita dituntut untuk membuat baris kode menjadi lebih efisien. Misalnya kita melakukan instruksi yang
sama lebih dari sekali, seperti contoh di bawah ini:

```java
System.out.print("Halo\n");
        System.out.print("Halo\n");
        System.out.print("Halo\n");
```

Baris kode di atas kita melakukan perintah yang sama sebanyak 3 kali dengan menulis kode yang sama. Hal ini sama
ilustrasinya dengan mengirimkan pesan melalui email dengan alamat yang berbeda-beda. Tidak efisien, bukan? Memang kurang
efisien kalau kita membuat baris kode dengan mengirimkan secara satu per satu. Dalam kasus seperti ini kita tidak harus
mengulang baris kode yang sama secara terus-menerus. Lebih tepat, gunakan metode perulangan.

# Perulangan For

Perulangan memungkinkan kita melakukan instruksi secara berulang-ulang secara sederhana, jelas dan ringkas. Ada berbagai
cara melakukan perulangan, namun yang paling populer adalah menggunakan for. Secara umum, bentuk pernyataan for di dalam
Java adalah sebagai berikut:

```java
for(initialization;termination;increment){
        statement(s)
        }

```

Dengan menggunakan perulangan, kita bisa menghasilkan output yang sama dari baris kode di atas dengan menggunakan salah
satu metode perulangan:

```java
for(int x=0;x< 3;x++){
        System.out.print("Halo\n");
        }
```

# Perulangan For Bersarang

For dapat menerapkan pengulangan bersarang (nested). Dengan kata lain kita membuat melakukan for di dalam for.

# Bedah Code Perulangan For Bersarang

Perhatikan kode berikut ini:

```java
for(int i=0;i<=a;i++){
        for(int j=0;j<=i;j++){
        System.out.print("*");
        }
        System.out.println("");
        }
```

Inilah yang disebut dengan perulangan for bersarang. Perulangan ke pertama akan mempengaruhi perulangan kedua, begitu
juga ketika ada perulangan ketiga, keempat dan seterusnya, maka akan dipengaruhi oleh perulangan sebelumnya.

# Perulangan While

Perulangan dengan menggunakan while digunakan jika proses saat kondisi terpenuhi. While akan mengecek kesesuaian dengan
kondisi pra perintah.

# Bedah Code Perulangan While

Kita mendeklarasikan variabel nilai dengan angka 1.

```java
int value=1;
```

Pengecekan suatu kondisi pada variabel. Apabila nilai lebih kecil atau sama dengan 10.

```java
while(value<=10)
```

Melakukan sebuah perintah apabila kondisi terpenuhi.

```java
System.out.print("Angka : "+value);
        value++;
        System.out.print("\n");
```

# Perulangan Do-While

Perulangan yang mempunyai fungsi yang sama dengan While, tetapi pengecekan kondisinya dilakukan di akhir. Pada
perulangan ini minimal melaksanakan perintah sekali, kemudian mengecek kondisi.

# Bedah Code Perulangan Do-While

Bagaimana bisa menghasilkan output seperti di atas? Mari kita bahas bersama-sama:

1. Kita mendeklarasikan variabel nilai dengan angka 1.

```java
int value=1;
```

2. Melakukan sebuah perintah terlebih dahulu.

```java
System.out.println("Angka : "+value);
        value++;
```

3. Pengecekan suatu kondisi terhadap variabel. Apabila terpenuhi maka perintah dilanjutkan.

```java
while(value<=10)
```

Penggunaan metode perulangan tergantung pada kasus dan mengaplikasiannya. Bisa jadi salah satu metode, paling cocok
diimplementasikan pada kasus tertentu. Metode mana yang paling kamu suka?

# Pengantar Collection Type

Collection adalah kumpulan interface yang digunakan sebagai wadah untuk mengumpulkan beberapa elemen menjadi satu
kesatuan. Dari definisi tersebut bisa ditafsirkan Collection mirip dengan Array karena keduanya merepresentasikan
struktur data. Java Collections Framework terdiri dari tiga komponen, yaitu:

1. Interface: Tipe abstrak dari Collection yang membentuk suatu hierarki.
2. Implementation: Tipe konkrit yang mengimplementasikan Interface dari Collection serta dan merupakan suatu struktur
   data yang bisa langsung digunakan.
3. Algorithm: Ini adalah method yang melakukan komputasi berguna, misal sorting atau searching.

Dari komponen pembentuk Java Collections Framework bisa kita lihat salah satu perbedaan Collection dengan Array.
Misalnya Array tidak mempunyai method untuk sorting atau jumlah elemen di Array tidak bisa dinamis. Sementara Collection
bisa dinamis.

Dapat disimpulkan bahwa Collection adalah struktur data yang lebih kompleks dan lebih canggih dibanding Array. Untuk itu
setiap programmer wajib menguasai Java Collections Framework. Sebabnya, kita akan selalu berurusan dengan data saat
membuat aplikasi.

Core Collection Interface dapat dirangkum pada gambar di bawah ini.
Gambar diambil dari https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html

Dalam materi ini kita hanya akan membahas Java Collections Framework yang paling sering digunakan yaitu List, Set, dan
Map. Sebagian Implementasi dari ketiga interface tersebut bisa kita lihat di tabel di bawah ini.


