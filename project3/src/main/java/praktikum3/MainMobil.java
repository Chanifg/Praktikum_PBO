/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author aniip
 */
public class MainMobil {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2022, "Merah");

        mobil1.startEngine();
        mobil1.displayInfo();

        System.out.println();

        mobil2.startEngine();
        mobil2.displayInfo();

        // Ganti warna mobil2
        mobil2.setWarna("Putih");
        System.out.println("\nSetelah warna diganti:");
        mobil2.displayInfo();
    }
}