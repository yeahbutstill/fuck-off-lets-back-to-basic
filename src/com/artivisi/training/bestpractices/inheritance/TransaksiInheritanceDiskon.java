package com.artivisi.training.bestpractices.inheritance;

import java.math.BigDecimal;

/*
Inheritance tujuan utamanya adalah untuk code reuse
artinya jadi kita kalau sudah implement methodnya di satu Class,
kalau kita mau nambahin lagi, itu kita tinggal gunakan kata kunci extends.
Biasanya orang untuk menambahkan method atau fitur itu pakainya Inheritance.
Tapi kalau terlalu banyak akan menyebabkan Fragile Software (Susah dirawat)
Kenapa susah dirawat, karena begitu Super Class berubah, maka Class yang bawahnya akan
terkena impek.

semua method-method yang public dan protected di super classnya
maka dia automatis akan langsung punya, kumudian dia bisa menambahkan internal variable yang dia punya.
sebetulnya inheritance itu ada dua macam,
yang pertama adalah implementation inheritance, yaitu kita mengreuse implementasinya. seperti class ini.

yang kedua type inheritance, artinya dia cuma mewarisi yang kita butuhkan untuk diwarisi cuman type data saja,
tidak ada implementasinya
 */
public class TransaksiInheritanceDiskon extends TransaksiInheritance {
    private BigDecimal diskon;

    public BigDecimal totalDibayar() {
        return hitungTotal().subtract(diskon);
    }
}
