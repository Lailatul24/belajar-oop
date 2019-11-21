/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyKasus1;
import java.util.Scanner;
/**
 *
 * @author MASTER-PC
 */
public class Segitiga extends Bangun_datar{
    public void Segitiga(){
        double ls,as,ts,ss,ks;
        Scanner a = new Scanner (System.in);
        System.out.println("PERSEGI");
        System.out.println("=======");
        System.out.print("Masukkan Alas :");
        as = a.nextDouble();
        System.out.print("Masukkan Tinggi :");
        ts = a.nextDouble();
        System.out.print("Masukkan Sisi :");
        ss = a.nextDouble();
        
        ls = (as * ts)/2;
        ks = (ss * 2)+ as;
        
        System.out.println("Luas Segitiga adalah :" +ls);
        System.out.println("keliling segitiga adalah :" +ks);
    }
    
}
