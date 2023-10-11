package com.dnl.accounts.service.impl;

import com.dnl.accounts.constants.AccountsConstants;
import com.dnl.accounts.dto.AccountsDto;
import com.dnl.accounts.dto.CustomerDto;
import com.dnl.accounts.entity.Accounts;
import com.dnl.accounts.entity.Customer;
import com.dnl.accounts.exception.CustomerAlreadyExistsException;
import com.dnl.accounts.exception.ResourceNotFoundException;
import com.dnl.accounts.mapper.AccountsMapper;
import com.dnl.accounts.mapper.CustomerMapper;
import com.dnl.accounts.repository.AccountsRepository;
import com.dnl.accounts.repository.CustomerRepository;
import com.dnl.accounts.service.AccountsService;
import java.util.Optional;
import java.util.Random;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements AccountsService {

  private AccountsRepository accountsRepository;
  private CustomerRepository customerRepository;

  /**
   * @param customerDto - CustomerDto Object
   */
  @Override
  public void createAccount(CustomerDto customerDto) {
    Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
    Optional<Customer> optionalCustomer =
        customerRepository.findByMobileNumber(customerDto.getMobileNumber());
    if (optionalCustomer.isPresent()) {
      throw new CustomerAlreadyExistsException(
          "Customer already registered with given mobileNumber " + customerDto.getMobileNumber());
    }
    Customer savedCustomer = customerRepository.save(customer);
    accountsRepository.save(createNewAccount(savedCustomer));
  }

  /**
   * @param customer - Customer Object
   * @return the new account details
   */
  private Accounts createNewAccount(Customer customer) {
    Accounts newAccount = new Accounts();
    newAccount.setCustomerId(customer.getCustomerId());
    long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

    newAccount.setAccountNumber(randomAccNumber);
    newAccount.setAccountType(AccountsConstants.SAVINGS);
    newAccount.setBranchAddress(AccountsConstants.ADDRESS);
    return newAccount;
  }

  /**
   * @param mobileNumber - Input Mobile Number
   * @return Accounts Details based on a given mobileNumber
   */
  @Override
  public CustomerDto fetchAccount(String mobileNumber) {
    Customer customer =
        customerRepository
            .findByMobileNumber(mobileNumber)
            .orElseThrow(
                () -> new ResourceNotFoundException("Customer", "mobileNumber", mobileNumber));
    Accounts accounts =
        accountsRepository
            .findByCustomerId(customer.getCustomerId())
            .orElseThrow(
                () ->
                    new ResourceNotFoundException(
                        "Account", "customerId", customer.getCustomerId().toString()));
    CustomerDto customerDto = CustomerMapper.mapToCustomerDto(customer, new CustomerDto());
    customerDto.setAccountsDto(AccountsMapper.mapToAccountsDto(accounts, new AccountsDto()));
    return customerDto;
  }

  /**
   * @param customerDto - CustomerDto Object
   * @return boolean indicating if the update of Account details is successful or not
   */
  @Override
  public boolean updateAccount(CustomerDto customerDto) {
    boolean isUpdated = false;
    AccountsDto accountsDto = customerDto.getAccountsDto();
    if (accountsDto != null) {
      Accounts accounts =
          accountsRepository
              .findById(accountsDto.getAccountNumber())
              .orElseThrow(
                  () ->
                      new ResourceNotFoundException(
                          "Account", "AccountNumber", accountsDto.getAccountNumber().toString()));
      AccountsMapper.mapToAccounts(accountsDto, accounts);
      accounts = accountsRepository.save(accounts);

      Long customerId = accounts.getCustomerId();
      Customer customer =
          customerRepository
              .findById(customerId)
              .orElseThrow(
                  () ->
                      new ResourceNotFoundException(
                          "Customer", "CustomerID", customerId.toString()));
      CustomerMapper.mapToCustomer(customerDto, customer);
      customerRepository.save(customer);
      isUpdated = true;
    }
    return isUpdated;
  }

  /**
   * @param mobileNumber - Input Mobile Number
   * @return boolean indicating if the delete of Account details is successful or not
   */
  @Override
  public boolean deleteAccount(String mobileNumber) {
    Customer customer =
        customerRepository
            .findByMobileNumber(mobileNumber)
            .orElseThrow(
                () -> new ResourceNotFoundException("Customer", "mobileNumber", mobileNumber));
    accountsRepository.deleteByCustomerId(customer.getCustomerId());
    customerRepository.deleteById(customer.getCustomerId());
    return true;
  }
}
