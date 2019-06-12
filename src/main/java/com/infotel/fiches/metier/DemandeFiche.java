package com.infotel.fiches.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
public class DemandeFiche {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDemande;
	private String requete;
	
	@ManyToOne
	private Etablissement etablissement;

	@Override
	public String toString() {
		return "DemandeFiche [requete=" + requete + "]";
	}

	public DemandeFiche(String requete) {
		super();
		this.requete = requete;
	}

}
