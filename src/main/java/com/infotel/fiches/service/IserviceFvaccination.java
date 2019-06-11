package com.infotel.fiches.service;

import java.util.List;

import com.infotel.fiches.metier.Fvaccination;

public interface IserviceFvaccination {

	public void deleteFvaccination(int id);
	public Fvaccination getFvaccination(int id);
	public void editFvaccination(Fvaccination f);
	public List<Fvaccination> listFvaccinations();
	
	public void attribuerFicheEnfant(Fvaccination f, int idEnf);
}
