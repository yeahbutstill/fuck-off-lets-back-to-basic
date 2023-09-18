Aplikasi biasanya tidak pernah berjalan mulus 100% setiap waktu, justru banyak sekali kejadian
dimana aplikasi mengalami kondisi yang tidak diinginkan, entah ada masalah dengan data yang
tidak benar, input/output yang tiba-tiba terputus, koneksi ke database yang tidak lancar hingga
error yang sengaja dibuat oleh user untuk mencari celah keamanan aplikasi. Kode yang ditulis
untuk menghandle masalah dan membuat aplikasi tangguh dalam segala segala medan sangat
penting perananya, bahkan menurut penelitian jumlahnya mencapai 80% dari total kode yang
dibuat developer.

Mengingat pentingnya penanganan kesalahan, Java menyediakan feature penanganan kesalahan
yang elegan, mudah digunakan dan tepat sasaran. Feature ini disebut dengan exception
handling, dengan feature ini kita tidak perlu mengetest hasil kembalian dari suatu fungsi untuk
mengetahui apakah ada error apa tidak, dengan begitu pengecekan kesalahan bisa lebih elegan
dan jelas.

try bisa langsung diikuti oleh fnally tanpa adanya catch sama sekali, hal ini bisa dilakukan
kalau di dalam try exception yang terjadi adalah unchecked exception. Artinya, exceptionya
tidak wajib ditangkap (catch), loh kalau tidak ditangkap apa yang terjadi? Yang terjadi adalah
konsep yang disebut dengan uncaught exception atau exception yang tidak tertangkap yang
pada akhirnya menyebabkan aplikasi berhenti berjalan. Untuk mengetahui bagaimana
mekanismenya saya akan menjelaskan tentang stack trace.