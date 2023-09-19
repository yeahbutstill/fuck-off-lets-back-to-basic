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

