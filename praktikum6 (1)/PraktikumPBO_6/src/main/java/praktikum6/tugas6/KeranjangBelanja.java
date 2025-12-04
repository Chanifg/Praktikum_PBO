/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6.tugas6;

/**
 *
 * @author aniip
 */
import java.util.ArrayList;

public class KeranjangBelanja {
    private ArrayList<Produk> daftarProduk;

    public KeranjangBelanja() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public double hitungTotalBayar() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.getHargaSetelahDiskon();
        }
        return total;
    }

    public void tampilkanDaftarProduk() {
        for (Produk p : daftarProduk) {
            System.out.println(p.getNama() +
                    " | Harga Asli: " + p.getHarga() +
                    " | Diskon: " + p.hitungDiskon() +
                    " | Harga Setelah Diskon: " + p.getHargaSetelahDiskon());

        }
    }    
}
