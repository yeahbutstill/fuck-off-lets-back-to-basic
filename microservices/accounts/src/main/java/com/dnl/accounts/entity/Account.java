package com.dnl.accounts.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Account extends BaseEntity {

  @Column(name = "customer_id")
  private Long customerId;

  @Id
  @Column(name = "account_number")
  private Long accountNumber;

  @NotBlank
  @NotEmpty
  @Column(name = "account_type")
  private String accountType;

  @NotBlank
  @NotEmpty
  @Column(name = "branch_address")
  private String branchAddress;
}
