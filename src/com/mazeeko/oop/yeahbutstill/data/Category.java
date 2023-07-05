package com.mazeeko.oop.yeahbutstill.data;

public class Category {
  // properties private sama juga encapsulation, jadi untuk ambil dan ubah menggunakan getter dan
  // setter
  private String id;
  private String name;
  private Boolean expensive;

  // no argument constructor
  public Category() {}

  // all argument constructor
  public Category(String id, String name, Boolean expensive) {
    this.id = id;
    this.name = name;
    this.expensive = expensive;
  }

  // method getters and setters for Encapsulation
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean isExpensive() {
    return expensive;
  }

  public void setExpensive(Boolean expensive) {
    this.expensive = expensive;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Category category)) return false;

    if (!getId().equals(category.getId())) return false;
    if (!getName().equals(category.getName())) return false;
    return expensive.equals(category.expensive);
  }

  @Override
  public int hashCode() {
    int result = getId().hashCode();
    result = 31 * result + getName().hashCode();
    result = 31 * result + expensive.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Category{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", expensive=" + expensive +
            '}';
  }
}
