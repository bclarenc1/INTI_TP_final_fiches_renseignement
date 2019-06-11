package com.infotel.fiches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infotel.fiches.dao.CentreLoisirRepository;
import com.infotel.fiches.dao.EcoleRepository;
import com.infotel.fiches.metier.CentreLoisir;
import com.infotel.fiches.metier.Ecole;

@CrossOrigin("*")
@RestController
public class CentreLoisirRestService implements IserviceCentreLoisir {

	@Autowired
	private CentreLoisirRepository centreLoisirRepository;
	
	@RequestMapping(value = "/centreLoisirs", method = RequestMethod.POST)			
	@Override
	public void addCentreLoisir(@RequestBody CentreLoisir cl) {
		
		centreLoisirRepository.save(cl);
	}

	@RequestMapping(value = "/centreLoisirs/{id}", method = RequestMethod.DELETE)			
	@Override
	public void deleteCentreLoisir(@PathVariable int id) {
	
		centreLoisirRepository.deleteById(id);
	}

	@RequestMapping(value = "/centreLoisirs/{id}", method = RequestMethod.GET)			
	@Override
	public CentreLoisir getCentreLoisir(@PathVariable int id) {

		return centreLoisirRepository.getOne(id);
	}

	@RequestMapping(value = "/centreLoisirs", method = RequestMethod.PUT)			
	@Override
	public void editCentreLoisir(@RequestBody CentreLoisir cl) {
		
		centreLoisirRepository.save(cl);
	}

	@RequestMapping(value = "/centreLoisirs", method = RequestMethod.GET)			
	@Override
	public List<CentreLoisir> listCentreLoisirs() {
		
		return centreLoisirRepository.findAll();
	}

}
