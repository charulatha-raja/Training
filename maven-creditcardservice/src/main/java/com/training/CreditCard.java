package com.training;

public class CreditCard 
{
	private int cardNumber;
	private String cardHolderName;
	private double amountDue;
	public CreditCard()
{
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(int cardNumber, String cardHolderName, double amountDue) 
	{
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.amountDue = amountDue;
	}
	public int getCardNumber() 
	{
		return cardNumber;
	}
	public void setCardNumber(int cardNumber)
	{
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName()
	{
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) 
	{
		this.cardHolderName = cardHolderName;
	}
	public double getAmountDue() 
	{
		return amountDue;
	}
	public void setAmountDue(double amountDue) 
	{
		this.amountDue = amountDue;
	}
	@Override
	public String toString()
	{
		return "CreditCard [cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName + ", amountDue="
				+ amountDue + "]";
	}
	

}
