package com.bookstore.demo.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.demo.Repo.CartRepo;
import com.bookstore.demo.entity.Book;
import com.bookstore.demo.entity.Cart;
import com.bookstore.demo.entity.Customer;
import com.bookstore.demo.service.CartService;
import com.bookstore.demo.service.CustomerService;

@Controller
@RequestMapping("/")
public class CartController {
	@Autowired
	private CartService cartService;
	@Autowired
	private CartRepo cartRepo;
	@Autowired
	private CustomerService custService;

	@PostMapping(value = "/{productid}")
	public String addToCart(@PathVariable("productid") int productid, Model m) {

		cartService.saveTocart(productid);
		List<Book> books = custService.viewBook();
		m.addAttribute("book", books);
		return "viewBookCust";
	}

	@RequestMapping("/viewcart")
	public String viewBook(Model m) {
		List<Cart> product = cartService.viewCart();
		m.addAttribute("product", product);
		return "cart";
	}

	@RequestMapping("/{productid}")
	public String removecart(@PathVariable("productid") int productid) {
		Optional<Cart> product = cartService.removeCart(productid);

		if (product.isPresent()) {
			cartRepo.deleteById(productid);
		}
		return "cart";
	}

	@PostMapping(value = "/orderfor/{id}")
	public String saveOrder(@PathVariable("id") int productid, Model m) {
		List<Cart> orderlist = cartService.proccedOrder();

		List<Cart> fileterlist = orderlist.stream().filter(order -> order.getIsbn() == productid)
				.collect(Collectors.toList());

		m.addAttribute("orderlist", fileterlist);
		return "order";
	}

}
