package com.example.AstronutsAndSatalitesProject.Repository;

import com.example.AstronutsAndSatalitesProject.modles.Astronaut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AstronautRepository extends JpaRepository<Astronaut, Long> {

}
