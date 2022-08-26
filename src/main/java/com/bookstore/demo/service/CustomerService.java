package com.bookstore.demo.service;

import java.util.List;
import java.util.Optional;

import com.bookstore.demo.entity.Book;
import com.bookstore.demo.entity.Customer;

public interface CustomerService {

	Customer saveBook(Customer customer);
	List<Book> viewBook();
	/* Optional<Customer> findbyusername(String username); */
	 Customer findByUsername(String username);
}
