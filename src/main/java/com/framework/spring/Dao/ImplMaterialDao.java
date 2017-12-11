package com.framework.spring.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.framework.spring.entites.Material;

public class ImplMaterialDao implements MaterialDao{

	@PersistenceContext
	private EntityManager em;
 
		@Override
		public Material addMaterial(Material demande) {
			em.persist(demande);
			return demande;
		}

		@Override
		public List<Material> allMaterials() {
			  return em.createQuery("Select a From Material a",
					  Material.class).getResultList();
		}

		
		@Override
		public Material findMaterial(int id_dem) {
			return em.find(Material.class, id_dem);
		}
		
		@Override
		public Material updateMaterial(Material id_dem) {
			em.merge(id_dem);
			return id_dem;
		}

		@Override
		public Material deleteMaterial(int id_dem) {
			Material m =  em.find(Material.class, id_dem);
			em.remove(m);
			return m;
		}
}
