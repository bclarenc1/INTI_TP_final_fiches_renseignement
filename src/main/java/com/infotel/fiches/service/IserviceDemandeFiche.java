package com.infotel.fiches.service;

import java.util.List;

import com.infotel.fiches.metier.DemandeFiche;

public interface IserviceDemandeFiche {

	public void deleteDemandeFiche(int id);
	public DemandeFiche getDemandeFiche(int id);
	public List<DemandeFiche> listerDemandeFiches();
	
	public void creerDemandeFiche(DemandeFiche df, int idEta);
	
}
