package com.yeahbutstill.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer", example = "Evil Bank"
    )
    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30")
    private String name;

    @Schema(
            description = "Email address of the customer", example = "gojo@evilbank.com"
    )
    @NotEmpty(message = "Email address can not be a null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Schema(
            description = "Mobile Number of the customer", example = "0878123123"
    )
    @Pattern(regexp = "(^\\d{10,13}$)", message = "Mobile number must be 10 or 13 max digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of the Customer"
    )
    private AccountsDto accountsDto;
}
