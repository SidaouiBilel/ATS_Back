package com.framework.spring.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Material extends Demandes{

	public Material(String nb_jours_loue, String sous_cat) {
		super();
		this.nb_jours_loue = nb_jours_loue;
		this.sous_cat = sous_cat;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_dem ;
	
	private String nb_jours_loue;
	private String sous_cat;
	public String getNb_jours_loue() {
		return nb_jours_loue;
	}
	public void setNb_jours_loue(String nb_jours_loue) {
		this.nb_jours_loue = nb_jours_loue;
	}
	public String getSous_cat() {
		return sous_cat;
	}
	public void setSous_cat(String sous_cat) {
		this.sous_cat = sous_cat;
	}
	
	
}
