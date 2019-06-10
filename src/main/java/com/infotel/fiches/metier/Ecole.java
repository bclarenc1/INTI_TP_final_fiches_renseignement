package com.infotel.fiches.metier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

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
@DiscriminatorValue("Ecole")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Ecole extends Etablissement {
	
	private int nbEleves;

	@Override
	public String toString() {
		return "Ecole [nbEleves=" + nbEleves + ", toString()=" + super.toString() + "]";
	}

	public Ecole(String nomEta, int nbEleves) {
		super();
		this.nbEleves = nbEleves;
	}
	
}
