package com.dnl.accounts.mapper;

import com.dnl.accounts.dto.CustomerDto;
import com.dnl.accounts.entity.Customer;

public class CustomerMapper {
  public static CustomerDto mapToCustomerDto(CustomerDto customerDto, Customer customer) {
    customerDto.name(customer.getName());
    customerDto.email(customer.getEmail());
    customerDto.mobileNumber(customer.getMobileNumber());
    return customerDto;
  }

  public static Customer mapToCustomer(Customer customer, CustomerDto customerDto) {
    customer.setName(customerDto.name());
    customer.setEmail(customerDto.email());
    customer.setMobileNumber(customerDto.mobileNumber());
    return customer;
  }
}
