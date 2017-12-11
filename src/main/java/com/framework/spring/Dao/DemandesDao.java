package com.framework.spring.Dao;

import java.util.List;

import com.framework.spring.entites.Demandes;

public interface DemandesDao {
	
	public Demandes addDemande(Demandes demande) ;

	public List<Demandes> allDemandes();

	public Demandes updateDemande(Demandes Demande);

	public Demandes deleteDemande(int id_dem);

	Demandes findDemande(int id_dem);
}
