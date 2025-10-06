/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.tugas4;

/**
 *
 * @author aniip
 */
public class Main {
    public static void main(String[] args0) {
        Pekerja pekerja1 = new Pekerja("Budi", 30, "Kuli Tinta", 8000000);
        
        // Tampilkan info dengan toString 
        System.out.println("Data Pekerja:");
        System.out.println(pekerja1.toString());
        
        // Ubah nama menggunakan Setter 
        pekerja1.setNama("Andi");
        System.out.println("\nSetelah nama diubah:");
        System.out.println(pekerja1.toString());
        
        pekerja1.nama = "Slamet";
        pekerja1.gaji = 9000000;
        pekerja1.usia = 35;
        pekerja1.pekerjaan = "Tukang Gambar";
        
        System.out.println("\nSetelah mencoba akses langsung:");
        System.out.println(pekerja1.toString());
    }
    
}
