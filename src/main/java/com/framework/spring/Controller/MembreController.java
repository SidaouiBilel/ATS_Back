package com.framework.spring.Controller;


	import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.el.ImplicitObjectELResolver;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.framework.spring.Dao.ImplMembreDao;
import com.framework.spring.Dao.MembreDao;
import com.framework.spring.Metier.MembreMetier;
import com.framework.spring.entites.Membre;



	@Controller
	public class MembreController {
		
		@Autowired
		private MembreMetier membreMetier ;
	
		@RequestMapping(value="/connexion", method = RequestMethod.POST, produces = "application/json")
		public @ResponseBody Membre connexion(HttpServletRequest request) {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
		 	Membre membre = membreMetier.membreExists( email, password);
	        HttpSession session = request.getSession();
	        if(membre!=null) session.setAttribute("membre", membre);
	        return membre;
			}
		@RequestMapping(value="/deconnexion", method = RequestMethod.GET, produces = "application/json")
		public @ResponseBody void deconnexion(HttpServletRequest request) {
			HttpSession session = request.getSession();
        	session.invalidate();	
		}
		
		@RequestMapping(value="/membres", method = RequestMethod.POST, produces = "application/json")
		public @ResponseBody Membre addMembre(@RequestBody Membre membre) {
			return 	membreMetier.addMembre(membre);
			}
		
		@RequestMapping(value="/membres", method = RequestMethod.GET, produces = "application/json")
		public @ResponseBody List<Membre> allMembres() {			
			return membreMetier.allMembres();
			}
		
		@RequestMapping(value="/membres/{id}", method = RequestMethod.GET, produces = "application/json")
		public @ResponseBody Membre showMembre(@PathVariable int id) {
			return membreMetier.findMembre(id);
			}
		
		@RequestMapping(value="/membres/{id}", method = RequestMethod.PUT, produces = "application/json")
		public @ResponseBody Membre updateMembre(@PathVariable int id,@RequestBody Membre membre) {
			membre.setIdMembre(id);
			return membreMetier.updateMembre(membre);
			}
		
		@RequestMapping(value="/membres/{id}", method = RequestMethod.DELETE, produces = "application/json")
		public @ResponseBody Membre deleteMembre(@PathVariable int id) {
			return membreMetier.deleteMembre(id);
			}
	}