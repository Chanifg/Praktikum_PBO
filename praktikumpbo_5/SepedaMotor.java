/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_5;

/**
 *
 * @author aniip
 */
public class SepedaMotor extends Kendaraan  {
    String jenisMesin; 
    
    @Override
    public void tampilkaninfo() {
        super.tampilkaninfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
    
}
