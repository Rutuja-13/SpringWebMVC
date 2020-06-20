package com.clc.SpringWebMVC;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Appcontroller {

	@RequestMapping("start")
	public String test(){
		
		System.out.println("appcontroller welcome method");
		return "index";
	}
	
	
	@RequestMapping("list_contacts")
	public String contactList(Model model){
		
		ContactBusiness cb = new ContactBusiness();
		List<Contact> contactlist = cb.getContactList();
		model.addAttribute("contacts", contactlist);
		return "contact";
		
	}
}
