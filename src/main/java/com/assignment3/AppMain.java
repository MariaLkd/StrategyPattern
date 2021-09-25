/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment3;

import com.assignment3.domain.TShirt;
import com.assignment3.pay.CashPayment;
import com.assignment3.pay.CreditCardPayment;

import com.assignment3.utill.Generator;

/**
 *
 * @author George
 */
public class AppMain {
    
    public static void main(String[] args){
        
        Cart cart1 = new Cart();
        Generator gen = new Generator();
        
        TShirt er = new TShirt(
                gen.randomColor(),
                gen.randomSize(),
                gen.randomFabric());
        System.out.println(er.toString());
        cart1.addItem(er);
        
        cart1.executePayment(new CashPayment());
        cart1.executePayment(new CreditCardPayment(
         "VISA" , "John" , "111 111 111 111" 
                 , "12-2021" , "123"));
        
    }
}
