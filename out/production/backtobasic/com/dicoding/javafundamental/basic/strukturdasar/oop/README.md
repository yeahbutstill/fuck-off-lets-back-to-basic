# Pengantar Object-Oriented Programming

Apa itu OOP? OOP atau (Object-Oriented Programming) adalah suatu paradigma dalam pemrograman yang berbasis pada obyek.
OOP terinsiprasi dari model yang telah ada di kehidupan sehari-hari. Contoh saja seperti mobil, mobil merupakan suatu
objek. Mobil terbentuk dari beberapa objek yang lebih kecil seperti roda, body, mesin dll. Objek yang terdapat pada
mobil saling berhubungan, berinteraksi dan berkomunikasi. Melalui konsep di atas, OOP diciptakan untuk mempermudah
pengembangan program dengan cara mengikuti pendekatan model objek yang telah ada dikehidupan sehari-hari. Bagi yang
ingin mempelajari bahasa pemrograman Java tentunya harus memahami konsep OOP, karena pemrograman Java didesain dengan
menerapkan konsep OOP.

Berikut ini adalah beberapa istilah yang sering digunakan dalam konsep OOP.

- Class dan Object
  Kelas (terjemahan dari class) dan obyek (terjemahan dari object) adalah hal paling dasar yang harus kita pelajari.
  Kita akan belajar bagaimana membuat suatu kelas dan menggunakaanya di dalam suatu program.
- Method
  Suatu metode mendefinisikan perilaku obyek yang dibuat dari kelas. Metode dapat berupa prosedur atau fungsi.
- Member
  Di materi ini kita akan belajar lebih dalam lagi tentang member (semua yang dideklarasikan) di dalam suatu kelas.
- Access Modifier
  Di sini kita akan belajar tentang hak akses dari suatu kelas, metode, dan data member. Ada beberapa macam modifier
  yaitu private, default, protected, dan public.
- Encapsulation
  Encapsulation adalah metode untuk membundling suatu data dan metode di dalam kelas. Di dalamnya juga akan ada materi
  tentang bagaimana mengaksesnya dengan memanfaatkan metode di dalam kelas.
- Inheritance
  Inheritance adalah pewarisan, suatu kelas dapat diturunkan dari kelas lain sehingga mewarisi data dan metode dari
  kelas lain tersebut. Materi inheritance sangat penting di dalam OOP.
- Interface
  Selain inheritance, kita juga akan belajar tentang interface. Interface mirip seperti kelas, tetapi hanya berisi
  method signature (nama, parameter dan return).

# Class

Class merupakan bagian dari turunan obyek yang berfungsi sebagai wadah atau cetakan untuk mendeskripsikan behavior/state
yang didukung obyeknya. Behavior adalah tingkah laku yang dapat dilakukan oleh obyek. Behavior adalah kelakuan atau
sifat dari obyek, misalnya lampu bisa dimatikan atau dinyalakan. State adalah kondisi atau keadaan yang bisa terjadi
pada obyek misalnya lampu dapat memiliki state nyala atau mati.

Di kehidupan nyata kita mungkin sering menemukan banyak obyek, akan tetapi beberapa di antaranya memiliki kemiripan.
Mungkin ada banyak kucing yang ada di dunia ini. Semua sama-sama memiliki bentuk yang sama. Bila diperhatikan ada banyak
jenis kucing, mulai dari warna, bentuk hingga ras. Dalam aturan orientasi obyek, dapat dikatakan bahwa jenis, warna dan
ras kucing di seluruh belahan dunia ini adalah sebuah kelas instance dari obyek yang dikenali sebagai kucing.

```java
package com.dicoding.javafundamental.kelas;

public class KucingAnggora {
    // class body
}
```

Dalam aturan penulisan yang dianjurkan pada pemrograman Java, nama kelas diawali dengan huruf besar dan diikuti huruf
kecil (contoh: Kucing). Bila suatu kelas terdiri dari banyak kata maka huruf pertama di setiap kata tersebut diberikan
huruf besar (contoh: KucingAnggora).

# Constructor

