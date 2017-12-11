package com.framework.spring.Metier;

import java.util.List;

import com.framework.spring.entites.Demandes;

public interface DemandesMetier {

	
	public Demandes addDemande(Demandes demande) ;

	List<Demandes> allDemandes();

	Demandes updateDemande(Demandes Demande);

	Demandes deleteDemande(int id_dem);

	Demandes findDemande(int id_dem);
	
}
