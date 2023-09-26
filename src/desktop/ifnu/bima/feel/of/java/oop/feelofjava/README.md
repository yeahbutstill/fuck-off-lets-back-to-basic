Feel of Java

Java pertama dibuat dan dikembangkan oleh Sun Microsystems untuk diimplementasikan dalam
embeded sistem seperti perangkat elektronik sehari-hari. Pada saat proses perancangan, java
didesain untuk menjadi “blue collar language” atau bahasa pemrograman untuk pekerjaan
sehari-hari, bukanya bahasa canggih untuk riset Phd. Untuk mencapai tujuan tersebut, dibuatlah
konsep “feel-of-java”, konsep ini berlandaskan kesederhanaan dan kemudahan dibaca.
Konsep ini memudahkan programmer dari berbagai macam background merasa mudah belajar
bahasa java. Sintaks java dibuat semirip mungkin dengan C dan C++, bahasa paling populer saat
itu. Bahkan beberapa konsep OOP dari C++ yang dirasa menyulitkan dihilangkan dari feature
java, misalnya operator overloading dan multiple inheritance.
Java juga mewarisi konsep static language dari C/C++. Static language mewajibkan setiap
variabel harus didefnisikan terlebih dahulu sebelum diinisialisasi. Konsep ini memudahkan
compiler untuk memeriksa statement java, sehingga error operasi variabel dapat ditemukan pada
saat compile. Berbeda dengan dynamic language seperti ruby dan PHP, semua variabel tidak
perlu didefnisikan dan kita bisa memasukkan tipe data apapun ke dalam variabel tersebut. Kalau
ada error dalam operasi variabel, error tersebut akan terdeteksi ketika program dijalankan.
Feature Kesederhanaan dan kemudahan dibaca mempunyai implikasi bahasa Java sangat verbose,
kode yang diketik relatif lebih banyak dari bahasa pemrograman lain. Hal inilah yang banyak
dikeluhkan programmer java, sehinga Sun memutuskan untuk membuat perubahan terhadap
bahasa java pada java versi 5. Perubahan tersebut antara lain:

- Enhanced for loop 
- Autoboxing/Unboxing 
- Static Import 
- Varargs 
- TypeSafe Enum 
- Generics 
- Annotation


Perubahan di atas semuanya dimaksudkan untuk mengurangi kode program yang harus ditulis
programmer tanpa mengurangi semangat kesederhanaan java. Mari kita bahas satu per satu dari
yang paling mudah.

Enhanced for Loop

For Loop Sebelum Java 5
Iterasi dalam sintaks bahasa java ada tiga bentuk: while, do-while dan for. Iterasi secara umum
digunakan untuk melakukan satu tugas tertentu secara berulang-ulang. Salah satu kegunaan dari
iterasi adalah mengambil satu-satu nilai dari sebuah kumpulan data.

Kumpulan data dalam java bisa dikategorikan tiga: array, Collection dan Map. 
Array adalah kumpulan data sejenis yang panjangnya tetap, setiap data diletakkan secara berurutan
berdasarkan index. Cara paling lazim untuk mengambil satu per-satu data dari array adalah
menggunakan suatu variabel index yang dimulai dari 0 kemudian diiterasi hingga n-1.

Collection dalam java mempunyai peran yang sangat penting dalam aplikasi, karena kita bisa
mempunyai kumpulan data dengan behaviour berbeda hanya dengan memilih class Collection
yang tepat, tidak perlu membuat algoritma sendiri hanya untuk melakukan sorting data.
Namun untuk mengambil data dari collection kita harus menulis kode yang sedikit lebih rumit
dibandingkan dengan array

Map adalah bentuk kumpulan data yang mempunyai pasangan key-value. Key dalam Map
berfungsi sebagai index yang mempunyai pasangan Value.

For Loop di Java 5

