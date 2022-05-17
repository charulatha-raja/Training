package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/mvc")
@Controller

public class WelcomeController 
{
	
	private ModelAndView mdlView;
	
	private ProductRepository repo;
	
	public WelcomeController(ModelAndView mdlView, ProductRepository repo)
	{
		super();
		this.mdlView = mdlView;
		this.repo = repo;
	}

//	public WelcomeController(ModelAndView mdlView) 
//	{
//		super();
//		this.mdlView = mdlView;
//	}

	@RequestMapping(value ="/first", method = RequestMethod.GET)
	
	public String getFirstPage()
	{
		return "welcome";
		
	}

	@RequestMapping(value ="/home", method = RequestMethod.GET)
	

	public ModelAndView getHomePage()
	
	{
		List<Product> prodList = repo.findAll();
		
		mdlView.addObject("list", prodList);
		 
		 mdlView.setViewName("home");
		 
		return mdlView;
		
		
		
			}
}
