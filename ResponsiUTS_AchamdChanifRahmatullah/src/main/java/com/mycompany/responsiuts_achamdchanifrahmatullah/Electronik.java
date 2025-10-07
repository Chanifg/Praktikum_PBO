/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts_achamdchanifrahmatullah;

/**
 *
 * @author aniip
 */
public class Electronik extends Produk {
    private int garansi  ;
    
    public Electronik(String namaProduk, double harga, int garansi){
        super (namaProduk, harga);
        this.garansi = garansi;
    }
    
    public int getGaransi() {
        return garansi;
    }
    
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }
    
    @Override 
    public void tampilkaninfo() {
        System.out.println("Produk Elektronik: " + getNamaProduk() +
                ", Harga: " + getHarga() +
                ", Garansi: " + garansi + " tahun");
    }
}
