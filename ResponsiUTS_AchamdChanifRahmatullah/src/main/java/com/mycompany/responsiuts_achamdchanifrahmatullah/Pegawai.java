/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts_achamdchanifrahmatullah;

/**
 *
 * @author aniip
 */
public class Pegawai {
    private String namaPegawai;
    private double gaji;
    
    //Constructor 
    public Pegawai(String namaPegawai, double gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    // Getter dan Setter 
    public String getNamaPegawai() {
        return namaPegawai; 
    }
    
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    public double getGaji() {
        return gaji;
    }
    
    public void setGaji(double gaji) {
        this.gaji = gaji; 
    }
    
    // Method untuk menampilkan info 
    public void tampilkaninfo() {
        System.out.println("Pegawai: " + namaPegawai + " , Gaji: " + gaji);
    }
}
