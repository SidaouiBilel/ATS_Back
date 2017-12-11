package com.framework.spring.Metier;

import java.util.List;

import com.framework.spring.entites.Material;

public interface MaterialMetier {

	public Material addMaterial(Material demande) ;

	List<Material> allMaterials();

	Material updateMaterial(Material Demande);

	Material deleteMaterial(int id_dem);

	Material findMaterial(int id_dem);
}
