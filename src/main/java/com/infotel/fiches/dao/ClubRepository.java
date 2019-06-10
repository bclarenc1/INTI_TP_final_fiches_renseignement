package com.infotel.fiches.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infotel.fiches.metier.Club;

public interface ClubRepository extends JpaRepository<Club, Integer> {

}
