package com.framework.spring.Metier;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.framework.spring.Dao.DemandesDao;
import com.framework.spring.entites.Demandes;

@Transactional
public class implDemandesMetier implements DemandesMetier{


	
		private DemandesDao demandesdao;
 
		public void setDemandesDao(DemandesDao demandesDao) {
			this.demandesdao = demandesDao;
		}
			@Override
			public Demandes addDemande(Demandes demandes) {
				// TODO Auto-generated method stub
				return demandesdao.addDemande(demandes);
			}

			
			@Override
			public Demandes deleteDemande(int id) {
				return demandesdao.deleteDemande(id);
				
			}
			
			@Override
			public Demandes updateDemande(Demandes dem) {
				// TODO Auto-generated method stub
				return demandesdao.updateDemande(dem);
			}
			
			@Override
			public List<Demandes> allDemandes() {
				// TODO Auto-generated method stub
				return demandesdao.allDemandes();
			}
			
			@Override
			public Demandes findDemande(int id) {
				Demandes demande = demandesdao.findDemande(id);
				return demande;
			}
}
