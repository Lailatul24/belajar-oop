/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biodata;
import java.util.Scanner;
/**
 *
 * @author MASTER-PC
 */
public class input_example {
    public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      String nama;
      int age;
      System.out.print("Siapa nama kamu   :");
      nama = input.nextLine();
      System.out.print("Berapa umur mu     :");
      age = input.nextInt();
      System.out.println("nama    =  " + nama);
      System.out.println("Umur    =  " + age);
      
    } 
    
}
