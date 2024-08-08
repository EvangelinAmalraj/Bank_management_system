package com.bank.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.app.entity.Customer;
import com.bank.app.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public String SaveCustomer(Customer customer) {
		customer.setGender(customer.getGender().equals("M")?"Male":"Female");
		customerRepository.save(customer);
		return "Customer Saved";
	}

	@Override
	public List<Customer> fetchAllCustomers() {
		return customerRepository.findAll();
	}

}
