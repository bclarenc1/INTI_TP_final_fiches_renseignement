package com.infotel.fiches.metier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_FICHE")
@DiscriminatorValue("FICHE")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public abstract class Frenseignement implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idFiche;
	
	@ManyToOne
	private Enfant enfant;
	
	@ManyToMany(mappedBy="frenseignement")
	@JsonIgnore
	@XmlTransient
	private List<Etablissement> etablissement = new ArrayList<Etablissement>();

	@Override
	public String toString() {
		return "Frenseignement [idFiche=" + idFiche + ", enfant=" + enfant + ", etablissement=" + etablissement + "]";
	}

}
