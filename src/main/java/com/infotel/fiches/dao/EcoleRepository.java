package com.infotel.fiches.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infotel.fiches.metier.Ecole;

public interface EcoleRepository extends JpaRepository<Ecole, Integer> {

}
