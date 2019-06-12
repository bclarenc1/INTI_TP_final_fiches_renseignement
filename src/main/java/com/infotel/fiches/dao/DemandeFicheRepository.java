package com.infotel.fiches.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infotel.fiches.metier.DemandeFiche;

public interface DemandeFicheRepository extends JpaRepository<DemandeFiche, Integer> {

}
