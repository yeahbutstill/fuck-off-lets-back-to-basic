package com.dnl.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Schema(name = "ErrorResponse", description = "Schema to hold error response information")
public class ErrorResponseDto {

  @Schema(description = "API path invoked by client")
  @NotEmpty
  private String apiPath;

  @Schema(description = "Error code representing the error happened")
  @NotEmpty
  private HttpStatus errorCode;

  @Schema(description = "Error message representing the error happened")
  @NotEmpty
  private String errorMessage;

  @Schema(description = "Time representing when the error happened")
  @NotEmpty
  private LocalDateTime errorTime;
}
