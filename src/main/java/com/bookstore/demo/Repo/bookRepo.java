package com.bookstore.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.demo.entity.Book;

public interface bookRepo extends JpaRepository<Book, Integer>{

}
