package com.infotel.fiches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infotel.fiches.dao.FprincipaleRepository;
import com.infotel.fiches.metier.Fprincipale;

@CrossOrigin("*")
@RestController
public class FprincipaleRestService implements IserviceFprincipale {

	@Autowired
	private FprincipaleRepository fprincipaleRepository;
	
	@RequestMapping(value = "/fprincipales/{id}", method = RequestMethod.DELETE)			
	@Override
	public void deleteFprincipale(@PathVariable int id) {
		fprincipaleRepository.deleteById(id);
	}

	@RequestMapping(value = "/fprincipales/{id}", method = RequestMethod.GET)			
	@Override
	public Fprincipale getFprincipale(@PathVariable int id) {
		return fprincipaleRepository.getOne(id);
	}

	@RequestMapping(value = "/fprincipales", method = RequestMethod.PUT)			
	@Override
	public void editFprincipale(@RequestBody Fprincipale f) {
		fprincipaleRepository.save(f);
	}

	@RequestMapping(value = "/fprincipales", method = RequestMethod.GET)			
	@Override
	public List<Fprincipale> listFprincipales() {
		return fprincipaleRepository.findAll();
	}
	
	@RequestMapping(value = "/fprincipales/{id}", method = {RequestMethod.POST, RequestMethod.GET})
	@Override
	public void attribuerFicheEnfant(@RequestBody Fprincipale f, @PathVariable int id) {
		fprincipaleRepository.save(f);
		int idFiche = f.getIdFiche();
		fprincipaleRepository.attribuerFicheEnfant(idFiche, id);
			
	}

}
