package com.infotel.fiches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infotel.fiches.dao.EtablissementRepository;
import com.infotel.fiches.metier.Etablissement;

@CrossOrigin("*")
@RestController
public class EtablissementRestService implements IserviceEtablissement {

	@Autowired
	private EtablissementRepository etablissementRepository;
	
	@RequestMapping(value = "/etablissements/{id}", method = RequestMethod.DELETE)			
	@Override
	public void deleteEtablissement(int id) {
		
		etablissementRepository.deleteById(id);
	}

	@RequestMapping(value = "/etablissements/{id}", method = RequestMethod.GET)			
	@Override
	public void getEtablissement(@PathVariable int id) {

		etablissementRepository.getOne(id);
	}

	@RequestMapping(value = "/etablissements", method = RequestMethod.GET)			
	@Override
	public List<Etablissement> listEtablissements() {

		return etablissementRepository.findAll();
	}

	@Override
	public void consulterFiches() {
		
		etablissementRepository.consulterFiches();
	}

	@Override
	public void demanderAccesFiche(int idEta, int idFiche) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attribuerEtaFiche(int idEta, int idFiche) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void retirerEtaFiche(int idEta, int idFiche) {
		// TODO Auto-generated method stub

	}
		
	@Override
	public void senregistrer(int idEta, int idLogin) {
		// TODO Auto-generated method stub

	}

}
