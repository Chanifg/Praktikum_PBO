/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.responsiuts_achamdchanifrahmatullah;

/**
 *
 * @author aniip
 */
public class Main {
    public static void main(String[] args) {
        // Polimorfisme pada Produk
        Produk p1 = new Electronik("Laptop", 15000000, 2);
        Produk p2 = new Makanan("Roti", 15000, "10-10-2025");

        // Polimorfisme pada Pegawai
        Pegawai peg1 = new PegawaiTetap("Budi", 5000000, 1000000);
        Pegawai peg2 = new PegawaiKontrak("Siti", 3000000, 12);

        // Tampilkan info
        p1.tampilkaninfo();
        p2.tampilkaninfo();
        peg1.tampilkaninfo();
        peg2.tampilkaninfo();
    }
}

