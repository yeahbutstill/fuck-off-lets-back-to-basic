Iterasi dalam sintaks bahasa java ada tiga bentuk: while, do-while dan for. Iterasi secara umum
digunakan untuk melakukan satu tugas tertentu secara berulang-ulang. Salah satu kegunaan dari
iterasi adalah mengambil satu-satu nilai dari sebuah kumpulan data.
Kumpulan data dalam java bisa dikategorikan tiga: array, Collection dan Map. Array adalah
kumpulan data sejenis yang panjangnya tetap, setiap data diletakkan secara berurutan
berdasarkan index. Cara paling lazim untuk mengambil satu per-satu data dari array adalah
menggunakan suatu variabel index yang dimulai dari 0 kemudian diiterasi hingga n-1. Berikut ini
adalah contoh kodenya :

```java
String[]arr={"a","b","c"};
        for(int idx=0;idx<arr.length;idx++){
        System.out.println("current value"+arr[idx]);
        }
```

Collection dalam java mempunyai peran yang sangat penting dalam aplikasi, karena kita bisa
mempunyai kumpulan data dengan behaviour berbeda hanya dengan memilih class Collection
yang tepat, tidak perlu membuat algoritma sendiri hanya untuk melakukan sorting data.
Namun untuk mengambil data dari collection kita harus menulis kode yang sedikit lebih rumit
dibandingkan dengan array, berikut ini contohnya:

```java
List lists=new ArrayList();
        lists.add("a");
        lists.add("b");
        Iterator iterator=lists.iterator();
        while(iterator.hasNext()){
        String current=(String)iterator.next();
        System.out.println("current value :"+current);
        }
```

Terlihat kodenya cukup banyak, karena kita harus membuat variabel bertipe Iterator hanya
untuk mengambil nilai dari Collection.

Map adalah bentuk kumpulan data yang mempunyai pasangan key-value. Key dalam Map
berfungsi sebagai index yang mempunyai pasangan Value. Sebelum Java 5, cara mengakses
setiap elemen dalam Map cukup rumit, berikut ini contohnya :

```java
Map maps=new HashMap();
        maps.put("Rp","Rupiah");
        maps.put("$","US Dollar");
        Iterator i=maps.keySet().iterator();
        while(i.hasNext()){
        String key=(String)i.next();
        System.out.println("Key : "+key);
        System.out.println(" value :"+maps.get(key));
        }
```

Kita harus mengambil dahulu daftar Key dari map, kemudian melakukan iterasi satu-satu
terhadap Key dan dengan menggunakan key tersebut baru bisa diambil pasangan valuenya.

# For Loop di Java 5

Bentuk penulisan for loop di atas cukup merepotkan dan dibandingkan dengan bahasa lain
sudah ketinggalan jaman. Oleh karena itu diperlukan perubahan sintaks penulisan for loop
agar proses pengambilan nilai dari kumpulan data menjadi lebih sederhana dan ringkas.
For loop untuk mengambil nilai dari array menjadi seperti berikut ini:

```java
String[]arr={"a","b","c"};
        for(String current:arr){
        System.out.println("current value"+current);
        }
```

Kode di atas menunjukkan bahwa kita tidak perlu lagi membuat variabel index untuk
mengambil satu per satu isi dari array. Setiap kali for dilaksanakan, maka elemen yang sedang
aktif akan disalin nilainya ke variabel current.
Bentuk for loop untuk Collection sama persis dengan Array di atas. Tidak lagi diperlukan
Iterator untuk mengambil satu per satu elemen dari collection:

```java
Collection<String> lists=new ArrayList<String>();
        lists.add("a");
        lists.add("b");
        for(String current:lists){System.out.println("current value :"+current);
        }
```

Sintaks untuk mengakses setiap pasangan key-value juga menjadi lebih ringkas :

```java
Map<String, String> maps=new HashMap<String, String>();
        maps.put("Rp","Rupiah");
        maps.put("$","US Dollar");
        for(String key:maps.keySet()){
        System.out.println("Key : "+key);
        System.out.println(" value :"+maps.get(key));
        }
```

Perbaikan for loop ini pada dasarnya tidak mengubah sintaks java secara drastis, yang terjadi
adalah sebelum kode di atas dikompilasi menjadi fle class, ada satu langkah untuk merubah kode
di atas menjadi bentuk yang lama.

# Autoboxing/Unboxing

## Primitif dan Wrapper

