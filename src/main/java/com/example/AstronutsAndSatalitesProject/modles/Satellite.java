package com.example.AstronutsAndSatalitesProject.modles;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Satellite {

    public enum OrbitType {
        LEO, MEO, GEO
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @Past(message = "Launch date must be in the past")
    private LocalDate launchDate;

    @Enumerated(EnumType.STRING)
    private OrbitType orbitType;

    private boolean decommissioned;

    @ManyToMany(mappedBy = "satellites")
    @JsonIgnore
    private List<Astronaut> astronauts;


    public Satellite(String name, LocalDate launchDate, OrbitType orbitType, boolean decommissioned) {
        this.name = name;
        this.launchDate = launchDate;
        this.orbitType = orbitType;
        this.decommissioned = decommissioned;
    }

    public Satellite(){}

    public Satellite(Long id, String name, LocalDate launchDate, OrbitType orbitType, boolean decommissioned) {
        this.id = id;
        this.name = name;
        this.launchDate = launchDate;
        this.orbitType = orbitType;
        this.decommissioned = decommissioned;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(LocalDate launchDate) {
        this.launchDate = launchDate;
    }

    public OrbitType getOrbitType() {
        return orbitType;
    }

    public void setOrbitType(OrbitType orbitType) {
        this.orbitType = orbitType;
    }

    public boolean isDecommissioned() {
        return decommissioned;
    }

    public void setDecommissioned(boolean decommissioned) {
        this.decommissioned = decommissioned;
    }

    public List<Astronaut> getAstronauts() {
        return astronauts;
    }

    public void setAstronauts(List<Astronaut> astronauts) {
        this.astronauts = astronauts;
    }
}
