package com.infotel.fiches.service;

import java.util.List;

import com.infotel.fiches.metier.Fmedicale;

public interface IserviceFmedicale {

	public void deleteFmedicale(int id);
	public Fmedicale getFmedicale(int id);
	public void editFmedicale(Fmedicale f);
	public List<Fmedicale> listFmedicales();
	
	public void attribuerFicheEnfant(Fmedicale f, int idEnf);
}
