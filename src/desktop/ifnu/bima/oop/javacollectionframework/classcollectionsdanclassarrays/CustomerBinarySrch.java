package desktop.ifnu.bima.oop.javacollectionframework.classcollectionsdanclassarrays;

import java.util.Objects;

public class CustomerBinarySrch implements Comparable<CustomerBinarySrch> {

    private Long id;

    public CustomerBinarySrch() {
    }

    public CustomerBinarySrch(Long id) {
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
        CustomerBinarySrch that = (CustomerBinarySrch) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "CustomerComparable{" +
                "id=" + id +
                '}';
    }

    @Override
    public int compareTo(CustomerBinarySrch o) {
        return getId().compareTo(o.getId());
    }

    /**
     * Perbandingan dalam method compareTo di atas akan menyebabkan Customer akan diurutkan berdasarkan
     * idnya dari yang kecil ke besar. Kalau ingin diurutkan dari besar ke kecil, maka perbandinganya
     * tinggal dibalik seperti di bawah ini :
     * o.getId().compareTo(getId()); }
     */

}
