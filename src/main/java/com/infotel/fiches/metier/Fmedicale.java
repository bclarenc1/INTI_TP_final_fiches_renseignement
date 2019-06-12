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
@DiscriminatorValue("Fmedicale")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Fmedicale extends Frenseignement {
	
	private String allergies;
	private String antecedents;
	
	@Override
	public String toString() {
		return "Fmedicale [allergies=" + allergies + ", antecedents=" + antecedents + ", toString()=" + super.toString()
				+ "]";
	}

}
