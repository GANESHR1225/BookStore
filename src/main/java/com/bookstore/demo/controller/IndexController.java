package com.bookstore.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {
	
	@GetMapping("/index")
	public String onBrowse(Model m)
	{
		return "login";
	}
	@PostMapping("/adminlogin")
	public String adminLogin(Model m)
	{
		return "adminlogin";
	}
	@RequestMapping("/customer-login")
	public String custLogin(Model m)
	{
		return "customerlogin";
	}
}
