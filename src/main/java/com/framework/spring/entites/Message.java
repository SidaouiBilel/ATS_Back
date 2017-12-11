package com.framework.spring.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Message  implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int idMessage ;
    @ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "destinataireId")
		Membre destinataire;
	    @ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "destinateurId")
		Membre destinateur;
		boolean lu;
		
		
		
		
		
		public Message() {
			super();
		}
		public int getIdMessage() {
			return idMessage;
		}
		public void setIdMessage(int idMessage) {
			this.idMessage = idMessage;
		}
		public Membre getDestinataire() {
			return destinataire;
		}
		public void setDestinataire(Membre destinataire) {
			this.destinataire = destinataire;
		}
		public Membre getDestinateur() {
			return destinateur;
		}
		public void setDestinateur(Membre destinateur) {
			this.destinateur = destinateur;
		}
		public boolean isLu() {
			return lu;
		}
		public void setLu(boolean lu) {
			this.lu = lu;
		}

	    
	    
	    
}
