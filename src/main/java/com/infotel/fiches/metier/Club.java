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
@DiscriminatorValue("Club")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Club extends Etablissement {
	
	private String discipline;

	@Override
	public String toString() {
		return "Club [discipline=" + discipline + ", toString()=" + super.toString() + "]";
	}

	public Club(String nomEta, String discipline) {
		super();
		this.discipline = discipline;
	}
	
}

