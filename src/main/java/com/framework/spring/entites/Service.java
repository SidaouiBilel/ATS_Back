package com.framework.spring.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Service extends Demandes{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_dem ;
	
	private String typologie;
	private String sous_cat;
	public String getTypologie() {
		return typologie;
	}
	public void setTypologie(String typologie) {
		this.typologie = typologie;
	}
	public String getSous_cat() {
		return sous_cat;
	}
	public void setSous_cat(String sous_cat) {
		this.sous_cat = sous_cat;
	}
	public Service(String typologie, String sous_cat) {
		super();
		this.typologie = typologie;
		this.sous_cat = sous_cat;
	}
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Service(int id_dem, String budget, String lieu, String intitule, String date, String statut) {
		super(id_dem, budget, lieu, intitule, date, statut);
		// TODO Auto-generated constructor stub
	}
	
	
}
