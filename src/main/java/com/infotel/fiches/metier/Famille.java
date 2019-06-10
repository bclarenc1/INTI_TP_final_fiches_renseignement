package com.infotel.fiches.metier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Famille implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idFamille;
	private String nomFamille;
	
	@OneToMany(mappedBy="famille")
	@JsonIgnore
	@XmlTransient
	private List<Enfant> enfants = new ArrayList<Enfant>();

	@Override
	public String toString() {
		return "Famille [idFamille=" + idFamille + ", nomFamille=" + nomFamille + ", enfants=" + enfants + "]";
	}

	public Famille(String nomFamille, List<Enfant> enfants) {
		super();
		this.nomFamille = nomFamille;
		this.enfants = enfants;
	}
	

}
