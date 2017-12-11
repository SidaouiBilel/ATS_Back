package com.framework.spring.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Offre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOffre;
	private String intitule_offre;
	private String statut_offre;
	private int prix;
	private String image_offre;
	private String desc_offre;
	private String etat;

	@OneToOne
	@JoinColumn(name = "IdDemande")
	private Demandes demande;

	@OneToOne
	@JoinColumn(name = "id")
	private Membre membre;

	public Membre getMembre() {
		return membre;
	}

	public void setMembre(Membre membre) {
		this.membre = membre;
	}

	public Offre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdOffre() {
		return idOffre;
	}

	public void setIdOffre(int idOffre) {
		this.idOffre = idOffre;
	}

	public String getIntitule_offre() {
		return intitule_offre;
	}

	public void setIntitule_offre(String intitule_offre) {
		this.intitule_offre = intitule_offre;
	}

	public String getStatut_offre() {
		return statut_offre;
	}

	public void setStatut_offre(String statut_offre) {
		this.statut_offre = statut_offre;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getImage_offre() {
		return image_offre;
	}

	public void setImage_offre(String image_offre) {
		this.image_offre = image_offre;
	}

	public String getDesc_offre() {
		return desc_offre;
	}

	public void setDesc_offre(String desc_offre) {
		this.desc_offre = desc_offre;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Demandes getDemande() {
		return demande;
	}

	public void setDemande(Demandes demande) {
		this.demande = demande;
	}

}
