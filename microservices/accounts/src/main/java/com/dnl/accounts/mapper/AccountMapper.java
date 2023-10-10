package com.dnl.accounts.mapper;

import com.dnl.accounts.dto.AccountDto;
import com.dnl.accounts.entity.Account;

public class AccountMapper {
  public static AccountDto mapToAccountDto(AccountDto accountDto, Account account) {
    accountDto.accountNumber(account.getAccountNumber());
    accountDto.accountType(account.getAccountType());
    accountDto.branchAddress(account.getBranchAddress());
    return accountDto;
  }

  public static Account mapToAccount(Account account, AccountDto accountDto) {
    account.setAccountNumber(accountDto.accountNumber());
    account.setAccountType(accountDto.accountType());
    account.setBranchAddress(accountDto.branchAddress());
    return account;
  }
}
