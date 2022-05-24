package com.example.service;

import java.sql.*;

import java.util.*;

import com.example.entity.*;

import com.example.util.ConnectionFactory;


public class ProductService<Invoice>
{
	
	private Connection  con;

	public ProductService(Connection con2) 
	{
		super();
		this.con = ConnectionFactory.getOracleConnection();
	}
	
	
	public int updatePriceByName(String productName, double newPrice)
	{
	 
		int rowsUpdated=0;
		
		String sql="update charu_product set price=? where product_name=?";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql))
	     {
	    	 pstmt.setDouble(1, newPrice);
	    	 
	    	 pstmt.setString(2, productName);
	    	 
	    	 rowsUpdated=pstmt.executeUpdate();
	     }
	     catch(SQLException e)
	     {
	    	 e.printStackTrace();
	     }
		
		return rowsUpdated;
	}
	
	public int  deleteById(int id)
	{
		 
	    String sql = "delete * from charu_product where product_id=?";
	     
	     int rowsDeleted=0;
	     
	     try(PreparedStatement pstmt=con.prepareStatement(sql))
	     {
	    	 pstmt.setInt(1, id);
	    	 
	    	 rowsDeleted=pstmt.executeUpdate();
	     }
	     catch(SQLException e)
	     {
	    	 e.printStackTrace();
	     }
	     
		 return rowsDeleted;
	}
	  
	
	public Optional<Product> findById(int id)
	
	 {
		
		Optional <Product> obj=Optional.empty();
		
		String sql="select * from charu_product where product_id=?";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			pstmt.setInt(1, id);
			
			ResultSet rs=pstmt.executeQuery();
			
			if(rs.next())
			{

				int productId =rs.getInt("product_Id");
				
				String productName=rs.getString("product_name");
				
				Double price=rs.getDouble("price");
				
				Product prod = new Product(productId,productName,price);
				
				obj=Optional.of(prod);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
		return obj;
		
	}
	public int addProduct(Product prod)
	
	{
		int rowAdded=0;
		
		String sql= "insert into charu_product values(?,?,?)";
		
		try(PreparedStatement pstmt= con.prepareStatement(sql))
		{
			pstmt.setInt(1,prod.getProductId());
			
			pstmt.setString(2,prod.getProductName() );
			
			pstmt.setDouble(3,prod.getPrice());
			
			rowAdded=pstmt.executeUpdate();
			
			
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
		return rowAdded;
	}

	public List<Product> findAll()
	{
		
		List<Product> productList = new ArrayList<Product>();
		
		String sql = "select * from charu_product";
		
		try(PreparedStatement pstmt =con.prepareStatement(sql))
		
		{
			ResultSet rs= pstmt.executeQuery();
			
			while(rs.next())
			{
				int productId =rs.getInt("product_Id");
				
				String productName=rs.getString("product_name");
				
				Double price=rs.getDouble("price");
				
				Product prod = new Product(productId,productName,price);
				
				productList.add(prod);
				
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
				
		return productList;
	}

//     public void usingTxn(Product prod1, Product prod2)
//     {
//    	 String sql ="insert into charu_product values(?,?,?)";
//    	 
//    	 try(PreparedStatement pstmt= con.prepareStatement(sql))
//    	 
//    	 {
//    		 con.setAutoCommit(false);
//    		 
//    		 pstmt.setInt(1, prod1.getProductId());
//    		 
//    		 pstmt.setString(2, prod1.getProductName());
//    		 
//    		 pstmt.setDouble(3, prod1.getPrice());
//    		 
//    		int rowAdded1=pstmt.executeUpdate();
//    		
//    		con.commit();
//    		
//    		System.out.println("Row Added:="+ rowAdded1);
//    	 
//    		 
//    	 pstmt.setInt(1, prod2.getProductId());
//		 
//		 pstmt.setString(2, prod2.getProductName());
//		 
//		 pstmt.setDouble(3, prod2.getPrice());
//
//		 int rowAdded2=pstmt.executeUpdate();
//		 
//    	 if(prod2.getPrice()>prod1.getPrice())
//    	 {
//    		con.commit();
//    	 }
//    	 else
//    	 {
//    		 con.rollback();
//    	 }
//    	 System.out.println("RowAdded:="+rowAdded1 +","+ rowAdded2);
//    	 
//    	 }
//    	 catch (SQLException e) 
//    	 {
//			
//			e.printStackTrace();
//		}
//     
//     }
//
//     
//     public  void usingTxnWithCatchBlock(Product prod1,Invoice invoice)
//     {
//			String addprodsql = "insert into charu_poduct values (?, ?, ?)";
//			
//			String addinvoicesql = "insert into charu_produuct values(?,?,?,?)";
//			
//			try(PreparedStatement prodpstmt = con.prepareStatement(addprodsql);
//					
//			PreparedStatement invpstmt = con.prepareStatement(addinvoicesql))
//			{
//				
//			con.setAutoCommit(false);
//			
//			prodpstmt.setInt(1, prod1.getProductId());
//			
//			prodpstmt.setString(2, prod1.getProductName());
//			
//			prodpstmt.setDouble(3, prod1.getPrice());
//			
//			int productAddCommit = 	prodpstmt.executeUpdate();
//			
//			
//			
//			invpstmt.setInt(1, invoice.getInvoiceNumber(),);
//			
//			invpstmt.setString(2, invoice.getCustomerName());
//			
//			invpstmt.setDouble(3, invoice.getQuantity());
//			
//			invpstmt.setInt(4, invoice.getProductRef());
//			
//			int invoiceaddrowAdded = invpstmt.executeUpdate();
//			
//			con.commit();
//			}

     }
    
    	 
    	 
	
	
	
	
	
	


