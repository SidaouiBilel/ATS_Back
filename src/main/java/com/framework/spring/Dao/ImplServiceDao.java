package com.framework.spring.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.framework.spring.entites.Service;


public class ImplServiceDao implements ServiceDao{

	@PersistenceContext
	private EntityManager em;
 
		@Override
		public Service addService(Service demande) {
			em.persist(demande);
			return demande;
		}

		@Override
		public List<Service> allServices() {
			  return em.createQuery("Select a From Service a",
					  Service.class).getResultList();
		}

		
		@Override
		public Service findService(int id_dem) {
			return em.find(Service.class, id_dem);
		}
		
		@Override
		public Service updateService(Service id_dem) {
			em.merge(id_dem);
			return id_dem;
		}

		@Override
		public Service deleteService(int id_dem) {
			Service m =  em.find(Service.class, id_dem);
			em.remove(m);
			return m;
		}
}
