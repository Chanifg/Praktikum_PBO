/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktium10.Tugas10;

/**
 *
 * @author aniip
 */
public class Main {
    public static void main(String[] args) { 
        
        double  harga = 100000;
        System.out.println("Harga total: " + harga);
        
        Pembayaran elektronik = new Elektronik();
        System.out.println ("Pajak Elektronik: " + elektronik.hitungPajak(harga));
        
        
        Pembayaran makanan = new Makanan(); 
        System.out.println("Pajak Makaanan: " + makanan.hitungPajak(harga));
    }
}
