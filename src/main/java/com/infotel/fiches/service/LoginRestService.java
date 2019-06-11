package com.infotel.fiches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infotel.fiches.dao.ClubRepository;
import com.infotel.fiches.dao.LoginRepository;
import com.infotel.fiches.metier.Login;

@CrossOrigin("*")
@RestController
public class LoginRestService implements IserviceLogin {

	@Autowired
	private LoginRepository loginRepository;
	
	
	@RequestMapping(value = "/logins", method = RequestMethod.POST)
	@Override
	public void addLogin(Login l) {

		loginRepository.save(l);
	}

	@RequestMapping(value = "/logins/{id}", method = RequestMethod.DELETE)
	@Override
	public void deleteLogin(int id) {
		
		loginRepository.deleteById(id);
	}

	@RequestMapping(value = "/logins/{id}", method = RequestMethod.GET)		
	@Override
	public Login getLogin(int id) {
		
		return loginRepository.getOne(id);
	}

	@RequestMapping(value = "/logins", method = RequestMethod.PUT)	
	@Override
	public void editLogin(Login l) {
		
		loginRepository.save(l);
	}

	@RequestMapping(value = "/logins", method = RequestMethod.GET)	
	@Override
	public List<Login> listLogins() {
		
		return loginRepository.findAll();
	}

	@Override
	public void seConnecter(String nickname, String password) {
		

	}

}
