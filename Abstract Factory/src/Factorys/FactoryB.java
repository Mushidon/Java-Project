/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorys;

import Interfaces.IFactory;
import Products.ProdutoA2;
import Products.ProdutoB2;

/**
 *
 * @author mayor
 */
public class FactoryB implements IFactory {
    
      public Object createProduct1(){
        return new ProdutoA2(); 
    }
    
    public Object createProduct2(){
        return new ProdutoB2(); 
    }
    
}
