package org.apache.cxf.rs.examples.service;

import org.apache.cxf.rs.examples.Calendar;

public class UserAccount {
	
    private String name;
    
    private String password;
    
    private Calendar calendar = new Calendar();

    public UserAccount(String name, String password) {
    	this.name = name;
    	this.password = password;
    }
    
    public String getName() {
    	return name;
    }
    
    public String getPassword() {
    	return password;
    }
    
	public Calendar getCalendar() {
		return calendar;
	}
}
