package com.training;

import com.training.services.InvalidEmailException;

public class Customer
{
	private int customerId;
	private String customerName;
	private long phoneNumber;
	private String email;
	public Customer() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, long phoneNumber, String email) {
		super();
		if(email.endsWith(".com")||email.endsWith(".org")||email.endsWith(".in"))
		{if(email.contains("@"))
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		}else {
			try {
				throw new InvalidEmailException("invalidemailexception");
			} catch (InvalidEmailException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public int getCustomerId()
	{
		return customerId;
	}
	public void setCustomerId(int customerId)
	{
		this.customerId = customerId;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}
	public long getPhoneNumber() 
	{
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email)
	{
		if(email.endsWith(".com")||email.endsWith(".org")||email.endsWith(".in"))
		{if(email.contains("@"))
			
			this.email = email;
		}
		else
		{
			try {
				throw new InvalidEmailException("invalidemailid");
			} catch (InvalidEmailException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public String toString()
	{
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + "]";
	}
	

}
