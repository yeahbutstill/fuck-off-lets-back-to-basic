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

# If Statement
- Dalam bahasa Java, if adalah salah satu kata kunci yang digunakan untuk percabangan
- Percabangan itu artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
- Hampir di semua bahasa pemrograman mendukung if expression
- didalam if terdapat parameter expression dari nilai boolean 

# Else Statement
- Block if akan dieksekusi ketika kondisi if bernilai true
- Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false
- Hal ini bisa dilakukan menggunakan else expression

# Else if Statement
- Kadang dalam if, kita butuh membuat beberapa kondisi
- Kasus seperti ini, di Java kita bisa menggunakan Else if Expression
- Else if di Java bisa lebih dari satu

# Switch Statement
- Kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya menggunakan perbandingan ==
- Switch adalah statement percabangan yang sama dengan if, namum lebih sederhana cara pembuatannya
- Kondisi di switch statement hanya untuk perbandingan ==

# Switch Lambda
- Di Java versi 14, diperkenalkan switch expression dengan lambda
- ini lebih mempermudah saat penggunaan switch expression karena kita tidak perlu lagi menggunakan kata kunci break
- -> {} block seperti ini yang disebut lambda

# Kata kunci yield
- Di Java versi 14, ada kata kunci baru yaitu yield, dimana kita menggunakan kata kunci yield untuk mengembalikan nilai pada switch statement
- Ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement

# Ternary Operator
- Ternary operator adalah operator sederhana dari if statement
- Ternary operator terdiri dari kondisi yang dievaluasi, jika menghasilkan true maka nilai pertama diambil, jika false maka nilai kedua diambil

# For Loop 
- for adalah salah satu kata kunci yang biasa digunakan untuk melakukan perulangan
- Block kode yang terdapat didalam for akan selalau diulangi selama kondisi for terpenuhi
- sintak perulangan for
- ```java
  for(init statement; kondisi; post statement) {
    // block perulangan
  }
  ```
- init statement akan dieksekusi hanya sekali diawal sebelum perulangan
- kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan, jika false perulangan akan berhenti 
- post statement akan dieksekusi setiap kali diakhiri perulangan
- init statement, kondisi dan post statement tidak wajib diisi, jika kondisi tidak diisi, berarti kondisi selalu bernilai true

# While Loop
- While loop adalah versi perulangan yang lebih sederhana dibanding for loop
- di While Loop, hanya terdapat kondisi perulangan, tanpa ada init statement dan post statement

# Do While Loop
- perulangan ini mirip dengan perulangan while
- Perbedaannya hanya pada pengecekan kondisi
- Pengecekan kondisi di while loop dilakukan di awal sebelum perulangan dilakukan, sedangkan di do while loop dilakukan setelah perulangan dilakukan
- Oleh karena itu dalam do while loop, minimal pasti sekali perulangan dilakukan walaupun kondisi tidak bernilai true

# Break & Continue
- Pada switch statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan case dalam switch
- Sama dengan pada perulangan, break juga digunakan untuk menghentikan seluruh perulangan.
- Namun berbeda dengan continue, continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke perulangan selanjutnya

# For Each
- Kadang kita bisa mengakses data array menggunakan perulangan
- Mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter, lalu mengakses array menggunakan counter yang kita buat
- Namun untungnya, di Java terdapat perulangan for each, yang bisa digunakan untuk mengakses seluruh data di Array secara otomatis

# Method 
- Method adalah block kode program yang akan berjalan saat kita panggil
- Untuk membuat method di Java, kita bisa menggunakan kata kunci void, lalu diikuti dengan nama method, kurung () dan diakhiri dengan block 
- Kita bisa memanggil method dengan menggunakan nama method lalau diikuti dengan kurung ()
- DI bahasa pemrograman lain, Method juga disebut dengan function

# Method Parameter
- Kita bisa mengirim informasi ke method yang ingin kita panggil
- Untuk melakukan hal tersebut, kita perlu menambahkan parameter atau argument di method yang sudah kita buat
- Cara membuat parameter sama seperti cara membuat variable
- Parameter ditempatkan didalam kurung () di deklarasikan method
- Parameter bisa lebih dari satu, jika lebih dari satu, harus dipisahkan menggunakan tanda koma
- Jadi kalau butuh argument yang dikirim dari luar methodnya saat dipanggil, kita bisa menggunakan method dengan parameter

# Method Return Value
- Secara default, method itu tidak menghasilkan value apapun, namun jika kita ingin menghasilkan retun value. Kita bisa memnbuat sebuah method yang mengembalikan nilai
- Agar method bisa menghasilkan value, kita harus mengubah kata kunci void dengan tipe data yang ingin dihasilkan
- Dan di dalam block method, untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci return, lalu diikuti dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan di method
- Di Java, kita hanya bisa menghasilkan 1 data di sebuah method, tidak bisa lebih dari satu

# Method Variable Argument
- Kadang kala kita butuh mengirim data ke method dengan jumlah data yang tidak pasti
- Biasanya, agar bisa seperti ini, kita akan menggunakan Array sebagai parameter di method tersebut
- Namun di Java, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumlah datanya tidak tentu, bisa nol atau lebih
- Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter


