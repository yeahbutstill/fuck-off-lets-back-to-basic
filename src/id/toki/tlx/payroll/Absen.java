package id.toki.tlx.payroll;

import java.util.Date;

public class Absen {
  private Pegawai pegawai;
  private Date datang;
  private Date pulang;

  public Absen() {}

  public Absen(Pegawai pegawai, Date datang, Date pulang) {
    this.pegawai = pegawai;
    this.datang = datang;
    this.pulang = pulang;
  }

  public Pegawai getPegawai() {
    return pegawai;
  }

  public void setPegawai(Pegawai pegawai) {
    this.pegawai = pegawai;
  }

  public Date getDatang() {
    return datang;
  }

  public void setDatang(Date datang) {
    this.datang = datang;
  }

  public Date getPulang() {
    return pulang;
  }

  public void setPulang(Date pulang) {
    this.pulang = pulang;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Absen absen)) return false;

    if (getPegawai() != null
        ? !getPegawai().equals(absen.getPegawai())
        : absen.getPegawai() != null) return false;
    if (getDatang() != null ? !getDatang().equals(absen.getDatang()) : absen.getDatang() != null)
      return false;
    return getPulang() != null ? getPulang().equals(absen.getPulang()) : absen.getPulang() == null;
  }

  @Override
  public int hashCode() {
    int result = getPegawai() != null ? getPegawai().hashCode() : 0;
    result = 31 * result + (getDatang() != null ? getDatang().hashCode() : 0);
    result = 31 * result + (getPulang() != null ? getPulang().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Absen{" + "pegawai=" + pegawai + ", datang=" + datang + ", pulang=" + pulang + '}';
  }
}
