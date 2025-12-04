/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6.tugas6;

/**
 *
 * @author aniip
 */
public class Main {
     public static void main(String[] args) {

        KeranjangBelanja keranjang = new KeranjangBelanja();

        // Tambahkan produk
        keranjang.tambahProduk(new Buku("Pemrograman Java", 100000));
        keranjang.tambahProduk(new Elektronik("Headset Gaming", 250000));
        keranjang.tambahProduk(new Pakaian("Kaos", 50000));

        // Tampilkan produk dalam keranjang
        keranjang.tampilkanDaftarProduk();

        // Total belanja
        double total = keranjang.hitungTotalBayar();
        System.out.println("\nTotal yang harus dibayar: Rp " + total);
    }
}
