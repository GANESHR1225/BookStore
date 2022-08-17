package com.bookstore.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.demo.Repo.bookRepo;
import com.bookstore.demo.Repo.customerRepo;
import com.bookstore.demo.entity.Book;
import com.bookstore.demo.entity.Customer;
import com.bookstore.demo.service.CustomerService;
import com.bookstore.demo.service.bookService;
@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private customerRepo custRepo;
	@Autowired
	private bookRepo bookrepo;

	@Override
	public Customer saveBook(Customer customer) {
		return custRepo.save(customer);
	}

	@Override
	public List<Book> viewBook() {
		return bookrepo.findAll();
	}


}
