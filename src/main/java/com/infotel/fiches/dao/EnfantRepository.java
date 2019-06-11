package com.infotel.fiches.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infotel.fiches.metier.Enfant;

public interface EnfantRepository extends JpaRepository<Enfant, Integer> {
	
	@Query("update Enfant set idResp=:a where idEnf=:b")
	public void modifierRespLegal(@Param("b")int idEnf,@Param("a") int idResp);

}
