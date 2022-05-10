# I/O

Input Output adalah topik yang sangat penting dalam aplikasi apapun, membaca atau menulis
fle merupakan rutin yang sering ada dalam aplikasi. I/O juga meliputi komunikasi dengan
aplikasi lain yang ada dalam jaringan melalui komunikasi socket.

# File

File adalah class yang merepresentasikan fle dan folder yang ada di dalam fle system, baik
yang ada di hardisk lokal atau ada di dalam mesin lain yang diakses dari fle sharing system.
Dengan menggunakan Class ini kita bisa ini kita bisa melakukan :

• mengecek sebuah path apakah berupa fle ataukah folder

• membuat, merename atau menghapus fle dan folder

• mengecek apakah folder atau fle tersebut ada dalam flesystem

• mengambil daftar isi dari folder.

# Reader

Class-class yang mengextends class Reader biasa digunakan kalau ingin membaca karakter
stream, artinya kalau yang dibaca adalah fle maka fle tersebut berisi text. Ada beberapa fle
yang menextends class Reader ini, tapi kita hanya akan membahas class BufferedReader untuk
membaca fle text.
BufferedReader akan menyimpan data yang sudah dibaca ke dalam memory, sehingga ketika
method read atau readLine dipanggil dan data sudah ada dalam memory, BufferedReader tidak
akan membaca lagi dari dalam fle.

# InputStream

InputStream digunakan untuk membaca dari I/O yang berupa byte stream, semua data
direpresentasikan dalam byte, jadi baik data berupa text maupun binary dapat dibaca
menggunakan InputStream.

Class yang mengextends InputStream cukup banyak, karena InputStream ini adalah dasar dari
IO di java. Semua sumber input output rata-rata bisa diakses menggunakan InputStream ini.
Kita sayangnya tidak akan membahas panjang lebar mengenai InputStream ini, yang kita
bahas hanya sedikit pengenalan bagaimana menggunakan InputStream.

Penggunaan InputStream yang pertama adalah membaca fle binary, sering kali kita
dihadapkan dengan upload fle dari user ke server, nah proses upload fle ini mau tidak mau
akan melibatkan InputStream intuk membaca fle yang dikirim ke server.

Mari kita lihat struktur kode untuk membaca fle byte per byte :

```java
InputStream is=new FileInputStream("file.txt");
        int byteRead;
        do{
        byteRead=is.read();
//lakukan sesuatu dengan datanya
        }while(byteRead!=-1);
```

# OutputStream

OutputStream tentu saja adalah kebalikan dari InputStream, fungsi OutputStream adalahmenulis data ke sumber data, baik
itu data dari flesystem ataupun dari koneksi socket.

# ImageIO

ImageIO adalah class yang berisi utility untuk bekerja dengan gambar. Ada beberapa class di
dalam java yang merepresentasikan gambar, antara lain Icon, ImageIcon, Image dan
BufferedImage.

Icon adalah interface yang digunakan untuk menampilkan gambar dalam komponen Swing,
misalnya membuat background atau membuat icon. Image adalah class untuk merepresentasikan
sebuah gambar dalam memory java, kita bisa mengambil lebar dan tinggi serta ukuran dari
gambar menggunakan class Image ini. ImageIcon adalah implementasi Icon yang diperoleh dari
sebuah Image. Sedangkan BufferedImage adalah class yang digunakan untuk memanipulasi
Image, misalnya melakukan resize atau menampilkan gambar yang bisa dicampur dengan
bentuk-bentuk lain (seperti lingkaran atau persegi panjang) untuk kemudian disimpan menjadi
gambar baru atau ditampilkan dalam canvas.

ImageIO memudahkan konversi dari satu class menjadi class lain, nah mari kita lihat bagaimana
penggunaanya dalam kode. Contoh kode pertama adalah membaca fle gambar dari internet,
kemudian disimpan dalam fle kemudian ditampilkan.

# Socket

Socket adalah satu ujung dari komunikasi dua arah antara dua buah aplikasi yang berjalan di
lingkungan jaringan. Class Socket digunakan untuk merepresentasikan koneksi antara apliksi
client dan server. Package java.net menyediakan dua buah class : Socket dan ServerSocket
yang mengimplementasikan client dan server.

Kita sudah sedikit melihat bagaimana socket beraksi, yaitu pada saat menggunakan
URLConnection di bab sebelumnya untuk mengambil isi halaman yahoo.com, di dalam class
URLConnection terdapat implementasi socket client untuk menghubungi yahoo.com dan
mengambil halamanya lewat protokol HTTP.

Socket adalah jantung dari aplikasi network, setiap kali kita menghubungi aplikasi yang
berada di server / workstation berbeda kita harus menggunakan socket ini, seperti koneksi ke
database, koneksi ke server three tier dan sebagainya.

Komunikasi socket harus menggunakan protokol tertentu untuk mengatur bagaimana
mekanisme komunikasi antara dua buah workstation. Protokol bisa dianalogikan dalam proses
komunikasi dua orang manusia, kalau ingin berkomunikasi kita harus memanggil orang
tersebut untuk mendapatkan perhatianya, kemudian menunggu apakah orang ini bersedia
berkomunikasi dengan kita atau tidak, setelah keduanya sepakat berkomunikasi maka wajah
dan mata saling berhadapan untuk menandakan bahwa proses komunikasi bisa dilanjutkan,
setelah itu percakapan terjadi hingga keduanya sepakat untuk mengakhiri percakapan dan
saling memalingkan muka.

Protokol yang akan kita gunakan dalam contoh kita kali ini adalai TCP (Transmission Control
Protocol) yang sangat terkenal. Protokol ini menyediakan mekanisme komunikasi point-to-point
yang biasa digunakan dalam arsitektur client-server. Internet yang menggunakan protokol
HTTP untuk menampilkan halaman web juga menggunakan protokol TCP sebagai mekanisme
transfer data antara client (browser) dan server (webserver, website).

Contoh aplikasi yang akan kita buat sangat sederhana, yaitu aplikasi ping-pong. Server akan
berjalan terlebih dahulu, membuka port tertentu dan menunggu client mengirim data ping,
setelah ping diterima maka server akan mengirim balik data pong untuk diterima client.
Kode server sangat sederhana, langkah-langkah yang harus dilakukan oleh server adalah sebagai berikut :

1. Membuka ServerSocket
2. Berusaha menerima client
3. membuat reader dan writer untuk menerima dan mengirim data ke client
4. dalam sebuah loop akan membaca data yang dikirim client
5. Kalau ada data yang dikirim client segera membalas dengan mengirim Pong ke client

