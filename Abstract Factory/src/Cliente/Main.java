/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Factorys.FactoryA;
import Factorys.FactoryB;
import Interfaces.IFactory;
import Interfaces.IProduct1;
import Interfaces.IProduct2;

/**
 *
 * @author mayor
 */
public class Main {
    
    public static void main(String[] args) {
   
    IProduct1 produto1;
    IProduct2 produto2; 
    IFactory fabrica1 = new FactoryA(); 
    IFactory fabrica2 = new FactoryB(); 
    
    System.out.println("Inicio fabrica A\n\n");
    
    produto1 = (IProduct1) fabrica1.createProduct1();
    produto2 = (IProduct2) fabrica1.createProduct2();

    System.out.println(produto1.viewInfo());
    System.out.println(produto2.viewInfo());
    
    System.out.println("Fim da fabrica A\n\n");
    
    
    System.out.println("Inicio fabrica B\n\n");
    
    produto1 = (IProduct1) fabrica2.createProduct1();
    produto2 = (IProduct2) fabrica2.createProduct2();
    
    System.out.println(produto1.viewInfo());
    System.out.println(produto2.viewInfo());        
    
    }
}
