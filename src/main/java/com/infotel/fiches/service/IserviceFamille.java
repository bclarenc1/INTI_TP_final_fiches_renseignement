package com.infotel.fiches.service;

import java.util.List;

import com.infotel.fiches.metier.Famille;

public interface IserviceFamille {

	public void addFamille(Famille f);
	public void deleteFamille(int id);
	public Famille getFamille(int id);
	public void editFamille(Famille f);
	public List<Famille> listFamilles();
}
