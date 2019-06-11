package com.infotel.fiches.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infotel.fiches.metier.Frenseignement;

public interface FrenseignementRepository extends JpaRepository<Frenseignement, Integer> {
	
}
