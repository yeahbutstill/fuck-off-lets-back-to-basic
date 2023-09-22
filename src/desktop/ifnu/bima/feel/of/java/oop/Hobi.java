package desktop.ifnu.bima.feel.of.java.oop;

public class Hobi implements Comparable<Hobi> {
  private Long id;
  private String name;

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
    if (!(o instanceof Hobi hobi)) return false;

    if (getId() != null ? !getId().equals(hobi.getId()) : hobi.getId() != null) return false;
    return getName() != null ? getName().equals(hobi.getName()) : hobi.getName() == null;
  }

  @Override
  public int hashCode() {
    int result = getId() != null ? getId().hashCode() : 0;
    result = 31 * result + (getName() != null ? getName().hashCode() : 0);
    return result;
  }

  @Override
  public int compareTo(Hobi h) {
    // dari yang kecil ke besar
    return getId().compareTo(h.getId());
    // kalau ingin di urutkan dari besar ke kecil, maka perbandingan tingaal dibalik
    // h.getId().compareto(getId())
  }
}
