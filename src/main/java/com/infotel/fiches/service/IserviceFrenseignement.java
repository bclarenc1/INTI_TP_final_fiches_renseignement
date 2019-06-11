package com.infotel.fiches.service;

import java.util.List;

import com.infotel.fiches.metier.Frenseignement;

public interface IserviceFrenseignement {

	public void deleteFrenseignement(int id);
	public Frenseignement getFrenseignement(int id);
	public List<Frenseignement> listFrenseignements();
	
	public boolean voirDemandeFiche(int idFiche, int idEta);
}
