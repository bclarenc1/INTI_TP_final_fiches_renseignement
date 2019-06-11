package com.infotel.fiches.service;

import java.util.List;

import com.infotel.fiches.metier.Login;
import com.infotel.fiches.metier.RespLegal;

public interface IserviceRespLegal {

	public void addRespLegal(RespLegal r);
	public void deleteRespLegal(int id);
	public RespLegal getRespLegal(int id);
	public void editRespLegal(RespLegal r);
	public List<RespLegal> listRespLegals();

	public void senregistrer(int idResp, Login login);
	
}
