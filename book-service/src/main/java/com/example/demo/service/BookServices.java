package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.ifaces.BookRepository;

@Service
public class BookServices
{
	private BookRepository repo;

	@Autowired
	public BookServices(BookRepository repo) {
		super();
		this.repo = repo;
	}
	
	public List<Book> findAll()
	{
		return this.repo.findAll();
		
	}
	

}
