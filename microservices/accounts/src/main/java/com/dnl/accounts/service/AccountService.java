package com.dnl.accounts.service;

import com.dnl.accounts.dto.CustomerDto;

public interface AccountService {
  void createAccount(CustomerDto customerDto);
}
