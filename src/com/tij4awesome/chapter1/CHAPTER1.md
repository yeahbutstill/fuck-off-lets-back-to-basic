1. Segala sesuatu adalah sebuah objek. Bayangkan suatu objek sebagai variabel mewah; itu menyimpan data, namun Anda
   dapat “membuat permintaan” pada objek tersebut, memintanya untuk melakukan operasi pada dirinya sendiri. Di dalam
   teori, Anda dapat mengambil komponen konseptual apa pun dalam masalah yang Anda coba selesaikan (anjing, bangunan,
   layanan, dll.) dan mewakilinya sebagai objek dalam program Anda.
2. Program adalah sekumpulan objek yang saling memberi tahu apa yang harus dilakukan dengan mengirimkan pesan. Untuk
   membuat permintaan suatu objek, Anda "mengirim pesan" ke objek itu. Lebih konkretnya, Anda dapat menganggap pesan
   sebagai permintaan untuk memanggil metode yang dimiliki objek tertentu.
3. Setiap objek memiliki memorinya sendiri yang terdiri dari objek lain. Dengan kata lain, Anda membuat objek jenis baru
   dengan membuat paket berisi objek yang sudah ada. Dengan demikian, Anda dapat membangun kompleksitas ke dalam suatu
   program sambil menyembunyikannya di balik kesederhanaan objek.
4. Setiap objek mempunyai tipe. Dengan menggunakan bahasa tersebut, setiap objek adalah turunan dari sebuah kelas, di
   mana “kelas” identik dengan “tipe.” Karakteristik pembeda yang paling penting dari suatu kelas adalah “Pesan apa yang
   dapat Anda kirim ke kelas tersebut?”
5. Semua objek dengan tipe tertentu dapat menerima pesan yang sama. Ini sebenarnya adalah pernyataan yang dimuat,
   seperti yang akan Anda lihat nanti. Karena objek bertipe "lingkaran" juga merupakan objek bertipe "bentuk", sebuah
   lingkaran dijamin menerima pesan bentuk. Ini berarti Anda dapat menulis kode yang sesuai dengan bentuk dan secara
   otomatis menangani apa pun yang sesuai dengan deskripsi bentuk. Substitusi ini adalah salah satu konsep kuat dalam
   OOP.

- Objek memiliki status, perilaku, dan identitas. Ini berarti bahwa sebuah objek dapat memiliki data internal (yang
  memberinya status), metode (untuk menghasilkan perilaku), dan setiap objek dapat dibedakan secara unik dari setiap
  objek lainnya untuk menempatkan ini dalam pengertian konkret, setiap objek memiliki alamat unik dalam memori.
- Mengakses elemen secara acak dalam ArrayList adalah operasi waktu konstan; dibutuhkan jumlah waktu yang sama terlepas
  dari elemen yang Anda pilih. Namun, dalam LinkedList mahal untuk menelusuri daftar untuk memilih elemen secara acak,
  dan butuh waktu lebih lama untuk menemukan elemen yang jauh di bawah daftar.
- Di sisi lain, jika Anda ingin menyisipkan elemen di tengah urutan, lebih murah di LinkedList daripada di ArrayList.
  Ini dan operasi lainnya memiliki efisiensi yang berbeda tergantung pada struktur yang mendasari urutan. Anda mungkin
  mulai membangun program Anda dengan LinkedList dan, saat mencari kinerja, ubah ke ArrayList. Karena abstraksi melalui
  Daftar interface, Anda dapat mengubah dari satu ke yang lain dengan dampak minimal pada kode Anda.
- Biasanya, tugas hanyalah cara untuk mengalokasikan waktu satu prosesor. Tetapi jika sistem operasi mendukung banyak
  prosesor, setiap tugas dapat ditugaskan ke prosesor yang berbeda, dan mereka benar-benar dapat berjalan secara
  paralel. Salah satu fitur nyaman dari konkurensi pada tingkat bahasa adalah programmer tidak perlu khawatir tentang
  apakah ada banyak prosesor atau hanya satu. Program secara logis dibagi menjadi beberapa tugas, dan jika mesin
  memiliki lebih dari satu prosesor, maka program berjalan lebih cepat, tanpa penyesuaian khusus.
- Semua ini membuat konkurensi terdengar cukup sederhana. Ada tangkapan: sumber daya bersama. Jika Anda menjalankan
  lebih dari satu tugas yang mengharapkan untuk mengakses sumber daya yang sama, Anda memiliki masalah. Misalnya, dua
  proses tidak dapat mengirimkan informasi secara bersamaan ke printer. Untuk mengatasi masalah tersebut, sumber daya
  yang dapat digunakan bersama, seperti printer, harus dikunci saat sedang digunakan. Jadi tugas mengunci sumber daya,
  menyelesaikan tugasnya, lalu melepaskan kunci sehingga orang lain dapat menggunakan sumber daya tersebut.
