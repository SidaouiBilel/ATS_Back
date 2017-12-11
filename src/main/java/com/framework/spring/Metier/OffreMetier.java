package com.framework.spring.Metier;

import java.util.List;

import com.framework.spring.entites.Offre;

public interface OffreMetier {

	public Offre addOffre(Offre offre, int idDemande, int id);

	List<Offre> allOffres();

	Offre updateOffre(Offre offre);

	Offre deleteOffre(int idOffre);

	Offre findOffre(int idOffre);

}
