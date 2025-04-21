package com.example.AstronutsAndSatalitesProject.DTO.Request;

import com.example.AstronutsAndSatalitesProject.modles.Satellite;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public record SatelliteRequestDto(
        @NotBlank(message = "Name is required")
        String name,

        @Past(message = "Launch date must be in the past")
        LocalDate launchDate,

        @NotNull(message = "Orbit type is required")
        Satellite.OrbitType orbitType,

        boolean decommissioned
) {
}