- Anda tahu seperti apa program prosedural: definisi data dan pemanggilan fungsi. Untuk menemukan arti dari program
  semacam itu, Anda harus mengerjakannya, melihat pemanggilan fungsi dan konsep tingkat rendah untuk membuat model dalam
  pikiran Anda. Inilah alasan kita memerlukan representasi perantara ketika merancang program prosedural, program ini
  cenderung membingungkan karena istilah ekspresinya lebih berorientasi pada komputer daripada masalah yang sedang Anda
  pecahkan.

- Where storage lives, Hal ini berguna untuk memvisualisasikan beberapa aspek tentang bagaimana segala sesuatunya ditata
  saat program sedang berjalan, khususnya bagaimana memori diatur. Ada lima tempat berbeda untuk menyimpan data:
- Registers. Ini adalah penyimpanan tercepat karena berada di tempat yang berbeda dari penyimpanan lainnya: di dalam
  prosesor. Namun, jumlah register sangat terbatas, sehingga register dialokasikan sesuai kebutuhan. Anda tidak memiliki
  kendali langsung, dan Anda juga tidak melihat bukti apa pun di program Anda bahwa register memang ada (C & C++,
  sebaliknya, memungkinkan Anda menyarankan alokasi register ke kompiler).
- The Stack. Ini berada di area random access memory (RAM), tetapi mendapat dukungan langsung dari prosesor melalui
  stack pointer. Penunjuk tumpukan (Stack Pointer) dipindahkan ke bawah untuk membuat memori baru dan dipindahkan ke
  atas untuk melepaskan memori tersebut. Ini adalah cara yang sangat cepat dan efisien untuk mengalokasikan penyimpanan,
  nomor dua setelah register. Sistem Java harus mengetahui, saat membuat program, umur pasti semua item yang disimpan di
  tumpukan (stack). Batasan ini membatasi fleksibilitas program Anda, jadi meskipun ada beberapa penyimpanan Java di
  tumpukan khususnya, referensi objek-objek Java itu sendiri tidak ditempatkan di tumpukan(Stack).
- The heap. Ini adalah kumpulan memori tujuan umum (juga di area RAM) tempat semua objek Java berada. Hal yang
  menyenangkan tentang heap adalah, tidak seperti tumpukan (stack), kompiler tidak perlu mengetahui berapa lama
  penyimpanan harus berada di heap. Oleh karena itu, ada banyak fleksibilitas dalam menggunakan penyimpanan di heap.
  Kapan pun Anda membutuhkan suatu objek, Anda cukup menulis kode untuk membuatnya dengan menggunakan kata kunci new,
  dan penyimpanan dialokasikan di heap saat kode tersebut dijalankan. Tentu saja ada harga yang harus dibayar untuk
  fleksibilitas ini: Mungkin diperlukan lebih banyak waktu untuk mengalokasikan dan membersihkan penyimpanan heap
  dibandingkan penyimpanan tumpukan(stack) (bahkan jika Anda dapat membuat objek pada tumpukan(stack) di Java, seperti
  yang dapat Anda lakukan di C++).
- Constant storage. Nilai konstan sering kali ditempatkan langsung di kode program, sehingga aman karena tidak akan
  pernah berubah. Terkadang konstanta ditutup sendiri sehingga dapat ditempatkan secara opsional di read only memory (
  ROM), di sistem tertanam atau embedded systems.
- Non-RAM storage. Jika data sepenuhnya berada di luar program, data tersebut dapat tetap ada saat program tidak
  berjalan, di luar kendali program. Dua contoh utama dari hal ini adalah objek streaming, yang mana objek diubah
  menjadi aliran byte, umumnya untuk dikirim ke mesin lain, dan objek persisten, yang mana objek ditempatkan pada disk
  sehingga objek tersebut akan mempertahankan statusnya bahkan ketika program sedang dijalankan. dihentikan. Trik dari
  jenis penyimpanan ini adalah mengubah objek menjadi sesuatu yang bisa ada di media lain, namun dapat dibangkitkan
  menjadi objek berbasis RAM biasa bila diperlukan. Java memberikan dukungan untuk persistensi ringan, dan mekanisme
  seperti JDBC dan Hibernate memberikan dukungan yang lebih canggih untuk menyimpan dan mengambil informasi objek dalam
  database.

# You never need to destroy an object

- Di sebagian besar bahasa pemrograman, konsep masa pakai suatu variabel menempati porsi yang signifikan dalam upaya
  pemrograman. Berapa lama variabel tersebut bertahan? Jika Anda seharusnya menghancurkannya, kapan Anda harus
  menghancurkannya? Kebingungan mengenai masa hidup variabel dapat menyebabkan banyak bug, dan bagian ini menunjukkan
  bagaimana Java menyederhanakan masalah dengan melakukan semua pekerjaan pembersihan untuk Anda.
