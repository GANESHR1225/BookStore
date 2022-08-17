package com.bookstore.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	private int isbn;
	private int price;
	private String name;
	private String author;
	

	public Cart()
	{
		
	}
	public Cart(int isbn, int price, String name, String author) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.name = name;
		this.author = author;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
