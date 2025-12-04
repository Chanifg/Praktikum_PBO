/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author aniip
 */
public class Main {
    public static void main(String[] args) {
        Hewan hewan = new kucing();
        hewan.bersuara(); 
        
        kucing kucing = new kucing();
        kucing.makan("ikan"); 
        kucing.makan("ikan", 2);
        
        anjing anjing = new anjing(); 
        anjing.bersuara(); 
        anjing.makan("daging", 3);
    }
}
