package com.bookstore.demo.service;

import java.util.List;
import java.util.Optional;

import com.bookstore.demo.entity.Cart;

public interface CartService  {
	Cart saveTocart(int productid);
	List<Cart> viewCart();
	Optional<Cart> removeCart(int productid);
	List<Cart>  proccedOrder();
}
