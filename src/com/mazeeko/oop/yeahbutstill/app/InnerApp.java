package com.mazeeko.oop.yeahbutstill.app;

import com.mazeeko.oop.yeahbutstill.data.Company;

public class InnerApp {
  public static void main(String[] args) {
    Company company = new Company();
    company.setName("Mazeeko");
    System.out.println(company.getName());

    Company.Employee employee = company.new Employee();
    employee.setName("Sasuke");
    System.out.println(employee.getName());
  }
}
