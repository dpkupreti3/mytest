package myfirstproject.service;

import myfirstproject.model.Customer;

public interface CustomerService {
	
	void save(Customer customer);
	
	String get(int id);
	

}
