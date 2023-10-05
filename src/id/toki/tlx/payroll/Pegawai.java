package id.toki.tlx.payroll;

import java.math.BigDecimal;

public class Pegawai {
  private String nomer;
  private String nama;
  private BigDecimal gaji;
  private BigDecimal denda;
  private BigDecimal lembur;
  private BigDecimal transport;

  public Pegawai(
      String nomer,
      String nama,
      BigDecimal gaji,
      BigDecimal denda,
      BigDecimal lembur,
      BigDecimal transport) {
    this.nomer = nomer;
    this.nama = nama;
    this.gaji = gaji;
    this.denda = denda;
    this.lembur = lembur;
    this.transport = transport;
  }

  public Pegawai() {}

  public String getNomer() {
    return nomer;
  }

  public void setNomer(String nomer) {
    this.nomer = nomer;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public BigDecimal getGaji() {
    return gaji;
  }

  public void setGaji(BigDecimal gaji) {
    this.gaji = gaji;
  }

  public BigDecimal getDenda() {
    return denda;
  }

  public void setDenda(BigDecimal denda) {
    this.denda = denda;
  }

  public BigDecimal getLembur() {
    return lembur;
  }

  public void setLembur(BigDecimal lembur) {
    this.lembur = lembur;
  }

  public BigDecimal getTransport() {
    return transport;
  }

  public void setTransport(BigDecimal transport) {
    this.transport = transport;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Pegawai pegawai)) return false;

    if (getNomer() != null ? !getNomer().equals(pegawai.getNomer()) : pegawai.getNomer() != null)
      return false;
    if (getNama() != null ? !getNama().equals(pegawai.getNama()) : pegawai.getNama() != null)
      return false;
    if (getGaji() != null ? !getGaji().equals(pegawai.getGaji()) : pegawai.getGaji() != null)
      return false;
    if (getDenda() != null ? !getDenda().equals(pegawai.getDenda()) : pegawai.getDenda() != null)
      return false;
    if (getLembur() != null
        ? !getLembur().equals(pegawai.getLembur())
        : pegawai.getLembur() != null) return false;
    return getTransport() != null
        ? getTransport().equals(pegawai.getTransport())
        : pegawai.getTransport() == null;
  }

  @Override
  public int hashCode() {
    int result = getNomer() != null ? getNomer().hashCode() : 0;
    result = 31 * result + (getNama() != null ? getNama().hashCode() : 0);
    result = 31 * result + (getGaji() != null ? getGaji().hashCode() : 0);
    result = 31 * result + (getDenda() != null ? getDenda().hashCode() : 0);
    result = 31 * result + (getLembur() != null ? getLembur().hashCode() : 0);
    result = 31 * result + (getTransport() != null ? getTransport().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Pegawai{"
        + "nomer='"
        + nomer
        + '\''
        + ", nama='"
        + nama
        + '\''
        + ", gaji="
        + gaji
        + ", denda="
        + denda
        + ", lembur="
        + lembur
        + ", transport="
        + transport
        + '}';
  }
}
