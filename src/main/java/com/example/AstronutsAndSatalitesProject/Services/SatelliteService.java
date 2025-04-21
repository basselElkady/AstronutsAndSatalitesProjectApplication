package com.example.AstronutsAndSatalitesProject.Services;

import com.example.AstronutsAndSatalitesProject.DTO.Request.SatelliteRequestDto;
import com.example.AstronutsAndSatalitesProject.DTO.Response.SatelliteResponseDto;

public interface SatelliteService {

    void addNewSatellite(SatelliteRequestDto satelliteRequestDto);

    void updateSatellite(SatelliteResponseDto satelliteResponseDto);

}
