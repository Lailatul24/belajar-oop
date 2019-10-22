/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASTER-PC
 */
public class MyProfile2 {
     long Nim;  // Create a class attribute
     String Nama;
     String Alamat;
     String Jurusan;
     int Angkatan;
  // Create a class constructor for the MyClass class
  public MyProfile2() {
    Nim      = 201869040018L;  // Set the initial value for the class attribute x
    Nama     = "Lailatul Afidah";
    Alamat   = "Pandaan";
    Jurusan  = "Teknik Informatika";
    Angkatan = 2018;
  }

  public static void main(String[] args) {
    MyProfile2 myProfile = new MyProfile2(); // Create an object of class MyClass (This will call the constructor)
    System.out.println("Nim      = " + myProfile.Nim  );
    System.out.println("Nama     = " +myProfile.Nama );
    System.out.println("Alamat   = " +myProfile.Alamat  );
    System.out.println("Jurusan  = " +myProfile.Jurusan  );
    System.out.println("Angkatan = " +myProfile.Angkatan  );
  }
  }
 

