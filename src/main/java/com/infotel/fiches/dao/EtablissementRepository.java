package com.infotel.fiches.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infotel.fiches.metier.Etablissement;

public interface EtablissementRepository extends JpaRepository<Etablissement, Integer> {

}