Bentuk penulisan for loop di atas cukup merepotkan dan dibandingkan dengan bahasa lain
sudah ketinggalan jaman. Oleh karena itu diperlukan perubahan sintaks penulisan for loop
agar proses pengambilan nilai dari kumpulan data menjadi lebih sederhana dan ringkas.
For loop untuk mengambil nilai dari array menjadi seperti berikut ini:
```java
String[] arr = {"a","b","c"};
    for(String current : arr) {
        System.out.println("current value" + current);
    }
```
Kode di atas menunjukkan bahwa kita tidak perlu lagi membuat variabel index untuk
mengambil satu per satu isi dari array. Setiap kali for dilaksanakan, maka elemen yang sedang
aktif akan disalin nilainya ke variabel current.

Bentuk for loop untuk Collection sama persis dengan Array di atas. Tidak lagi diperlukan
Iterator untuk mengambil satu per satu elemen dari collection


Autoboxing/Unboxing

Primitif dan Wrapper
Java dibuat pada pertengahan dekade 90-an, pada waktu itu memory RAM masih mahal. Arsitek
Java memutuskan untuk tetap memasukkan tipe data primitif dengan alasan menghemat memory.
Tipe data primitif hanya mempunyai nilai tunggal tanpa mempunyai method, sehingga
membutuhkan kapasitas memory yang lebih kecil dibanding dengan object.
Tipe data Primitif mempunyai class padananya yang disebut dengan Wrapper class yang
menyediakan method utility untuk melakukan convert dari satu tipe ke tipe yang lain, misalnya
mengkonvert data dari tipe int menjadi double. Berikut ini adalah tabel tipe data primitif dan
wrappernya:
![img.png](img.png)


Autoboxing/Unboxing memberikan kemudahan dengan menghilangkan kewajiban kita untuk
menulis kode convert dari primitif ke wrapper atau sebaliknya, dengan inboxing/outoboxing kode
di atas akan menjadi :
```java
int a = 10;
Integer b = a;
Integer c = a;
int d = c;
```
Seperti halnya enhaced for loop, inboxing/outoboxing dilaksanakan pada level compiler, sebelum
kode dirubah menjadi .class, compiler akan merubah kode tersebut ke bentuk lamanya. Hal ini
akan memberikan beberapa konsekuensi, perhatikan kode di bawah ini:
```java
Integer a = null;
int b = a;
```

kode di baris kedua, ada proses perubahan dari wrapper ke primitif, sebenarnya kode tersebut
akan diubah ke bentuk lama sebelum dicompile. Nilai dari variabel a adalah null, ketika akan
dirubah ke bentuk primitif, a akan memanggi method intValue() dari class Integer,
pemanggilan ini menyebabkan error NullPointerException ketika kode di atas dijalankan.

Kita harus hati-hati menggunakan fasilitas ini untuk menghindari error NullPointerException.


Static Import

Utility Class

Sering kita menjumpai jenis class yang disebut Utility Class, class ini hanya berisi static
method, contohnya adalah class Math dan Assert. Setiap kali kita akan memanggil method dari
class utility ini, kita harus menuliskan nama classnya berulang-ulang. Jika kita bekerja
intensive dengan method dalam class Math, kode program kita terlihat tidak rapi, berikut ini
contohnya:
```java
Double result = Math.pow(Math.cos(180),3) /2;
```
Dengan menggunakan static import, kita tidak harus menuliskan nama classnya jika akan
mengunakan method atau variabel static. Sintaks penulisan static import :
```java
static import java.lang.Math.pow;
static import java.lang.Math.cos;
```
kita juga bisa menggunakan wildcard (*) untuk mengimport semua static member dalam class
tersebut.
```java
static import java.lang.Math.*;
```
Setelah static import didefnisikan, kode untuk memanggil method pow dan cos dari class Math
menjadi lebih sederhana, seperti di bawah ini:
```java
Double result = pow(cos(180),3) /2;
```