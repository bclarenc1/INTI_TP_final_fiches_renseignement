package com.infotel.fiches.metier;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Login implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLogin;
	private String nickname;
	private String password;
	
	@OneToOne (mappedBy = "login")
	private RespLegal respLegal;
	
	@OneToOne (mappedBy = "login")
	private Etablissement etablissement;

	@Override
	public String toString() {
		return "Login [idLogin=" + idLogin + ", nickname=" + nickname + ", password=" + password + ", respLegal="
				+ respLegal + ", etablissement=" + etablissement + "]";
	}

	public Login(String nickname, String password) {
		super();
		this.nickname = nickname;
		this.password = password;
	}
	
	
}
