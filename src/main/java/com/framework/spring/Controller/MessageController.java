package com.framework.spring.Controller;


	import java.util.List;
import java.util.Map;

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

import com.framework.spring.Dao.ImplMessageDao;
import com.framework.spring.Dao.MessageDao;
import com.framework.spring.Metier.MessageMetier;
import com.framework.spring.entites.Message;



	@Controller
	public class MessageController {
		
		@Autowired
		private MessageMetier messageMetier ;
	
		@RequestMapping(value="/messages", method = RequestMethod.POST, produces = "application/json")
		public @ResponseBody Message addMessage(@RequestBody Message message) {
			return 	messageMetier.addMessage(message);
			}
		
		@RequestMapping(value="/messages", method = RequestMethod.GET, produces = "application/json")
		public @ResponseBody List<Message> allMessages() {			
			return messageMetier.allMessages();
			}
		@RequestMapping(value="/messagesByMembre/{id}", method = RequestMethod.GET, produces = "application/json")
		public @ResponseBody List<Message> allMessagesByMembre(@PathVariable int id) {	
			System.out.println(id);
			return messageMetier.allMessagesByMembreId(id);
			}
		
		@RequestMapping(value="/messages/{id}", method = RequestMethod.GET, produces = "application/json")
		public @ResponseBody Message showMessage(@PathVariable int id) {
			return messageMetier.findMessage(id);
			}
		
		@RequestMapping(value="/messages/{id}", method = RequestMethod.PUT, produces = "application/json")
		public @ResponseBody Message updateMessage(@PathVariable int id,@RequestBody Message message) {
			message.setIdMessage(id);
			return messageMetier.updateMessage(message);
			}
		
		@RequestMapping(value="/messages/{id}", method = RequestMethod.DELETE, produces = "application/json")
		public @ResponseBody Message deleteMessage(@PathVariable int id) {
			return messageMetier.deleteMessage(id);
			}
	}