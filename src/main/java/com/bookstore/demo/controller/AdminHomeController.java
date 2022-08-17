package com.bookstore.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.demo.entity.Book;
import com.bookstore.demo.entity.Customer;
import com.bookstore.demo.service.bookService;


@Controller
public class AdminHomeController {
	private bookService bkService;
	
	@Autowired
	public AdminHomeController(bookService bkService) {
		super();
		this.bkService = bkService;
	}

	@RequestMapping("/Adminhome")
	public String home(Model m)
	{
		return "Adminhome";
	}
	
	@RequestMapping("/addBook")
	public String newBookRegisterform(Model m)
	{
		Book book = new Book();
		m.addAttribute("book", book);
		return "addBook";
	}
	
	@RequestMapping("/add")
	public String saveBook(@ModelAttribute("book") Book bk)
	{
		bkService.saveBook(bk);
		
		return "redirect:/Adminhome";
	}
	@RequestMapping("/view")
	public String viewBook(Model m)
	{
		
		List<Book>books=bkService.viewBook();
		m.addAttribute("book", books);
		return "viewBook";
	}
	@GetMapping("/viewCustomer")
	public String viewUser(Model m)
	{
		
		List<Customer>customer=bkService.viewUser();
		m.addAttribute("customer", customer);
		return "viewCustomer";
	}
}
