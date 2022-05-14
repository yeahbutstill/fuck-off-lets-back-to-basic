# Interface

Apa itu interface? Di materi sebelumnya kita sudah mempelajari class.

Pada bahasa pemrograman Java interface sangat mirip dengan kelas, tapi tanpa atribut kelas dan memiliki metode yang
dideklarasikan tanpa isi. Deklarasi metode pada sebuah interface dapat diimplementasikan oleh kelas lain.

Sebuah kelas dapat mengimplementasikan lebih dari satu interface. Kelas ini akan mendeklarasikan metode pada interface
yang dibutuhkan oleh kelas itu sekaligus mendefinisikan isinya pada kode program.

Metode pada interface yang diimplementasikan pada suatu kelas harus sama persis dengan yang ada pada interface tersebut.
Property/Field di interface akan menjadi static final atau konstanta. Method dan field di interface akan selalu bersifat
public. Perhatikan kata-kata yang diberi huruf tebal.

Posisi saat ini tidak ada eror yang dilaporkan IntelliJ, tetapi sebagian kode kita menjadi berwarna abu-abu. Coba
arahkan kursor ke bagian kode yang berwarna abu-abu. Pertama ke modifier public di property atau method yang kita buat.
Akan ada informasi “Modifier ‘public’ is redundant for interface fields..”. Ini menjelaskan kalimat di paragraf di awal
yaitu method dan field akan selalu bersifat public.

Selain modifier public, kode yang berwana abu-abu adalah keyword static. Coba arahkan kursor ke bagian tersebut. Akan
ada informasi “Modifier ‘static’ is redundant for interface fields..”. Ini menandakan keyword static juga tidak
diperlukan karena field di interface akan dianggap sebagai static.

egitu juga untuk keyword final tidak diperlukan. Apabila kursor diarahkan ke bagian keyword final maka akan ada
informasi “Modifier ‘final’ is redundant for interface fields..”. Ini menjelaskan kalimat di paragraf awal yaitu
property/field akan selalu bersifat static final.

Berdasarkan penjelasan sebelumnya maka kita bisa mengubah kode menjadi seperti di bawah ini. Tidak ada eror yang
dilaporkan IntelliJ. Perhatikan masih ada kode yang diwarnai abu-abu karena method atau field “... is never used”. Hal
ini wajar.

```java
package com.dicoding.javafundamental.oop;

public interface Hewan {
    String respirasi = "oksigen";

    void makan();
}
```

Ada satu hal lagi yang perlu dibahas dari penjelasan kalimat pada paragraf di awal yaitu field akan menjadi static final
atau konstanta. Konstanta di kode Java biasanya ditulis dengan huruf besar semuanya dan diberi pemisah underscore jika
lebih dari 1 kata. Hal ini tertuang di java coding convention bagian Constants. Coding convention sangat diperlukan
dalam bahasa pemrograman apapun. Gunanya, mempermudah developer membaca kode yang ditulis oleh orang lain atau bahkan
diri sendiri. Sehingga interface Hewan selengkapnya menjadi seperti di bawah ini.

```java
package com.dicoding.javafundamental.oop;

public interface Hewan {
    String RESPIRASI = "oksigen";

    void makan();
}
```

# Implement

Setelah kita mempelajari cara dan ketentuan dalam membuat interface, berikutnya kita akan mempelajari cara menggunakan
interface tersebut. Interface harus dapat digunakan ke kelas lain. Cara untuk mengimplementasi interface yaitu
menggunakan keyword implements pada kelas yang mengimplementasikannya. Kelas yang mengimplementasi interface (bisa lebih
dari 1 interface) harus mendefinisikan isi kode semua deklarasi metode yang ada pada interface tersebut.

# Codelab Implement

Masih ingat kan kalau metode di interface hanya berupa deklarasi? Jika suatu kelas tak mendefinisikan isi kode semua
deklarasi metode yang ada di interface, maka kelas tersebut harus menjadi abstract class. Untuk lebih jelasnya mari kita
langsung coding saja.

Perhatikan IntelliJ akan memberi informasi kesalahan ditandai baris kode berwarna merah. Jika kita arahkan kursor ke
baris tersebut maka akan ada informasi “Class ‘Kucing’ must either be declared abstract or implement abstract method
‘makan()’ in ‘Hewan’”. Ini menjelaskan kalau kita harus memilih untuk menjadikan kelas Kucing sebagai abstract class
atau mendefinisikan isi kode semua deklarasi metode dari interface Hewan.

Jika kita ingin menjadikan kelas Kucing sebagai abstract class, cukup tambahkan keyword abstract sebelum keyword
classseperti berikut.

```java
package com.dicoding.javafundamental.oop;

public abstract class Kucing implements Hewan {
}
```

Jika kita ingin mengimplementasikan interface maka kita harus membuat method signature (nama, parameter, return) yang
sama disertai isi kode program untuk metodenya. Berikut contoh implementasi metode makan.

```java
package com.dicoding.javafundamental.oop;

public class Kucing implements Hewan {
    @Override
    public void makan() {

    }
}
```

# Code to Interface not Implementation

Dari latihan sebelumnya kita membuat interface Hewan. Kemudian kita membuat kelas Kucing yang menerapkan interface
tersebut. Maka tiap metode yang berada pada interface harus diimplementasikan. Interface terlihat sebagai suatu aturan
atau kontrak bagi kelas yang mengimplementasikannya.

Salah satu contoh implementasi interface adalah JDBC API. Java Database Connectivity (JDBC) adalah package (java.sql dan
javax.sql) yang menyediakan akses ke database. Sedangkan Application Programming Interface (API), dari namanya sudah
bisa ditebak adalah kumpulan Interface.

Jadi JDBC API adalah kumpulan interface untuk mengakses database sedangkan implementasinya akan dibuat oleh
masing-masing merk database misal MySql, SqlServer, Oracle dan lain-lain. Implementasi tersebut biasa disebut JDBC
Driver. JDBC Driver akan kita unduh (dalam bentuk jar) tergantung dari database yang digunakan untuk dimasukkan ke
classpath.

Silakan buka tautan https://www.javatpoint.com/example-to-connect-to-the-mysql-database untuk melihat contoh JDBC API.
Perhatikan penggunaan interface java.sql.Connection bukan menggunakan kelas com.mysql.jdbc.Connection dari JDBC Driver.

Dalam coding Java ada istilah best practice (design pattern) “code to interface not implementation”. Salah satu
maksudnya adalah seperti contoh JDBC API di paragraf sebelumnya. Contoh lainnya adalah ketika kita membuat aplikasi yang
terdiri dari beberapa layer. Maka lebih baik gunakan interface untuk komunikasi antar layernya.

# Silakan baca beberapa tautan ini untuk menambah pengetahuan Anda.

- https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/
- https://en.wikipedia.org/wiki/Design_Patterns
- 