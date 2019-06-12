package com.infotel.fiches.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.fiches.metier.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {

	@Transactional
	@Modifying(clearAutomatically = true)
	// (nickname,password) must be on one line of table login
	//	@Query(value="select log from login log where log.nickname=:a INTERSECT"
	//		       + "select log from login log where log.password=:b", nativeQuery=true)
	@Query(value="select * from login log where log.nickname=:a and log.password=:b", nativeQuery=true)
	public List<Login> seConnecter(@Param("a") String nickname, @Param("b") String password);

}
