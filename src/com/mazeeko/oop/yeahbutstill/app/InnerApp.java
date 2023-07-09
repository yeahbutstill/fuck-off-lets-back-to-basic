package com.mazeeko.oop.yeahbutstill.app;

import com.mazeeko.oop.yeahbutstill.data.Company;

public class InnerApp {
  public static void main(String[] args) {
    Company company = new Company();
    company.setName("Mazeeko");

    Company.Employee employee = company.new Employee();
    employee.setName("Sasuke");

    System.out.println(employee.getName());
    System.out.println(employee.getCompanyThisname());
    System.out.println("========================================");

    Company company2 = new Company();
    company2.setName("Belum Jadi");

    Company.Employee employee2 = company2.new Employee();
    employee2.setName("Nana");

    System.out.println(employee2.getName());
    System.out.println(employee2.getCompanyThisname());
  }
}
