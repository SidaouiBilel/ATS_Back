package com.framework.spring.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Demandes implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_dem ;
	public Demandes() {
		super();
	}
	
	private String budget;
	private String lieu;
	private String Intitule;
	private String Date;
	private String statut;
	
	
	
	
	public Demandes(int id_dem, String budget, String lieu, String intitule, String date, String statut) {
		super();
		this.id_dem = id_dem;
		this.budget = budget;
		this.lieu = lieu;
		Intitule = intitule;
		Date = date;
		this.statut = statut;
	}
	public int getId_dem() {
		return id_dem;
	}
	public void setId_dem(int id_dem) {
		this.id_dem = id_dem;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getIntitule() {
		return Intitule;
	}
	public void setIntitule(String intitule) {
		Intitule = intitule;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	
}
