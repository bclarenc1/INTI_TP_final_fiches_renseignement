package com.infotel.fiches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infotel.fiches.dao.FrenseignementRepository;
import com.infotel.fiches.metier.Frenseignement;

@CrossOrigin("*")
@RestController
public class FrenseignementRestService implements IserviceFrenseignement {

	@Autowired
	private FrenseignementRepository frenseignementRepository;
	

	@RequestMapping(value = "/frenseignements/{id}", method = RequestMethod.DELETE)			
	@Override
	public void deleteFrenseignement(@PathVariable int id) {
	
		frenseignementRepository.deleteById(id);
	}

	@RequestMapping(value = "/frenseignements/{id}", method = RequestMethod.GET)			
	@Override
	public Frenseignement getFrenseignement(@PathVariable int id) {

		return frenseignementRepository.getOne(id);
	} 

	@RequestMapping(value = "/frenseignements", method = RequestMethod.GET)			
	@Override
	public List<Frenseignement> listFrenseignements() {
		
		return frenseignementRepository.findAll();
	}
	

	@Override
	public boolean voirDemandeFiche(int idEta, int idFiche) {

		return false;
	}

}
