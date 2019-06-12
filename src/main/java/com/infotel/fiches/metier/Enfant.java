package com.infotel.fiches.metier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
public class Enfant implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEnf;
	private String prenomEnf;
	private String nomEnf;
	private int ageEnf;
	
	@OneToMany(mappedBy="enfant")
	@JsonIgnore
	@XmlTransient
	private List<Frenseignement> frenseignements = new ArrayList<Frenseignement>();
	
	@ManyToOne
	private Famille famille;
	
	@ManyToOne
	private RespLegal respLegal;

	@Override
	public String toString() {
		return "Enfant [idEnf=" + idEnf + ", prenomEnf=" + prenomEnf + ", nomEnf=" + nomEnf + ", ageEnf=" + ageEnf
				+ ", frenseignements=" + frenseignements + ", famille=" + famille + ", respLegal=" + respLegal + "]";
	}

	public Enfant(String prenomEnf, String nomEnf, int ageEnf) {
		super();
		this.prenomEnf = prenomEnf;
		this.nomEnf = nomEnf;
		this.ageEnf = ageEnf;
	}
	
}
