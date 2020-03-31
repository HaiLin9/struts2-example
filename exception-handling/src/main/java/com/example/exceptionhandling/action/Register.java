package com.example.exceptionhandling.action;

import com.example.exceptionhandling.exceptions.SecurityBreachException;
import com.example.exceptionhandling.model.Person;
import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private Person
            personBean;

    public String input(){
        return INPUT;
    }

    @Override
    public void validate(){
        if(personBean==null) {
            return;
        }

        if(personBean.getFirstName().length()==0){
            addFieldError("personBean.firstName","First name is required.");
        }
        if (personBean.getEmail().length() == 0) {
            addFieldError("personBean.email", "Email is required.");
        }

        if (personBean.getAge() < 18) {
            addFieldError("personBean.age", "Age is required and must be 18 or older");
        }
    }


    public String execute() throws Exception {
        //call Service class to store personBean's state in database

        return SUCCESS;
    }

    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person person) {
        personBean = person;
    }

    public void throwSecurityException() throws SecurityBreachException {

        throw new SecurityBreachException(
                "Security breach exception thrown from throwSecurityException");
    }

    public void throwNullPointerException() throws NullPointerException{
        throw new NullPointerException();
    }

}
