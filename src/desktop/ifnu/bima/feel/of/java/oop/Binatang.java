package desktop.ifnu.bima.feel.of.java.oop;

public class Binatang extends BinatangComperator {
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
    if (!(o instanceof Binatang binatang)) return false;

    if (getId() != null ? !getId().equals(binatang.getId()) : binatang.getId() != null)
      return false;
    return getName() != null ? getName().equals(binatang.getName()) : binatang.getName() == null;
  }

  @Override
  public int hashCode() {
    int result = getId() != null ? getId().hashCode() : 0;
    result = 31 * result + (getName() != null ? getName().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Binatang{" + "id=" + id + ", name='" + name + '\'' + '}';
  }
}
