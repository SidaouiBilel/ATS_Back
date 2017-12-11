package com.framework.spring.Metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.framework.spring.Dao.MessageDao;
import com.framework.spring.entites.Message;

@Transactional
public class ImplMessageMetier implements MessageMetier{
	
	 private MessageDao messageDao ;
	 
		public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}
		@Override
		public Message addMessage(Message message) {
			// TODO Auto-generated method stub
			return messageDao.addMessage(message);
		}

		
		@Override
		public Message deleteMessage(int idMessage) {
			return messageDao.deleteMessage(idMessage);
			
		}
		
		@Override
		public Message updateMessage(Message message) {
			// TODO Auto-generated method stub
			return messageDao.updateMessage(message);
		}
		
		@Override
		public List<Message> allMessages() {
			// TODO Auto-generated method stub
			return messageDao.allMessages();
		}
		
		@Override
		public Message findMessage(int idMessage) {
			Message message=messageDao.findMessage(idMessage);
			return message;
		}
		@Override
		public List<Message> allMessagesByMembreId(int idMembre) {
			// TODO Auto-generated method stub
			return messageDao.allMessagesByMembreId(idMembre);
		}
}
