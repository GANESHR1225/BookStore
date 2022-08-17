package com.bookstore.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.demo.Repo.bookRepo;
import com.bookstore.demo.Repo.customerRepo;
import com.bookstore.demo.entity.Book;
import com.bookstore.demo.entity.Customer;
import com.bookstore.demo.service.bookService;

@Service
public class BookServiceImpl implements bookService {
	@Autowired
	private bookRepo bkrepo;
	@Autowired
	private customerRepo custrepo;
	

	public BookServiceImpl(bookRepo bkrepo) {
		super();
		this.bkrepo = bkrepo;
	}

	@Override
	public Book saveBook(Book book) {
		return bkrepo.save(book);
	}

	@Override
	public List<Book> viewBook() {
		return bkrepo.findAll();
	}

	@Override
	public List<Customer> viewUser() {
		return custrepo.findAll();
	}

}
