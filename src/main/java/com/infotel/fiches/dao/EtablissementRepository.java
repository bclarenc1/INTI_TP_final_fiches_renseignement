package com.infotel.fiches.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.fiches.metier.Etablissement;

public interface EtablissementRepository extends JpaRepository<Etablissement, Integer> {
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("select e.frenseignements from Etablissement e")
	public void consulterFiches();
	
	@Transactional
	@Modifying(clearAutomatically = true)
//	@Query("update Etablissement_Frenseignement set enfant_idEnf=:a  where idFiche=:b")
	@Query("select e.frenseignements from Etablissement e")
	public void attribuerEtaFiche(@Param("b") int idEta, @Param("a") int idFiche);
	
	@Transactional
	@Modifying(clearAutomatically = true)
//	@Query("delete Etablissement_Frenseignement set enfant_idEnf=:a where idFiche=:b")
	@Query("select e.frenseignements from Etablissement e")
	public void attribuerFicheEnfant(@Param("b")int idFiche,@Param("a") int idEnf);

}
