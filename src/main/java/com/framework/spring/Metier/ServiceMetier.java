package com.framework.spring.Metier;

import java.util.List;

import com.framework.spring.entites.Service;


public interface ServiceMetier {
	public Service addService(Service demande) ;

	List<Service> allServices();

	Service updateService(Service Demande);

	Service deleteService(int id_dem);

	Service findService(int id_dem);
}
