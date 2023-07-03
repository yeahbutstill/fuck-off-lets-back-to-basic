package desktop.ifnu.bima.oop.overridingdanoverloading;


import desktop.ifnu.bima.oop.inheritance.hasA.composition.Customer;
import java.io.Serializable;

/**
 * Method overloading adalah salah satu feature dalam bahasa pemrograman Java, dimana dua buah
 * method bisa dideklarasikan dengan nama yang sama asal argumenya berbeda, baik dari
 * jumlahnya, tipenya atau urutan dari parameternya. Berikut ini adalah method yang berbeda
 * walaupun namanya sama :
 */

public class MethodOverloading extends Customer implements Serializable {


    public void setId(Long aId) {
    }

    public void setId(Integer aId) {
    }

    public void setId(Long aId, boolean checkNull) {
    }

    public void setId(boolean checkNull, Long aId) {
    }

}
