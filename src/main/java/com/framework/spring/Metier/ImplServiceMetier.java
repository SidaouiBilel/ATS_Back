package com.framework.spring.Metier;

import java.util.List;

import com.framework.spring.Dao.ServiceDao;
import com.framework.spring.entites.Service;

public class ImplServiceMetier implements ServiceMetier{

	private ServiceDao servicedao;
	 
	public void setServiceDao(ServiceDao serviceDao) {
		this.servicedao = serviceDao;
	}
		@Override
		public Service addService(Service demandes) {
			// TODO Auto-generated method stub
			return servicedao.addService(demandes);
		}

		
		@Override
		public Service deleteService(int id) {
			return servicedao.deleteService(id);
			
		}
		
		@Override
		public Service updateService(Service dem) {
			// TODO Auto-generated method stub
			return servicedao.updateService(dem);
		}
		
		@Override
		public List<Service> allServices() {
			// TODO Auto-generated method stub
			return servicedao.allServices();
		}
		
		@Override
		public Service findService(int id) {
			Service demande = servicedao.findService(id);
			return demande;
		}
}
