/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum11.Tugas11;

/**
 *
 * @author aniip
 */
public class Perpustakaan {
    private Buku[] daftarBuku; 
    private int jumlahBuku; 
    
    public Perpustakaan(int kapasitas) { 
        daftarBuku = new Buku[kapasitas];
        jumlahBuku = 0; 
    }
    
    public void tambahBuku(Buku buku) { 
        if (jumlahBuku < daftarBuku.length) { 
            daftarBuku[jumlahBuku] = buku; 
            jumlahBuku++; 
        } else {
            System.out.println("Perpustakaan penuh!");
        }
    }
    
    public void infoPerpustakaan() { 
        System.out.println("=== DAFTAR BUKU DI PERPUSTAKAAN ===");
        for (int i = 0; i < jumlahBuku; i++) { 
            daftarBuku[i].infoBuku();
        }
    }
}
