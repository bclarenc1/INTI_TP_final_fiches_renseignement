package com.infotel.fiches.service;

import java.util.List;

import com.infotel.fiches.metier.Enfant;

public interface IserviceEnfant {

	public void addEnfant(Enfant e);
	public void deleteEnfant(int id);
	public Enfant getEnfant(int id);
	public void editEnfant(Enfant e);
	public List<Enfant> listEnfants();
	
	public void modifierRespLegal(int idEnf, int idResp);
}
