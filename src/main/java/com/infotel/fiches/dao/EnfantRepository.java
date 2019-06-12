package com.infotel.fiches.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.fiches.metier.Enfant;

public interface EnfantRepository extends JpaRepository<Enfant, Integer> {
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update Enfant set idResp=:a where idEnf=:b")
	public void modifierRespLegal(@Param("b")int idEnf,@Param("a") int idResp);

}
