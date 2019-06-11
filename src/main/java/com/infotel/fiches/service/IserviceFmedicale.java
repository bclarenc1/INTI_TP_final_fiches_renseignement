package com.infotel.fiches.service;

import java.util.List;

import com.infotel.fiches.metier.Fmedicale;

public interface IserviceFmedicale {

	public void addFmedicale(Fmedicale f);
	public void deleteFmedicale(int id);
	public Fmedicale getFmedicale(int id);
	public void editFmedicale(Fmedicale f);
	public List<Fmedicale> listFmedicales();
}
