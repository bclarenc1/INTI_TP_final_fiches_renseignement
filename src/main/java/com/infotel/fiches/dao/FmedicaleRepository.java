package com.infotel.fiches.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.fiches.metier.Fmedicale;

public interface FmedicaleRepository extends JpaRepository<Fmedicale, Integer> {
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("Select Frenseignement from Frenseignement")
	public void attribuerFicheEnfant(@Param("b")int idFiche,@Param("a") int idEnf);

//@Query("update Frenseignement set enfant_id_enf=:a where frenseignement.id_fiche=:b")
//public void attribuerFicheEnfant(@Param("b")int idFiche,@Param("a") int idEnf);


}
