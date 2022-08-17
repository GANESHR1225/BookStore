package com.bookstore.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.demo.Repo.CartRepo;
import com.bookstore.demo.Repo.bookRepo;
import com.bookstore.demo.entity.Book;
import com.bookstore.demo.entity.Cart;
import com.bookstore.demo.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepo cartrepo;

	@Autowired
	private bookRepo bkr;

	@Override
	public Cart saveTocart(int productid) {

		Book bk = bkr.findById(productid).orElseThrow(IllegalArgumentException::new);
		Cart cart = new Cart(bk.getIsbn(), bk.getPrice(), bk.getName(), bk.getAuthor());
		return cartrepo.save(cart);
	}

	@Override
	public List<Cart> viewCart() {
		return cartrepo.findAll();
	}

	@Override
	public Optional<Cart> removeCart(int productid)

	{
		Optional<Cart> Product = cartrepo.findById(productid);
		return Product;

	}
	/*
	 * @Override public Optional<Cart> proccedOrder(int productid) {
	 * 
	 * Optional<Cart> bk = cartrepo.findById(productid); return bk; }
	 */

	@Override
	public List<Cart> proccedOrder() {

		List<Cart> bk = cartrepo.findAll();
		return bk;
	}
}
