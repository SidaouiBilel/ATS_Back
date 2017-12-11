package com.framework.spring.Metier;

import java.util.List;

import com.framework.spring.entites.Membre;

public interface MembreMetier {

	
	public Membre addMembre(Membre membre) ;

	List<Membre> allMembres();

	Membre updateMembre(Membre membre);

	Membre deleteMembre(int idMembre);

	Membre findMembre(int idMembre);

	public Membre membreExists(String email, String password);


}
