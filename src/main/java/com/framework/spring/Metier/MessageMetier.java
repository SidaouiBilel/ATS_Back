package com.framework.spring.Metier;

import java.util.List;

import com.framework.spring.entites.Message;

public interface MessageMetier {

	
	public Message addMessage(Message message) ;

	List<Message> allMessages();

	Message updateMessage(Message message);

	Message deleteMessage(int idMessage);

	Message findMessage(int idMessage);

	public List<Message> allMessagesByMembreId(int idMembre) ;


}
