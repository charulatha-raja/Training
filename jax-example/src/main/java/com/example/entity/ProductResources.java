package com.example.entity;

import java.util.List;

import com.example.entity.Product;
import com.example.entity.ProductService;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/products")

public class ProductResources
{
		
	private static ProductService service= new ProductService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
	public List<Product>findAll()
	{
		return service.findAll();
		
	}
	
//	@GET
//	
//@Path("srch/{id}")
//	
//	@Produces(MediaType.APPLICATION_JSON)
//	
//	public Response findById(@PathParam("id")int id) 
//{
//	try
//		{
//			Product entity =  service.findById(id).orElseThrow(()->new RuntimeException("id not found"));
//		
//		return Response.ok(entity).build();
//	}
//	catch(RuntimeException e)
//			{
//			e.printStackTrace();
//		
//		return Response.ok("id not found").status(400).build();
//		}
//	}
//	
//	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	
	public Response add(Product entity)
	
	{
		int result =  service.addProduct( entity);
		  if(result!=0)
		  {
    		  return Response.ok( entity).status(201).build();
    		 
    	  }
		  else 
		  {
    		  return Response.status(400,"Not created").build();
    	  }
		
		
		  
		 	  
		
	}
	@PUT
	@Path("/{productName}/{newPrice}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateByName(@PathParam("productName")  String productName , @PathParam("newPrice") double newPrice)
	{
		int result=service.updatePriceByname(productName, newPrice);
		return Response.ok("updated"+result+"rows").build();
	
}
}


