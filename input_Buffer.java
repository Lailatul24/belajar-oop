/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biodata;
import java.io.*;
/**
 *
 * @author MASTER-PC
 */
public class input_Buffer {
    public static void main(String[]args){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String nama ;
        String alamat ;
        String jurusan;
        String jenis_kelamin;
        
        try{
             System.out.print("Nama          :");
             nama = input.readLine();
             System.out.print("ALamat        :");
             alamat = input.readLine();
             System.out.print("Jurusan       :");
             jurusan = input.readLine();
             System.out.print("Jenis Kelamin :");
             jenis_kelamin = input.readLine();
             
            
        System.out.println("Nama              = " +nama );
        System.out.println("Alamat            = " +alamat );
        System.out.println("Jurusan           = " +jurusan ); 
        System.out.println("Jenis kelamin     = " +jenis_kelamin );
            
        }catch(IOException ex){
            System.out.println("data yang diisi tidak sesuai");
            
        }
    }
    
}
