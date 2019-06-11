package com.infotel.fiches.service;

import java.util.List;

import com.infotel.fiches.metier.Ecole;

public interface IserviceEcole {

	public void addEcole(Ecole e);
	public void deleteEcole(int id);
	public Ecole getEcole(int id);
	public void editEcole(Ecole e);
	public List<Ecole> listEcoles();
}
