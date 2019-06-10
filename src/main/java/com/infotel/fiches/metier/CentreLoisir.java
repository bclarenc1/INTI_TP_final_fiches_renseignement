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
@DiscriminatorValue("Loisir")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CentreLoisir extends Etablissement {
	
	private int nbAdherents;

	@Override
	public String toString() {
		return "CentreLoisir [nbAdherents=" + nbAdherents + ", toString()=" + super.toString() + "]";
	}

	public CentreLoisir(String nomEta, int nbAdherents) {
		super();
		this.nbAdherents = nbAdherents;
	}
	
}
