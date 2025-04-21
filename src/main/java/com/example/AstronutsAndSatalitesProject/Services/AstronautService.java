package com.example.AstronutsAndSatalitesProject.Services;

import com.example.AstronutsAndSatalitesProject.DTO.Request.AstronautRequestDto;
import com.example.AstronutsAndSatalitesProject.DTO.Request.SatelliteRequestDto;
import com.example.AstronutsAndSatalitesProject.DTO.Response.AstronautResponseDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface AstronautService {

    void addNewAstronaut(AstronautRequestDto astronautRequestDto);

    Page<AstronautResponseDto> getAllAstronauts(
            int page, int size, String sortField, String direction
    );



}
