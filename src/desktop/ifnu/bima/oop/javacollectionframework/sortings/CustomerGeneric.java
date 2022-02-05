package desktop.ifnu.bima.oop.javacollectionframework.sortings;

/**
 * Kalau menggunakan generics maka method compareTo tipe parameternya adalah Customer, bukan Object.
 * Contohnya :
 */
import java.util.Objects;

public class CustomerGeneric implements Comparable<CustomerGeneric> {
  private Long id;

  public CustomerGeneric(Long id) {
    this.id = id;
  }

  public CustomerGeneric() {}

  public void seId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerGeneric that = (CustomerGeneric) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
    return hash;
  }

  @Override
  public String toString() {
    return "CustomerGeneric{" + "id=" + id + '}';
  }

  @Override
  public int compareTo(CustomerGeneric c) {
    return getId().compareTo(c.getId());
  }
}

/**
 * Perbandingan dalam method compareTo di atas akan menyebabkan Customer akan diurutkan berdasarkan
 * idnya dari yang kecil ke besar. Kalau ingin diurutkan dari besar ke kecil, maka perbandinganya
 * tinggal dibalik seperti di bawah ini : public int compareTo(Customer c) { return
 * c.getId().compareTo(getId()); }
 */
