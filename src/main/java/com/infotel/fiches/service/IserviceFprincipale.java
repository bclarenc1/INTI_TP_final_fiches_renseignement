package com.infotel.fiches.service;

import java.util.List;

import com.infotel.fiches.metier.Fprincipale;

public interface IserviceFprincipale {
	
	public void addFprincipale(Fprincipale f);
	public void deleteFprincipale(int id);
	public Fprincipale getFprincipale(int id);
	public void editFprincipale(Fprincipale f);
	public List<Fprincipale> listFprincipales();
}
