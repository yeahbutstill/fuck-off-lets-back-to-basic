# Generics

Generics adalah salah satu fitur yang terdapat di JDK 1.5. Ia sangat ditunggu-tunggu. Salah satunya untuk
menyederhanakan penulisan kode dari type-casting juga untuk compile-time type safety. Generics dalam kode program bisa
dikenali dengan type-parameter. Contoh penggunaan Generics paling umum adalah Collection.

Sebelumnya di materi Collection kita sudah menggunakan fitur Generics yaitu ketika kita deklarasi Set<String>, Set
dengan type-parameter <String>. Kita juga deklarasi Map<String, Planet>, Map dengan type-parameter <String, Planet>.
Tetapi untuk List kita deklarasi tanpa type-parameter. Apa perbedaannya? Ayo kita lihat dengan coding!

Perhatikan kode untuk loop masing-masing List. Untuk List lo perlu dilakukan type-casting sedangkan untuk List<Planet>
lp tidak perlu. Dalam kasus ini terlihat penggunaan Generics membuat kode lebih sederhana seperti yang sudah di bahas di
paragraf awal. Dari kode di atas tidak ada compile-error tetapi saat kita jalankan akan terjadi runtime-error. Sebabnya,
dalam List lo ada objek yang tidak bisa di-cast ke Planet.

Suatu saat kode program kita akan menjadi besar, ribuan baris kode! Bayangkan jika kita tidak menggunakan type-parameter
saat deklarasi objek Collection. Lalu objek tersebut digunakan di tempat lainnya, misal dikirim sebagai parameter ke
suatu method. Bisa saja tanpa sadar kita memasukkan tipe objek yang salah dan baru akan ketahuan ketika program
dijalankan. Pusing kan? Nah, gunakan type-parameter. Paling tidak kita akan terbantu karena masalah terdeteksi lebih
dini saat compile.

# Wildcards

Perhatikan baris kode di bawah ini.

```java
package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Wildcard {
    public static void main(String[] args) {
        List<String> ls = new ArrayList();
        ls.add("String1");
        ls.add("String2");

        print(ls); // Apakah baris ini valid?

        Collection<Planet> cp = new ArrayList();
        cp.add(new Planet("Mercury", 0.06));
        cp.add(new Planet("Venus", 0.82));

        print(cp); // Apakah baris ini valid?
    }

    public static void print(Collection<Object> collection) {
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}
```

Apakah baris yang ditanyakan di atas valid? Coba pindahkan ke IntelliJ. Jawabannya adalah tidak valid. Loh kenapa
begitu? Berdasarkan materi Inheritance, bukankah class String dan class Planet adalah turunan dari class Object?

Ya benar tetapi List<String> dan Collection<Planet> bukan turunan (subtype) dari Collection<Object> atau
Collection<Object> bukan supertype dari Collection<Planet> dan List<String>. Lalu apa supertype dari semua tipe
Collection? Hal ini dikenal dengan nama wildcard type, ditulis dengan syntax Collection<?> yang artinya collection of
unknown. Kita tulis ulang sebagian kode di atas menggunakan wildcard type.

```java
package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Wildcard {
    public static void main(String[] args) {
        List<String> ls = new ArrayList();
        ls.add("String1");
        ls.add("String2");

        print(ls); // Baris ini valid

        Collection<Planet> cp = new ArrayList();
        cp.add(new Planet("Mercury", 0.06));
        cp.add(new Planet("Venus", 0.82));

        print(cp); // Baris ini valid
    }

    public static void print(Collection<?> collection) { // perubahan ada di baris ini
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}

```

Sekarang kode kita sebelumnya menjadi valid. Perhatikan sekarang method print() menjadi bisa dipanggil dengan tipe
Collection yang berbeda atau reuseable.

# Generic Methods

Perhatikan kode di bawah ini.

```java
static void arrayToCollection(Object[]a,Collection<?> c){
        for(Object o:a){
        c.add(o); // baris ini tidak valid
        }
        }
```

Kode di atas tidak valid karena Collection<?> c adalah collection of unknown type dan kita menambahkan tipe Object o.
Sekarang kita ubah kode kita menjadi sebagai berikut.

```java
static<T> void arrayToCollection(T[]a,Collection<T> c){
        for(T o:a){
        c.add(o); // baris ini valid
        }
        }
```

Kode kita menjadi menarik bukan? Perhatikan penambahan huruf T. Kita bisa mengganti dengan huruf apapun, tetapi anjuran
coding convention menggunakan huruf T, mengacu ke type. Cara penulisan kode seperti di atas dikenal dengan istilah
Generic Methods. Lalu kita bisa gunakan method di atas dengan cara seperti di bawah ini.

```java
package com.dicoding.javafundamental.basic.strukturdasar.oop.generics;

import java.util.ArrayList;
import java.util.Collection;

public class GenericsMethod {

    private static <T> void arrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o); // baris ini valid
        }
    }

    public static void main(String[] args) {
        Object[] oa = new Object[100];
        Collection<Object> co = new ArrayList();

        // T inferred to be Object
        arrayToCollection(oa, co);

        String[] sa = new String[100];
        Collection<String> cs = new ArrayList();

        // T inferred to be String
        arrayToCollection(sa, cs);

        // T inferred to be Object
        arrayToCollection(sa, co);

        Integer[] ia = new Integer[100];
        Float[] fa = new Float[100];
        Number[] na = new Number[100];
        Collection<Number> cn = new ArrayList();

        // T inferred to be Number
        arrayToCollection(ia, cn);

        // T inferred to be Number
        arrayToCollection(fa, cn);

        // T inferred to be Number
        arrayToCollection(na, cn);

        // T inferred to be Object
        arrayToCollection(na, co);

        // compile-error
        //arrayToCollection(na, cs);
    }
}
```

# Wildcards vs Generic Methods

Setelah kita pelajari wildcards dan generic methods timbul pertanyaan baru. Kapan kita menggunakan wildcards dan kapan
menggunakan generic methods? Jawaban sederhananya adalah: ketika balikan (return-type) dari suatu method tidak
bergantung kepada tipe parameter (parameter-type). Atau kita hanya ingin memanfaatkan fitur polymorphism untuk tipe
parameter method tersebut maka gunakanlah wildcards. Jika ada keterkaitan antara return-type dan parameter-type maka
gunakanlah generic methods. Untuk memperjelas maksud kalimat di atas mari kita simak kode di bawah ini.

```java
package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.Collection;

public class WildcardVSGenericsMethod {
    // mengunakan wildcards
    static void print(Collection<?> col) {
        for (Object o : col) {
            System.out.println(o);
        }
    }

    // menggunakan generic methods
    static <T> Collection arrayToCollection(T[] a) {
        Collection<T> c = new ArrayList();
        for (T o : a) {
            c.add(o);
        }
        return c;
    }

    public static void main(String[] args) {
        String[] sa = {"Happy", "Coding"};
        Collection r = arrayToCollection(sa);
        print(r);
    }
}
```

Pada metode print(), kita menggunakan wildcard sebagai parameternya agar dapat bekerja dengan beragam tipe data.
Penggunaan wildcard juga dapat kita lakukan saat menuliskan kode metode generic class yang tidak bergantung pada tipe
parameternya. Misalnya, List.size atau List.clear. Sementara pada metode arrayToCollection, kita mengembalikan nilai
dengan tipe Collection dan untuk tipe parameter kita gunakan T. Tanpa harus menuliskan <String>arrayToCollection(sa).
Fitur ini dinamakan type inference, memungkinkan kita untuk memanggil generic method sebagai metode biasa, tanpa
menentukan jenis antara kurung sudut.