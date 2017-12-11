package com.framework.spring.Dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.framework.spring.entites.Demandes;
import com.framework.spring.entites.Membre;
import com.framework.spring.entites.Offre;

public class ImplOffreDao implements OffreDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Offre> allOffres() {
		// TODO Auto-generated method stub
		return em.createQuery("Select a From Offre a", Offre.class).getResultList();
	}

	@Override
	public Offre updateOffre(Offre offre) {
		// TODO Auto-generated method stub
		em.merge(offre);
		return offre;
	}

	@Override
	public Offre deleteOffre(int idOffre) {
		// TODO Auto-generated method stub
		Offre o = em.find(Offre.class, idOffre);
		em.remove(o);
		return o;
	}

	@Override
	public Offre findOffre(int idOffre) {
		// TODO Auto-generated method stub
		return em.find(Offre.class, idOffre);
	}

	@Override
	public Offre addOffre(Offre offre, int idDemande, int id) {
		// TODO Auto-generated method stub

		Demandes d = em.find(Demandes.class, idDemande);
		Membre m = em.find(Membre.class, id);
		if (d == null) {
			throw new RuntimeException("demande n'éxiste pas");
		}
		if (m == null) {
			throw new RuntimeException("membre n'éxiste pas");
		}

		offre.setMembre(m);
		offre.setDemande(d);

		em.merge(offre);

		return offre;
	}

}
