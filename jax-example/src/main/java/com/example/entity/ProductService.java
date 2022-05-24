package com.example.entity;

import java.sql.*;

import java.util.*;

import com.example.entity.*;

public class ProductService<Invoice>
{
	
	
private Connection con;
	
	public ProductService() {
		
		super();
		this.con=ConnectionFactory.getOracleConnection();
	}
	
	public int updatePriceByname(String name,double newPrice) {
		String sql=("UPDATE sri_product SET price = ? where product_name = ?");
		int rowsUpdated=0;
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setDouble(1, newPrice);
			pstmt.setString(2, name);
			
			
			rowsUpdated=pstmt.executeUpdate(); 
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return rowsUpdated;
		
	}
	
	public int deleteById(int id) {
		
		String sql="delete from sri_product where product_id=?";
		
		int rowsDeleted=0;
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, id);
			
			rowsDeleted=pstmt.executeUpdate(); 

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rowsDeleted;
		
	}
	
	public Optional<Product> findById(int id){
		
		Optional<Product>obj=Optional.empty();
		
		String sql =("select*from sri_product where product_id=?");
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1, id);
			
			ResultSet rs =pstmt.executeQuery();
			
		if(rs.next()) {
			int productId=rs.getInt("product_Id");
			String productName =rs.getString("product_Name");
			double price =rs.getDouble("price");
			
			Product prod = new Product(productId,productName,price);
			obj=Optional.of(prod);
			
		}} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return obj;
	
	}
	public int addProduct(Product product) {
		int rowAdded =0;
		String sql ="insert into sri_product values(?,?,?)";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1, product.getProductId());
			pstmt.setString(2, product.getProductName());
			pstmt.setDouble(3, product.getPrice());
			
			rowAdded=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowAdded;
	}
	
	public List<Product>findAll(){
		
		List<Product>productList= new ArrayList<Product>();
		
		String sql= "select*from sri_product";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {

				int productId =rs.getInt("Product_Id");
				
				String productName= rs.getString("Product_name");
				
				double price =rs.getDouble("price");
				
				
				Product prod = new Product(productId, productName, price);
				
				productList.add(prod);
			}
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		return productList;
		
				
	}
	
	
	
	
	
	

}

    

	
	 
	
	


    
    
    	 
    	 
	
	
	
	
	
	


