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
public class Lingkaran extends Bangun_datar{
    public void Lingkaran(){
        double ll,rl,kl,phi = 3.14;
        Scanner b = new Scanner (System.in);
        System.out.println("Lingkaran");
        System.out.println("=========");
        System.out.print("Masukkan jari - jari :");
        rl = b.nextDouble();
        ll = phi * rl * rl;
        kl = 2*phi*rl;
        
        System.out.println("Luas Lingkaran adalah :" + ll);
        System.out.println("keliling Lingkaran adalah :" +kl);
        
            
        }
        
    }
    

