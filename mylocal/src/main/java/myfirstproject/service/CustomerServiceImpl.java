package myfirstproject.service;

import org.springframework.stereotype.Service;

import myfirstproject.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String get(int id) {
		return "Deepak";
		
	}

}
