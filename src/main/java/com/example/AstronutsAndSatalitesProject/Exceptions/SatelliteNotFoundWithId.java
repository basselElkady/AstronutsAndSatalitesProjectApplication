package com.example.AstronutsAndSatalitesProject.Exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = org.springframework.http.HttpStatus.NOT_FOUND)
public class SatelliteNotFoundWithId extends RuntimeException{
    public SatelliteNotFoundWithId(String message) {
        super(message);
    }
}
