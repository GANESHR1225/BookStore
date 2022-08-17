package com.bookstore.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class Book {

	@Id
	private int isbn;
	private int price,edition;
	
	public Book() {}
	public Book(int isbn, int price, int edition, String name, String author) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.edition = edition;
		this.name = name;
		this.author = author;
	}
	private String name;
	private String author;
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
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
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
