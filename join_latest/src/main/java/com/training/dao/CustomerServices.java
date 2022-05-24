package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.entity.Customer;
import com.training.entity.LoanApplication;
import com.training.ifaces.CrudRepository;

public class CustomerServices implements CrudRepository<LoanApplication>
{    
	
	private Connection con;

	public CustomerServices(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public int add(LoanApplication obj) {
		
		return 0;
	}

	@Override
	public List<LoanApplication> findAll()
	{
		List<LoanApplication> loanList=new ArrayList<LoanApplication>();
		String sql= 
				"SELECT *FROM customer_charu LEFT JOIN charu_loan_application ON customer_charu.customer_id = charu_loan_application.customer_ref";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				
				int customerId=rs.getInt("customer_id");
				String customerName=rs.getString("customer_name");
				long phoneNumber=rs.getLong("phone_number");
				double creditScore=rs.getDouble("credit_score");
				int applicationNumber=rs.getInt("application_number");
				double loanAmount=rs.getDouble("loan_amount");
				
			Customer customer=new Customer(customerId, customerName,phoneNumber,creditScore);
				LoanApplication prod=new LoanApplication(applicationNumber, customer, loanAmount);
				loanList.add(prod);
			
			}
			
		}catch(SQLException e) 
		{
			e.printStackTrace();
		}
		
		return loanList;
		
		
			
	}

	@Override
	public int remove(int id)
	{
		
		return 0;
	}

	@Override
	public LoanApplication findById(int id)
	{
		
		return null;
	}

	@Override
	public int update(int Id, LoanApplication obj) {
	
		return 0;
	}

	
	
}
