# Properti dan Metode

Di dalam OOP suatu kelas bisa memiliki banyak properti dan banyak metode. Jika dianalogikan dengan kelas hewan, maka
hewan memiliki properti antara lain tinggi, berat, dan umur. Hewan juga memiliki metode antara lain untuk jalan, lari,
dan makan.

# Properti

Properti atau fields adalah atribut yang menjadi anggota dari suatu kelas. Properti digunakan untuk menyimpan data yang
relevan dengan kelas. Seperti yang sudah disebutkan sebelumnya seperti tinggi, berat, dan umur adalah properti dari
suatu kelas.

# Metode

Metode di dalam kelas adalah block statement yang memiliki nama dan bisa dieksekusi dengan memanggilnya. Pemanggilan
metode biasa disebut dengan “invoke”.

# Bedah Code Metode

```java
void lari(){
        System.out.println("Berlari dengan sangat cepat..");
        }

        void jalan(){
        System.out.println("Berjalan dengan pelan..");
        }

        void makan(){
        System.out.println("Makan dengan menggunakan mulut..");
        }
```

Jika Anda perhatikan, 3 metode di atas menggunakan void sebelum nama metodenya. Ini menandakan bahwa metode tersebut
tidak memiliki nilai balik. Apa itu nilai balik? Nilai balik adalah nilai yang dikirim oleh suatu fungsi.

# Codelab Fungsi (Metode dengan Nilai Balik)

Pada dasarnya fungsi adalah metode yang memberikan nilai balik. Nilai balik tersebut bisa kita lihat pada penggunaan
tipe data sebagai pengganti dari void, dan kode return.

# Bedah Code Fungsi (Metode dengan Nilai Balik)

Fungsi getBerat, getTinggi, dan getUmur masing-masing memiliki tipe data sebelum nama fungsinya. Ia bisa dilihat secara
urut double, double, dan int. Tipe data ini menandakan bahwa metode ini akan mengembalikan nilai yang memiliki tipe data
tersebut.

Kemudian ada penulisan return, yang wajib dituliskan ketika kita membuat suatu fungsi. Nilai return yang dikembalikan
haruslah memiliki tipe data yang sama dengan tipe data yang dideklarasikan. Misalnya getUmur memiliki deklarasi tipe int
maka nilai return-nya juga harus memiliki tipe data int.

Perhatikan kode berikut:

```java
System.out.println("Umurnya adalah "+kucing.getUmur());

        double bmi=kucing.getBerat()/((kucing.getTinggi()*0.01)*(kucing.getTinggi()*0.01));
        System.out.println("Indeks massa tubuhnya adalah "+bmi);
```

Dari kode di atas ada 2 contoh penggunaan fungsi:

- Pertama, pemanggilan fungsi getUmur() yang langsung ditampilkan ke dalam output. Tipe data yang dikembalikan adalah
  int.
- Kedua, perhitungan indeks massa tubuh dengan menggunakan fungsi getBerat() dan getTinggi(). Tipe data yang
  dikembalikan
  adalah double.

Kedua contoh tersebut, dapat disimpulkan bahwa pemanggilan fungsi akan mengembalikan nilai sesuai dengan tipe data yang
dideklarasikan di depan nama fungsi.

Terakhir, tidak ada batasan dalam penulisan nama metode atau fungsi. Akan tetapi jangan lupakan penulisan yang
dianjurkan (code conventions). Pertama, nama metode haruslah kata kerja dengan huruf kecil (lower case). Dan kalau
terdiri lebih dari 1 kata, penulisan dimulai dari kata kerja dengan huruf kecil dan diikuti dengan kata benda yang huruf
pertamanya adalah besar/kapital. Ada beberapa contoh yang bisa Anda lihat berikut ini:

```java
lari()
        jalan()
        setUmur()
        getUmur()
        isEmpty()
        lemparBolaCepat()
        lemparBolaLambat()
```

# Access Modifier

Access modifier di dalam Object Oriented Programming (OOP) akan menentukan apakah kelas lain dapat menggunakan field
atau meng-invoke methods dari suatu kelas. Ada beberapa macam access modifier yang dapat digunakan yaitu private,
default, protected, dan public.

# Private

Access modifier private akan membatasi akses hanya di dalam class. Private biasanya digunakan sebagai modifier dari
member dan metode suatu class.

# Bedah Code Access Modifier Private

Perhatikan kode berikut:

```java
public class KelasA {

    private int memberA = 5;

    private int functionA() {
        return memberA;
    }

    int functionB() {
        // Pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;
    }
}
```

Dari kode di atas dapat dilihat bahwa ada kelas dengan nama KelasA. Di dalamnya ada 2 contoh kode yang menggunakan
modifier private yaitu memberA dan functionA. Variabel memberA memiliki tipe data integer dengan nilainya 5. Sementara
fungsi functionA memiliki nilai balik integer yang di ambil dari memberA, ini berarti functionA juga akan mengembalikan
nilai 5. Kemudian yang perlu diperhatikan adalah pada fungsi functionB. Di dalamnya ada akses ke member private dan
fungsi private. Jika dijalankan maka nilai yang didapatkan adalah 10 (5+5). Oleh karena itu, kode di atas merupakan
contoh dari modifier private di mana akses ke variabel/fungsi hanya dari kelas tersebut.

# Default

Default modifier berarti penulisan kodenya tanpa atribut modifier. Ini berlaku untuk semua kelas, member, atau fungsi
yang kita tuliskan tanpa access modifier.

Modifier default bisa diakses selama masih dalam satu package.

Pemanggilan memberB, memberC, dan functionB seperti di atas tidak akan menimbulkan kompiler eror. Tapi perlu diingat
bahwa access modifier default tidak bisa diakses dari luar package. Sebagai contoh kita akan coba modifikasi dengan
menambahkan package pada masing-masing kelas. Buatlah 2 package baru di dalamnya dengan nama package1 dan package2.

# Protected

Access modifier protected bisa diakses selama masih dalam satu package. Protected memiliki sedikit perbedaan dengan
default modifier. Perbedaannya adalah protected bisa diakses dari luar package. Akan tetapi, satu-satunya cara untuk
akses dari luar package adalah kelas yang hendak mengakses, merupakan kelas turunannya.

# Public

Access modifier public bisa kita sebut sebagai modifier global. Artinya bisa diakses dari manapun bahkan package yang
berbeda.

Seperti pada contoh kode sebelumnya, KelasA ditambahkan modifier public. Karena modifiernya public maka bisa diakses
dari package lainnya.

Ada 4 access modifier yang masing-masing memiliki batasan akses yang berbeda-beda. Berikut ini tabel perbandingan antara
keempatnya.

Dimulai dari private yang hanya memiliki batasan akses dari dalam kelas. Kemudian default modifier yang memiliki batasan
dalam satu package. Protected memiliki akses dari luar package selama kelas tersebut merupakan turunannya. Dan terakhir,
public, yang dapat diakses secara global.

# Non Access Modifier

Java juga mengenal modifier lainnya yaitu tipe non access modifier. Ada beberapa non access modifier yaitu static,
final, transient, dan synchronize.

Non access modifier memiliki fungsi yang beragam tergantung dari kebutuhannya. Mari kita bahas satu per satu.

# Static

Yang pertama adalah static. Ia digunakan untuk mendeklarasikan variabel atau metode yang berdiri sendiri tanpa perlu
instance dari suatu kelas. Ada dua macam non access modifier static yaitu static variable dan static methods.

# Static Variable

Variabel yang berdiri sendiri tanpa perlu instance dari kelas.

# Static Methods

Metode yang berdiri sendiri tanpa perlu instance dari kelas.
