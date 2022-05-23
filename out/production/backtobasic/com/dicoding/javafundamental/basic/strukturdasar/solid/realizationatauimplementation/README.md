Hubungan realisasi atau implementasi adalah hubungan abstraksi khusus antara dua kelas, satu mewakili interface yang
menjadi spesifikasinya (ProductService) dan yang lainnya mewakili kelas implementasi yang menjadi realisasinya (
ProductServiceImpl). Realisasi dapat digunakan dalam beberapa hal seperti untuk menyempurnakan sebuah kelas, optimasi,
transformasi, template, model sintesis, komposisi kerangka kerja, dll. Jika melihat gambar di atas, hubungan realisasi
ditandai dengan garis putus-putus yang memiliki simbol segitiga putih pada ujungnya yang mengarah pada kelas yang
direalisasikan (supplier).

Interface realization adalah hubungan realisasi khusus antara classifier dan interface. Hubungan ini menandakan bahwa
classifier mengimplementasikan kontrak yang telah ditentukan oleh kelas interface. Kelas classifier dapat
mengimplementasikan satu atau beberapa kelas interface. Classifier yang mengimplementasikan interface mendukung
serangkaian fitur yang dimiliki oleh kelas interface. Selain mendukung fitur, kelas classifier harus mematuhi batasan
yang dimiliki oleh kelas interface. Mari kita lihat implementasi pada kode berikut.

Pada contoh kode diatas kelas ProductServiceImpl merupakan kelas classifier yang mengimplementasikan kontrak dari kelas
interface-nya yaitu kelas ProductService.

# Rangkuman

Pada modul ini, Anda sudah mempelajari beberapa hubungan dalam OOP. Sebelum menuju ke modul selanjutnya, mari kita
mengingat-ingat point apa saja yang sudah dipelajari;

1. Relations in OOP atau bisa disebut hubungan antar object adalah hal yang mendasar dalam pemrograman berorientasi
   objek. Hubungan tersebut mendefinisikan bagaimana objek-objek tersebut akan berinteraksi atau berkolaborasi satu sama
   lain.
2. Ada 3 kategori dalam hubungan antar objek, yaitu association, dependency, dan generalization.
3. Association, didefinisikan sebagai hubungan yang terstruktur, yang secara konsep memiliki arti bahwa dua komponen
   saling terhubung satu sama lain.
4. Hubungan dalam asosiasi disebut sebagai kardinalitas, yang merupakan hubungan maksimum yang terjadi dari himpunan
   entitas yang satu ke himpunan entitas yang lain, atau sebaliknya. Ada beberapa tipe dalam kardinalitas, yaitu:

    - One-to-one relationship, hubungan yang terjadi ketika satu objek A memiliki referensi dari satu objek B, atau
      sebaliknya.
    - One-to-many relationship, hubungan antara dua objek A dan B di mana objek A terhubung dengan lebih dari satu objek
      B, tetapi anggota dari objek B hanya terhubung dengan satu anggota A.
    - Many-to-many relationship, hubungan antara dua buah objek A dan B, di mana setiap anggota dari objek A maupun B
      memiliki hubungan lebih dari satu objek A dan B.

5. Dalam hubungan asosiasi antara 2 objek, terdapat 2 relasi yaitu:

    - Aggregation, hubungan yang tidak terikat, hanya sekedar memiliki. Setiap class yang berhubungan dapat berdiri
      sendiri jika salah satunya dihancurkan atau tidak ada.
    - Composition, hubungan yang saling terikat, yang saling memiliki satu sama lain. Apabila salah satunya dihancurkan,
      maka class yang terikat lainnya akan hancur juga, atau tidak bisa digunakan lagi.

6. Dependency, adalah hubungan antara dua buah class, di mana satu class memiliki ketergantungan dengan class lainnya
   tetapi class lainnya tidak/mungkin memiliki ketergantungan terhadap class pertama.
7. Generalization, adalah konsep pemisahan karakteristik dari dua atau lebih class dan menggabungkannya menjadi satu
   class yang lebih umum atau biasa disebut Superclass. Berbanding terbalik dari generalisasi, specialization adalah
   konsep membuat subclass dari class yang sudah ada.
