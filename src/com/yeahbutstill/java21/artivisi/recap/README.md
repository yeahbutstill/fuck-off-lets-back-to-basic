- Kalau di maven folder resource itu outomatis didaftarkan ke class Path
- Checked Exception: ini harus ditretment, artinya exception ini harus dihandle mau di trhow lagi ke method lain yang memanggilnya atau di catch di method tersebut
- Unchecked Exception: ini tidak perlu di try catch atau throw
- Guideline kalau error user pake Checked Exception, karena kita bisa trhow sampai ke UI, di UI keluarkan pesan error "Opps nama file tidak sesuai" nah dari sini user bisa memperbaiki
- Tapi kalau ArrayIndexOutOfBoundException ini Error untuk devloper, maka kita yang memperbaiki
- Istilah Low Level adalah semua yang kita kerjakan manual
- ServerSocker - Server
- Socket - Client
- InputStream adalah aliran data yang masuk ke applikasi kita
- OutputStream adalah untuk mengirim data
- Try with resource itu yang penting harus implement java.lang.AutoCloseable. maka saat try catch kita tidak perlu lagi membuat block finally lalu memanggil method close. karena try with resource itu dia akan automatis close resource yang sudah tidak dipakai.
- Thread itu adalah proses, jadi kita pengen server ini bisa bekerja paralel artinya yang satu lagi menghandle clinet pertama, yang satu lagi menghandle client yang lainnya
- Untuk menjalankan multi thread maka kita akan menginstankan class yang extend thread atau implement runnable. kalau di java caranya seperti ini.
- Concurrency artinya berjalan secara berbarengan, untuk mengimplementasikan ini si Java ini menyediakan class Thread.
- Processes adalah apikasi java kita, nah komputer kita itu menjalankan banyak proses.
- Nah didalam proses itu ada Thread yang kita bikin
- Kalau kita menggunakan atau mengextends Thread, berarti class kita sendiri ini sudah Thread sehingga mempunyai method start, jadi bisa kita langsung instantkan.
- Kalau kita menggunakan atau implement Runnable, ini harus dibungkus dulu ke dalam Thread.
- Thread join menunggu semua thread selesai di eksekusi baru dia akan melanjutkan ke stamenet berikutnya.
- Jadi kalau koding yang biasa bukan multithread, dia jalannya berurut dari atas sampai kebawah
- Tapi kalau koding yang multithread dia tidak akan menunggu masing-masing thread selesai, jadi begitu dia start maka dia akan lanjut lagi walaupun proses sebeulumnya belum selesai
- Harap berhati-hati kalau kita bikin aplikasi yang jalan di thread banyak sekaligus, kita harus hati-hati dengan sharing data. Karena data tersebut bisa saja diganti-ganti oleh masing-masing thread. Sehingga hasilnya bisa berbeda dengan yang diharapkan.
- Intermitend AKA kadang error, kadang engga, makanya untuk urusan multithread di debug nya susah dan biasanya yang ngurusin ini yang sudah senior. nah Kapan dia muncul. Semakin banyak Threadnya, maka dia akan potensi terjadi errornya semakin besar. misal Jumlah Thread 100
- Tidak Threadsafe itu maksudnya tidak aman untuk digunakan dalam multithreading
- Solusi untuk membuat aplikasi yang threadsafe, field atau variable yang digunakan berbarengan itu kita harus batasi, supaya tidak diakses berbarengan.
- Keyword synchronized pada method, digunakan untuk thread-thread yang mengakses ke object ini akan disuruh gantian, contoh misalnya yang 1 lagi menjalankan proses tambah, yang satu engga boleh jalanin pengurangan atau thread lain juga engga boleh jalanin perhitungan tambah. jadi harus antri dulu.
- Synchronization itu dia sebetulnya membuat lock atau mengunci object tersebut. sehingga kalau orang lain sedang menjalankan method tersebut maka yang lain jika ingin mengaksesnya juga maka dia disuruh nunggu sampai thread pertama yang mengakses itu selesai.
- Liveness ini adalah problem yang terjadi karena si thread tersebut melocking object jadi dia rebutan lock. ada 3 permasalahan, deadlock, starvation dan livelock
- Thread pool itu adalah kita bisa membatasi maksiman dan minimum threadnya berapa.
- Flow Layout, itu mengalirnya dari kiri ke kanan, kalau udah engga muat pindah ke bawah.
- Grid Layout, ada panjang kali lebar, jadi row kali column