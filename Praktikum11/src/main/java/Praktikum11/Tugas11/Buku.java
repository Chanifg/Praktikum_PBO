/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum11.Tugas11;

/**
 *
 * @author aniip
 */
public class Buku {
    private String judul; 
    private Pengarang pengarang; 
    
    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul; 
        this.pengarang = pengarang; 
    }
    
    public void infoBuku() { 
        System.out.println("\nJudul Buku      : " + judul);
        System.out.println("Pengarang       : " + pengarang.getNamaPengarang());
    }
}
