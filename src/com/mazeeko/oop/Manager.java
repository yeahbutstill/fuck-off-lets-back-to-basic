package com.mazeeko.oop;

public class Manager {
  private String name;
  private String age;

  public Manager() {}

  public Manager(String name, String age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Manager manager)) return false;

    if (!getName().equals(manager.getName())) return false;
    return getAge().equals(manager.getAge());
  }

  @Override
  public int hashCode() {
    int result = getName().hashCode();
    result = 31 * result + getAge().hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Manager{" + "name='" + name + '\'' + ", age='" + age + '\'' + '}';
  }

  public void sayHello(String name) {
    System.out.println("Hello " + name + ", My name is " + this.name + " As Manager");
  }
}
