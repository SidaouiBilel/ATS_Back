package com.framework.spring.Dao;

import java.util.List;

import com.framework.spring.entites.Message;

public interface MessageDao {

	
	 public Message addMessage (Message message);

	public List<Message> allMessages();

	public Message updateMessage(Message message);

	public Message deleteMessage(int idMessage);

	Message findMessage(int idMessage);

	List<Message> allMessagesByMembreId(int idMembre);


}