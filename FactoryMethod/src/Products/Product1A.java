/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Products;

import Interfaces.IProductA1;

/**
 *
 * @author mayor
 */
public class Product1A implements IProductA1 {

    @Override
    public String viewInfo() {
       return "Produto1A funcionando";
    }
    
    
}