Java dibuat pada pertengahan dekade 90-an, pada waktu itu memory RAM masih mahal. Arsitek
Java memutuskan untuk tetap memasukkan tipe data primitif dengan alasan menghemat memory.
Tipe data primitif hanya mempunyai nilai tunggal tanpa mempunyai method, sehingga
membutuhkan kapasitas memory yang lebih kecil dibanding dengan object.
Tipe data Primitif mempunyai class padananya yang disebut dengan Wrapper class yang
menyediakan method utility untuk melakukan convert dari satu tipe ke tipe yang lain, misalnya
mengkonvert data dari tipe int menjadi double. Berikut ini adalah tabel tipe data primitif dan
wrappernya:

- int Integer
- double Double
- float Float
- short Short
- char Character
- byte Byte
- boolean Boolean
- long Long

Dalam banyak kasus terkadang kita perlu melakukan convert dari nilai primitif ke nilai
wrappernya atau sebaliknya, berikut ini contohnya :

```java
int a=10;
        Integer b=Integer.valueOf(a);
        Integer c=new Integer(a);
        int d=c.intValue();
```

kode di atas sangat merepotkan dan tidak ada gunanya.
Autoboxing/Unboxing memberikan kemudahan dengan menghilangkan kewajiban kita untuk
menulis kode convert dari primitif ke wrapper atau sebaliknya, dengan inboxing/outoboxing kode
di atas akan menjadi :

```java
int a=10;
        Integer b=a;
        Integer c=a;
        int d=c;
```

Seperti halnya enhaced for loop, inboxing/outoboxing dilaksanakan pada level compiler, sebelum
kode dirubah menjadi .class, compiler akan merubah kode tersebut ke bentul lamanya. Hal ini
akan memberikan beberapa konsekuensi, perhatikan kode di bawah ini:

```java
Integer a=null;
        int b=a;
```

kode di baris kedua, ada proses perubahan dari wrapper ke primitif, sebenarnya kode tersebut
akan diubah ke bentuk lama sebelum dicompile. Nilai dari variabel a adalah null, ketika akan
dirubah ke bentuk primitif, a akan memanggi method intValue() dari class Integer,
pemanggilan ini menyebabkan error NullPointerException ketika kode di atas dijalankan.
Kita harus hati-hati menggunakan fasilitas ini untuk menghindari error NullPointerException.

# Static Import

## Utility Class

Sering kita menjumpai jenis class yang disebut Utility Class, class ini hanya berisi static
method, contohnya adalah class Math dan Assert. Setiap kali kita akan memanggil method dari
class utility ini, kita harus menuliskan nama classnya berulang-ulang. Jika kita bekerja
intensive dengan method dalam class Math, kode program kita terlihat tidak rapi, berikut ini
contohnya:

```java
Double result=Math.pow(Math.cos(180),3)/2;
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
Double result=pow(cos(180),3)/2;
```

# Varargs

## Fungsi Dengan Jumlah Parameter Tidak Tetap

Acap kali kita membutuhkan jumlah parameter yang tidak tetap untuk sebuah method
tertentu. Cara yang paling lazim dilakukan adalah dengan membuat parameter bertipe array
atau collection. Cara ini tidak terlalu rumit, hanya saja kita terkadang harus membuat array
atau collection padahal nilai parameternya hanya satu. Contohnya seperti ini :

```java
public void printAll(String[]array){
        for(String curr:array){
        System.out.println(curr);
        }
        }
```

Kode untuk memanggil fungsi di atas :

```java
String[]arr=new String[1];
        arr[0]="a";
        printAll(arr);
```

Varargs mengijinkan method Java mempunyai jumlah argumen tidak tetap, artinya kita bisa
memasukkan jumlah parameter semau kita pada kode pemanggilan method.
Mari kita implementasikan kembali method printAll di atas menggunakan fasilitas varargs:

```java
public void printAll(String...array){
        for(String curr:array){System.out.println(curr);
        }
        }
```

Sekarang kode untuk memanggil fungsi di atas menjadi lebih sederhana :

```java
printAll("a");
        printAll("a","b","c");
```

# TypeSafe Enum

## Tipe Data Enum

Java tidak mengenal tipe data enum seperti halnya pada C/C++, biasanya tipe data enum
didefnisikan sebagai variabel konstant seperti di bawah ini :

```java
public static final JENIS_KELAMIN_LAKI_LAKI=0;
public static final JENIS_KELAMIN_PEREMPUAN=1;
```

Pola ini mempunyai banyak kelemahan karena beberapa alasan, antara lain:

1. Tidak TypeSafe – karena tipenya hanya berupa int, kita bisa saja memasukkan nilai int apapun
   ketika kita memerlukan data jenis kelamin, atau menambahkan dua jenis kelamin, suatu
   operasi yang nyaris tidak logis.
2. Tidak mempunyai namespace – Kita harus secara manual memberikan awalan terhadap
   variabel enum agar tidak tertukar dengan variabel yang lainya.
