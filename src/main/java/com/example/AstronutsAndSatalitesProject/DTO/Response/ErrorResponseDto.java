package com.example.AstronutsAndSatalitesProject.DTO.Response;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ErrorResponseDto(
        String apiPath,
        HttpStatus errorCode,
        String errorMessage,
        LocalDateTime timestamp
) {
}
