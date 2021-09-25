/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment3.pay;

/**
 *
 * @author George
 */
public class CreditCardPayment implements PaymentMethod{
    
    private String cardType; 
    private String cardholderName; 
    private String cardNumber; 
    private String cardExpDate; 
    private String cardCVV;

    public CreditCardPayment(String cardType, String cardholderName, String cardNumber, String cardExpDate, String cardCVV) {
        this.cardType = cardType;
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.cardExpDate = cardExpDate;
        this.cardCVV = cardCVV;
    }

    @Override
    public void pay(double amount) {
        
        System.out.println("Your payment with Card"
        + this.cardNumber + 
                " is successful");
    }
    
    
    
    
    
    
}
