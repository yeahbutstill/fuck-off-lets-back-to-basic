package desktop.ifnu.bima.feel.of.java.oop;

/**
 * Hubungan HAS-A lebih sederhana penjelasanya dibanding hubungan IS-A. Hubungan HAS-A atau
 * biasa disebut dengan komposisi (composition) terjadi kalau sebuah class mempunyai sebuah
 * property. Misalnya kita bisa melihat dalam kode di atas Customer HAS-A UUID dengan nama id.
 * Kita akan membuat sebuah satu buah class lagi dengan nama Address, class ini akan digunakan
 * oleh class Customer untuk mendefnisikan alamat Customer
 */
public class Address {
    private String street;
    private String city;
    private String postCode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;

        if (getStreet() != null ? !getStreet().equals(address.getStreet()) : address.getStreet() != null) return false;
        if (getCity() != null ? !getCity().equals(address.getCity()) : address.getCity() != null) return false;
        return getPostCode() != null ? getPostCode().equals(address.getPostCode()) : address.getPostCode() == null;
    }

    @Override
    public int hashCode() {
        int result = getStreet() != null ? getStreet().hashCode() : 0;
        result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
        result = 31 * result + (getPostCode() != null ? getPostCode().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
