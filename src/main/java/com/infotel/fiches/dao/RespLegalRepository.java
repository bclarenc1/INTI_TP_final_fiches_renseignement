package com.infotel.fiches.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infotel.fiches.metier.RespLegal;

public interface RespLegalRepository extends JpaRepository<RespLegal, Integer> {

	@Query("update RespLegal set idLogin=:a where idResp=:b")
	public void senregistrer(@Param("b")int idResp,@Param("a") int idLogin);

}
