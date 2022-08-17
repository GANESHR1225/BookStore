package com.bookstore.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookstore.demo.Repo.bookRepo;
import com.bookstore.demo.entity.Book;
import com.bookstore.demo.entity.Customer;


public interface bookService{
	
Book saveBook(Book book);

List<Book> viewBook();
List<Customer> viewUser();
}
