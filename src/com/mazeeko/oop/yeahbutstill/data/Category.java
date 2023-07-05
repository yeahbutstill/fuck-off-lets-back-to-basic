package com.mazeeko.oop.yeahbutstill.data;

public class Category {
  // properties private sama juga encapsulation, jadi untuk ambil dan ubah menggunakan getter dan setter
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
}
