package com.infotel.fiches.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infotel.fiches.metier.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {

	// (nickname,password) must be on one line of table login
	@Query("select login from Login where login.nickname=:a INTERSECT select login from Login where login.password=:b")
	public boolean seConnecter(@Param("a") String nickname, @Param("b") String password);
}
