/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts_achamdchanifrahmatullah;

/**
 *
 * @author aniip
 */
public class PegawaiKontrak extends Pegawai {
    private int lamaKontrak;
    
    public PegawaiKontrak(String namaPegawai, double gaji, int lamaKontrak){
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak; 
    }
    
    public int getLamaKontrak() {
        return lamaKontrak; 
    }
     public void setLamaKontrak(int lamaKontrak) { 
         this.lamaKontrak = lamaKontrak; 
    }
    
     @Override 
     public void tampilkaninfo() {
         System.out.println(" Pegawai Kontrak: " + getNamaPegawai() + 
                 ", Gaji: " + getGaji() + 
                 ", Lama Kontrak; " + lamaKontrak + " bulan");
     }
}
