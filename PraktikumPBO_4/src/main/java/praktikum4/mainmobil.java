/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author aniip
 */

public class mainmobil {
    public static void main(String[] args) {
        // Buat objek mobil
        mobil satu = new mobil("Lexus", 465, "Bensin", 2);

        // Panggil method dari kelas induk (Kendaraan)
        satu.tampilkanInfoKendaraan();

        // Panggil method dari kelas anak (Mobil)
        satu.tampilkanInfoMobil();
    }
}
