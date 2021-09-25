/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment3;

import com.assignment3.domain.TShirt;
import com.assignment3.pay.PaymentMethod;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author George
 */
public class Cart {
    
    private List<TShirt> orderItems; 

    public void Cart() {
        orderItems = new ArrayList<TShirt>();
    }
    
    public void addItem(TShirt tshirt){
        if(orderItems==null){
            orderItems = new ArrayList<TShirt>();
        }
        orderItems.add(tshirt);
    }
    
    public void removeItem(TShirt tshirt){
        orderItems.remove(tshirt);
    }
    
    public double totalOrderCost(){
        double sum = 0.0;
        
        for(int i =0; i<orderItems.size(); i++){
            sum += orderItems.get(i).getPrice();
        }
        return sum;
    }
    
    public void executePayment(
            PaymentMethod paymentMethod){
        
         double sum = 0.0;         
         sum = totalOrderCost(); 
         
         paymentMethod.pay(sum);
        
    }
    
    
    
}
