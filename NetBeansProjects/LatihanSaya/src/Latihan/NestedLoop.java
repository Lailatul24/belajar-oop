/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author MASTER-PC
 */
public class NestedLoop {
    public static void main(String[]args){
        int jumlahlooping = 0;
        for(int i = 0;i< 10; i++){
            for (int ii = 0; ii < 10 ; ii++){
                jumlahlooping++;
                System.out.println("indexs looping pertama"+i+", indeks looping kedua"+ii);
            }
        }
        System.out.println("jumlahlooping:"+jumlahlooping);
    }
    
}
