Class Date adalah representasi dari waktu di Java, class ini terdapat dua jenis: java.util.Date
dan java.sql.Date. Class java.util.Date adalah class yang sering digunakan dalam perhitungan
tanggal, sedangkan java.sql.Date adalah representasi data tanggal di java yang setara dengan
tipe data date di dalam database. Kalau tidak bekerja dengan database, sebaiknya selalu
gunakan java.util.Date, sedangkan java.sql.Date hanya digunakan ketika kita bekerja dengan
database. Istilah class Date di dalam bab ini merujuk ke java.util.Date.

Waktu dalam perhitungan komputer direpresentasikan sebagai bilangan Long yang merupakan
durasi antara tanggal 1 januari 1970 00:00:000 hingga waktu sekarang dalam mili detik.
Pencatatan tanggal ini disimpan dalam BIOS dari PC. Dari kode java kita bisa mendapatkan
waktu sekarang menggunakan kode :

```java
Long waktuSekarang=System.currentTimeMillis();
```

nilai waktuSekarang adalah jarak antara tanggal 1 januari 1970 00:00:000 hingga kode ini
dieksekusi dalam mili detik. Kalau ingin mendapatkan representasi yang lebih baik, kita bisa
menggunakan class Date untuk mendapatkan waktu sekarang, seperti di bawah ini :

```java
Date d=new Date();
        int tahun=d.getYear();
        int bulan=d.getMonth();
        int tanggal=d.getDate();
        Long waktuSekarang=d.getTime();
```

variabel d adalah instance dari class Date yang merepresentasikan waktu sekarang dan
mempunyai method-method untuk mendapatkan bagian dari waktu seperti tahun, bulan,
tanggal dan seterusnya. Class Date juga menyediakan constructor dengan parameter Long,
sehingga nilai dari System.currentTimeMillis() bisa dimasukkan sebagai parameternya, seperti
di bawah ini :

```java
Long waktuSekarang=System.currentTimeMillis();
        Date d=new Date(waktuSekarang);
```

Semenjak java 1.1, di dalam JDK ditambahkan class Calendar untuk memanipulasi nilai dari
class Date ini, oleh karena itu banyak sekali method di dalam class Date yang sifatnya
deprecated, sudah tidak didukung dan sebaiknya tidak digunakan lagi. Misalnya method-
method seperti getDate, getMonth, getYear dan seterusnya kalau digunakan dan kodenya
dicompile maka pada waktu kompilasi akan muncul warning bahwa method-method tersebut
sudah deprecated.

Class Date digunakan sebagai object untuk menyimpan waktu saja, hal ini terutama karena class
Date mengimplementasikan interface Serializable, plus semua fungsi untuk perhitungan sudah
ditandai deprecated.Sedangkan class Calendar digunakan layaknya kalkulator untuk proses
perhitungan tanggal pada class Date, misalnya kita ingin menambahkan 1 hari, menambah 1 menit dan seterusnya.
Calendar juga menyediakan sistem penanggalan Masehi(GregorianCalendar), penanggalan Budha dengan bahas Thailand dan
penanggalan Jepang.
Misalnya kita ingin membuat class Date dengan tanggal : 1 januari 2000, kodenya seperti di
bawah ini :

```java
Calendar calendar=Calendar.getInstance(); //secara default penanggalan yang
        digunakan adalah Masehi(GregorianCalendar);
        calendar.set(2000,Calendar.JANUARY,1,0,0,0);
        Date d=calendar.getTime();
```
