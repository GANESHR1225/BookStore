package com.bookstore.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.bookstore.demo.Repo.bookRepo;
import com.bookstore.demo.Repo.customerRepo;
import com.bookstore.demo.entity.Book;
import com.bookstore.demo.entity.Customer;

@SpringBootApplication(scanBasePackages={
		"com.bookstore.demo.controller",
		"com.bookstore.demo.entity","com.bookstore.demo.service","com.bookstore.demo.service.impl"})
public class BookstoreApplication implements CommandLineRunner  {
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	@Autowired
	bookRepo bookrepo;
	@Autowired
	customerRepo custrepo;
	@Override
	public void run(String... args) throws Exception {
		Book bk = new Book(123,2000, 1, "Python", "Pritam");
		bookrepo.save(bk);
		
		Customer customer = new Customer(1, "vicky", "jhon", "Mumbai", "abc@demo.com", "25-12-1995", "Vicky", "12345");
		custrepo.save(customer);
		
	}

}
