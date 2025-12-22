/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resposipbo;

/**
 *
 * @author aniip
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Perpustakaan implements Serializable {

    private List<Buku> daftarBuku;
    private List<Anggota> daftarAnggota;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
        daftarAnggota = new ArrayList<>();
    }

    // ===== BUKU =====
    public void tambahBuku(Buku b) {
        daftarBuku.add(b);
    }

    public Buku cariBuku(String id) {
        for (Buku b : daftarBuku) {
            if (b.getId().equalsIgnoreCase(id)) {
                return b;
            }
        }
        return null;
    }

    public boolean hapusBukuById(String id) {
        Buku b = cariBuku(id);
        if (b != null) {
            daftarBuku.remove(b);
            return true;
        }
        return false;
    }

    public void tampilBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada buku.");
            return;
        }
        for (Buku b : daftarBuku) {
            b.tampilInfo();
            System.out.println("----------------");
        }
    }

    // ===== ANGGOTA =====
    public void tambahAnggota(Anggota a) {
        daftarAnggota.add(a);
    }

    public Anggota cariAnggota(String id) {
        for (Anggota a : daftarAnggota) {
            if (a.getId().equalsIgnoreCase(id)) {
                return a;
            }
        }
        return null;
    }

    public boolean hapusAnggotaById(String id) {
        Anggota a = cariAnggota(id);
        if (a != null) {
            daftarAnggota.remove(a);
            return true;
        }
        return false;
    }

    public void tampilAnggota() {
        if (daftarAnggota.isEmpty()) {
            System.out.println("Belum ada anggota.");
            return;
        }
        for (Anggota a : daftarAnggota) {
            a.tampilInfo();
            System.out.println("----------------");
        }
    }
}


