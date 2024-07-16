package com.ms.email.core.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public record EmailDto (
        UUID userId,
        @NotBlank @Email
        String emailTo,
        @NotBlank
        String subject,
        @NotBlank
        String body
){
}
