package desktop.ifnu.bima.feel.of.java.oop;

public class MakananComparable implements Comparable<Makanan> {
  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof MakananComparable that)) return false;

    return getId() != null ? getId().equals(that.getId()) : that.getId() == null;
  }

  @Override
  public int hashCode() {
    return getId() != null ? getId().hashCode() : 0;
  }

  @Override
  public int compareTo(Makanan o) {
    return getId().compareTo(o.getId());
  }
}
