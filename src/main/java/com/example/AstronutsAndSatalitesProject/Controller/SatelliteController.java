package com.example.AstronutsAndSatalitesProject.Controller;

import com.example.AstronutsAndSatalitesProject.DTO.Request.SatelliteRequestDto;
import com.example.AstronutsAndSatalitesProject.DTO.Response.SatelliteResponseDto;
import com.example.AstronutsAndSatalitesProject.Services.SatelliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/satellites")
public class SatelliteController {

    private final SatelliteService satelliteService;

    @Autowired
    public SatelliteController(SatelliteService satelliteService) {
        this.satelliteService = satelliteService;
    }

    @PostMapping
    public ResponseEntity<Void> addNewSatellite(@RequestBody SatelliteRequestDto satelliteRequestDto) {
        try {
            satelliteService.addNewSatellite(satelliteRequestDto);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping()
    public ResponseEntity<Void> updateSatellite(
            @RequestBody SatelliteResponseDto satelliteResponseDto) {

            satelliteService.updateSatellite(satelliteResponseDto);
            return ResponseEntity.ok().build();
    }
}