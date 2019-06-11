package com.infotel.fiches.service;

import java.util.List;

import com.infotel.fiches.metier.CentreLoisir;

public interface IserviceCentreLoisir {

	public void addCentreLoisir(CentreLoisir c);
	public void deleteCentreLoisir(int id);
	public CentreLoisir getCentreLoisir(int id);
	public void editCentreLoisir(CentreLoisir c);
	public List<CentreLoisir> listCentreLoisirs();
}
