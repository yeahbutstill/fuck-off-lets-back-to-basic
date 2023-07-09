package com.mazeeko.oop.yeahbutstill.data;

// outher class
public class Company {
  private String name;

  public Company() {}

  public Company(String name) {
    this.name = name;
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
    if (!(o instanceof Company company)) return false;

    return getName().equals(company.getName());
  }

  @Override
  public int hashCode() {
    return getName().hashCode();
  }

  @Override
  public String toString() {
    return "Company{" + "name='" + name + '\'' + '}';
  }

  // inner class
  public class Employee {
    private String name;

    public Employee() {}

    public Employee(String name) {
      this.name = name;
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
      if (!(o instanceof Employee employee)) return false;

      return getName().equals(employee.getName());
    }

    @Override
    public int hashCode() {
      return getName().hashCode();
    }

    @Override
    public String toString() {
      return "Employee{" + "name='" + name + '\'' + '}';
    }
  }
}
