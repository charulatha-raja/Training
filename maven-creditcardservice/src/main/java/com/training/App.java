package com.training;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

      CreditCard card = new CreditCard(123, "ram", 100.00);
      System.out.println(card.getCardNumber());
      System.out.println(card.getCardHolderName());
      System.out.println(card.getAmountDue());

    }
}
