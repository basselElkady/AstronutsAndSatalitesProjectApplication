package com.example.AstronutsAndSatalitesProject.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class SatelliteIsAlreadyDecomissionedException extends RuntimeException {

    public SatelliteIsAlreadyDecomissionedException(String message) {
        super(message);
    }
}
