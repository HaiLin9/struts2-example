package com.example.control.service;

import com.example.control.model.Person;

/**
 * Implement Services needed to edit and save
 * a Person object's state.  In this implementation
 * the Person object's state is stored in memory
 * @author brucephillips
 *
 */
public class EditServiceInMemory implements EditService {
	
	
	private static Person person ;
	private static String [] carModels = {"Ford","Nissan"};

	
	static {
		
		person = new Person();
		person.setFirstName("Bruce");
		person.setLastName("Phillips");
		person.setEmail("837383993@163.com");
		person.setPhoneNumber("999-999-9999");
		person.setSport("basketball");
		person.setGender("not sure");
		person.setResidency("KS");
		person.setOver21(true);		
		person.setCarModels( carModels);		

	}

	
	public Person getPerson() {
		
		return EditServiceInMemory.person;
	}


	public void savePerson(Person personBean) {

		EditServiceInMemory.person.setFirstName(personBean.getFirstName() );
		EditServiceInMemory.person.setLastName(personBean.getLastName() );
		EditServiceInMemory.person.setSport(personBean.getSport() );
		EditServiceInMemory.person.setGender( personBean.getGender() );
		EditServiceInMemory.person.setResidency( personBean.getResidency() );
		EditServiceInMemory.person.setOver21( personBean.isOver21() );
		EditServiceInMemory.person.setCarModels(personBean.getCarModels() );
		EditServiceInMemory.person.setEmail(personBean.getEmail());
		EditServiceInMemory.person.setPhoneNumber(personBean.getPhoneNumber());

	}

}
