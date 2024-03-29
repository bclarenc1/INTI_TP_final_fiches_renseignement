package com.infotel.fiches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infotel.fiches.dao.EnfantRepository;
import com.infotel.fiches.dao.FmedicaleRepository;
import com.infotel.fiches.metier.Fmedicale;

@CrossOrigin("*")
@RestController
public class FmedicaleRestService implements IserviceFmedicale {

	@Autowired
	private FmedicaleRepository fmedicaleRepository;
	@Autowired
	private EnfantRepository enfantRepository;

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
	
	@RequestMapping(value = "/fmedicales/{id}", method = RequestMethod.POST)
	@Override
	public void attribuerFicheEnfant(@RequestBody Fmedicale f, @PathVariable int id) {
		f.setEnfant(enfantRepository.getOne(id));
		fmedicaleRepository.save(f);
	}
	
}
