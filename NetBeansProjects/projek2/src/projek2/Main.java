/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek2;
import java.util.LinkedList;
/**
 *
 * @author MASTER-PC
 */
class ShoopingCart {
    private LinkedList products = new LinkedList();
    public void addToCart(String product){
        products.add(product);
    }
    public void order(){
        System.out.println("Ordered Product");
        System.out.println(products);
    }
}
public class Main {
    public static void main(String[]args){
        ShoopingCart Cart1 = new ShoopingCart();
        
        Cart1.addToCart("a");
        Cart1.addToCart("b");
        Cart1.addToCart("c");
        
        Cart1.order();
        
        
    }
    
}
