# Konversi Tipe Data Number

- Widening Casting (otomatis) byte -> short -> int -> long -> float -> double
- Narrowing Casting (manual) double -> float -> long -> int -> char -> short -> byte

# Tipe Data Character

- Data Character(huruf) di Java direpresentasikan oleh tipe char.
- Untuk membuat data char di Java, kita bisa menggunakan tanda ''(kurung buka kurung tutup petik satu)

# Tipe Data Boolean

- Tipe data boolean adalah tipe data yang memiliki 2 nilai, yaitu benar dan salah
- Tipe data boolean di Java direpresentasikan dengan kata kunci boolean
- Nilai benar direpresentasikan dengan kata kunci true
- Nilai salah direpresentasikan dengan kata kunci false
- Default value untuk boolean adalah false

# Tipe Data String

- Tipe Data String adalah tipe data yang berisikan kumpulan karakter atau sederhananya adalah text
- Di Java tipe data String direpresentasikan dengan kata kunci String
- Untuk membuat String di Java, kita menggunakan karakter "" (petik dua) sebelum dan sesudah text nya
- Default value untuk String adalah null

# Variable

- Variable adalah tempat untuk menyimpan data
- Java adalah bahasa static type, sehingga sebuah variable hanya bisa digunakan untuk menyimpan tipe data yang sama,
  tidak bisa berubah-ubah tipe data seperti dibahas pemrograman PHP atau JavaScript
- Untuk membuat variable di Java kita bisa menggunakan nama tipe data lalu diikuti dengan nama variable nya
- Nama variable tidak boleh mengandung whitespace(spasi, enter atau tab) dan tidak boleh seluruhnya number

# Kata Kunci Final
- Secara default variable di Java bisa diubah-ubah nilainya
- Jika kita ingin membuat sebuah variable yang datanya tidak boleh diubah setelah pertama kali dibuat, kita bisa menggunakan kata kunci final
- Isitilah variable seperti ini, banyak juga menyebutnya konstant

# Tipe Data Bukan Primitif (Tipe data Object)
- Tipe data primitif adalah tipe bawaan di dalam bahasa pemrograman. Tipe data primitif tidak bisa diubah lagi
- Tipe data number, char boolean adalah tipe data primitif. Tipe data primitif selalu memiliki default value
- Tipe data String buka tipe data primitif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai null
- Tipe data bukan primitif bisa memiliki method/function
- Di Java, semua tipe data primitif memiliki representasi tipe data bukan primitifnya

# Tipe Data Array
- Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
- Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat
- Cara kerja Array itu, ketika pertama kali kita membuat Array kita harus tentukan panjangnya Arraynya itu berapa. Misal 10
- Saat kita membuat panjang Array 10, nanti si array itu akan menyiapkan kotak-kotak (Element) 10, dimana tiap kotak(Element) itu bisa kita masukan datanya, tapi ingat tipe datanya harus sama
- Untuk identitas tiap kotak itu dimulau dari angka 0 (indexnya) jadi misalnya panjang datanya 10, maka 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 (Panjang data - 1)
- Unutk mengakses atau mengubah data yang ada di element, kita bisa mengaksesnya dengan nomor indexnya. jadi jika kita ingin menubah data pertmama maka kita harus memasukan index 0, kalau ingin mengabil data yang terakhir harus memasukan index 9
- array[index], untuk mengambil data di Array
- array[index] = value, untuk menubah data di Array
- array.length, untuk mengambil panjang Array

# Operasi Perbandingan
- Operasi perbandingan adalah operasi untuk membandingkan dua buah data
- Operasi perbandingan adalah operasi yang menghasilkan nilai boolean (benar atau salah)
- Jika hasil operasinya adalah benar, maka nilainya adalah true
- Jika hasil operasinya adalah salah, maka nilainya adalah false
- > lebih dari
- < kurang dari
- >= lebih dari sama dengan
- <= kurang dari sama dengan
- == sama dengan
- != tidak sama dengand
- Semua operasi ini bisa digunakan disemua tipe data number namun nanti balikan dari nilai resultnya adalah tipe boolean true/false

# Operasi Boolean
- Operasi ini sederhana, yang digunakan untuk membandingakn dua data boolean
- && dan
- || atau
- ! kebalikan

# Expression
- Expression adalah konstruksi dari variable, operator dan pemanggilan method yang mengevaluasi menjadi sebuah single value
- Expression adalah core component dari statement

# Statement
- Statement adalah bisa dibilang kalimat lengkap dalam bahasa.
- Sebuah Statement berisikan execution komplit, biasanya diakhiri dengan titik koma
- Ada beberapa jenis statement
- Assigment expression
- Penggunaan ++ dan --
- Method invocation
- Object creation expression

# Block 
- Block adalah kumpulan statement yang terdiri dari nol atau lebih statement
- Jadi kalau kumpulan expression adalah statement
- Kalau kumpulan statement adalah block
- Block itu diawali dan diakhiri dengan kurung kurawal { }

