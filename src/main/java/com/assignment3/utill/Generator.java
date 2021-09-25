/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment3.utill;

import com.assignment3.domain.Color;
import com.assignment3.domain.Fabric;
import com.assignment3.domain.Size;
import java.util.Random;

/**
 *
 * @author George
 */
public class Generator {

    public Generator() {
    }
    
    public Color randomColor(){
        Random random = new Random();
        
        
        /*
        public int nextInt(int n)
        Returns a random number.
        between 0 (inclusive) and n (exclusive).
        */
        Color randomColor; 
        randomColor = Color.values()[random.nextInt(Color.values()
                                                    .length)];
        
        return randomColor;        
    }
            
      public Size randomSize(){
        Random random = new Random();
        
        Size randomSize; 
        randomSize = Size.values()[random.nextInt(Size.values()
                                                    .length)];
        return randomSize;        
    }          
            
       public Fabric randomFabric(){
        Random random = new Random();
        
        Fabric randomFabric; 
        randomFabric = Fabric.values()[random.nextInt(Fabric.values()
                                                    .length)];
        return randomFabric;        
    }           
            
 
}
