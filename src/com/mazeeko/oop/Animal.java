package com.mazeeko.oop;

public class Animal {
  private String name;
  private String type;

  public Animal() {}

  public Animal(String name, String type) {
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Animal animal)) return false;

    if (getName() != null ? !getName().equals(animal.getName()) : animal.getName() != null)
      return false;
    return getType() != null ? getType().equals(animal.getType()) : animal.getType() == null;
  }

  @Override
  public int hashCode() {
    int result = getName() != null ? getName().hashCode() : 0;
    result = 31 * result + (getType() != null ? getType().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Animal{" + "name='" + name + '\'' + ", type='" + type + '\'' + '}';
  }

  public void sayHello(String paramName) {
    System.out.println("Hello " + paramName + ", My name is " + name);
  }

  public void sayGoodBye(String paramname) {
    System.out.println("Goodbye " + paramname);
  }
}
