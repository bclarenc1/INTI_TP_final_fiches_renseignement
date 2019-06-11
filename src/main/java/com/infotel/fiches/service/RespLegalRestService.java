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
import com.infotel.fiches.dao.RespLegalRepository;
import com.infotel.fiches.metier.Login;
import com.infotel.fiches.metier.RespLegal;

@RestController
@CrossOrigin("*")
public class RespLegalRestService implements IserviceRespLegal {

	@Autowired
	private RespLegalRepository respLegalRepository;
	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	@RequestMapping(value="/respLegals",method=RequestMethod.POST)
	public void addRespLegal(@RequestBody RespLegal r) {
		respLegalRepository.save(r);
	}

	@Override
	@RequestMapping(value="/respLegals/{id}",method=RequestMethod.DELETE)
	public void deleteRespLegal(@PathVariable int id) {
		respLegalRepository.deleteById(id);
	}

	@Override
	@RequestMapping(value="/respLegals",method=RequestMethod.GET)
	public RespLegal getRespLegal(@PathVariable int id) {
		return respLegalRepository.getOne(id);
	}

	@Override
	@RequestMapping(value="/respLegals/{id}",method=RequestMethod.PUT)
	public void editRespLegal(@RequestBody RespLegal r) {
		respLegalRepository.save(r);
	}

	@Override
	@RequestMapping(value="/respLegals",method=RequestMethod.GET)
	public List<RespLegal> listRespLegals() {
		return respLegalRepository.findAll();
	}

	@Override
	@RequestMapping(value="/respLegals/senregistrer/{idResp}",method={RequestMethod.POST,RequestMethod.GET})
	public void senregistrer(@PathVariable int idResp, @RequestBody Login login) {
		loginRepository.save(login);
		int idLogin = login.getIdLogin();
		respLegalRepository.senregistrer(idResp, idLogin);
	}

}
