package desktop.ifnu.bima.feel.of.java.deklarasiclass.stackorheap;

/**
 * Program java akan berada dalam stack atau heap
 * selama daur hidupnya, instance variabel dan object selalu berada di heap sedangkan local
 * variabel berada di dalam stack.
 */
public class Person {
  /**
   * id dan nama adalah instance variabel, keduanya dideklarasikan di dalam class
   * Person.
   */
  // instance variable
  private Long id;

  // instance variable
  private String nama;

  public Long getId() {
    return id;
  }

  /**
   * Local variabel adalah variabel yang berada di dalam method, variabel ini hanya hidup selama
   * method dieksekusi, begitu program keluar dari method maka variabel ini akan diserahkan ke
   * garbage collector untuk dibersihkan. Variabel di dalam parameter method adalah salah satu
   * contoh local variabel.
   * @param id
   */
  public void setId(Long id) { // local variable id
    this.id = id;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) { // local variable nama
    this.nama = nama;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person person)) return false;

    if (getId() != null ? !getId().equals(person.getId()) : person.getId() != null) return false;
    return getNama() != null ? getNama().equals(person.getNama()) : person.getNama() == null;
  }

  @Override
  public int hashCode() {
    int result = getId() != null ? getId().hashCode() : 0;
    result = 31 * result + (getNama() != null ? getNama().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Person{" + "id=" + id + ", nama='" + nama + '\'' + '}';
  }

  /**
   * Reference variabel adalah variabel yang menunjuk ke object, seperti dani
   * dan cloneDani, keduanya juga merupakan local variabel karena di diklarasikan di dalam
   * method main.
   * @param args
   */
  public static void main(String[] args) {
    Person dani; // local variable/reference variable dani
    dani = new Person(); // object Person diinstansiasi
    dani.setId(17L);
    dani.setNama("Dani Setiawan");
    System.out.println(dani);

    Person cloneDani = dani; // local variable yang menunjuk ke object yang sama
    cloneDani.setNama("clone Dani Setiawan");
    System.out.println(cloneDani);

    System.out.println("apakah di memo yang sama dani dan cloneDani : " + dani.equals(cloneDani));
  }
}

/**
 * Reference variabel dani dan cloneDani menunjuk ke object yang sama, maka ketika
 * cloneDani mengganti nilai nama maka object yang dipegang oleh variabel dani juga akan ikut
 * terganti namanya. Analoginya misalnya begini, reference variabel itu adalah alamat, sedangkan
 * object adalah sebuah rumah. Misalnya sebuah rumah mempunyai dua alamat, yang satu alamat
 * menggunakan nama jalan satu lagi alamat menggunakan PO BOX. Kita bayangkan misalnya pak
 * pos mengirim barang ke alamat PO BOX ataupun alamat jalan, maka barang akan sampai ke
 * rumah yang sama. Begitu juga dengan instance variable dani dan cloneDani, jika satu
 * dirubah maka yang lain ikut berubah karena keduanya menunjuk ke alamat object yang sama.
 * Konsep reference ini penting untuk selalu diingat ketika bekerja dengan object, banyak sekali
 * masalah yang bisa dipecahkan hanya dengan menggunakan pemahaman tentang yang baik
 * tentang reference ini.
 */
