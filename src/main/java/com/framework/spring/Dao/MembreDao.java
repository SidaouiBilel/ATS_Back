package com.framework.spring.Dao;

import java.util.List;

import com.framework.spring.entites.Membre;

public interface MembreDao {

	
	 public Membre addMembre (Membre membre);

	public List<Membre> allMembres();

	public Membre updateMembre(Membre membre);

	public Membre deleteMembre(int idMembre);

	Membre findMembre(int idMembre);

	public Membre membreExists(String email, String password);


}
