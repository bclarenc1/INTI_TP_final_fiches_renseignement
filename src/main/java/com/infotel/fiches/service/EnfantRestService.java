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
import com.infotel.fiches.metier.Enfant;

@RestController
@CrossOrigin("*")
public class EnfantRestService implements IserviceEnfant {

	@Autowired
	private EnfantRepository enfantRepository;
	
	@Override
	@RequestMapping(value="/enfants",method=RequestMethod.POST)
	public void addEnfant(@RequestBody Enfant e) {
		enfantRepository.save(e);
	}

	@Override
	@RequestMapping(value="/enfants/{id}",method=RequestMethod.DELETE)
	public void deleteEnfant(@PathVariable int id) {
		enfantRepository.deleteById(id);
	}

	@Override
	@RequestMapping(value="/enfants/{id}",method=RequestMethod.GET)
	public Enfant getEnfant(@PathVariable int id) {
		return enfantRepository.getOne(id);
	}

	@Override
	@RequestMapping(value="/enfants/",method=RequestMethod.PUT)
	public void editEnfant(@RequestBody Enfant e) {
		enfantRepository.save(e);
	}

	@Override
	@RequestMapping(value="/enfants",method=RequestMethod.GET)
	public List<Enfant> listEnfants() {
		return enfantRepository.findAll();
	}

	@Override
	@RequestMapping(value="/enfants/modifRespLegal/{idEnf}/{idResp}",method=RequestMethod.GET)
	public void modifierRespLegal(int idEnf, int idResp) {
		enfantRepository.modifierRespLegal(idEnf, idResp);
	}

}
