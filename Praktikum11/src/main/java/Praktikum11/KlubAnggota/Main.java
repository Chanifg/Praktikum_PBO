/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum11.KlubAnggota;

/**
 *
 * @author aniip
 */
public class Main {
    public static void main(String[] args) {
        
        Klub klub = new Klub("Machester United");
        
        Anggota a1 = new Anggota("Bagas");
        Anggota a2 = new Anggota("Tole"); 
        
        klub.tambahAnggota(a1);
        klub.tambahAnggota(a2);
        
        klub.infoKlub();
    }
    
}
