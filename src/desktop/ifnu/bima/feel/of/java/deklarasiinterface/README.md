Interface biasanya digunakan sebagai "kontrak" agar sebuah class yang mengimplementasikan
interface mempunyai semua method yang ada dalam interface itu, tetapi kita tidak ingin
mengekspose implementasinya. Salah satu contoh penggunaan interface adalah JDBC API. di
dalam JDBC API terdapat banyak interface seperti Connection, ResultSet, Statement,
PreparedStatement dan seterusnya. Setiap database yang ingin bisa diakses dari Java akan
mengimplementasikan JDBC API ini dengan cara membuat class yang mengimplementasikan
semua interface dalam JDBC API. Sehingga kalau kita ingin melakukan koneksi ke MySQL
ataupun ke Oracle, interfacenya sama, yang berbeda hanya implementasinya saja.
Implementasi dari JDBC API ini sering dikenal sebagai JDBC Driver. Mengenai JDBC kan kita
bahas lebih lanjut di bagian akses data ke database, sekarang kita fokuskan ke Interface.


Interface juga digunakan dalam best practice yang sering disebut dengan "code to interface",
best practice ini menganjurkan developer untuk menggunakan interface antar layer dalam
aplikasi. Misalnya contoh di atas kita membuat sebuah interface dengan nama PersonDao
untuk melakukan operasi penyimpanan object person, dengan membuat interface seperti ini
kita bisa mempunyai implementasi berbeda-beda untuk proses penyimpanan object person. Di
contoh di atas implementasi PersonDao sangat sederhana hanya menulis string ke stdout, kita
juga bisa membuat misalnya PersonDaoJdbc untuk menyimpan object person ke database
dengan menggunakan JDBC, atau bisa juga dibuat PersonDaoHibernate untuk menyimpan
object person ke database menggunakan Hibernate.