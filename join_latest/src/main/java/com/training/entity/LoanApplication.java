package com.training.entity;



public class LoanApplication 
{

	 private int appliactionNumber;
	 private Customer customer;
	 private double loanAmount;
	public LoanApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoanApplication(int appliactionNumber, com.training.entity.Customer customer, double loanAmount) {
		super();
		this.appliactionNumber = appliactionNumber;
		this.customer = customer;
		this.loanAmount = loanAmount;
	}
	public int getAppliactionNumber() {
		return appliactionNumber;
	}
	public void setAppliactionNumber(int appliactionNumber) {
		this.appliactionNumber = appliactionNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public String toString() {
		return "LoanApplication [appliactionNumber=" + appliactionNumber + ", customer=" + customer + ", loanAmount="
				+ loanAmount + "]";
	}
	 
	 
}
