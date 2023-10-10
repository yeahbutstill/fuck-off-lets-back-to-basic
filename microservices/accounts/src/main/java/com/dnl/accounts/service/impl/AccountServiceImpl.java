package com.dnl.accounts.service.impl;

import com.dnl.accounts.constant.AccountConstan;
import com.dnl.accounts.dto.CustomerDto;
import com.dnl.accounts.entity.Account;
import com.dnl.accounts.entity.Customer;
import com.dnl.accounts.exception.CustomerAlreadyExistsException;
import com.dnl.accounts.mapper.CustomerMapper;
import com.dnl.accounts.repository.AccountRepository;
import com.dnl.accounts.repository.CustomerRepository;
import com.dnl.accounts.service.AccountService;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.random.RandomGenerator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

  private final AccountRepository accountRepository;
  private final CustomerRepository customerRepository;

  @Override
  public void createAccount(CustomerDto customerDto) {
    Customer customer = CustomerMapper.mapToCustomer(new Customer(), customerDto);
    Optional<Customer> byMobileNumber =
        customerRepository.findByMobileNumber(customerDto.mobileNumber());
    if (byMobileNumber.isPresent())
      throw new CustomerAlreadyExistsException(
          "Customer already register with given mobile number: " + customerDto.mobileNumber());
    customer.setCreatedAt(LocalDateTime.now());
    customer.setCreatedBy(customer.getName());
    Customer saveCustomer = customerRepository.save(customer);
    accountRepository.save(createNewAccount(saveCustomer));
  }

  private Account createNewAccount(Customer customer) {
    Account account = new Account();
    account.setCustomerId(customer.getCustomerId());
    Long randomAccNumber = RandomGenerator.getDefault().nextLong(1000000000L, 9000000000L);

    account.setAccountNumber(randomAccNumber);
    account.setAccountType(AccountConstan.SAVINGS);
    account.setBranchAddress(AccountConstan.ADDRESS);
    customer.setCreatedAt(LocalDateTime.now());
    customer.setCreatedBy(customer.getName());
    return account;
  }
}
