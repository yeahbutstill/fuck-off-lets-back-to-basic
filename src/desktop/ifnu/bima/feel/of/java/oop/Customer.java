package desktop.ifnu.bima.feel.of.java.oop;

import java.util.UUID;

/**
 * Apa tujuan dari inheritance dilihat dari sisi kode? Yang pertama adalah mempromosikan code
 * reuse, yaitu penggunaan kembali kode yang sudah ditulis. Hal ini dikarenakan, sebagai
 * turunan dari Customer, MemberCustomer akan mempunyai semua sifat-sifat (kode) dari class
 * Customer. Misalnya kita tambahkan property dan method di
 * dalam class Customer :
 */
public class Customer {
    private UUID id;
    private String nama;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
