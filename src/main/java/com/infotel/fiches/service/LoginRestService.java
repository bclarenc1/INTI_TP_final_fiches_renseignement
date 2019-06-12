package com.infotel.fiches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infotel.fiches.dao.LoginRepository;
import com.infotel.fiches.metier.Login;

@CrossOrigin("*")
@RestController
public class LoginRestService implements IserviceLogin {

	@Autowired
	private LoginRepository loginRepository;
	
	
	@RequestMapping(value = "/logins", method = RequestMethod.POST)
	@Override
	public void addLogin(@RequestBody Login l) {
		loginRepository.save(l);
	}

	@RequestMapping(value = "/logins/{id}", method = RequestMethod.DELETE)
	@Override
	public void deleteLogin(@PathVariable int id) {
		loginRepository.deleteById(id);
	}

	@RequestMapping(value = "/logins/{id}", method = RequestMethod.GET)		
	@Override
	public Login getLogin(@PathVariable int id) {
		return loginRepository.getOne(id);
	}

	@RequestMapping(value = "/logins", method = RequestMethod.PUT)	
	@Override
	public void editLogin(@RequestBody Login l) {
		loginRepository.save(l);
	}

	@RequestMapping(value = "/logins", method = RequestMethod.GET)	
	@Override
	public List<Login> listLogins() {
		return loginRepository.findAll();
	}

	@RequestMapping(value = "/logins/connexion", method = RequestMethod.GET)	
	@Override
	public void seConnecter(@RequestBody String nickname, @RequestBody String password) {
		List<Login> logins = loginRepository.seConnecter(nickname, password);
		if (logins == null) {
			System.out.println("Connexion impossible, vérifiez login et mdp.");
		} else {
			System.out.println("Connexion établie");
		}
	}

	@Override
	@RequestMapping(value="/logins/senregistrerEta/{idResp}",method={RequestMethod.POST,RequestMethod.GET})
	public void senregistrerEta(int idEta, Login login) {
		
		loginRepository.save(login);
		int idLogin = login.getIdLogin();
		loginRepository.senregistrerEta(idEta, idLogin);
	}

	@Override
	@RequestMapping(value="/logins/senregistrerResp/{idResp}",method={RequestMethod.POST,RequestMethod.GET})
	public void senregistrerResp(int idResp, Login login) {
		
		loginRepository.save(login);
		int idLogin = login.getIdLogin();
		loginRepository.senregistrerResp(idResp, idLogin);
	}

}
