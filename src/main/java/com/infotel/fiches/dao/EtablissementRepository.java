package com.infotel.fiches.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.fiches.metier.Etablissement;

public interface EtablissementRepository extends JpaRepository<Etablissement, Integer> {
		
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value="select frenseignements_id_fiche from etablissement_frenseignements where etablissements_id_eta=:a", nativeQuery=true)
	public List<Integer> consulterFiches(@Param("a") int idEta);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value="select e.frenseignements from etablissement e", nativeQuery=true)
	public void demanderAccesFiche(@Param("a") int idEta, @Param("b") int idFiche);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value="insert into etablissement_frenseignements (etablissements_id_eta, frenseignements_id_fiche) values (:a, :b)", nativeQuery=true)
	public void attribuerEtaFiche(@Param("a") int idEta, @Param("b") int idFiche);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value="delete from etablissement_frenseignements where etablissements_id_eta=:a and frenseignements_id_fiche=:b", nativeQuery=true)
	public void retirerEtaFiche(@Param("a") int idEta, @Param("b") int idFiche);

}
