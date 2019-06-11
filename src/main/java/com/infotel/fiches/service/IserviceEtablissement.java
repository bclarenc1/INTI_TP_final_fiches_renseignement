package com.infotel.fiches.service;

import java.util.List;

import com.infotel.fiches.metier.Etablissement;

public interface IserviceEtablissement {

	public void deleteEtablissement(int id);
	public void editEtablissement(Etablissement e);
	public List<Etablissement> listEtablissements();

	public void consulterFiches();
	public void demanderAccesFiche(int idEta, int idFiche);
	public void attribuerEtaFiche(int idEta, int idFiche);
	public void retirerEtaFiche(int idEta, int idFiche);
	public void senregistrer(int idEta, int idLogin);
}
