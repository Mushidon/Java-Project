/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorys;

import Interfaces.IFactory;
import Products.ProdutoA1;
import Products.ProdutoB1;

/**
 *
 * @author mayor
 */
public class FactoryA implements IFactory {
    
    public Object createProduct1(){
        return new ProdutoA1(); 
    }
    
    public Object createProduct2(){
        return new ProdutoB1(); 
    }
}
