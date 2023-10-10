package com.dnl.accounts.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Customer extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
  @GenericGenerator(name = "native")
  @Column(name = "customer_id")
  private Long customerId;

  @NotBlank @NotEmpty private String name;

  @NotBlank @NotEmpty @Email private String email;

  @NotBlank
  @NotEmpty
  @Column(name = "mobile_number")
  private String mobileNumber;
}
