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
import com.infotel.fiches.dao.FvaccinationRepository;
import com.infotel.fiches.metier.Fvaccination;

@CrossOrigin("*")
@RestController
public class FvaccinationRestService implements IserviceFvaccination {

	@Autowired
	private FvaccinationRepository fvaccinationRepository;
	@Autowired
	private EnfantRepository enfantRepository;

	@RequestMapping(value = "/fvaccinations", method = RequestMethod.PUT)
	@Override
	public void editFvaccination(@RequestBody Fvaccination f) {
		fvaccinationRepository.save(f);
	}

	@RequestMapping(value = "/fvaccinations/{id}", method = RequestMethod.DELETE)
	@Override
	public void deleteFvaccination(@PathVariable int id) {
		fvaccinationRepository.deleteById(id);
	}

	@RequestMapping(value = "/fvaccinations/{id}", method = RequestMethod.GET)
	@Override
	public Fvaccination getFvaccination(@PathVariable int id) {
		return fvaccinationRepository.getOne(id);
	}

	@RequestMapping(value = "/fvaccinations", method = RequestMethod.GET)
	@Override
	public List<Fvaccination> listFvaccinations() {
		return fvaccinationRepository.findAll();
	}

	@RequestMapping(value = "/fvaccinations/{id}", method = RequestMethod.POST)
	@Override
	public void attribuerFicheEnfant(@RequestBody Fvaccination f, @PathVariable int id) {
		f.setEnfant(enfantRepository.getOne(id));
		fvaccinationRepository.save(f);
	}

}
