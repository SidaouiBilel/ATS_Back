package com.framework.spring.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.security.crypto.bcrypt.BCrypt;

import com.framework.spring.entites.Membre;
import com.framework.spring.entites.Message;
import com.framework.spring.entites.Offre;
import com.mysql.jdbc.Messages;

public class ImplMembreDao implements MembreDao{

	
	 @PersistenceContext
		private EntityManager em;
	 
			@Override
			public Membre addMembre(Membre membre) {
				em.persist(membre);
				 
				return membre;
			}

			@Override
			public List<Membre> allMembres() {
				  return em.createQuery("Select a From Membre a",
						  Membre.class).getResultList();
			}

			
			@Override
			public Membre findMembre(int idMembre) {
				Membre membre;
				 membre = em.find(Membre.class, idMembre);
				 /* List<Message> messages_envoyes = em.createQuery("Select m From Message m where destinateurId=1",Message.class).getResultList();
				 List<Message> messages_recus = em.createQuery("Select m From Message m where destinataireId=1",Message.class).getResultList();
				 List<Offre> offres = em.createQuery("Select o From Offre o where membreId=1",Offre.class).getResultList();
				 membre.setOffres(offres);
				 membre.setMessages_envoyes(messages_envoyes);
				 membre.setMessages_recus(messages_recus);
				 */
				 return membre;
			}
			
			@Override
			public Membre updateMembre(Membre membre) {
				em.merge(membre);
				return membre;
			}

			@Override
			public Membre deleteMembre(int idMembre) {
				Membre m =  em.find(Membre.class, idMembre);
				em.remove(m);
				return m;
			}

			@Override
			public Membre membreExists(String email, String password) {
				List<Membre> l =  em.createQuery("SELECT c FROM Membre c WHERE c.email =:email and c.password= :password")
				        .setParameter("email", email)
				        .setParameter("password", password)
				        .getResultList();
				 if (l.isEmpty()) return null;
				 return l.get(0);
			}
			
}
