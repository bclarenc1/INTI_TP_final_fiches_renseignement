package com.infotel.fiches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infotel.fiches.dao.ClubRepository;
import com.infotel.fiches.metier.Club;


@CrossOrigin("*")
@RestController
public class ClubRestService implements IserviceClub {

	@Autowired
	private ClubRepository clubRepository;
	
	@RequestMapping(value = "/clubs", method = RequestMethod.POST)			
	@Override
	public void addClub(@RequestBody Club c) {
		
		clubRepository.save(c);
	}

	@RequestMapping(value = "/clubs/{id}", method = RequestMethod.DELETE)			
	@Override
	public void deleteClub(@PathVariable int id) {
	
		clubRepository.deleteById(id);
	}

	@RequestMapping(value = "/clubs/{id}", method = RequestMethod.GET)			
	@Override
	public Club getClub(@PathVariable int id) {

		return clubRepository.getOne(id);
	}

	@RequestMapping(value = "/clubs", method = RequestMethod.PUT)			
	@Override
	public void editClub(@RequestBody Club c) {
		
		clubRepository.save(c);
	}

	@RequestMapping(value = "/clubs", method = RequestMethod.GET)			
	@Override
	public List<Club> listClubs() {
		
		return clubRepository.findAll();
	}

}
