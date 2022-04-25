package desktop.ifnu.bima.oop.javacollectionframework.sortings;

import java.util.Objects;

/**
 * Interface Comparable hanya mempunyai satu buah method, yaitu compareTo: method ini mempunyai
 * sebuah parameter yang bertipe Object kalau tidak menggunakan generics, dan bertipe sama dengan
 * class yang mengimplement interface Comparable kalau menggunakan generics. Method compareTo
 * mengembalikan integer, nilai kembalianya positif berarti object yang dipanggil method comparenya
 * lebih besar dari object yang dimasukkan ke parameter, nilai kembalianya negatif berarti
 * sebaliknya dan kalau nilainya nol berarti kedua object sama besar. Kita lihat contoh implementasi
 * interface Comparable di class Customer. Pertama, kita akan mengimplementasikan interface
 * Comparable tanpa menggunakan generics :
 */
public class Customer implements Comparable {
    private Long id;
    private String name;

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    @Override
    public int compareTo(Object o) {
        Customer c = (Customer) o;
        return getId().compareTo(c.getId());
    }
}
