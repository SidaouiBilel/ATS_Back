package com.framework.spring.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.*;



@Entity

public class Membre implements IMembre , Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int idMembre ;
	
	private String prenom;
	private String nom;
    @Column(nullable=false, unique=true) 
	private String email;
	private String adr_postale;
	private int tel;
    @Column(nullable=false) 
	private String password;
	private String ville;
	private String msg_presentation;
	private boolean Confirmed;

	/*
    @OneToMany(mappedBy="destinateur",fetch = FetchType.LAZY)    

	private Collection<Message> messages_envoyes=new ArrayList<Message>();
	@OneToMany(mappedBy="destinataire",fetch = FetchType.LAZY)   

	private Collection<Message> messages_recus=new ArrayList<Message>();
	
	@OneToMany(mappedBy="membre")
	private Collection<Offre> offres=new ArrayList<Offre>();

	*/
	
	public Membre() {
		super();
	}

	public Membre(String prenom, String email, String adr_postale, int tel, String password, String ville,
			String msg_presentation, Collection<Message> messages_envoyes, Collection<Message> messages_recus,
			Collection<Offre> offres) {
		super();
		this.prenom = prenom;
		this.email = email;
		this.adr_postale = adr_postale;
		this.tel = tel;
		this.password = password;
		this.ville = ville;
		this.msg_presentation = msg_presentation;
	}

	public int getIdMembre() {
		return idMembre;
	}

	public void setIdMembre(int idMembre) {
		this.idMembre = idMembre;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdr_postale() {
		return adr_postale;
	}

	public void setAdr_postale(String adr_postale) {
		this.adr_postale = adr_postale;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getMsg_presentation() {
		return msg_presentation;
	}

	public void setMsg_presentation(String msg_presentation) {
		this.msg_presentation = msg_presentation;
	}



	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	

	public boolean isConfirmed() {
		return Confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		Confirmed = confirmed;
	}

	@Override
	public String toString() {
		return "Membre [idMembre=" + idMembre + ", prenom=" + prenom + ", nom=" + nom + ", email=" + email
				+ ", adr_postale=" + adr_postale + ", tel=" + tel + ", password=" + password + ", ville=" + ville
				+ ", msg_presentation=" + msg_presentation + ", Confirmed=" + Confirmed + "]";
	}

	
	
	
	
}
