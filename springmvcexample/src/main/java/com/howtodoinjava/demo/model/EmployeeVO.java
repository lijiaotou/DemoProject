package com.howtodoinjava.demo.model;
 
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
 
public class EmployeeVO implements Serializable
{
    private static final long serialVersionUID = 1L;
 
    
    Integer id;
	String firstName;
    String lastName;
 
    //Setters and Getters
    
 public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
    @Override
    public String toString() {
        return "EmployeeVO [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + "]";
    }
}