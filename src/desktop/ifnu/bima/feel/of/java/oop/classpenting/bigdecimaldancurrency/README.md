BigDecimal dan Currency

Penanganan angka pecahan sangat penting untuk aplikasi bisnis, terutama untuk uang, hal ini
karena kalau ada kesalahan pembulatan maka akan ada kesalahan perhitungan uangnya. Selisih
sedikit saja akan membuat perhutungan accounting atau pajak menjadi tidak seimbang sehingga
menyebabkan laporan keuangan tidak benar.

Bekerja dengan angka pecahan, kita pasti langsung teringat dengan tipe data float atau double,
tergantung presisi dan besarnya data yang digunakan. Tetapi ketika berurusan dengan uang,
kedua tipe data ini bisa menyebabkan masalah pelik, terutama kalau ada aturan berapa angka di
belakang koma saja yang berpengaruh terhadap perhitungan. Misalnya hanya 2 buah angka di
belakang koma saja yang digunakan, sisanya bisa diabaikan dengan menggunakan pembulatan.

Tipe data float dan double tidak bisa diatur berapa angka di belakang koma, sehingga proses
pembulatan juga tidak selalu berhasil dengan baik.
Mari kita lihat contoh perhitungan bilangan pecahan menggunakan double yang bisa
menyebabkan kesalahan angka dibelakang koma. Misalnya kita menjual barang dengan harga Rp.
1.000.000,05 kemudian ada diskon 10%, baru setelah itu dihitung PPN 5%. Untuk melihat
hasilnya digunakan class NumberFormat agar tampilan diformat menggunakan format uang
Rupiah yang benar.

Dengan menggunakan BigDecimal kita bisa mengontrol bagaimana caranya melakukan
pembulatan angka di belakang koma. Aturan pembulatan yang digunakan bisa dipilih salah
satu dari nilai enum class RoundingMode yang diperkenalkan semenjak Java 6. Aturan
pembulatan yang tersedia di dalam class RoundingMode antara lain :
- CEILING : pembulatan ke atas 
- DOWN : pembulatan ke bawah mendekati nol, kalau nilainya negatif dibulatkan ke angka
lebih besar yang lebih dekat dengan angka nol. 
- FLOOR : pembulatan ke atas mendekati angka negatif tak terhingga. Kalau angkanya
negatif dibulakan ke angka lebih kecil lagi mendekati negatif tak terhingga. 
- UP : pembulatan yang selalu menjauhi angka nol. Kalau nilai positif dibulatkan ke lebih
besar, kalau angka negatif dibulatkan ke angka lebih kecil lagi. 
- HALF_DOWN : dibulatkan ke angka terdekat, kecuali kalau sama jaraknya antara ke atas
dan ke bawah, maka dibulatkan ke angka bawah mendekati nol. 
- HALF_UP : dibulatkan ke angka terdekat, kecuali kalau sama jaraknya antara ke atas dan
ke bawah, maka dibulatkan ke angka atas menjauhi nol. Pembulatan ini adalah sistem
pembulatan yang digunakan dalam sistem keuangan. 
- UNNECESSARY : tidak perlu dilakukan pembulatan

Selain masalah pembulatan, tipe data double juga mempunyai masalah serius dengan
representasinya di dalam memory. Tidak semua angka dibelakang koma bisa direpresentasikan
dalam binary, misalnya angka 0.035, kalau angka ini disimpan dalam tipe data double maka
hasilnya adalah 0.034999999999999996. Masalah representasi data di belakang koma ini tidak
muncul di BigDecimal, sehingga bisa dihindari masalah seperti ini.

