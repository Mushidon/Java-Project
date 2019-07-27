/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creators;

import Interfaces.ICreator;
import Products.Product1A;

/**
 *
 * @author mayor
 */
public class Creator1A implements ICreator {

    @Override
    public Object createProduct() {
        return new Product1A(); 
    }
 
}
