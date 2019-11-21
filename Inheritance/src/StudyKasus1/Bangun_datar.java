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
public class Bangun_datar {
    public static void main (String[]args){
        int pil;
        Lingkaran L = new Lingkaran();
        Segitiga S  = new Segitiga();
        Persegi P   = new Persegi();
        PersegiPanjang PP = new PersegiPanjang();
        Scanner inp = new Scanner (System.in);
        
        System.out.println("PILIH BANGUN DATAR");
        System.out.println("==================");
        System.out.println("1.LINGKARAN");
        System.out.println("2.SEGITIGA");
        System.out.println("3.PERSEGI");
        System.out.println("4.PERSEGI PANJANG");
        
        System.out.println("5.EXIT");
        System.out.print("Pilihan  :");
        pil = inp.nextInt();
        switch(pil){
            case 1 : L.Lingkaran();
                break;
            case 2 : S.Segitiga();
                break;
            case 3 : P.persegi();
                break;
            case 4 : PP.PersegiPanjang();
                break;
            case 5 : System.exit(0);
        }
        
        
    }
    
}
