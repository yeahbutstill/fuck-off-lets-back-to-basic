package com.dnl.accounts.dto;

import com.dnl.accounts.entity.Customer;

public record CustomerDto(String name, String email, String mobileNumber) {
  public void name(String name) {
    Customer customer = new Customer();
    customer.setName(name);
  }

  public void email(String email) {
    Customer customer = new Customer();
    customer.setEmail(email);
  }

  public void mobileNumber(String mobileNumber) {
    Customer customer = new Customer();
    customer.setMobileNumber(mobileNumber);
  }
}
