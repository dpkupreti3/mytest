package myfirstproject.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import myfirstproject.service.CustomerService;

@RestController
public class CustomerController {

	CustomerService customerService;
	
	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/customers/{id}")
	public String get(@PathVariable("id") int id) {
		return customerService.get(id);
		
	
	}
}
