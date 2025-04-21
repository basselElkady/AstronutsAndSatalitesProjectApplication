package com.example.AstronutsAndSatalitesProject.DTO.Response;

import java.util.List;

public record AstronautResponseDto(
        Long id,
        String firstName,
        String lastName,
        int experienceYears,
        List<SatelliteResponseDto> satelliteIds
) {
}
