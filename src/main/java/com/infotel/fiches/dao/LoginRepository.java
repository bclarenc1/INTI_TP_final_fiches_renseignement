package com.infotel.fiches.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.fiches.metier.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {

	// (nickname,password) must be on one line of table login
//	@Query("select log from Login log where log.nickname=:a INTERSECT"
//		 + "select log from Login log where log.password=:b")
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("select log from Login log")
	public List<Login> seConnecter(@Param("a") String nickname, @Param("b") String password);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update Login set idResp=:a where idLogin=:b")
	public void senregistrerResp(@Param("b")int idLogin,@Param("a") int idResp);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update Login set idEta=:a where idLogin=:b")
	public void senregistrerEta(@Param("b")int idLogin,@Param("a") int idEta);
}
