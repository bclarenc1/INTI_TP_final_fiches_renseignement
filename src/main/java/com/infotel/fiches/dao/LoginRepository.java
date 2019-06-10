package com.infotel.fiches.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infotel.fiches.metier.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {

}
