package com.infotel.fiches.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infotel.fiches.metier.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {

	// (nickname,password) must be on one line of table login
//	@Query("select log from Login log where log.nickname=:a INTERSECT"
//		 + "select log from Login log where log.password=:b")
	@Query("select log from Login log")
	public List<Login> seConnecter(@Param("a") String nickname, @Param("b") String password);
}
