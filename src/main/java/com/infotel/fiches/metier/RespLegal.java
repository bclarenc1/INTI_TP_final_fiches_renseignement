package com.infotel.fiches.metier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class RespLegal implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idResp;
	private String nomResp;
	private String prenomResp;
	
	@OneToOne
	private Login login;
	
	@OneToMany(mappedBy="respLegal")
	@JsonIgnore
	@XmlTransient
	private List<Enfant> enfants = new ArrayList<Enfant>();

	@Override
	public String toString() {
		return "RespLegal [idResp=" + idResp + ", nomResp=" + nomResp + ", prenomResp=" + prenomResp + ", login="
				+ login + ", enfants=" + enfants + "]";
	}

	public RespLegal(String nomResp, String prenomResp) {
		super();
		this.nomResp = nomResp;
		this.prenomResp = prenomResp;
	}
	
}
