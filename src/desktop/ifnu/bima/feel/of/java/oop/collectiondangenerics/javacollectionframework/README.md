Java Collection Framework

Membuat aplikasi yang cukup kompleks tanpa adanya collection yang baik akan sangat repot,
banyak hal harus dilakukan hanya untuk membuat collection yang memenuhi kebutuhan kita.
Untungnya dalam JDK terdapat banyak sekali collection yang sudah tersedia, kita hanya perlu
mempelajari API tersebut dan memahami kapan saat terbaik untuk menggunakan collection
API tersebut.

Dalam Java collection API ada beberapa interface kunci yang merupakan dasar dari collection
yang ada dalam JDK. Interface-interface itu antara lain :
- Collection
- Set
- SortedSet 
- List
- Map
- SortedMap
- Queue
- NavigableSet
- NavigableMap

Dalam buku ini kita akan membahas beberapa interface saja yang sering dibutuhkan dalam
aplikasi, antara lain: List, Set, Map dan Queue. Daftar class yang mengimplementasikan
keempat interface di atas antara lain :
- Map
- Set
- List
- Queue 
- HashMap
- HashSet
- ArrayList
- PriorityQueue 
- HashTable
- LinkedHashSet
- Vector
- TreeMap
- TreeSet
- LinkedList 
- LinkedHashMap

Setiap jenis collection di atas mempunyai empat varian : terurut (sorted), tidak terurut
(unsorted), teratur (ordered) dan tidak teratur (unordered). Collection yang terurut (sorted)
artinya isi dari collection tersebut terurut berdasarkan nilai tertentu dari objectnya, misalnya
kalau yang dimasukkan dalam collection adalah object dari Customer, kita bisa mengurutkan
berdasarkan id atau berdasarkan nilai property yang lain. Kita akan membahas lebih lanjut
bagaimana caranya melakukan sorting atau menggunakan sorted collection di bab selanjutnya.
Collection tidak terurut jelas kebalikan dari collection terurut.

Collection teratur (ordered) adalah collection yang diatur berdasarkan kapan item tersebut
dimasukkan ke dalam collection, item yang dimasukkan pertama akan berada di awal,
sedangkan item yang dimasukkan terakhir akan berada di akhir collection. Sedangkan
collection tidak teratur (unordered) jelas kebalikan dari collection teratur.

Nah mari kita bahas satu per satu dari keempat collection di atas beserta varianya, dimulai
dari List.

List adalah jenis collection yang teratur tetapi tidak terurut. List mempunyai index yang
disusun berdasarkan urutan kapan item dimasukkan ke dalam List. Isi dari List bersifat tidak
unik, alias dua buah item yang sama bisa dimasukkan berkali kali ke dalam List. Method
penting dalam List antara lain :

- get(int index); method ini digunakan untuk mengambil isi dari list berdasarkan index
  (urutan item dimasukkan ke dalam List)
- indexOf(Object o); method ini digunakan untuk mengetahui berapa nomor index dari object
  yang ada dalam List. 
- add(Object o); digunakan untuk menambahkan object ke dalam List 
- add(int index, Object o); menambahkan object ke dalam List di index tertentu

Class ArrayList adalah class yang mengimplementasikan interface List, bayangkan class ArrayList
ini adalah Array yang dapat bertambah ukuranya. Vector adalah class yang juga
mengimplementasikan List, Vector adalah pendahulu dari ArrayList, kalau tidak ada yang
menghalangi anda menggunakan ArrayList, sebaiknya hindari Vector karena performance
ArrayList lebih bagus dan classnya lebih modern.

LinkedList adalah implementasi dari List yang menambahkan method baru untuk menambahkan
atau menghapus isi dari List dari depan atau dari belakang. Class ini cocok digunakan untuk
membuat tumpukan (stack) atau antrian (queue).

terlihat bahwa index adalah bagian terpenting dari List, sedangkan item dalam List sendiri bisa
dobel, tidak unik. Selain itu item di dalam List juga tidak terurut, terlihat dari huruf “a” yang
diletakkan setelah huruf “c”.

Set

Set adalah collection yang bersifat unik. Set digunakan kalau anda memerlukan collection yang
isinya harus unik. Defnisi unik diimplementasikan dengan mengoverride method equals dan
hashCode dari class yang akan dimasukkan ke dalam Set. Semua class wrapper seperti String
telah mengoverride method equals dan hashCode sehingga dua buah object String dianggap sama
kalau string yang ada di dalamnya sama. Untuk class yang kita buat sendiri, seperti classCustomer, maka method equals dan hashCode harus dioverride dahulu sebelum dimasukkan ke
dalam Set. Kalau method equals dan hashCode tidak dioverride maka dua buah object
dianggap sama kalau keduanya merefer ke object yang sama di dalam memory, tidak seperti
yang kita harapkan.

Map

Map adalah bentuk struktur data yang berpasangan antara key-value. Key bersifat unik karena
implementasinya menggunakan Set. Key dan value adalah object, bisa object apa saja, tipe data
primitif tidak bisa dimasukkan ke dalam Map, juga tidak bisa dimasukkan ke semua jenis
collection.
Implementasi Map memberikan kemampuan untuk mencari value berdasarkan key, setiap kali
kita dihadapkan pada permasalahan bagaimana caranya melakukan pencarian berdasarkan value
kita bisa menggunakan Map ini. Map bergantung pada method equals dan hashCode untuk
menentukan apakah dua buah key sama atau tidak, jadi kalau kita ingin menggunakan object dari
class yang kita buat sendiri sebagai key, maka kedua method itu harus dioverride untuk
menentukan bagaimana dua buah object dianggap sama atau tidak.
HashMap adalah class yang mengimplementasikan interface Map, sifatnya adalah tidak terurut
dan tidak teratur. Implementasi HashMap adalah yang paling efsien, implementasi Map lainya
yang membutuhkan keterurutan atau keteraturan akan menambahkan komputasi tambahan
sehingga kurang efsien dibanding dengan HashMap. HashMap memperbolehkan satu buah key
dengan nilai null dan banyak key bukan null yang valuenya adalah null.

Method penting yang dimiliki oleh Map antara lain :
- put(Object key, Object value); method yang digunakan untuk meletakkan pasangan key dan
value
- get(Object key); method digunakan untuk mendapatkan value dari key yang dimasukkan
sebagai parameter 
- keySet(); digunakan untuk mendapatkan Set yang berisi semua key, biasanya kita ingin
mendapatkan Set dari key ini kalau ingin mengambil nilai dalam Map satu per satu

Mari kita lihat contoh kode penggunaan Map. Kita akan membuat sebuah map dimana key
adalah kota dan value adalah kumpulan Customer yang tinggal di kota tersebut. Tipe data key
adalah String dan tipe data valuenya adalah List of Customer: