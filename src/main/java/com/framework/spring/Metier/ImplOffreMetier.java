package com.framework.spring.Metier;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.framework.spring.Dao.OffreDao;
import com.framework.spring.entites.Offre;

@Transactional
public class ImplOffreMetier implements OffreMetier {

	private OffreDao offreDao;

	public void setOffreDao(OffreDao offreDao) {
		this.offreDao = offreDao;
	}

	@Override
	public Offre addOffre(Offre offre, int idDemande, int id) {
		// TODO Auto-generated method stub
		return offreDao.addOffre(offre, idDemande, id);
	}

	@Override
	public List<Offre> allOffres() {
		// TODO Auto-generated method stub
		return offreDao.allOffres();
	}

	@Override
	public Offre updateOffre(Offre offre) {
		// TODO Auto-generated method stub
		return offreDao.updateOffre(offre);
	}

	@Override
	public Offre deleteOffre(int idOffre) {
		// TODO Auto-generated method stub
		return offreDao.deleteOffre(idOffre);
	}

	@Override
	public Offre findOffre(int idOffre) {
		// TODO Auto-generated method stub
		return offreDao.findOffre(idOffre);
	}

}
