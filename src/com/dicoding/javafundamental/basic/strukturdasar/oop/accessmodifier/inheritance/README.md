# Inheritance

Pada dasarnya setiap objek yang berbeda sering memiliki kesamaan atau kemiripan tertentu. Kita ambil contoh kelas hewan.
Misalnya, kucing dan anjing memiliki kemiripan sebagai hewan. Kesamaan yang dimiliki kucing dan anjing misalnya
sama-sama hewan mamalia. Namun suara atau cara komunikasi kucing dan anjing berbeda. Begitu juga dengan hewan lain,
misalnya harimau dan domba keduanya juga hewan mamalia dengan suara serta komunikasi yang berbeda.

Dari contoh di atas bisa dipahami kalau kucing, anjing, harimau, dan domba adalah hewan. Maka dalam bahasa Java kucing,
anjing, harimau, dan domba adalah turunan (inheritance) dari hewan. Pada pemrograman berorientasi objek atau OOP, konsep
inheritance menjadi salah satu topik yang penting. Suatu objek diwariskan dengan menggunakan keyword extends. Pada
pemrograman Java setiap objek pada kenyataannya adalah turunan dari class Object. Walaupun tidak secara eksplisit, ini
bisa dibuktikan dengan operator instanceof.

Beberapa terminologi yang penting:

- Super Class atau Parent Class, kelas yang semua fiturnya di wariskan kepada kelas turunannya.
- Sub Class atau Child Class, kelas turunan yang mewarisi semua fitur dari kelas lain. Sub class dapat menambah field
  dan metodenya sendiri sebagai tambahan dari kelas yang memberi warisan.
- Reusability, yaitu ketika kita ingin membuat kelas baru dan sudah ada kelas yang berisi kode yang kita inginkan, kita
  bisa menurunkan kelas baru tersebut dari kelas yang sudah ada. Dengan begitu, kita menggunakan kembali field dan
  metode dari kelas yang telah ada.

Perhatikan output berikut:

```java
...
        construct Hewan
        construct Kucing
        ...
```

Ketika membuat instans objek kucing, constructor dari class Hewan akan tetap dipanggil walaupun sengaja kita komentari
baris super(). Coba jadikan komentar di baris tersebut dan jalankan ulang class Main maka hasilnya akan sama saja.

# Overriding dan Overloading

Setiap kelas yang extends kelas lain akan mewarisi semua field dan metode yang ada di parent class tersebut.

Ada kalanya metode yang diwariskan perlu diubah sesuai kebutuhan spesifik dari sub-class tersebut. Perubahan dapat
dilakukan dengan 2 cara yaitu overriding dan overloading. Overriding adalah pembuatan metode baru pada subclass yang
sama persis dengan superclassnya, sedangkan overloading adalah pembuatan metode baru pada subclass yang sama dengan
method superclass namun parameternya berbeda. Untuk lebih jelasnya, bukalah kelas Hewan.

```java
package com.dicoding.javafundamental.inheritance;

public class Hewan {
    public Hewan() {
        System.out.println("construct Hewan");
    }

    public void makan() {  // base method
        System.out.println("Hewan sedang makan..");
    }
}
```

Seperti dibahas di awal, setiap objek pada kenyataannya adalah turunan dari class Object. Maka setiap objek akan
otomatis mewarisi method dari class Object. Sebagian metode yang sering digunakan adalah metode toString() dan equals().
Metode toString() bisa kita gunakan untuk merepresentasikan objek dalam bentuk String yang sangat berguna salah satunya
untuk debugging. Sedangkan metode equals() digunakan untuk membandingkan antara dua objek, apakah mereka sama. Metode
equals() biasanya kita override karena kebutuhan khusus . Misalnya kita mau dua objek Kucing adalah sama jika rasnya
sama, meski habitatnya beda. Bukalah kelas Kucingdan tambahkan kode di dalamnya menjadi seperti ini:

```java
package com.dicoding.javafundamental.inheritance;

public class Kucing extends Hewan {

    private String ras;
    private String habitat;

    public Kucing(String ras, String habitat) {
        this.ras = ras;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Kucing ras: " + ras + ", habitat: " + habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Kucing) {
            Kucing other = (Kucing) obj;
            return this.ras.equals(other.ras);
        } else {
            return false;
        }
    }

    public Kucing() {
        //super(); // akan tetap memanggil constructor dari parent Class
        System.out.println("construct Kucing");
    }

    public void makan() { // overriding
        System.out.println("Kucing sedang makan..");
    }

    public void makan(String food) { // overloading
        System.out.println("Kucing makan " + food);
    }
}

```

# Polymorphism

Polymorphism artinya banyak bentuk. Contohnya, kucing adalah seekor Hewan, kucing juga adalah sebuah objek. Artinya
kucing bisa dikenali dalam banyak bentuk. Lalu apa maknanya bagi pemrograman khususnya Java?

# Perbedaan Antara Inheritance Dengan Interface

Sekilas penggunaan Inheritance dan interface mirip-mirip. Keduanya sama-sama akan menurunkan field/method. Lalu apa
bedanya antara Inheritance dan interface? Hal ini sering ditanyakan dalam interview programmer Java :) Jawaban yang
sering dilontarkan adalah “interface menggunakan Implements sedangkan Inheritance menggunakan extends.”

Sebenarnya, jawaban tersebut tidak cocok. Alih-alih, jawaban tersebut cocok untuk pertanyaan bagaimana cara menggunakan
interface dan menggunakan Inheritance.

Konsep inheritance digunakan untuk abstraksi dari yang paling umum ke yang lebih spesifik. Misalnya class Hewan adalah
bentuk yang umum, lalu class Kucing adalah turunannya yang lebih spesifik.

Sedangkan interface digunakan sebagai kontrak atau aturan. Class yang menerapkan suatu interface wajib override semua
method dari interface tersebut. Artinya class tersebut harus mengikuti aturan atau spesifikasi yang ada di interface.

Sampai sini, Anda sudah paham perbedaan Inheritance dan Interface? Ingat saja kata kuncinya inheritance adalah abstraksi
sedangkan interface adalah kontrak. Happy coding :)

Pengantar Common Class
Bahasa pemograman Java dibangun dengan banyak library. Ini akan membantu programmer dalam memecahkan masalah saat proses
development. Common class sendiri merupakan kelas yang sering atau umum digunakan dari pustaka standar Java tersebut.

Berikut Common Class yang akan kita pelajari:

1. Generic
   Generics pada Java memperbolehkan tipe (String, Integer, dll, serta user defined) bisa menjadi suatu parameter untuk
   metode, class dan interface. Generics juga berfungsi untuk type casting dan compile time safety.
2. Exception
   Eror adalah hal yang perlu kita tangani. Nah, di sini kita bisa menggunakan exception.
3. Input Output
   Di Java sudah tersedia library untuk membaca input dari suatu berkas dan juga menuliskan data ke suatu berkas.
4. Date Time
   Di Java sudah tersedia library yang khusus berurusan dengan waktu.
5. Casting
   Mengubah suatu tipe data atau objek menjadi tipe data atau objek lainnya, akan menjadi mudah dengan menggunakan
   casting yang sudah tersedia di dalam Java.