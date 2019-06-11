package com.infotel.fiches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infotel.fiches.dao.FamilleRepository;
import com.infotel.fiches.metier.Famille;

@RestController
@CrossOrigin("*")
public class FamilleRestService implements IserviceFamille {
	
	@Autowired
	private FamilleRepository familleRepository;

	@Override
	@RequestMapping(value="/familles",method=RequestMethod.POST)
	public void addFamille(@RequestBody Famille f) {
		familleRepository.save(f);
	}

	@Override
	@RequestMapping(value="/familles/{id}",method=RequestMethod.DELETE)
	public void deleteFamille(@PathVariable int id) {
		familleRepository.deleteById(id);
	}

	@Override
	@RequestMapping(value="/familles/{id}",method=RequestMethod.GET)
	public Famille getFamille(@PathVariable int id) {
		return familleRepository.getOne(id);
	}

	@Override
	@RequestMapping(value="/familles",method=RequestMethod.PUT)
	public void editFamille(@RequestBody Famille f) {
		familleRepository.save(f);
	}

	@Override
	@RequestMapping(value="/familles",method=RequestMethod.GET)
	public List<Famille> listFamilles() {
		return familleRepository.findAll();
	}

}
