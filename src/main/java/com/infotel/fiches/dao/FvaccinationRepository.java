package com.infotel.fiches.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infotel.fiches.metier.Fvaccination;

public interface FvaccinationRepository extends JpaRepository<Fvaccination, Integer> {

}
