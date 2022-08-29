package com.bookstore.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.bookstore.demo.Repo.customerRepo;
import com.bookstore.demo.entity.Customer;
import com.bookstore.demo.entity.CustomerDetails;

public class CustomerModelServiceImpl implements UserDetailsService{

	   @Autowired
	   private customerRepo repo;
	   
	    @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        Customer customer = repo.findByUsername(username);
	        if (customer == null) {
	            throw new UsernameNotFoundException("No user found with the given email");
	        }
	         
	         System.out.println("inside if");
            return new CustomerDetails(customer);
	    }
	 
	
}
