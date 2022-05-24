package com.training.join_latest;

import java.sql.Connection;

import com.training.dao.CustomerServices;
import com.training.entity.Customer;
import com.training.util.ConnectionFactory;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	Connection con = ConnectionFactory.getOracleConnection();
    	
         System.out.println(con);
         
         CustomerServices services= new CustomerServices(con);
         
         services.findAll().forEach(System.out::println);
         
        
         
         
    }
}
