package com.dnl.accounts.dto;

import com.dnl.accounts.entity.Account;

public record AccountDto(Long accountNumber, String accountType, String branchAddress) {
  public void accountNumber(Long accountNumber) {
    Account account = new Account();
    account.setAccountNumber(accountNumber);
  }

  public void accountType(String accountType) {
    Account account = new Account();
    account.setAccountType(accountType);
  }

  public void branchAddress(String branchAddress) {
    Account account = new Account();
    account.setBranchAddress(branchAddress);
  }
}
