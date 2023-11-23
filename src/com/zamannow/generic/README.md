# Pengenalan Generic
- Generic adalah kemampuan menambahkan parameter type saat membuat class atau method
- Berbeda dengan tipe data yang biasa kita gunakan di class, function, generic memungkinkan kita bisa mengubah-ubah bentuk tipe data sesuai dengan yang kita mau

# Manfaat generic
- Pengecekan ketika proses kompilasi
- Tidak perlu manual menggunakan pengecekan tipe data dan konversi tipe data
- Memudahkan programmer membuat kode program yang generic sehingga bisa digunakan oleh berbagai tipe data

# Generic Class
- Generic class adalah class atau interface yang memiliki parameter type, tapi ini tidak bisa digunakan di enum
- Tidak ada ketentuan dalam pembuatan generic parameter type, namun biasanya kebanyakan orang menggunakan 1 karakter sebagai generic parameter type
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