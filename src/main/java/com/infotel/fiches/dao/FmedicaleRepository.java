package com.infotel.fiches.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infotel.fiches.metier.Fmedicale;

public interface FmedicaleRepository extends JpaRepository<Fmedicale, Integer> {

}