Constructor adalah method yang secara default sudah terbentuk ketika kelas dibuat. Ketika suatu kelas dibuat (
instansiasi) maka konstruktor akan terpanggil juga. Constructor harus memiliki nama yang sama dengan nama kelasnya. Lalu
apa kegunaan Constructor?

- Memberikan nilai awal terhadap suatu data atau object
- Mengalokasikan ruang sebuah kelas dalam object

Terdapat dua tipe constructor pada Java:

- No-argument constructor, apabila kita tidak mendeklarasikan konstruktor dalam suatu kelas, kompiler Java akan membuat
  default constructor(tanpa parameter) dan pada body constructor tersebut kosong. Sementara jika kita mendeklarasikan
  konstruktor tanpa parameter , baik menuliskan kode pada body-nya atau tidak, maka itu bukan default constructor. Itu
  adalah no-argument constructor.
  Berikut ini adalah contoh no-argument constructorpada suatu kelas.

```java
package com.dicoding.javafundamental.kelas;

public class KucingAnggora {

    //ini adalah contoh no-argument constructor 
    public KucingAnggora() {
    }
}
```

- Parameterized constructor, konstruktor yang memiliki parameter untuk menginisiasi atau memberikan nilai awal data
  dengan nilai yang kita tentukan.
  Berikut ini adalah contoh parameterized constructor pada suatu kelas.

```java
package com.dicoding.javafundamental.kelas;

public class KucingAnggora {

    String namaKucing;
    int beratBadan;

    //ini adalah contoh parameterized constructor
    //dengan memberikan nilai awal data member nama_kucing dan berat_badan
    //dengan parameter yang kita tentukan
    public KucingAnggora(String nama, int berat) {
        namaKucing = nama;
        beratBadan = berat;
    }

```

# Object

Dalam paradigma OOP, obyek merupakan instance atau wujud nyata dari suatu kelas. Pemahaman mengenai obyek tidak kalah
pentingnya pada konsep pemrograman berorientasi obyek. Salah satu kegunaan obyek adalah untuk mengakses berbagai fungsi
dan metode pada kelas. Obyek bisa dibuat lebih dari satu.

# Menciptakan Obyek

Karena obyek merupakan instansiasi dari kelas, untuk menciptakan suatu obyek kita perlu mendeklarasikan tiap obyek yang
dibuat dengan mengikutsertakan kelasnya. Pada Java untuk membuat sebuah obyek terdapat 3 tahap :

- Declaration : mendeklarasikan nama sebuah obyek
- Instantiation : memerlukan sebuah perintah new untuk menciptakan obyek
- Initialization : inisialisasi dari sebuah obyek setelah perintah new

# Bedah Code Menciptakan Obyek

Pada kode di atas kita mempunyai sebuah kelas bernama Hewan. Di dalam class tersebut kita mempunyai metode cetakNama
yang mempunyai parameter nama. Pada metode cetakNama kita hanya melakukan perintah menampilkan berdasarkan parameter
yang dikirim dengan menggunakan tipe data String.

```java
public void cetakNama(String nama){
        System.out.println("Nama hewan: "+nama);
        }

```

Pada kode selanjutnya kita menciptakan suatu obyek dengan perintah new. Sedangkan obyekHewan merupakan nama dari obyek
yang kita buat.

```java
Hewan obyekHewan=new Hewan();
```

Untuk memanggil sebuah metode di dalam suatu kelas, kita dapat menggunakan (.) (titik).

```java
obyekNama.cetakNama("Elang");
```

Sampai di sini, kita telah mengerti bagaimana membuat obyek secara sederhana. Tahap selanjutnya kita akan mencoba
membuat obyek pada sebuah kelas yang lebih kompleks.

Kini kita telah memahami cara membuat kelas dan menginstansiasinya pada Java. Ada yang perlu kita tekankan dalam bab ini
. Dalam sebuah kelas kita bisa menciptakan beberapa obyek. Dengan menggunakan obyek kita dapat mengeksekusi baik metode
maupun fungsi yang beraneka ragam, yang dipakai dalam sebuah kelas.