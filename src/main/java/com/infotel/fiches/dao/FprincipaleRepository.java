package com.infotel.fiches.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.fiches.metier.Fprincipale;

public interface FprincipaleRepository extends JpaRepository<Fprincipale, Integer> {
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update Frenseignement set enfant_idEnf=:a where idFiche=:b")
	public void attribuerFicheEnfant(@Param("b")int idFiche,@Param("a") int idEnf);


}
