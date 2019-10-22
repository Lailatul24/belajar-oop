/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASTER-PC
 */
public class MyProfile {
  long modelNim;
  String modelName;
  String modelAlamat;
  String modelJurusan;
  int modelAngkatan;

  public MyProfile(long nim, String name,String alamat,String jurusan,int angkatan) {
    modelNim = nim;
    modelName = name;
    modelAlamat = alamat;
    modelJurusan = jurusan;
    modelAngkatan = angkatan;
            
  }

  public static void main(String[] args) {
    MyProfile myProfile = new MyProfile(201869040018L,"Lailatul Afidah","pandaan","Teknik Informatika",2018);
    System.out.println("Nim      = " + myProfile.modelNim  );
    System.out.println("Nama     = " +myProfile.modelName  );
    System.out.println("Alamat   = " +myProfile.modelAlamat  );
    System.out.println("Jurusan  = " +myProfile.modelJurusan  );
    System.out.println("Angkatan = " +myProfile.modelAngkatan  );
  }
} 

