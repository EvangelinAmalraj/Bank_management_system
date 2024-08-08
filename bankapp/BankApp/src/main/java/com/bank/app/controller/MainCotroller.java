package com.bank.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bank.app.entity.Customer;
import com.bank.app.service.CustomerService;

@Controller
public class MainCotroller {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/home")
	public String index() {
		return "index";
	}

	@GetMapping("/signin")
	public String signin() {
		return "login";
	}

	@GetMapping("/newcustomer")
	public String newCustomer() {
		return "newcustomer";
	}

	@PostMapping("/newcustomer")
	public String addCustomer(Customer customer, Model model) {
		customerService.SaveCustomer(customer);
		model.addAttribute("response", "Record Added");
		return "newcustomer";
	}

	@GetMapping("/viewcustomer")
	public ModelAndView viewCustomer() {
		List<Customer> customers = customerService.fetchAllCustomers();
		ModelAndView model = new ModelAndView();
		if (!customers.isEmpty()) {
			model.addObject("customers", customers);
		}
		model.setViewName("viewcustomers");
		return model;
	}

}
