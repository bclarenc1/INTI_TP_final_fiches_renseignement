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
import com.infotel.fiches.dao.FimageRepository;
import com.infotel.fiches.metier.Fimage;

@CrossOrigin("*")
@RestController
public class FimageRestService implements IserviceFimage {

	@Autowired
	private FimageRepository fimageRepository;
	@Autowired
	private EnfantRepository enfantRepository;

	@RequestMapping(value = "/fimages/{id}", method = RequestMethod.DELETE)			
	@Override
	public void deleteFimage(@PathVariable int id) {
		fimageRepository.deleteById(id);
	}

	@RequestMapping(value = "/fimages/{id}", method = RequestMethod.GET)			
	@Override
	public Fimage getFimage(@PathVariable int id) {
		return fimageRepository.getOne(id);
	}

	@RequestMapping(value = "/fimages", method = RequestMethod.PUT)			
	@Override
	public void editFimage(@RequestBody Fimage f) {
		fimageRepository.save(f);
	}

	@RequestMapping(value = "/fimages", method = RequestMethod.GET)			
	@Override
	public List<Fimage> listFimages() {
		return fimageRepository.findAll();
	}
	
	@RequestMapping(value = "/fimages/{id}", method = RequestMethod.POST)
	@Override
	public void attribuerFicheEnfant(@RequestBody Fimage f, @PathVariable int id) {
		f.setEnfant(enfantRepository.getOne(id));
		fimageRepository.save(f);
	}

}
