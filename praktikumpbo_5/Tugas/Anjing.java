/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_5.Tugas;

/**
 *
 * @author aniip
 */
public class Anjing extends Hewan {
    
    // Method suara anjing 
    public void suara() {
        System.out.println("Anjing menggonggong");
    }
    
    // Overriding tampilkaninfo() 
    @Override
    public void tampilkaninfo() {
        super.tampilkaninfo();
        suara(); 
    }
}