3. Mudah Rusak – Misalnya suatu saat tanpa sengaja ada yang merubah nilai int dari variabel
   tersebut, maka integritas data dengan data yang ada di dalam database dengan sendirinya
   akan ikut berubah.
4. Nilai yang divetak tidak informatif – Setelah nilai Jenis kelamin dimasukkan ke dalam
   database, nilai yang dimasukkan hanyalah 0 atau 1. Informasi tentang Jenis kelaminya tidak
   ada.

   Java 5 mendukung TypeSafe enum langsung di sisi sintaksnya. Defnisi enum di atas bisa dengan
   mudah diganti menjadi :

```java
public enum JenisKelamin {LAKI_LAKI, PEREMPUAN};
```

Walaupun tampilan enum di atas mirip-mirip dengan enum di C/C++, enum di Java 5 mempunyai
lebih banyak feature. Enum di atas adalah class java, yang bisa mempunyai method dan property.
Enum juga merupakan implementasi dari class Object, yang Comparable dan Serializable.

Aplikasi berbasis database biasanya mengimplentasikan enum Jenis kelamin dengan mempunyai
dua jenis data, data pertama adalah simbol jenis kelamin, biasanya L dan P. Data kedua adalah
nama lengkap dari jenis kelamin tersebut, biasanya digunakan sebagai pilihan dalam combo box.
Kita bisa mendefniskan ulang enum JenisKelamin menjadi seperti berikut ini :

```java
public enum JenisKelamin {
    LAKI_LAKI("L", "Laki-laki"),
    PEREMPUAN("P", "Perempuan");
    private String symbol;
    private String name;

    JenisKelamin(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
    }
return symbol;
}
```

Enum juga bisa digunakan dalam clausa switch seperti di bawah ini :

```java
switch(jk){
        case JenisKelamin.LAKI_LAKI:
        return"suaranya soprano";
        case JenisKelamin.PEREMPUAN:
        return"suaranya tenor";
        }
```

Setiap Enum mempunyai nilai ordinal, nilai tersebut adalah nilai urut enum, urutan pertama
mempunyai nilai 0 dan seterusnya.

Kita bisa mendapatkan semua nilai Enum secara programatik tanpa harus menyebutkan satu-
satu, contohnya:

```java
JenisKelamin[]jks=JenisKelamin.values();
        for(JenisKelain jk:jks){
        System.out.println(jk);
        }
```

# Generics

## Tipe Data di Dalam Collection

Ketika kita akan mengambil elemen dari dalam Collection, kita memerlukan proses casting ke
tipe data sebenarnya. Proses casting ini diperlukan karena kita tidak bisa mendefniskan tipe
data apa yang ada di dalam collection, sehingga semua yang masuk ke dalam collection
dianggap bertipe Object.

Masalah muncul kalau kita tidak tahu-menahu tentang apa isi dari collection tersebut, jika
ternyata isi dalam collection tersebut beraneka ragam tipe data, kode kita akan mengalami
error ClassCastException.

Compiler java tidak dapat mendeteksi potensi kesalahan ini pada saat compile. Berikut ini
contohnya :

```java
Collection lists=new ArraList();
        lists.add("a");
        lists.add(100);
        Iterator iterator=lists.iterator();
        for(;iterator.hasNext();){
        String current=(String)iterator.next();
        }
```

Kode di atas akan menyebabkan error ClassCastException, karena dalam collection lists, kita
memasukkan “a” yang bertipe String dan 100 yang bertipe Integer. Pada saat kita mengambil
data dari lists dan melakukan cast ke tipe String terhadap niai 100, error ClassCastException
akan terjadi.

Generics dapat digunakan untuk mendefniskan tipe data apa yang ada di dalam collection,
kode di atas dapat dimodifkasi menjadi seperti di bawah ini:

```java
Collection<String> lists=new ArraList<String>();
        lists.add("a");
        lists.add(100);
        for(String s:lists){
        String current=iterator.next();
        }
```

pada baris lists.add(100);, compiler akan memberikan keterangan error bahwa nilai yang
dmasukkan ke dalam collection lists mempunyai tipe data selain String.
Pengecekan tipe data apa yang ada di dalam Collection sekarang terjadi pada saat kompilasi,
bukan pada saat jalanya aplikasi, dengan begitu kesalahan bisa ditemukan lebih cepat.
Generics bisa digunakan untuk melakukan banyak hal, namun sebagai programmer kita tidak
harus memikirkan secara detail tentang penggunaan generics, kita bertindaks sebagai pemakai
library, bukan library designer.

# Annotations

## Metadata

