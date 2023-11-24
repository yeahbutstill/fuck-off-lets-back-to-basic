# Pengenalan Generic

- Generic adalah kemampuan menambahkan parameter type saat membuat class atau method
- Berbeda dengan tipe data yang biasa kita gunakan di class, function, generic memungkinkan kita bisa mengubah-ubah
  bentuk tipe data sesuai dengan yang kita mau

# Manfaat generic

- Pengecekan ketika proses kompilasi
- Tidak perlu manual menggunakan pengecekan tipe data dan konversi tipe data
- Memudahkan programmer membuat kode program yang generic sehingga bisa digunakan oleh berbagai tipe data

# Generic Class

- Generic class adalah class atau interface yang memiliki parameter type, tapi ini tidak bisa digunakan di enum
- Tidak ada ketentuan dalam pembuatan generic parameter type, namun biasanya kebanyakan orang menggunakan 1 karakter
  sebagai generic parameter type
- Nama generic parameter type yang biasa digunakan adalah:
    - E, element (biasanya digunakan di collection atau struktur data)
    - K, key
    - N, number
    - T, type
    - V, value
    - S,U,V etc. - 2nd, 3rd, 4th types

# Multiple Parameter Type

- Parameter type di Generic class boleh lebih dari satu
- Namun harus menggunakan nama type berbeda
- Ini sangat berguna ketika kita ingin membuat generic parameter type yang banyak

# Generic Method

- Generic parameter type tidak hanya bisa digunakan pada class atau interface
- Kita juga bisa menggunakan generic parameter type di method
- Generic parameter type yang kita deklarasikan di method, hanya bisa diakses di method tersebut, tidak bisa digunakan
  di luar method
- Ini cocok jika kita ingin membuat generic method, tanpa harus mengubah deklarasi class

# Invariant

- Secara default, saat kita membuat generic parameter type, sifat parameter tersebut adalah invariant
- Invariant artinya tidak boleh di subtitusikan dengan subtype (child) atau supertype (parent)
- Artinya saat kita membuat object Contoh<String>, maka tidak sama dengan Contoh<Object>, begitupun sebaliknya, saat
  membuat object Contoh<Object>, maka tidak sama dengan Contoh<String>
- Walaupun kalau dipikir-pikir kalau di Polymorphism itu kita boleh mengsubtitut dari si parent ke childnya. Tapi kalau
  di Generic itu tidak bisa

# Covariant

- Artinya adalah kita bisa melakukan subtitusi subtype (child) dengan supertype (parent)
- Cara agar generic object kita menjadi covariant adalah dengan menggunakan kata kunci (? extends ParentClass)
- Artinya saat kita membuat object Contoh<String>, maka bisa disubtitusi menjadi Contoh<? extends Object>
- Covariant adalah read-only, jadi kita tidak bisa mengubah data generic nya

# Contravariant

- Artinya adalah kita bisa melakukan subsitusi supertype (Parent) dengan subtype (Child)
- Caranya agar generic object kita menjadi contravariant adalah dengan menggunakan kata kunci (? super SubClass)
- Artinya saat kita membuat object Contoh<Object>, maka bisa disubtitusi mejadi Contoh<? super String>
- Contravariant adalah bisa write dan read, namun perlu berhati-hati ketika melakukan read, terutama jika sampai parent
  nya punya banyak child.

# Bounded Type Parameter
- Kadang kita ingin membatasi data yang boleh digunakan di generic parameter type
- Kita bisa menambahkan constraint di generic parameter type dengan menyebutkan tipe yang diperbolehkan
- Secara otomatis, type data yang bisa digunakan adalah type yang sudah kita sebutkan, atau class-class turunannya
- Secara default, constraint type untuk generic parameter type adalah Object, sehingga semua tipe data bisa digunakan

# Multiple Bounded Type Paramter
- Kadang kita ingin membatasi tipe data dengan beberapa jenis tipe data di generic parameter type
- Kita bisa menambahkan beberapa bounded type parameter dengan karakter & setelah bounded type pertama
- Jika ingin menambahkan lagi, cukup gunakan karakter & diikuti bounded type nya lagi

# Wildcard
- Kadang ada kasus kita tidak peduli dengan generic parameter type pada object
- Misal kita hanya ingin mem-print data T, tidak peduli tipe apapun
- Jika kita mengalami kasus seperti ini, kita bisa menggunakan wildcard
- Wildcard bisa dibuat dengan mengganti generic parameter type dengan karakter ?

# Type Erasure
- Ini adalah proses pengecekan generic pada saat compile time dan menghiraukan pengecekan pada saat runtime
- Type Erasure menjadikan informasi generic yang kita buat akan hilang ketika kode program kita telah di compile menjadi binary file
- Compailer akan mengubah generic parameter type menjadi tipe Object di Java

# Problem Type Erasure
- Karena informasi generic itu hilang, ketika sudah menjadi binary file
- Oleh karena itu, konversi tipe data generic akan berbahaya jika dilakukan secara tidak bijak

# Comparable
- Sebelumnya kita sudah tahu, bahawa operator perbandingan object menggunakan method equals
- Bagaimana dengan operator perbandingan lainnya? seperti kurang dari atau lebih dari?
- Operator perbandingan tersebut bisa kita lakukan, jika object kita mewariskan interface generic Comparable
- Ini banyak sekali digunakan seperti untuk proses pengurutan data misalnya

# Comparator Interface
- Jika kita ingin mengurutkan class yang kita gunakan, cukup mudah tinggal implement interface Comparable
- Namun bagaimana jika class tersebut milik orang lain? Tidak bisa kita ubah?
- Maka kita bisa menggunakan interface generic yang bernama Comparator