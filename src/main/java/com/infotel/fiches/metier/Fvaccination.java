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
@DiscriminatorValue("Fvaccination")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Fvaccination extends Frenseignement {
	
	private boolean ajour;

	@Override
	public String toString() {
		return "Fvaccination [ajour=" + ajour + ", toString()=" + super.toString() + "]";
	}
	
}
