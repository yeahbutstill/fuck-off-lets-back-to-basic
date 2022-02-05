package desktop.ifnu.bima.oop.collectiondangeneric.tostring;

public class Customer {
  private Long id;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Customer other = (Customer) obj;
    if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  public int hashCode() {
    int hash = 7;
    hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
    return hash;
  }
}
