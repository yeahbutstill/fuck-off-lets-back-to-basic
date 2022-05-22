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