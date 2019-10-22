/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek3;

/**
 *
 * @author MASTER-PC
 */
class Simple{
    public void print(int a){
        System.out.println("int -" + a);
    }
    public void print(double a){
        System.out.println("double -" + a);
    }
    public void print(String a){
        System.out.println("String -" + a);
    }
}
public class Main {
    public static void main (String[]args){
        Simple obj = new Simple();
        obj.print(10);
        obj.print(10.19);
        obj.print("a,b,c");
        
        
    }
    
}
