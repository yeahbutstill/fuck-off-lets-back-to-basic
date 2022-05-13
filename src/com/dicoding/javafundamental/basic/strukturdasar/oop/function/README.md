# Function

Fungsi pada Java dideklarasikan di dalam sebuah kelas. Fungsi pada Java bertugas untuk mengembalikan nilai. Sedangkan
untuk fungsi yang tidak mengembalikan nilai (void) disebut sebagai prosedur. Baik fungsi maupun prosedur di dalam suatu
kelas kita sebut sebagai metode. Metode merupakan aspek yang penting di dalam Java. Dalam sebuah kelas bisa terdapat
banyak metode sesuai dengan kegunaannya masing-masing.

# Mendeklarasikan Fungsi

Cara membuat sebuah fungsi di dalam kelas adalah sebagai berikut :

```java
modifier returnType nameOfFunction(parameters){

        }
```

- modifier menunjukkan sifat yang dimiliki pada suatu fungsi seperti public, private, protected.
- returnType merupakan nilai balik yang diberikan oleh fungsi. Apabila fungsi tidak memiliki nilai balik maka
  menggunakan void.
- nameOfFunction adalah nama dari sebuah fungsi.
- parameters bersifat opsional, Suatu fungsi dapat mempunyai banyak parameters atau pun tidak sama sekali.

# Memanggil Fungsi

Berikut adalah contoh cara mengimplementasikan fungsi secara sederhana di dalam sebuah kelas secara statis. Artinya
penggunaan fungsi ini hanya dilakukan pada kelas tersebut tanpa membuat objek.

# Fungsi dengan nilai balik

Jika contoh kode sebelumnya tanpa nilai balik, lalu bagaimana untuk fungsi yang mengirimkan/menghasilkan nilai balik?
Fungsi yang yang mengirimkan/menghasilkan nilai balik selalu mendeklarasikan tipe data kemudian diakhiri dengan return.

Catatan : Penamaan suatu fungsi dapat disesuaikan sesuai kebutuhan. Namun, secara umum penamaan sebuah fungsi diawali
dengan huruf kecil dan diikuti dengan huruf besar setelahnya. Hal ini biasa disebut dengan notasi ”punuk unta” seperti
contoh:

```java
luas
        hitungKeliling
        hapusUser
        rataNilaiMahasiswa
        jumlahKomentarNetizen
        jumlahLaguYoungLex
```

# Fungsi dengan parameter

Fungsi ini bertujuan untuk menghitung luas persegi panjang dengan menggunakan parameter.

# Bedah Kode Fungsi dengan Parameter

Perhatikan kode berikut:

```java
public static void hitungLuas(double panjang,double lebar){
        double luas;
        luas=panjang*lebar;
        System.out.println(luas);
        }
```

Pada kode di atas kita membuat fungsi hitungLuas dengan menggunakan paramater serta tidak memberikan nilai balik. Maka
dari itu kita menggunakan void. Kemudian fungsi dipanggil dengan memberikan nilai pada masing-masing parameter serta
dipisahkan oleh tanda koma (,).

# Method Overloading

Java mengizinkan menggunakan dua atau lebih fungsi dengan nama yang sama dalam satu kelas. Namun, yang membedakan adalah
parameternya. Konsep ini disebut dengan method overloading. Sebagai contoh kita membuat fungsi dengan nama yang sama
pada kode sebelumnya dengan membedakan tipe datanya menjadi int.