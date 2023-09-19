Polimorfsme mengijinkan sebuah variabel yang dideklarasikan dengan menggunakan class orang
tuanya diinstansiasi dengan object dari class anaknya. Hal ini sesuai dengan kaidah hubungan IS-
A. Nah, bagaimana kalau misalnya variabel yang sudah dideklarasikan dengan class orang tua
kemudian diinstansiasi dengan menggunakan class anaknya akan diassign lagi ke variabel lain
dengan tipe class anaknya? Hal ini bisa dilakukan dengan menggunakan casting. Sintaks casting
sudah kita pelajari sedikit di bab tipe data primitif, kita akan ulang sedikit di bab ini untuk tipe
data reference.


Interface sudah dibahas sedikit di dalam bab deklarasi interface. Dalam bab ini akan kita bahas
lebih lanjut tentang atura-aturan mengimplementasikan interface. Ketika kita mendeklarasikan
class yang mengimplementasikan interface, sebenarnya kita sudah menandatangani kontrak
untuk mengimplementasikan semua method di dalam interface.

Ada satu cara yang bisa dilakukan jika kita tidak ingin mengimplementasikan semua method
yang ada dalam interface, yaitu dengan menambahkan keyword abstract dalam deklarasi class
serta mendeklarasikan method yang tidak ingin diimplementasikan menggunakan keyword
abstract

Pada dasarnya interface itu adalah sebuah class yang dideklarasikan dengan keyword abstract
dan semua methodnya bersifat public abstract.

Interface PersonDao statusnya setara dengan
class AbstractClassPersonDao