Banyak sekali API dalam java yang memerlukan konfgurasi yang terkadang diletakkan dalam fle
terpisah. Pola ini sangat memberatkan programmer karena ada tambahan fle lagi yang harus
dimantain. API lainnya mengharuskan kita meng-extend class tertentu atau membuat nama
method dengan pola tertentu.

Annotation memberikan alternatif cara menambahkan informasi terhadap fle java. Informasi
tambahan ini disebut dengan metadata. Metadata digunakan oleh API atau IDE sebagai informasi
tambahan yang digunakan sebagai patokan untuk memperlakukan fle java tersebut dengan
tindakan tertentu.

Junit 3.x mengharuskan fle yang akan ditest memenuhi beberapa aturan, pertama harus meng-
extend class TestCase, kemudian setiap method yang akan ditest harus diawali dengan kata test,
berikut ini contohnya:

```java
public class PersonTest extends TestCase {
    public PersonTest(String testName) {
        super(testName);
    }

    public void testGetEmails() {
        fail(“ this test is not actualy created”);
    }

    public void testSetEmails() {
        fail(“ this test is not actualy created”);
    }
}
```

Dengan annotation kita bisa menyederhanakan struktur fle java di atas, dan menghilangkan
keharusan untuk melakukan extend terhadap fle tertentu atau memberikan awalan terhadap
method yang harus ditest, berikut ini test yang sama untuk Junit 4.x dengan annotation :

```java
public class PersonTest {
    public PersonTest() {
    }

    @Test
    public void getEmails() {
        fail(“ this test is not actualy created”);
    }

    @Test
    public void setEmails() {
        fail(“ this test is not actualy created”);
    }
}
```

Terlihat bahwa kita menambahkan annotation @Test di atas method yang akan ditest. Junit
menggunakan informasi @Test ini sebagai penanda bahwa method yang akan ditest.
Contoh annotation lain yang banyak digunakan adalah @Deprecated, jika annotation ini
diletakkan di atas method, maka akan digunakan oleh java compiler dan IDE untuk
memberitahukan kepada pemanggil dari method tersebut bahwa method yang dipanggil
kemungkinan besar akan dihilangkan pada versi berikutnya. Hal ini membantu programmermenghindari error di masa depan.

Menambahkan annotation @Override di atas method yang di-override juga merupakan praktek
yang baik. Compiler akan memeriksa method yang ditandai dengan @Override apakah sudah
dengan benar mengoverride method kepunyaan parentnya. Contohnya, misalkan kita akan
berniat mengoverride method equals dari class Object seperti di bawah ini :

```java
public boolean equals(){
        return true;
        }
```

ternyata kode method equals di atas tidak memenuhi struktur method equals yang seharusnya
mempunyai parameter Object. Java compiler tidak akan berkata apa-apa dan tidak akan
memperingatkan kita bahwa ada kesalahan dalam proses override tersetbut.

```java
@Override
public boolean equals(){
        return true;
        }
```

Dengan menggunakan @Override kita memberitahukan java compiler bahwa kita berniat
mengoverride method equals, dan jika terdapat kesalahan dalam proses overridenya, compiler
akan memberikan peringatan “method does not override or implement a method from a
supertype ”.

Masih banyak kasus lain dimana annotation akan memudahkan programmer
mengimplentasikan aturan tertentu dari API yang digunakan. Misalnya hanya dengan
menambahkan keterangan @Stateless terhadap class tertentu, maka kita sudah membuat
Stateless session bean. Hibernate versi dahulu mewajibkan kita untuk membuat fle hbm.xml
untuk setiap class Entity, sekarang kita bisa meletakkan informasi mapping hibernate dalam
fle java-nya dengan menggunakan annotation.

# Kesimpulan

Java 5 Language Enhancement ditujukan utamanya untuk menyederhanakan kode java tanpa
menghilangkan kemudahanya untuk dibaca. Perubahan sintaks tersebut tidak serta merta
merupakan perubahan signifkan terhadap sintaks java secara radikal, tetapi hanya perubahan
kecil dalam compiler, dimana da langkah tambahan untuk merubah sintaks bentuk baru ke
dalam bentuk yang lama sebelum fle java tersebut benar-benar dicompile menjadi fle class.
Feature generics dan annotation ternyata membawa perubahan yang sangat signifkan
terhadap banyak sekali API. Dengan menggunakan kedua feature ini API menjadi lebih mudah
digunakan dan lebih sedikit fle konfgurasi yang diperlukan untuk menjelaskan beberapa
informasi dalam fle java.
Pada akhirnya bahasa java menjadi lebih mudah digunakan dan lebih ringkas dibandingkan
dengan versi sebelumnya.