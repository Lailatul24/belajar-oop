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
public class Input_Biodata {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        long nim ;
        int Thun_angkatan ;
        String nama ;
        String alamat ;
        String jurusan;
        String jenis_kelamin;
        
        
        System.out.print("Nama          :");
        nama = input.nextLine();
        System.out.print("ALamat        :");
        alamat = input.nextLine();
        System.out.print("Jurusan       :");
        jurusan = input.nextLine();
        System.out.print("Jenis Kelamin :");
        jenis_kelamin = input.nextLine();
        System.out.print("Nim           :");
        nim = input.nextLong();
        System.out.print("Thun Angkatan :");
        Thun_angkatan = input.nextInt();
   
        
      
        System.out.println("Nim               = " +nim);
        System.out.println("Nama              = " +nama );
        System.out.println("Alamat            = " +alamat );
        System.out.println("Jurusan           = " +jurusan );
        System.out.println("Thun Angkatan     = " +Thun_angkatan); 
        System.out.println("Jenis kelamin     = " +jenis_kelamin );
        
        
        
        
        
    }
    
}
