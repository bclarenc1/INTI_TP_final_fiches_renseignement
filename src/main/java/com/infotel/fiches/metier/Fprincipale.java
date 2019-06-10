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
@DiscriminatorValue("Fprincipale")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Fprincipale extends Frenseignement {
	
	private String adresse;
	private String telephone;
	
	@Override
	public String toString() {
		return "Fprincipale [adresse=" + adresse + ", telephone=" + telephone + ", toString()=" + super.toString()
				+ "]";
	}

}