8. Realization, adalah hubungan abstraksi khusus antara dua kelas, satu mewakili kelas yang direalisasikan (supplier)
   dan yang lainnya mewakili kelas implementasinya (client)

# Software Design Principle

Kita sudah berkenalan dengan software design pada modul sebelumnya. Bedanya, di modul ini kita akan sama-sama
mempelajari beberapa prinsip design. Tapi sebelum lanjut, yuk kita pahami dulu apa itu Software Design Principle.

Software Design Principle merupakan sebuah pedoman yang dapat kita gunakan untuk menghindari design yang buruk saat
mengembangkan sebuah perangkat lunak. Menurut Robert C. Martin, terdapat 3 (tiga) karakteristik penting dari design yang
buruk yang perlu kita perhatikan dan sebaiknya dihindari.

Mari kita bahas satu-satu ketiga pedoman tersebut.

# Rigidity

Dimulai dari rigidity atau kekakuan. Rigidity adalah kondisi suatu sistem yang sulit diubah, bahkan untuk perubahan yang
paling sederhana [1]. Saat kita ingin melakukan perubahan, perubahan tersebut menyebabkan ketergantungan untuk mengubah
item lain di dalam suatu modul. Alhasil, perubahan yang seharusnya dapat dilakukan dalam waktu yang singkat, malah
sebaliknya. Belum lagi dampaknya pada modul-modul lain yang saling berkaitan.

# Fragility

Selanjutnya adalah fragility. Fragility (kerapuhan) masih memiliki keterkaitan dengan rigidity. Fragility adalah
kecenderungan perangkat lunak yang salah di beberapa bagian setiap kali melakukan perubahan. Seringkali kesalahan
terjadi di area yang tidak memiliki hubungan konseptual dengan area yang diubah. Sehingga jika melakukan perbaikan,
kadang takut timbul kesalahan dengan cara yang tidak terduga. Ketika fragility ada di dalam suatu perangkat lunak,
kemungkinan kesalahan akan meningkat seiring berjalannya waktu. Perangkat lunak semacam itu tak hanya sulit dipelihara,
bahkan sulit juga dipertahankan. Saat melakukan perbaikan, alih-alih memperbaiki kesalahan yang ada, sebuah sistem akan
menjadi lebih buruk dan menimbulkan lebih banyak masalah.

# Immobility

Terakhir yang harus kita perhatikan dan hindari adalah Imobilitas. Yaitu sebuah ketidakmampuan untuk menggunakan kembali
perangkat lunak dari proyek lain atau bagian-bagian dari proyek yang sama. Seorang engineer tentu akan mengalami kondisi
di mana ia membutuhkan modul atau sistem yang sebelumnya sudah pernah ditulis atau dibuat oleh engineer lain. Namun,
sering juga terjadi bahwa modul yang dibutuhkan tersebut memiliki terlalu banyak bobot yang bergantung padanya. Setelah
mencoba untuk memisahkan, para engineer menemukan bahwa pekerjaan dan risiko yang diperlukan untuk memisahkan bagian
yang diinginkan (dari bagian yang tidak diinginkan), terlalu besar untuk ditoleransi. Sehingga alih-alih menulis ulang (
re-write), sang engineer akan menggunakannya kembali untuk project lain.

Dari penjelasan beberapa pedoman di atas, kita dapat mengetahui lebih dalam mengenai perbedaan antara architecture dan
design pada perangkat lunak. Selain itu, telah dijelaskan pula tentang bagaimana kita mendefinisikan sebuah design yang
buruk dan perlu kita dihindari.

Pada modul selanjutnya kita akan mempelajari tentang prinsip SOLID, baik itu definisi, penjelasan dan contoh studi kasus
kapan kita membutuhkannya. Yuk lanjut!

# Rangkuman

Akhirnya, kita telah selesai mempelajari tentang Software Design. Berikut adalah beberapa materi yang telah dibahas:

1. Dalam mengembangkan perangkat lunak, dibutuhkan architecture dan design yang baik. Architecture menentukan struktur
   dari perangkat lunak. Sedangkan design, lebih mengarah pada hubungan antar komponen yang berada di dalamnya.
2. Software Design Principle merupakan pedoman yang dapat digunakan untuk menghindari design yang buruk saat
   mengembangkan sebuah perangkat lunak.
