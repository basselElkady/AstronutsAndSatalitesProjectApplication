package com.example.AstronutsAndSatalitesProject.Services.Imp;

import com.example.AstronutsAndSatalitesProject.DTO.Request.SatelliteRequestDto;
import com.example.AstronutsAndSatalitesProject.DTO.Response.SatelliteResponseDto;
import com.example.AstronutsAndSatalitesProject.Exceptions.SatelliteIsAlreadyDecomissionedException;
import com.example.AstronutsAndSatalitesProject.Exceptions.SatelliteNotFoundWithId;
import com.example.AstronutsAndSatalitesProject.Mapper.SatelliteMapper;
import com.example.AstronutsAndSatalitesProject.Repository.SatelliteRepository;
import com.example.AstronutsAndSatalitesProject.Services.SatelliteService;
import com.example.AstronutsAndSatalitesProject.modles.Satellite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SatelliteServiceImp implements SatelliteService {

    private final SatelliteRepository satelliteRepository;
    private final SatelliteMapper satelliteMapper;

    @Autowired
    public SatelliteServiceImp(SatelliteRepository satelliteRepository, SatelliteMapper satelliteMapper) {
        this.satelliteRepository = satelliteRepository;
        this.satelliteMapper = satelliteMapper;
    }

    @Override
    public void addNewSatellite(SatelliteRequestDto satelliteRequestDto) {

        Satellite satellite = satelliteMapper.toSatellite(satelliteRequestDto);
        satelliteRepository.save(satellite);

    }

    @Override
    public void updateSatellite(SatelliteResponseDto satelliteResponseDto) {

        Satellite satellite = satelliteRepository.findById(satelliteResponseDto.id()).
                orElseThrow(() -> new SatelliteNotFoundWithId("Satellite not found."));
        if(satellite.isDecommissioned())
            throw new SatelliteIsAlreadyDecomissionedException("Satellite is already decommissioned.");
        if(satelliteResponseDto.name() != null)
            satellite.setName(satelliteResponseDto.name());
        if(satelliteResponseDto.launchDate() != null)
            satellite.setLaunchDate(satelliteResponseDto.launchDate());
        if(satelliteResponseDto.orbitType() != null)
            satellite.setOrbitType(satelliteResponseDto.orbitType());

        satelliteRepository.save(satellite);

    }

    // we may add function here to add astronaut to satellite but it is not required


}
