/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum11.Tugas11;

/**
 *
 * @author aniip
 */
public class Main {
    public static void main(String[] args) { 
        
        Pengarang p1 = new Pengarang("Tere Liye");
        Pengarang p2 = new Pengarang("Anderah Hirata");
        
        Buku b1 = new Buku("Bumi", p1);
        Buku b2 = new Buku("Laskar Pelangi", p2);
        Buku b3 = new Buku("Matahari", p1);
        
        Perpustakaan perpustakaan = new Perpustakaan(5);
        
        perpustakaan.tambahBuku(b1);
        perpustakaan.tambahBuku(b2);
        perpustakaan.tambahBuku(b3);
        
        perpustakaan.infoPerpustakaan(); 
        
        
    }
}
    