3. Menurut Robert C. Martin, terdapat 3 design yang buruk, yaitu :

    - Rigidity, adalah kondisi suatu sistem yang sulit diubah, bahkan untuk perubahan yang paling sederhana.
    - Fragility, adalah kecenderungan perangkat lunak yang salah di beberapa bagian setiap kali melakukan perubahan.
    - Immobility, adalah sebuah ketidakmampuan untuk menggunakan kembali perangkat lunak dari proyek lain atau
      bagian-bagian dari proyek yang sama.

# Pengenalan S.O.L.I.D

Pada beberapa modul sebelumnya kita telah belajar memahami Object Oriented Programming, dari definisi hingga
pilar-pilarnya. Kini kita akan masuk ke pembahasan tentang SOLID ya.

# Apa itu SOLID

SOLID merupakan kumpulan dari beberapa principle yang diwujudkan oleh engineer-engineer yang ahli dibidangnya. SOLID
membantu kita mengembangkan sebuah perangkat lunak dengan tingkat kekukuhan yang tinggi. Itu goal kita!

Lantas apakah seseorang yang sudah menguasai dan menggunakan OOP perlu mempelajari SOLID? Tentu saja YA, karena pada
dasarnya OOP dan SOLID merupakan 2 (dua) hal yang berbeda. OOP adalah sebuah paradigma untuk menuliskan program yang
sudah diadaptasi oleh beberapa bahasa pemrograman, sedangkan SOLID merupakan sebuah principle yang sudah disebutkan
sebelumnya. Sampai di sini kita pasti sudah bisa membedakannya ya.

Berbicara soal paradigma lebih dalam, paradigma sendiri bukanlah sebuah principle yang mengajarkan tentang bagaimana
sebuah tanggung jawab suatu entitas yang berada di dalam sebuah perangkat lunak. Saat kita sudah berhasil menulis kode
dengan mengikuti paradigma OOP, bukan berarti kita sudah mengikuti design principle yang sudah kita pelajari bersama di
modul-modul sebelumnya.

Ilustrasi di atas menggambarkan bagaimana sekumpulan bola yang disusun sedemikian rupa dapat menciptakan bentuk yang
kukuh. Padahal seperti yang kita ketahui, bola memiliki bentuk yang sangat mudah untuk bergerak. Analogi serupa dapat
kita terapkan saat mengetik kode. Dalam mengembangkan sebuah perangkat lunak, jika kita bisa menuliskan kode dengan
bentuk dan ukuran yang sama seperti halnya kumpulan bola di atas, kita pun dapat menciptakan sebuah sistem yang kukuh.
Denga terciptanya sistem yang kukuh, kita dapat lebih mudah dan leluasa mengganti komponen dan memperluas sistem tanpa
adanya gangguan.

# Tujuan SOLID

Sudah paham kan penjelasan dari ilustrasi di atas? Kita jadi paham bahwa dengan mengikuti prinsip SOLID, kode yang kita
buat dapat dengan mudah diekstensi (extended) dan dipertahankan (maintained).

Prinsip SOLID bukanlah suatu hukum atau aturan tertentu yang wajib kita patuhi, melainkan sebuah prinsip yang
dimaksudkan untuk membantu kita dalam menuliskan kode yang rapi. Bagaimana hal itu dapat diwujudkan? Berikut adalah
tujuan dari prinsip SOLID dalam pembuatan struktur mid-level perangkat lunak:

- Toleran terhadap perubahan.
- Mudah dipahami.
- Komponen dasar dapat digunakan kembali dalam bentuk software system lainnya.

Istilah mid-level yang merujuk pada prinsip SOLID ini diterapkan oleh engineer yang bekerja pada level module [2].
Prinsip ini diterapkan tepat di atas level kode. Manfaatnya, ia dapat membantu menentukan jenis struktur perangkat lunak
yang digunakan dalam modul dan komponen. Setelah komponen tersebut dapat kita desain dengan baik menggunakan prinsip
SOLID, maka selanjutnya kita dapat melanjutkan ke dalam prinsip-prinsip arsitektur tingkat tinggi (high-level
architecture).

Di modul berikutnya kita akan sama-sama belajar lebih dalam lagi tentang masing-masing principle yang menjadi bagian
dari SOLID itu sendiri.


