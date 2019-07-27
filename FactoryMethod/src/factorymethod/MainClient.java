/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import Creators.Creator1A;
import Creators.Creator1B;
import Interfaces.ICreator;
import Interfaces.IProductA1;


/**
 *
 * @author mayor
 */
public class MainClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ICreator creator1 = new Creator1A(); 
        
        IProductA1 produto1A; 
      
        System.out.println("Criando produto 1"); 
        
        produto1A  = (IProductA1) creator1.createProduct();
        System.out.println(produto1A.viewInfo()); 
        
        System.out.println("Criando produto 2"); 
        
        ICreator creator2 = new Creator1B(); 
        
        IProductA1 produto1B; 
        
        produto1B = (IProductA1) creator2.createProduct(); 
       
        System.out.println(produto1B.viewInfo()); 
        
    }
    
}
