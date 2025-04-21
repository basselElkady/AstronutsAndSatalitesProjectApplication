package com.example.AstronutsAndSatalitesProject.DTO.Request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AstronautRequestDto(
        @NotBlank(message = "First name is required")
        @Size(min = 2, max = 20, message = "First name must be between 2 and 20 characters")
        String firstName,

        @NotBlank(message = "Last name is required")
        @Size(min = 2, max = 20, message = "Last name must be between 2 and 20 characters")
        String lastName,

        @Min(value = 0, message = "Experience years cannot be less than 0")
        @Max(value = 50, message = "Experience years cannot be more than 50")
        int experienceYears
) {
}
