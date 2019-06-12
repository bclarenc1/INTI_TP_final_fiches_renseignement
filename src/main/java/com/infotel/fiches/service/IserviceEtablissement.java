package com.infotel.fiches.service;

import java.util.List;

import com.infotel.fiches.metier.Etablissement;

public interface IserviceEtablissement {

	public void deleteEtablissement(int id);
	public Etablissement getEtablissement(int id);
	public List<Etablissement> listEtablissements();

	public void attribuerEtaFiche(int idEta, int idFiche);
	public void retirerEtaFiche(int idEta, int idFiche);
	public List<Integer> consulterFiches(int idEta);
}
