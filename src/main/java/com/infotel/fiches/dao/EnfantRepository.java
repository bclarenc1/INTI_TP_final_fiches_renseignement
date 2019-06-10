package com.infotel.fiches.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infotel.fiches.metier.Enfant;

public interface EnfantRepository extends JpaRepository<Enfant, Integer> {

}
