Dengan menggunakan BigDecimal kita bisa mengontrol bagaimana caranya melakukan
pembulatan angka di belakang koma. Aturan pembulatan yang digunakan bisa dipilih salah
satu dari nilai enum class RoundingMode yang diperkenalkan semenjak Java 6. Aturan
pembulatan yang tersedia di dalam class RoundingMode antara lain :

• CEILING : pembulatan ke atas

• DOWN : pembulatan ke bawah mendekati nol, kalau nilainya negatif dibulatkan ke angka
lebih besar yang lebih dekat dengan angka nol.

• FLOOR : pembulatan ke atas mendekati angka negatif tak terhingga. Kalau angkanya
negatif dibulakan ke angka lebih kecil lagi mendekati negatif tak terhingga.

• UP : pembulatan yang selalu menjauhi angka nol. Kalau nilai positif dibulatkan ke lebih
besar, kalau angka negatif dibulatkan ke angka lebih kecil lagi.

• HALF_DOWN : dibulatkan ke angka terdekat, kecuali kalau sama jaraknya antara ke atas
dan ke bawah, maka dibulatkan ke angka bawah mendekati nol.

• HALF_UP : dibulatkan ke angka terdekat, kecuali kalau sama jaraknya antara ke atas dan
ke bawah, maka dibulatkan ke angka atas menjauhi nol. Pembulatan ini adalah sistem
pembulatan yang digunakan dalam sistem keuangan.

• UNNECESSARY : tidak perlu dilakukan pembulatan