package com.infotel.fiches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infotel.fiches.dao.EcoleRepository;
import com.infotel.fiches.metier.Ecole;

@CrossOrigin("*")
@RestController
public class EcoleRestService implements IserviceEcole {

	@Autowired
	private EcoleRepository ecoleRepository;
	
	@RequestMapping(value = "/ecoles", method = RequestMethod.POST)			
	@Override
	public void addEcole(@RequestBody Ecole e) {
		
		ecoleRepository.save(e);
	}

	@RequestMapping(value = "/ecoles/{id}", method = RequestMethod.DELETE)			
	@Override
	public void deleteEcole(@PathVariable int id) {
	
		ecoleRepository.deleteById(id);
	}

	@RequestMapping(value = "/ecoles/{id}", method = RequestMethod.GET)			
	@Override
	public Ecole getEcole(@PathVariable int id) {

		return ecoleRepository.getOne(id);
	}

	@RequestMapping(value = "/ecoles", method = RequestMethod.PUT)			
	@Override
	public void editEcole(@RequestBody Ecole e) {
		
		ecoleRepository.save(e);
	}

	@RequestMapping(value = "/ecoles", method = RequestMethod.GET)			
	@Override
	public List<Ecole> listEcoles() {
		
		return ecoleRepository.findAll();
	}

}
