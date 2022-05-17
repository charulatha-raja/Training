package com.example.demo.repos;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;
import com.example.demo.ifaces.CrudRepository;
@Repository

public class ProductRepository implements CrudRepository<Product> 
{

	 private JdbcTemplate template;
	 @Autowired
	public ProductRepository(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public int add(Product t)
	{
		String sql = "insert into sri_product values(?,?,?)";
		
		return template.update(sql, t.getProductId(),t.getProductName(),t.getPrice());
	}

	@Override
	
	public List<Product> findAll() 
	{
		
          String sql="select*from sri_product";
		
		    return template.query(sql,BeanPropertyRowMapper.newInstance(Product.class));
		
		
	}
		
		
		
	

	@Override
	public Product findById(int id) 
	{
		try
		{
			String sql = "select * from sri_product where product_id=?";
			return   template.queryForObject(sql, 
					BeanPropertyRowMapper.newInstance(Product.class),id);
		}
		catch(IncorrectResultSizeDataAccessException e)
		{
		 
		return null;
		}
	}

	@Override
	public int update(Product t) 
	{
		 String sql = "update sri_product set product_name=?, price=? where product_id=?";
		return template.update(sql, new Object[] {t.getProductName(),t.getPrice(),t.getProductId()});
	}

	@Override
	public int remove(int id) 
	{
		
		return  template.update("delete from sri_product where product_id=?", id);
	}

	
}
