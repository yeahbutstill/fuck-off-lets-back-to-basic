Chronology adalah jantung dari Joda Time, semua perhitungan instant, periode dan durasididasarkan pada jenis penanggalan
yang digunakan. Joda Time secara default menyediakan
beberapa sistem penanggalan, antara lain :

• Gregorian : standard penanggalan masehi yang dimulai pada 15 september 1582,
penanggalan ini mendefnisikan bahwa tahun kabisat hanya terjadi pada tahun yang habis
dibagi 4, tidak habis dibagi 100 dan habis dibagi 400. Misalnya tahun 2008 adalah kabisat
karena habis dibagi 4, tahun 2100 bukan kabisat karena walaupun habis dibagi 4 juga
habis dibagi 100. Tahun 2000 adalah kabisat karena habis dibagi 4, walaupun habis dibagi
100 tetapi habis dibagi 400.

• Julian :
standard penanggalan masehi yang sebelum tanggal 15 september 1582.
Penanggalan ini mendefnisikan bahwa setiap tahun yang habis dibagi 4 adalah tahun
kabisat.

• ISO8601 : standard penanggalan yang menggunakan sistem Gregorian plus standarisasi
format penulisan tanggal. Joda Time secara default menggunakan ISO8601 sebagai default
chronology.

• GJ : penanggalan yang menggabungkan Julian dan Gregorian. Sebelum tanggal 15
September 1582 sistem penanggalan yang digunakan adalah Julian dan setelahnya adalah
Gregorian.

• Penanggalan lain yang spesifk : Buddhist, Coptic, Ethiopic
Sampai di sini kita sudah belajar secara umum tentang konsep waktu dalam Joda Time beserta
implementasinya, nah kita akan membahas lagi sedikit tentang bagaimana Joda Time
menyederhanakan kode perhitungan tanggal yang dibuat dengan class dari JDK.