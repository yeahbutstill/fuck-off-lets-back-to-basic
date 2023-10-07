package com.zamannow.oop.inner;

public class InnerApp {
  public static void main(String[] args) {
    Company company = new Company();
    company.setName("dnl");
    System.out.println(company.getName());

    Company.Employee employee = company.new Employee();
    employee.setName("wn");
    System.out.println(employee.getName());
  }
}
