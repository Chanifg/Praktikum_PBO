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

public class Peminjaman implements PeminjamanInterface, Serializable {
    private Anggota anggota;
    private List<Buku> daftarBuku;

    public Peminjaman(Anggota anggota) {
        this.anggota = anggota;
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    @Override
    public void pinjam() {
        System.out.println("Peminjaman oleh: " + anggota.getNama());
        for (Buku b : daftarBuku) {
            System.out.println("- " + b.getJudul());
        }
    }

    @Override
    public void kembalikan() {
        daftarBuku.clear();
    }
}


