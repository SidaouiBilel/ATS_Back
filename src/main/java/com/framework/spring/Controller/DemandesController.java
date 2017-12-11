package com.framework.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.framework.spring.Metier.DemandesMetier;
import com.framework.spring.Metier.MaterialMetier;
import com.framework.spring.Metier.ServiceMetier;
import com.framework.spring.entites.Demandes;
import com.framework.spring.entites.Material;
import com.framework.spring.entites.Service;

@Controller
public class DemandesController {

	@Autowired
	private DemandesMetier demandeMetier;
	private ServiceMetier serviceMetier;
	private MaterialMetier materialMetier;
	
	@RequestMapping(value="/demandes", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody Demandes addDemande(@RequestBody Demandes demande) {
		return 	demandeMetier.addDemande(demande);
		}
	
	@RequestMapping(value="/demandes", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Demandes> allDemandes() {			
		return demandeMetier.allDemandes();
		}
	
	@RequestMapping(value="/demandes/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Demandes showDemande(@PathVariable int id) {
		return demandeMetier.findDemande(id);
		}
	
	@RequestMapping(value="/demandes/{id}", method = RequestMethod.PUT, produces = "application/json")
	public @ResponseBody Demandes updateDemande(@PathVariable int id,@RequestBody Demandes demande) {
		demande.setId_dem(id);
		return demandeMetier.updateDemande(demande);
		}
	
	@RequestMapping(value="/demandes/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public @ResponseBody Demandes deleteDemande(@PathVariable int id) {
		return demandeMetier.deleteDemande(id);
		}
	
	
	
		//Service
	@RequestMapping(value="/services", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody Service addService(@RequestBody Service demande) {
		return 	serviceMetier.addService(demande);
		}
	
	@RequestMapping(value="/services", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Service> allServices() {			
		return serviceMetier.allServices();
		}
	
	@RequestMapping(value="/services/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Service showService(@PathVariable int id) {
		return serviceMetier.findService(id);
		}
	
	@RequestMapping(value="/services/{id}", method = RequestMethod.PUT, produces = "application/json")
	public @ResponseBody Demandes updateService(@PathVariable int id,@RequestBody Service demande) {
		demande.setId_dem(id);
		return serviceMetier.updateService(demande);
		}
	
	@RequestMapping(value="/services/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public @ResponseBody Demandes deleteService(@PathVariable int id) {
		return serviceMetier.deleteService(id);
		}
	
		//Material
	@RequestMapping(value="/materials", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody Material addMaterial(@RequestBody Material demande) {
		return 	materialMetier.addMaterial(demande);
		}
	
	@RequestMapping(value="/materials", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Material> allMaterials() {			
		return materialMetier.allMaterials();
		}
	
	@RequestMapping(value="/materials/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Material showMaterial(@PathVariable int id) {
		return materialMetier.findMaterial(id);
		}
	
	@RequestMapping(value="/materials/{id}", method = RequestMethod.PUT, produces = "application/json")
	public @ResponseBody Material updateMaterial(@PathVariable int id,@RequestBody Material demande) {
		demande.setId_dem(id);
		return materialMetier.updateMaterial(demande);
		}
	
	@RequestMapping(value="/materials/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public @ResponseBody Material deleteMaterial(@PathVariable int id) {
		return materialMetier.deleteMaterial(id);
		}
}
