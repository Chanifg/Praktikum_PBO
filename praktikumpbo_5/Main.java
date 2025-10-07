/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_5;

/**
 *
 * @author aniip
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota";
        mobil.kecepatan = 250;
        mobil.jumlahPintu = 4;
        
        System.out.println("== Informasi Mobil ==");
        mobil.tampilkaninfo();
        mobil.tampilkaninfmobil();
        
        SepedaMotor motor = new SepedaMotor(); 
        motor.nama = "Yamaha";
        motor.kecepatan = 125;
        motor.jenisMesin = "2-Tak";
        
        System.out.println("== Info Motor ==");
        motor.tampilkaninfo();
    }
    
}
