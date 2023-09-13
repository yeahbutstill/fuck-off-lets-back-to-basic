Operator Assignment menggunakan simbol sama dengan (=), kita sudah melihat bagaimana
operator ini digunakan di bab-bab sebelumnya. Operator ini mempunyai dua buah operand,
sebelah kiri sama dengan dan sebelah kanan sama dengan. Operand sebelah kiri harus berupa
variabel, sedangkan sebelah kanan bisa berupa nilai literal atau variabel yang lain. Arah
operasinya adalah dari kanan ke kiri, artinya nilai sebelah kanan akan dicopy ke sebelah kiri.
Setelah operasi sukses dilakukan nilai variabel di sebelah kiri akan sama dengan nilai operand
di sebelah kanan.

Ada beberapa hal yang harus diperhatikan dalam menggunakan operator assignment ini,
antara lain:

- Jika tipe data variabel adalah primitif, ukuran data sangat berpengaruh terhadap hasil
operasi. Pastikan anda mengetahui proses casting secara implisit atau explisit, kalau
proses casting terjadi secara eksplisit pastikan bahwa nilai datanya berada dalam rentang
nilai variabel di sebelah kiri, karena casting secara eksplisit akan memotong data sesuai
ukuran variabel di sebelah kiri.
- Ingat bahwa tipe data reference bukan merupakan object, tetapi alamat dimana object
sebenarnya berada. Ketika kita melakukan assigment ke variabel dengan tipe data
reference, yang terjadi adalah proses pengcopyan alamat object dari operand di sebelah
kanan ke operand di sebelah kiri, sedangkan objectnya sendiri tetap satu, setelah operasi
selesai maka kedua operand akan merujuk ke alamat object yang sama. Kalau anda sudah
belajar C/C++ konsep ini disebut dengan pointer, tetapi jangan salah, di java konsep
pointer tidak dikenal, yang dikenal adalah konsep reference.
- Ketika mengassign nilai ke variabel dengan tipe data reference, perlu diingat aturan
tentang supertypes, subtypes dan arrays. Ketiga konsep itu akan dibahas lebih lanjut
ketika kita belajar tentang konsep OOP di java di bab selanjutnya.
Operator assigment bisa digabungkan dengan operator lain menghasilkan operator campuran,
misalnya +=, -=, *= dan /=, operator campuran ini digunakan untuk menyingkat penulisan
kode