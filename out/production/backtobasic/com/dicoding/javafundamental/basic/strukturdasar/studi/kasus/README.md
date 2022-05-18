# Studi Kasus

Kita akan membuat beberapa program sederhana untuk melatih dan mengimplementasikan materi dari modul yang telah kita
pelajari. Beberapa program yang akan dibuat adalah :

1. Studi Kasus : Implementasi Pernyataan If
2. Studi Kasus : Implementasi Perulangan For, Pernyataan If, dan Function dalam OOP
3. Studi Kasus : Implementasi Pernyataan Switch, Operator Aritmatika, dan OOP

Mari kita ulik satu per satu dari studi kasus ini!

# Studi Kasus : Implementasi Pernyataan If

Program ini cukup sederhana. Kita harus menentukan wujud air apakah beku, cair atau gas. Masukan dari user berupa suhu
akan diproses dengan menggunakan kondisional IF untuk tiga kasus karena kita kan menentukan tiga wujud air. Untuk tahap
awalnya, masih sama dengan modul first java project, yang bisa dilihat di modul First Java Project.

# Studi Kasus : Implementasi Perulangan For, Pernyataan If, dan Function dalam OOP

Pada program ini kita akan membuat program yang menghitung jumlah huruf vokal dan konsonan dari masukan user yang
bertipe data String. Untuk membuatnya kita bisa menggunakan perulangan. Dengan perulangan kita dapat mengakses karakter
yang terdapat pada String melalui setiap indeksnya.

# Studi Kasus : Implementasi Pernyataan Switch, Operator Aritmatika, dan OOP

Program yang terakhir adalah menghitung luas dan keliling dari bangun datar. Kali ini kita akan mencoba menggunakan
konsep atau paradigma OOP agar lebih mudah dalam proses pemrogramannya. Anda membuat interface bangun datar agar dapat
mengmplementasikannya pada setiap kelas bangun datar yang akan dibuat.

1. Untuk studi kasus, kita bisa membuat project baru dan beri nama BangunDatar. Selanjutnya buatlah package di dalamnya
   dengana nama com.dicoding.javafundamental.bangundatar.
2. Studi kasus pertama ini cukup mudah. Kita buat kelas interface baru dan beri nama BangunDatar. Kemudian tambahkanlah
   kode berikut:

```java
package com.dicoding.javafundamental.bangundatar;

public interface BangunDatar {
    public double luas(int s1, int s2);

    public double keliling(int s1, int s2);
}
```

3. Buatlah kelas baru dengan nama PersegiPanjang. Kemudian implementasikan interface BangunDatardengan mendeklarasikan
   setiap fungsi yang ada pada interface tersebut. Karena ini adalah implements maka tambahkan juga statement isi
   fungsinya.

```java
package com.dicoding.javafundamental.bangundatar;

public class PersegiPanjang implements BangunDatar {

    PersegiPanjang() {
    }

    @Override
    public double luas(int s1, int s2) {
        return (s1 * s2);
    }

    @Override
    public double keliling(int s1, int s2) {
        return (2 * (s1 + s2));
    }
}

```

4. Buatlah kelas yang lain dengan nama SegitigaSiku. Implementasikan juga interface-nya

```java
package com.dicoding.javafundamental.bangundatar;

public class SegitigaSiku implements BangunDatar {
    SegitigaSiku() {
    }

    @Override
    public double luas(int s1, int s2) {
        return (0.5 * s1 * s2);
    }

    @Override
    public double keliling(int s1, int s2) {
        return (s1 + s2 + Math.sqrt((s1 * s1) + (s2 * s2)));
    }
}

```

5. Buatlah kelas Lingkaran, kemudian implementasikan interface kembali. Pada kelas Lingkaran ini, kita juga mencoba
   untuk menerapkan metode overloadkarena rumus menghitung luas dan keliling pada lingkaran cukup dengan satu parameter
   saja yaitu jari-jari.

```java
package com.dicoding.javafundamental.bangundatar;

public class Lingkaran implements BangunDatar {
    private double pi = 3.1415;

    Lingkaran() {
    }

    @Override
    public double luas(int s1, int s2) {
        return 0;
    }

    @Override
    public double keliling(int s1, int s2) {
        return 0;
    }

    public double luas(int r) { //metode overload
        return (pi * r * r);
    }

    public double keliling(int r) { //methode overload
        return (2 * pi * r);
    }
}

```

6. Terakhir buat kelas Main untuk menjalankan program. Pada kelas ini kita instansiasi kelas setiap bangun datar.

```java
package com.dicoding.javafundamental.bangundatar;

public class Main {
    public static void main(String[] args) {
        /*Kamus*/
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;
        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();
    }
}
```

7. Kita buat metode mainMenu. Metode ini digunakan untuk menampilkan pilihan menu.

```java
package com.dicoding.javafundamental.bangundatar;

import java.util.Scanner;

public class Main {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*Kamus*/
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;

        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();
    }

    private static void mainMenu() {
        //pilihan menu
        System.out.println("====================");
        System.out.println("Hitung Luas dan Keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}
```

8. Lengkapi kode di dalam main menjadi seperti ini:

```java
package com.dicoding.javafundamental.bangundatar;

import java.util.Scanner;

public class Main {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*Kamus*/
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;

        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();

        /*Program*/
        //panggil metode
        mainMenu();
        //kondisional untuk pilihan menu yang dimasukan
        switch (pilihan) {
            case '1': {
                System.out.print("Masukan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + opersegi.luas(s1, s2));
                System.out.println("Keliling persegi panjang: " + opersegi.keliling(s1, s2));
                break;
            }
            case '2': {
                System.out.print("Masukan alas segitiga siku: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan tinggi segitiga siku: ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga: " + osegitiga.luas(s1, s2));
                System.out.println("Keliling segitiga: " + osegitiga.keliling(s1, s2));
                break;
            }
            case '3': {
                System.out.print("Masukan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran: " + olingkaran.luas(r));
                System.out.println("Keliling lingkaran: " + olingkaran.keliling(r));
                break;
            }
            default: {
                System.out.println("tidak ada pilihan");
                break;
            }
        }
    }

    private static void mainMenu() {
        //pilihan menu
        System.out.println("====================");
        System.out.println("Hitung Luas dan Keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}
```

9. Untuk menjalankan program yang telah dibuat, klik tombol run. Setelah menalankan program tersebut, console akan
   menampilkan seperti berikut ini. Pertama akan muncul pilihan menu bangun datar yang akan kita hitung luas dan
   kelilingnya. Untuk mencoba, bisa pilih antara 1-3. Misalnya Anda bisa pilih menu 1, yaitu menghitung luas dan
   keliling persegi panjang. Maka Anda akan diminta untuk memasukkan panjang dan lebar. Setelah itu, akan keluar hasil
   perhitungan dari luas dan kelilingpersegi panjang. Outputnya akan jadi seperti ini:

```java
====================
        Hitung Luas dan Keliling:
        1.Persegi Panjang
        2.Segitiga Siku
        3.Lingkaran
        Masukan Menu:1
        Masukan panjang persegi:10
        Masukan lebar persegi:20
        Luas persegi panjang:200.0
```

Untuk mencoba memilih menu lain, jalankan lagi programnya dan pilih menghitung luas dan keliling pada bangun datar yang
lain. Selain itu Anda juga bisa membuat bangun datar yang lain, misalnya trapesium, layang-layang, belah ketupat, dll.
Untuk tambahan menghitung luas dan kelilingnya. Selamat mencoba dan berkreasi.

