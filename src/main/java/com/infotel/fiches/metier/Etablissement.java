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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@DiscriminatorColumn(name="TYPE_ETA")
@DiscriminatorValue("Eta")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public abstract class Etablissement implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEta;
	private String nomEta;
	
	@OneToOne(mappedBy = "etablissement")
	private Login login;
	
	@ManyToMany
	@JsonIgnore
	@XmlTransient
	private List<Frenseignement> frenseignements = new ArrayList<Frenseignement>();

	@OneToMany(mappedBy="etablissement")
	@JsonIgnore
	@XmlTransient
	private List<DemandeFiche> demandeFiches = new ArrayList<DemandeFiche>();
	
	@Override
	public String toString() {
		return "Etablissement [idEta=" + idEta + ", nomEta=" + nomEta + ", login=" + login + ", frenseignements="
				+ frenseignements + "]";
	}

}
