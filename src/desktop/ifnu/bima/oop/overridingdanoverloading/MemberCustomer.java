package desktop.ifnu.bima.oop.overridingdanoverloading;

import desktop.ifnu.bima.oop.inheritance.hasA.composition.Customer;

import java.io.Serializable;

/**
 * Setiap kali sebuah class mengextends class lain, class tersebut bisa mengoverride method yang ada
 * di dalam class orang tuanya. Alasanya karena di class anaknya ingin mengimplementasikan method
 * tersebut dengan cara yang berbeda. Misalnya dalam class MemberCustomer akan mengoverride method
 * setId untuk memeriksa apakah id yang dimasukkan bernilai null atau tidak, kalau nilainya null
 * maka sebuah pesan dicetak ke dalam console. Setelah pesan dicetak, method setId yang dipunyai
 * oleh orang tua dari class Customer, hal ini bisa dilakukan dengan menggunakan keyword super.
 * Contohnya adalah seperti ini :
 */
public class MemberCustomer extends Customer implements Serializable {
    public void setId(Long id) {
        if (id == null) {
            System.out.println("nilai tidak boleh null");
        } else {
            super.setId(id);
        }
    }
}

/**
 * Overriding method dilakukan dengan cara mendeklarasikan method yang sama persis denga method yang
 * ada di class orang tuanya. Deklarasi dari method harus sama persis, mulai dari access modifernya,
 * keyword yang digunakan, nama method, jumlah parameter dan letak parameter, hingga deklarasi
 * throws exception.
 * <p>
 * Method overloading adalah salah satu feature dalam bahasa pemrograman Java, dimana dua buah
 * method bisa dideklarasikan dengan nama yang sama asal argumenya berbeda, baik dari jumlahnya,
 * tipenya atau urutan dari parameternya. Berikut ini adalah method yang berbeda walaupun namanya
 * sama : public void setId(Long aId) {} public void setId(Integer aId) {} public void setId(Long
 * aId, boolean checkNull) {} public void setId(boolean checkNull,Long aId) {}
 */

/**
 * Method overloading adalah salah satu feature dalam bahasa pemrograman Java, dimana dua buah
 * method bisa dideklarasikan dengan nama yang sama asal argumenya berbeda, baik dari jumlahnya,
 * tipenya atau urutan dari parameternya. Berikut ini adalah method yang berbeda walaupun namanya
 * sama : public void setId(Long aId) {} public void setId(Integer aId) {} public void setId(Long
 * aId, boolean checkNull) {} public void setId(boolean checkNull,Long aId) {}
 */
