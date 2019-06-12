package com.infotel.fiches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infotel.fiches.dao.DemandeFicheRepository;
import com.infotel.fiches.dao.EtablissementRepository;
import com.infotel.fiches.metier.DemandeFiche;

@CrossOrigin("*")
@RestController
public class DemandeFicheRestService implements IserviceDemandeFiche {

	@Autowired
	private DemandeFicheRepository demandeFicheRepository;	
	@Autowired
	private EtablissementRepository etablissementRepository;
	
	@RequestMapping(value = "/demandeFiches/{id}", method = RequestMethod.DELETE)
	@Override
	public void deleteDemandeFiche(@PathVariable int id) {
		demandeFicheRepository.deleteById(id);
	}

	@RequestMapping(value = "/demandeFiches/{id}", method = RequestMethod.GET)
	@Override
	public DemandeFiche getDemandeFiche(@PathVariable int id) {
		return demandeFicheRepository.getOne(id);	
	}

	@RequestMapping(value = "/demandeFiches", method = RequestMethod.GET)
	@Override
	public List<DemandeFiche> listerDemandeFiches() {
		return demandeFicheRepository.findAll();	
	}

	@RequestMapping(value = "/demandeFiches/{idEta}", method = RequestMethod.POST)
	@Override
	public void creerDemandeFiche(@RequestBody DemandeFiche df, @PathVariable int idEta) {
		df.setEtablissement(etablissementRepository.getOne(idEta));
		demandeFicheRepository.save(df);
	}

}
