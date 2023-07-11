package com.mazeeko.oop.yeahbutstill.data;

import com.mazeeko.oop.yeahbutstill.enumrate.Level;

public class Customer {
  private String name;
  private Level level;

  public Customer() {}

  public Customer(String name, Level level) {
    this.name = name;
    this.level = level;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Level getLevel() {
    return level;
  }

  public void setLevel(Level level) {
    this.level = level;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Customer customer)) return false;

    if (!name.equals(customer.name)) return false;
    return level == customer.level;
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + level.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Customer{" + "name='" + name + '\'' + ", level=" + level + '}';
  }
}
