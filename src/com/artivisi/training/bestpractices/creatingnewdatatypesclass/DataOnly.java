package com.artivisi.training.bestpractices.creatingnewdatatypesclass;

/***
 * Saat Anda mendefinisikan sebuah kelas (dan yang Anda lakukan di Java hanyalah mendefinisikan kelas,
 * membuat objek dari kelas tersebut, dan mengirim pesan ke objek tersebut), Anda dapat meletakkan
 * dua jenis elemen di kelas Anda: (field) (terkadang disebut anggota data (member data) ),
 * dan metode (method) (terkadang disebut fungsi anggota). Bidang (Field) adalah
 * objek jenis apa pun yang dapat Anda ajak bicara melalui referensinya,
 * atau tipe primitif. Jika ini adalah referensi ke suatu objek,
 * Anda harus meng inisialisasi referensi tersebut untuk menghubungkannya ke objek
 * sebenarnya (menggunakan kata kunci new, seperti yang terlihat sebelumnya).
 *
 * Setiap objek menyimpan penyimpanannya sendiri untuk fieldnya;
 * field biasa tidak dibagikan di antara objek.
 * Berikut adalah contoh kelas dengan beberapa field:
 */
public class DataOnly {
    int i;
    double d;
    boolean b;
    String name;
    String age;

    // Kelas ini tidak melakukan apa pun kecuali menyimpan data. Tapi Anda bisa membuat objek seperti ini:
    // DataOnly data = new DataOnly();

    public static void main(String[] args) {
        // Anda dapat menetapkan nilai ke field,
        // namun Anda harus terlebih dahulu mengetahui cara merujuk ke anggota suatu objek.
        // Hal ini dilakukan dengan menyebutkan nama objek referensi,
        // diikuti dengan titik (.), diikuti dengan nama anggota di dalam objek:
        DataOnly dataOnly = new DataOnly();
        // objectReference.member
        dataOnly.i = 47;
        dataOnly.d = 1.1;
        dataOnly.b = false;
        dataOnly.name = "danil";
        dataOnly.age = "30";
        System.out.println(dataOnly.i);
        System.out.println(dataOnly.d);
        System.out.println(dataOnly.b);
        System.out.println(dataOnly.name);
        System.out.println(dataOnly.age);

        // mungkin juga object anda berisikan object lain
        // yang berisi data yang ingin anda modifikasi, untuk ini
        // anda cukup terus menghubungkan titik-titik:
        Plane myPlane = new Plane();
        myPlane.leftTank = new Tank();
        myPlane.leftTank.capacity = 100;
        System.out.println(myPlane.leftTank.capacity);
    }
}
