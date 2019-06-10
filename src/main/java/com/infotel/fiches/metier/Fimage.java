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
@DiscriminatorValue("Fimage")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Fimage extends Frenseignement {
	
	private boolean autorisation;

	@Override
	public String toString() {
		return "Fimage [autorisation=" + autorisation + ", toString()=" + super.toString() + "]";
	}

}
