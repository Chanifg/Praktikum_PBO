/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_5;

/**
 *
 * @author aniip
 */
public class Mobil extends Kendaraan {
    int jumlahPintu;
    
    // Method khusus untuk mobil 
    public void tampilkaninfmobil() {
        System.out.println("MObil  " + nama + " memiliki " + jumlahPintu + " Pintu");
    }
    
    // Overriding method tampilkaninfo() 
    @Override 
    public void tampilkaninfo(){
            super.tampilkaninfo();
            System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
