package com.zamannow.oop.inner;

public class InnerApp {
    public static void main(String[] args) {
        // Membuat object Inner Class
        Company company = new Company();
        company.setName("Google");

        Company.Employee employee = company.new Employee();
        employee.setName("dnl");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
