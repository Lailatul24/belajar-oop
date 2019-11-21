/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASTER-PC
 */
public class Bangun_datar extends Study_kasus {
    private String Rumus = "Lingkaran       =   Phi * jari - jari ,\n"
            +"Persegi panjang   =   P * L  ,\n"
            +"Segitiga          =   a*t/2 ,\n"
            +"Persegi           =   S * S ,\n";
public static void main(String[]args){
    Bangun_datar Match = new Bangun_datar();
    
    Match.Bangun_Datar();
    
    System.out.println();
    System.out.println(Match.Tema);
    System.out.println(Match.Rumus);
}    
}
