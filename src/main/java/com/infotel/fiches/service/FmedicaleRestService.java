package com.infotel.fiches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infotel.fiches.dao.FmedicaleRepository;
import com.infotel.fiches.metier.Fmedicale;
import com.infotel.fiches.metier.Fprincipale;

@CrossOrigin("*")
@RestController
public class FmedicaleRestService implements IserviceFmedicale {

	@Autowired
	private FmedicaleRepository fmedicaleRepository;
	
	@RequestMapping(value = "/fmedicales", method = RequestMethod.POST)			
	@Override
	public void addFmedicale(@RequestBody Fmedicale f) {
		
		fmedicaleRepository.save(f);
	}

	@RequestMapping(value = "/fmedicales/{id}", method = RequestMethod.DELETE)			
	@Override
	public void deleteFmedicale(@PathVariable int id) {
	
		fmedicaleRepository.deleteById(id);
	}

	@RequestMapping(value = "/fmedicales/{id}", method = RequestMethod.GET)			
	@Override
	public Fmedicale getFmedicale(@PathVariable int id) {

		return fmedicaleRepository.getOne(id);
	}

	@RequestMapping(value = "/fmedicales", method = RequestMethod.PUT)			
	@Override
	public void editFmedicale(@RequestBody Fmedicale f) {
		
		fmedicaleRepository.save(f);
	}

	@RequestMapping(value = "/fmedicales", method = RequestMethod.GET)			
	@Override
	public List<Fmedicale> listFmedicales() {
		
		return fmedicaleRepository.findAll();
	}

}