package desktop.ifnu.bima.feel.of.java.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Binatang extends BinatangComperator implements Comparable<Binatang> {
  private Long id;
  private String name;
  private List<String> mengkonsumsi;

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

  public List<String> getMengkonsumsi() {
    return Collections.unmodifiableList(mengkonsumsi);
  }

  public void setMengkonsumsi(List<String> aMengkonsumsi) {
    this.mengkonsumsi = aMengkonsumsi;
  }

  /**
   * terlihat bahwa pada saat method getMengkonsumsi dipanggil, yang dikembalikan
   * adalah versi read only dari mengkonsumsi. Dengan begitu, properti mengkonsumsi hanya bisa dimodifkasi dari dalam
   * class Binatang dengan memanggil method addMengkonsumsi. Praktek seperti ini sangat disarankan
   * terutama ketika kita membuat kode yang banyak digunakan orang lain dan tidak ingin
   * collection yang dimanage oleh library tersebut diedit sembarangan. Pengaturan seperti ini
   * biasanya cukup ditekankan kalau aplikasi dibuat oleh banyak sekali orang, sehingga bisa
   * meminimalisasi kesalahan karena kurangnya informasi atau ketidaktahuan anggota tim lain.
   * Dengan membuat collection yang ditandai dengan read only seperti di atas, kita
   * menyampaikan informasi kepada orang lain yang mungkin menggunakan class Binatang ini
   * bahwa List mengkonsumsi tidak bisa diedit dari luar class Binatang.
   */
  public void addMengkonsumsi(List<String> mengkonsumsi) {
    if (this.mengkonsumsi == null) {
      this.mengkonsumsi = new ArrayList<>();
    }
    this.mengkonsumsi.add(mengkonsumsi.toString());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Binatang binatang)) return false;

    if (getId() != null ? !getId().equals(binatang.getId()) : binatang.getId() != null)
      return false;
    if (getName() != null ? !getName().equals(binatang.getName()) : binatang.getName() != null)
      return false;
    return getMengkonsumsi() != null
        ? getMengkonsumsi().equals(binatang.getMengkonsumsi())
        : binatang.getMengkonsumsi() == null;
  }

  @Override
  public int hashCode() {
    int result = getId() != null ? getId().hashCode() : 0;
    result = 31 * result + (getName() != null ? getName().hashCode() : 0);
    result = 31 * result + (getMengkonsumsi() != null ? getMengkonsumsi().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Binatang{"
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", mengkonsumsi="
        + mengkonsumsi
        + "} ";
  }

  @Override
  public int compareTo(Binatang o) {
    return getId().compareTo(o.getId());
  }
}
