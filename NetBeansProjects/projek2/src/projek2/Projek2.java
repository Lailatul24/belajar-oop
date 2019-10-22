/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek2;

/**
 *
 * @author MASTER-PC
 */
class Account{
    private double balance = 0; //deflaut is zero
    public void debit(double amount){
        if (amount >0 && amount <= balance){
            balance -= amount;
        }
        
    }
    public void kredit(double amount){
        if (amount > 0 ){
            balance += amount;
        }
        
    }
    public void showBalance(){
        System.out.println("current balance -" + balance);
    }
}
public class Projek2 { 
    public static void main(String[] args) {
        Account al;
        
        al = new Account() ;
        al.kredit (20000);
        al.debit(10000);
        al.showBalance();
        
        al.debit ( -2000);
        
        al.showBalance();
       
    }
    
}
