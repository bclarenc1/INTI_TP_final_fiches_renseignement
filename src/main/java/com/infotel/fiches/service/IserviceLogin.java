package com.infotel.fiches.service;

import java.util.List;

import com.infotel.fiches.metier.Login;

public interface IserviceLogin {

	public void addLogin(Login l);
	public void deleteLogin(int id);
	public Login getLogin(int id);
	public void editLogin(Login l);
	public List<Login> listLogins();

	public void seConnecter(String nickname, String password);
	
	public void senregistrerEta(int idEta, Login login);
	public void senregistrerResp(int idResp, Login login);
}
