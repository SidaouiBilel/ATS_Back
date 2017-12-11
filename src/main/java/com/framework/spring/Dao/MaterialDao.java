package com.framework.spring.Dao;

import java.util.List;

import com.framework.spring.entites.Material;

public interface MaterialDao {

	public Material addMaterial(Material demande) ;

	public List<Material> allMaterials();

	public Material updateMaterial(Material Demande);

	public Material deleteMaterial(int id_dem);

	public Material findMaterial(int id_dem);
}
