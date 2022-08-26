package com.bookstore.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.demo.entity.Book;
import com.bookstore.demo.entity.Customer;
import com.bookstore.demo.service.CustomerService;
import com.bookstore.demo.service.bookService;
import com.bookstore.demo.validator.CustomerValidator;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService custService;
	
	 @Autowired
	  private CustomerValidator customervalidator;
	

	@RequestMapping("/customer/login")
	public String login(Model model) {
		System.out.println(" customer controller in**********");
		return "customerlogin";
	}

	@RequestMapping("/customer/home")
	public String home(Model m) {
		return "customerhome";
	}

	@RequestMapping("/customer/newCustomerRegistration")
	public String addNewCustomerForm(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "newCustomerRegistration";
	}

	@PostMapping("/customer/addcustomer")
	public String addNewCustomer(@ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		
		customervalidator.validate(customer, bindingResult);
		 if (bindingResult.hasErrors()) {
	            return "newCustomerRegistration";
	        }
		 else {
		custService.saveBook(customer);
		 
		return "customerlogin";
		 }
	}

	@RequestMapping("/customer/viewbookcust")
	public String viewBook(Model m) {
		List<Book> books = custService.viewBook();
		m.addAttribute("book", books);
		return "viewBookCust";
	}

}
