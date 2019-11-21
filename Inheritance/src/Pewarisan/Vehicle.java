/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author MASTER-PC
 */
public class Vehicle {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Tuut........Tuuut!");
    }
    
}
class Car extends Vehicle{
    private String ModelName = "Mustag";
    public static void main (String[]args){
        Car myCar = new Car();
        myCar. honk();
        System.out.println(myCar.brand + "          " +myCar.ModelName);
        
    }
}