package com.bank.app.service;

import java.util.List;

import com.bank.app.entity.Customer;

public interface CustomerService {

	public String SaveCustomer(Customer customer);
	public List<Customer> fetchAllCustomers();
}
