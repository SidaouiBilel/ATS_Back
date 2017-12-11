package com.framework.spring.Metier;

import java.util.List;

import com.framework.spring.Dao.MaterialDao;
import com.framework.spring.entites.Material;


public class ImplMaterialMetier implements MaterialMetier{

	private MaterialDao materialdao;
	 
	public void setMaterialDao(MaterialDao demandesDao) {
		this.materialdao = demandesDao;
	}
		@Override
		public Material addMaterial(Material demandes) {
			// TODO Auto-generated method stub
			return materialdao.addMaterial(demandes);
		}

		
		@Override
		public Material deleteMaterial(int id) {
			return materialdao.deleteMaterial(id);
			
		}
		
		@Override
		public Material updateMaterial(Material dem) {
			// TODO Auto-generated method stub
			return materialdao.updateMaterial(dem);
		}
		
		@Override
		public List<Material> allMaterials() {
			// TODO Auto-generated method stub
			return materialdao.allMaterials();
		}
		
		@Override
		public Material findMaterial(int id) {
			Material demande = materialdao.findMaterial(id);
			return demande;
		}
}
