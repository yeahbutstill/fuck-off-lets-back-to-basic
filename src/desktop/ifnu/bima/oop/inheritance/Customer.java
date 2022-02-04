package desktop.ifnu.bima.oop.inheritance;

/**
 * Hubungan antara Customer dan Address adalah HAS-A, diimplementasikan dengan membuat property di
 * dalam class Customer dengan tipe Address. Kita ubah sedikit kode dari class Customer di atas
 * menjadi seperti di bawah ini :
 */
public class Customer {
  private Long id;
  private Address address;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}

// Kode di atas memperlihatkan hubungan Customer HAS-A Address.
// Manfaat kedua dari inheritance adalah polimorfsme
