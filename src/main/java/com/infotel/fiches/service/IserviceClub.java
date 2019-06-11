package com.infotel.fiches.service;

import java.util.List;

import com.infotel.fiches.metier.Club;

public interface IserviceClub {

	public void addClub(Club c);
	public void deleteClub(int id);
	public Club getClub(int id);
	public void editClub(Club c);
	public List<Club> listClubs();

}
