package com.infotel.fiches.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infotel.fiches.metier.Frenseignement;

public interface FrenseignementRepository extends JpaRepository<Frenseignement, Integer> {
	
	@Query("update Frenseignement set enfant_id_enf=:a where frenseignement.id_fiche=:b")
	public void attribuerFicheEnfant(@Param("b")int idFiche,@Param("a") int idEnf);

}
