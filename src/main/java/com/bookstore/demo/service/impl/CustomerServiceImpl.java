package com.bookstore.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.demo.Repo.bookRepo;
import com.bookstore.demo.Repo.customerRepo;
import com.bookstore.demo.entity.Book;
import com.bookstore.demo.entity.Customer;
import com.bookstore.demo.entity.CustomerDetails;
import com.bookstore.demo.service.CustomerService;
import com.bookstore.demo.service.bookService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Service
public class CustomerServiceImpl implements CustomerService, UserDetailsService{
	
	@Autowired
	private customerRepo custRepo;
	@Autowired
	private bookRepo bookrepo;
	/*
	 * @Autowired private Customer customer;
	 */

	@Override
	public Customer saveBook(Customer customer) {
		
		  BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		  String encodedPassword =passwordEncoder.encode(customer.getpassword());
		  System.out.println(customer.getpassword());
		  System.out.println("Encoded Password" +encodedPassword);
		  customer.setpassword(encodedPassword);
		 
		   
		return custRepo.save(customer);
	}

	@Override
	public List<Book> viewBook() {
		return bookrepo.findAll();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 Customer customer = custRepo.findByUsername(username);
	        if(customer != null){
	            return new CustomerDetails(customer);
	        }else {
	            throw new UsernameNotFoundException("Invalid email or password");
	        }
	    
	}

	
	
	@Override
    public Customer findByUsername(String username) {
        
			return custRepo.findByUsername(username);

    }


}
