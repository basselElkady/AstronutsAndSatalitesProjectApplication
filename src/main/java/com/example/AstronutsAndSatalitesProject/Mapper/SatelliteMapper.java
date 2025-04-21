package com.example.AstronutsAndSatalitesProject.Mapper;

import com.example.AstronutsAndSatalitesProject.DTO.Request.SatelliteRequestDto;
import com.example.AstronutsAndSatalitesProject.DTO.Response.SatelliteResponseDto;
import com.example.AstronutsAndSatalitesProject.modles.Satellite;
import org.springframework.stereotype.Component;

@Component
public class SatelliteMapper {

    public Satellite toSatellite(SatelliteRequestDto satelliteRequestDto) {
        return new Satellite(
                satelliteRequestDto.name(),
                satelliteRequestDto.launchDate(),
                satelliteRequestDto.orbitType(),
                satelliteRequestDto.decommissioned());
    }

    public SatelliteResponseDto toSatelliteResponseDto(Satellite satellite) {
        return new SatelliteResponseDto(
                satellite.getId(),
                satellite.getName(),
                satellite.getLaunchDate(),
                satellite.getOrbitType(),
                satellite.isDecommissioned());
    }

}
