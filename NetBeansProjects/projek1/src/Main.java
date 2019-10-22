/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASTER-PC
 */
class Bike{
    //Data or Attributes
    
    boolean power;
    int speed;
    
    //operations or Methods or Behavior
   
    void start(){
        power = true;
        speed = 0;
        
    }
    void stop (){
        power = false;
        speed = 0;
    }
    void accelerate(int newSpeed){
        speed = newSpeed;
    }
    
    void printState(){
        System.out.println("current state");
        System.out.println("power = "+power);
        System.out.println("speed = "+speed);
    }
}
public class Main {
    public static void main (String[]args){
        Bike b1,b2;
        
        b1 = new Bike();
        b2 = new Bike();
        
        b1.start();
        b2.start();
        
        b1.accelerate(50);
        
        b1.printState();
        b2.printState();
    }
    
}
