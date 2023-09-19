Overriding dan Overloading

Setiap kali sebuah class mengextends class lain, class tersebut bisa mengoverride method yang
ada di dalam class orang tuanya(Super Class). Alasanya karena di class anaknya ingin
mengimplementasikan method tersebut dengan cara yang berbeda. Misalnya dalam class
MemberCustomer akan mengoverride method setId untuk memeriksa apakah id yang
dimasukkan bernilai null atau tidak, kalau nilainya null maka sebuah pesan dicetak ke dalam
console. Setelah pesan dicetak, method setId yang dipunyai oleh orang tua dari class
Customer, hal ini bisa dilakukan dengan menggunakan keyword super.
Contohnya adalah seperti ini :

```java
import java.io.Serializable;

public MemberCustomer extends Customer implements Serializable {
    public void setId(Long aId) {
        if(id == null) {
            System.out.println("nilai id tidak boleh null");
        } else {
            super.setId(aId);
        }
    }
}
```

Overriding method dilakukan dengan cara mendeklarasikan method yang sama persis denga
method yang ada di class orang tuanya. Deklarasi dari method harus sama persis, mulai dari
access modifernya, keyword yang digunakan, nama method, jumlah parameter dan letak
parameter, hingga deklarasi throws exception.

Apa yang terjadi kalau misalnya kita mendeklarasikan sebuah variabel dengan tipe Customer
tetapi diinstansiasi dengan object MemberCustomer, kemudian kita panggil method setId?
Apakah method setId yang ada dalam Customer atau MemberCustomer yang akan dieksekusi?
Method yang dioverride akan terikat dengan instance dari variabel, bukan tipe dari variabel,
jadi jawaban dari pertanyaan di atas adalah : yang dieksekusi adalah method setId dari class
MemberCustomer bukan dari class Customer.

Method overloading adalah salah satu feature dalam bahasa pemrograman Java, dimana dua buah
method bisa dideklarasikan dengan nama yang sama asal argumenya berbeda, baik dari
jumlahnya, tipenya atau urutan dari parameternya. Berikut ini adalah method yang berbeda
walaupun namanya sama :
```java
public void setId(Long aId) {}
public void setId(Integer aId) {}
public void setId(Long aId, boolean checkNull) {}
public void setId(boolean checkNull,Long aId) {}
```