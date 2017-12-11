package com.framework.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.framework.spring.Metier.OffreMetier;
import com.framework.spring.entites.Offre;

@Controller
public class OffreController {
	@Autowired
	private OffreMetier offreMetier;

	@RequestMapping(value = "/offres/{idDemande}/{id}", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody Offre addOffre(@RequestBody Offre offre, @PathVariable int idDemande, @PathVariable int id) {
		return offreMetier.addOffre(offre, idDemande, id);

	}

	@RequestMapping(value = "/offres", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Offre> allOffres() {
		return offreMetier.allOffres();
	}

	@RequestMapping(value = "/offres/{idOffre}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Offre showOffre(@PathVariable int idOffre) {
		return offreMetier.findOffre(idOffre);
	}

	@RequestMapping(value = "/offres/{idOffre}", method = RequestMethod.PUT, produces = "application/json")
	public @ResponseBody Offre updateOffre(@PathVariable int idOffre, @RequestBody Offre offre) {
		offre.setIdOffre(idOffre);
		return offreMetier.updateOffre(offre);
	}

	@RequestMapping(value = "/offres/{idOffre}", method = RequestMethod.DELETE, produces = "application/json")
	public @ResponseBody Offre deleteOffre(@PathVariable int idOffre) {
		return offreMetier.deleteOffre(idOffre);
	}

}
