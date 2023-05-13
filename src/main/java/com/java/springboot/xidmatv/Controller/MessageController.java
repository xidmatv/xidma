package com.java.springboot.xidmatv.Controller;
import com.java.springboot.xidmatv.data.MessageDAO;
import com.java.springboot.xidmatv.model.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MessageController {
	//private List<Message> messageList = new ArrayList<>();
	@Autowired
	public MessageDAO messageDAO;
	@PostMapping(path="/msg" )
	public String postMessage(@ModelAttribute Message newMessage) {
		//messageList.add(newMessage);
		
		Message msg = new Message(newMessage.getAuthor(),newMessage.getBody());
		messageDAO.save(msg);
		return "redirect:msg";
		
	}
	@RequestMapping(path="/msg", method=RequestMethod.GET)
	public String showMessage(Model model) {
		/*Message msg1 = new Message("loufa","bonjour , je suis en test");
		Message msg2 = new Message("Mouha","bonjour , je suis en test 1");
		messageList.add(msg1);
		messageList.add(msg2);*/
		
		model.addAttribute("msgList", messageDAO.findAll());
		model.addAttribute("newMessage", new Message());
		return "MessagePage";
	}
	
}
