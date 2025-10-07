/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts_achamdchanifrahmatullah;

/**
 *
 * @author aniip
 */
public class Produk {
    private String namaProduk;
    private double harga; 
    
    // Constructor 
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk; 
        this.harga = harga;
    }
    
    // Getter dan Setter 
    public String getNamaProduk() {
        return namaProduk; 
    }
    
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk; 
    }
    
    public double getHarga() {
        return harga; 
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    // Method tampilkan info 
    public void tampilkaninfo() {
        System.out.println("Produk: " + namaProduk + ", Harga: " + harga );
    }
}
