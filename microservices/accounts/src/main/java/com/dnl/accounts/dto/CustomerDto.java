package com.dnl.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Schema(name = "Customer", description = "Schema to hold Customer and Account information")
public class CustomerDto {

  @Schema(description = "Name of the customer", example = "DNL Bytes")
  @NotEmpty(message = "Name can not be a null or empty")
  @NotBlank
  @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30")
  private String name;

  @Schema(description = "Email address of the customer", example = "dnl@yeahbutstill.com")
  @NotEmpty(message = "Email address can not be a null or empty")
  @NotBlank
  @Email(message = "Email address should be a valid value")
  private String email;

  @Schema(description = "Mobile Number of the customer", example = "9345432123")
  @Pattern(
      regexp = "(^$|[0-9]\\+?([ -]?\\d+)+|\\(\\d+\\)([ -]\\d+))",
      message = "Mobile number must be 12 or 14 max digits")
  @NotEmpty
  @NotBlank
  @Size(min = 12, max = 14)
  private String mobileNumber;

  @Schema(description = "Account details of the Customer")
  private AccountsDto accountsDto;
}
