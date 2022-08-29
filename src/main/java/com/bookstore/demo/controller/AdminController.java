package com.bookstore.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@PostMapping("/admin/login")
	public String login(Model model)
	{
		return "adminlogin";
	}

}
