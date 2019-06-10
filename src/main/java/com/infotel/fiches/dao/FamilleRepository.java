package com.infotel.fiches.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infotel.fiches.metier.Famille;

public interface FamilleRepository extends JpaRepository<Famille, Integer> {

}
