package com.framework.spring.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.framework.spring.entites.Demandes;

public class ImplDemandesDao implements DemandesDao{

	@PersistenceContext
	private EntityManager em;
 
		@Override
		public Demandes addDemande(Demandes demande) {
			em.persist(demande);
			return demande;
		}

		@Override
		public List<Demandes> allDemandes() {
			  return em.createQuery("Select a From Demandes a",
					  Demandes.class).getResultList();
		}

		
		@Override
		public Demandes findDemande(int id_dem) {
			return em.find(Demandes.class, id_dem);
		}
		
		@Override
		public Demandes updateDemande(Demandes id_dem) {
			em.merge(id_dem);
			return id_dem;
		}

		@Override
		public Demandes deleteDemande(int id_dem) {
			Demandes m =  em.find(Demandes.class, id_dem);
			em.remove(m);
			return m;
		}
		
}
