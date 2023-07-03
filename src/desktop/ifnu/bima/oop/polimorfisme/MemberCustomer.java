package desktop.ifnu.bima.oop.polimorfisme;

import desktop.ifnu.bima.oop.inheritance.hasA.composition.Customer;
import java.io.Serializable;

public class MemberCustomer extends Customer implements Serializable {
    public static void main(String[] args) {
        Serializable s = new MemberCustomer();

        if (s instanceof Object) {
            System.out.println("ini object");
        } else {
            System.out.println("bukan object");
        }

        Object o = new MemberCustomer();
        Customer c = new MemberCustomer();
        MemberCustomer mc = new MemberCustomer();
        Object object = mc;
        Customer cust = mc;
    }
}

/**
 * Jadi MemberCustomer mempunyai banyak bentuk (polimorfsme). Kita akan sering melihat kode dengan
 * pola seperti ini, variabel akan dideklarasikan dengan tipe interface tetapi diinstansiasi dengan
 * class yang mengimplementasikan interface tersebut. Praktek seperti ini dikategorikan sebagai
 * praktek yang baik sehingga banyak diikuti oleh developer Java.
 */
