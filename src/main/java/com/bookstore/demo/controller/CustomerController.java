package com.bookstore.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.demo.entity.Book;
import com.bookstore.demo.entity.Customer;
import com.bookstore.demo.service.CustomerService;
import com.bookstore.demo.service.bookService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService custService;
	

	@RequestMapping("/customerlogin")
	public String login(Model model) {
		return "customerlogin";
	}

	@RequestMapping("/customerhome")
	public String home(Model m) {
		return "customerhome";
	}

	@RequestMapping("/newCustomerRegistration")
	public String addNewCustomerForm(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "newCustomerRegistration";
	}

	@PostMapping("/addcustomer")
	public String addNewCustomer(@ModelAttribute("customer") Customer customer) {
		custService.saveBook(customer);

		return "customerlogin";
	}

	@RequestMapping("/viewbookcust")
	public String viewBook(Model m) {
		List<Book> books = custService.viewBook();
		m.addAttribute("book", books);
		return "viewBookCust";
	}

}
