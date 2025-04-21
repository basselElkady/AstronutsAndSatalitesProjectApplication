package com.example.AstronutsAndSatalitesProject.DTO.Response;

import com.example.AstronutsAndSatalitesProject.modles.Satellite;

import java.time.LocalDate;

public record SatelliteResponseDto(
        Long id,
        String name,
        LocalDate launchDate,
        Satellite.OrbitType orbitType,
        boolean decommissioned
) {
}
