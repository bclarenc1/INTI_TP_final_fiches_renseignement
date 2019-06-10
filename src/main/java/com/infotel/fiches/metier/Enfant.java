package com.infotel.fiches.metier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Enfant implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEnf;
	private String prenomEnf;
	private String nomEnf;
	private int ageEnf;
	
	@OneToMany(mappedBy="enfant")
	@JsonIgnore
	@XmlTransient
	private List<Frenseignement> frenseignement = new ArrayList<Frenseignement>();
	
	@ManyToOne
	private Famille famille;
	
	@ManyToOne
	private RespLegal respLegal;

}
