package com.bookstore.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.demo.entity.Book;
import com.bookstore.demo.entity.Customer;

public interface customerRepo extends JpaRepository<Customer,Integer>{
	Customer findByUsername(String username);

}
