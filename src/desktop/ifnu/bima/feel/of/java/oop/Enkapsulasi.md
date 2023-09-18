Enkapsulasi

Enkapsulasi adalah konsep dimana sebuah logic kode dibungkus dalam satu bentuk kode yang
menggambarkan dunia nyata. Class adalah sebuah enkapsulasi dari perilaku yang diwakilinya
dalam dunia nyata. Setiap entitas dalam dunia nyata mempunyai karakteristik dan perilaku.
Karakteristik ini diwujudkan sebagai property, sedangkan perlilaku diwujudkan dalam sebuah
method. Kedua hal ini : karakteristik dan perilaku dienkapsulasi menjadi satu entitas dalam class.

Bahasa prosedural tidak mempunyai feature enkapsulasi ini, sehingga kalau kita melihat kode
kita tidak bisa melihat wujud abstraksi kode tersebut dengan dunia nyata. Semua hanya
berbentuk fungsi / method, sedangkan datanya berceceran di sana sini. OOP memberikan konsep
yang sangat praktis tentang bagaimana menjembatani logic yang ada di dunia nyata dengan
wujudnya dalam kode. Sehingga ketika kita bicara dengan user aplikasi yang tidak mengetahui
kode, kita tetap bisa bicara dengan istilah yang sama. Misalnya kita berbicara tentang customer,
kita bicara customer yang nyata dan juga sekaligus berbicara tentang class Customer yang ada
dalam kode.

Dengan adanya enkapsulasi, programmer yang pada awalnya tidak terlibat dalam analisis
aplikasi, dan hanya bisa melihat kode bisa dengan mudah mengasosiasikan kode tersebut dengan
keadaan nyata. Enkapsulasi menyebabkan kode menjadi self explained, artinya hanya dengan
melihat kode kita dapat mengetahui apa logic di balik kode ini, atau kita bisa mengetahui apa
maksud dari kode yang sedang kita baca.

Java dari awal didesain sebagai bahasa untuk membuat aplikasi Enterprise. Sebenernya antara
aplikasi enterprise dan aplikasi main-main tugas kuliah kodenya tidak jauh berbeda, yang jauh
berbeda adalah ukuranya. Kalau aplikasi main-main tugas kuliah, ukuran kodenya paling masih
beberapa kilobyte saja, tetapi aplikasi dengan skala enterprise bisa sampai bergiga-giga.
Developer yang mengerjakan aplikasi juga jauh sekali perbandinganya, karena aplikasi enterprise
bisa dikerjakan hingga ratusan orang. Dengan ukuran sebesar itu, tidak mungkin membuat
dokumentasi yang mendetail tentang kodenya, oleh karena itu sebisa mungkin setiap kode yang
ditulis oleh developer sudah self explained.

