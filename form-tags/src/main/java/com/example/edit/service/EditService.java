package com.example.edit.service;

import com.example.edit.model.Person;

public interface EditService {
	
	
	Person getPerson() ;

	void savePerson(Person personBean);

}
