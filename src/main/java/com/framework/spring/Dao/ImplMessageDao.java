package com.framework.spring.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.framework.spring.entites.Message;

public class ImplMessageDao implements MessageDao{

	
	 @PersistenceContext
		private EntityManager em;
	 
			@Override
			public Message addMessage(Message message) {
				em.persist(message);
				return message;
			}

			@Override
			public List<Message> allMessages() {
				  return em.createQuery("Select a From Message a",
						  Message.class).getResultList();
			}
			@Override
			public List<Message> allMessagesByMembreId(int idMembre) {
				  return (em.createQuery("Select a From Message a where destinataireId=:idMembre or destinateurId=:idMembre",
						  Message.class)).setParameter("idMembre", idMembre).getResultList();
			}
			
			@Override
			public Message findMessage(int idMessage) {
				return em.find(Message.class, idMessage);
			}
			
			@Override
			public Message updateMessage(Message message) {
				em.merge(message);
				return message;
			}

			@Override
			public Message deleteMessage(int idMessage) {
				Message m =  em.find(Message.class, idMessage);
				em.remove(m);
				return m;
			}
			
}
