package com.infotel.fiches.service;

import java.util.List;

import com.infotel.fiches.metier.Fimage;

public interface IserviceFimage {

	public void addFimage(Fimage f);
	public void deleteFimage(int id);
	public Fimage getFimage(int id);
	public void editFimage(Fimage f);
	public List<Fimage> listFimages();
}
