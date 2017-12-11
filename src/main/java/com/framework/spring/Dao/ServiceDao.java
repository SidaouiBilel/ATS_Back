package com.framework.spring.Dao;

import java.util.List;

import com.framework.spring.entites.Service;

public interface ServiceDao {

	public Service addService(Service demande) ;

	public List<Service> allServices();

	public Service updateService(Service Demande);

	public Service deleteService(int id_dem);

	public Service findService(int id_dem);
}
