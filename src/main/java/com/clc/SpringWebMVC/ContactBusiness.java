package com.clc.SpringWebMVC;

import java.util.ArrayList;
import java.util.List;

public class ContactBusiness {

	public List<Contact> getContactList(){
		
		List<Contact> contactlist = new ArrayList<>();
		contactlist.add(new Contact("rj", 11111111, "France"));
		contactlist.add(new Contact("pega", 22222222, "Italy"));
		contactlist.add(new Contact("bob", 33333333, "orlando"));
		contactlist.add(new Contact("pikachu", 444444444, "USA"));
		
		return contactlist;
	}
}
