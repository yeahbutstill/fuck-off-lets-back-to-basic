package com.artivisi.training.bestpractices.referensi;

public class ContohReferensi {
    public static void main(String[] args) {
        // hanya karena anda mempunyai referensi tidak berarti harus ada objek yang terhubung dengannya
        // jadi jika anda ingin menampung sebuah kata atau kalimat, anda membuat referensi String
        // namun disini anda hanya membuat referensi, bukan objek.
        String name;
//        System.out.println(name);

        // jika anda memutuskan untuk mengirim pesan ke name pada saat ini, anda akan mendapatkan pesan kesalahan
        // karena name sebenarnya tidak terikat pada apapun. Oleh karena itu paraktik yang baik dan aman adalah selalu
        // menginisialisasi referensi saat anda membuatnya:
        String alamat = "Depok";
        System.out.println(alamat);

        // Saat anda membuat referensi, anda ingin menghubungkan dengan objek baru. Anda melakukan secara umum,
        // dengan operator new. Kata kunci new artinya adalah "Buatkan saya benda baru dari benda-benda ini" :
        // hal ini tidak hanya berarti "Buatkan saya String baru". Tetapi juga memberikan informasi tentang cara
        // membuat String dengan menyediakan String karakter awal.
        String zodiak = new String("Virgo");
        System.out.println(zodiak);

    }
}
