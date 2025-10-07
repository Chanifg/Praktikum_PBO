/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_5.Tugas;

/**
 *
 * @author aniip
 */
public class Mobil extends KendaraanDarat {
    int jumlahPintu;
    
    @Override 
    public void tampilkaninfo() {
        super.tampilkaninfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
    
    
}
