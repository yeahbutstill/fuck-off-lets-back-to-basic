package com.artivisi.training.bestpractices.inheritance;

import java.math.BigDecimal;

/*
Inheritance tujuan utamanya adalah untuk code reuse
artinya jadi kita kalau sudah implement methodnya di satu Class,
kalau kita mau nambahin lagi, itu kita tinggal gunakan kata kunci extends.
Biasanya orang untuk menambahkan method atau fitur itu pakainya Inheritance.
Tapi kalau terlalu banyak akan menyebabkan Fragile Software (Susah dirawat)
Kenapa susah dirawat, karena begitu Super Class berubah, maka Class yang bawahnya akan
terkena impek
 */
public class TransaksiInheritanceDiskon extends TransaksiInheritance {
    private BigDecimal diskon;

    public BigDecimal totalDibayar() {
        return hitungTotal().subtract(diskon);
    }
}
