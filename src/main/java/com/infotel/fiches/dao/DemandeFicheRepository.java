package com.infotel.fiches.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infotel.fiches.metier.CentreLoisir;

public interface DemandeFicheRepository extends JpaRepository<CentreLoisir, Integer> {

}
