package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookServices;

@RestController
@RequestMapping(path="/api/v1")

public class BookController 
{

	private BookServices service;

	@Autowired
	public BookController(BookServices service) {
		super();
		this.service = service;
	}
	
	@GetMapping(path = "/books")
	public List<Book> findAll()
	{
		return this.service.findAll();
		
	}
	
}
