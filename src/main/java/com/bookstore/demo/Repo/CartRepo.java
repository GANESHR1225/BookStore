package com.bookstore.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.demo.entity.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer>{

}
