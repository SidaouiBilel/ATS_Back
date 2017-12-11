package com.framework.spring.Dao;

import java.util.List;
import com.framework.spring.entites.Offre;

public interface OffreDao {

	public Offre addOffre(Offre offre, int idDemande, int id);

	public List<Offre> allOffres();

	public Offre updateOffre(Offre offre);

	public Offre deleteOffre(int idOffre);

	Offre findOffre(int idOffre);

}
