package com.infotel.fiches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infotel.fiches.dao.EtablissementRepository;
import com.infotel.fiches.dao.LoginRepository;
import com.infotel.fiches.dao.RespLegalRepository;
import com.infotel.fiches.metier.Login;

@CrossOrigin("*")
@RestController
public class LoginRestService implements IserviceLogin {

	@Autowired
	private LoginRepository loginRepository;
	
	@Autowired
	private EtablissementRepository etablissementRepository;
	
	@Autowired
	private RespLegalRepository respLegalRepository;
	
	
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

	@RequestMapping(value = "/logins/connexion/{nickname}/{password}", method = RequestMethod.GET)	
	@Override
//	public List<Login> seConnecter(@RequestBody String nickname, @RequestBody String password) {
	public List<Login> seConnecter(@PathVariable String nickname, @PathVariable String password) {
		List<Login> logins = loginRepository.seConnecter(nickname, password);
		if (logins.isEmpty()) {
			System.out.println("Connexion impossible, vérifiez login et mdp.");
		} else {
			System.out.println("Connexion établie");
		}
		return logins;
	}

	@Override
	@RequestMapping(value="/logins/senregistrerEta/{idResp}",method=RequestMethod.POST)
	public void senregistrerEta(@PathVariable int idEta, @RequestBody Login login) {
		login.setEtablissement(etablissementRepository.getOne(idEta));
		loginRepository.save(login);

	}

	@Override
	@RequestMapping(value="/logins/senregistrerResp/{idResp}",method=RequestMethod.POST)
	public void senregistrerResp(@PathVariable int idResp, @RequestBody Login login) {
		login.setRespLegal(respLegalRepository.getOne(idResp));
		loginRepository.save(login);

	}

}
