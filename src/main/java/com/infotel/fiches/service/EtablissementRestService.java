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
	public void deleteEtablissement(@PathVariable int id) {
		etablissementRepository.deleteById(id);
	}

	@RequestMapping(value = "/etablissements/{id}", method = RequestMethod.GET)
	@Override
	public Etablissement getEtablissement(@PathVariable int id) {
		return etablissementRepository.getOne(id);
	}

	@RequestMapping(value = "/etablissements", method = RequestMethod.GET)
	@Override
	public List<Etablissement> listEtablissements() {
		return etablissementRepository.findAll();
	}

	@RequestMapping(value = "/etablissements/attribuer/{idEta}/{idFiche}", method = RequestMethod.POST)
	@Override
	public void attribuerEtaFiche(@PathVariable int idEta, @PathVariable int idFiche) {
		etablissementRepository.attribuerEtaFiche(idEta, idFiche);
	}
	
	@RequestMapping(value = "/etablissements/retirer/{idEta}/{idFiche}", method = RequestMethod.POST)
	@Override
	public void retirerEtaFiche(@PathVariable int idEta, @PathVariable int idFiche) {
		etablissementRepository.retirerEtaFiche(idEta, idFiche);
	}

	@RequestMapping(value = "/etablissements/consulter/{idEta}", method = RequestMethod.GET)
	@Override
	public List<Integer> consulterFiches(@PathVariable int idEta) {
		return etablissementRepository.consulterFiches(idEta);
	}

}

