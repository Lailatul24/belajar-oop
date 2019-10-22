/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author MASTER-PC
 */
public class ConditionalLogicEX {
    
    public static void main(String[]args){
        
        int angka1 = 10;
        int angka2 = 25;
        int angka3 = 9;
        
        if(angka1 > angka2 && angka2 > angka3){
            System.out.println(angka1);
        }
            
         else if (angka3 > angka1){
            System.out.println(angka2);
            
        
        }
         else {
                 System.out.println(angka3);
                 } 
    }
    
    
    
}
