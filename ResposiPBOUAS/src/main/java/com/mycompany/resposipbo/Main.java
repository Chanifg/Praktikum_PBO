/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resposipbo;

/**
 *
 * @author aniip
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan;

        Object data = DataManager.bacaData("perpustakaan.dat");
        perpustakaan = (data != null) ? (Perpustakaan) data : new Perpustakaan();

        int menu;
        do {
            System.out.println("\n=== MENU PERPUSTAKAAN DIGITAL ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Buku");
            System.out.println("3. Tambah Anggota");
            System.out.println("4. Lihat Anggota");
            System.out.println("5. Pinjam Buku");
            System.out.println("6. Hapus Buku");
            System.out.println("7. Hapus Anggota");
            System.out.println("8. Simpan & Keluar");
            System.out.print("Pilih menu: ");

            try {
                menu = Integer.parseInt(input.nextLine());

                switch (menu) {
                    case 1:
                        System.out.print("ID Buku   : ");
                        String idB = input.nextLine();
                        System.out.print("Judul     : ");
                        String judul = input.nextLine();
                        System.out.print("Penulis   : ");
                        String penulis = input.nextLine();
                        perpustakaan.tambahBuku(new Buku(idB, judul, penulis));
                        System.out.println("Buku ditambahkan.");
                        break;

                    case 2:
                        perpustakaan.tampilBuku();
                        break;

                    case 3:
                        System.out.print("ID Anggota   : ");
                        String idA = input.nextLine();
                        System.out.print("Nama Anggota : ");
                        String nama = input.nextLine();
                        perpustakaan.tambahAnggota(new Anggota(idA, nama));
                        System.out.println("Anggota ditambahkan.");
                        break;

                    case 4:
                        perpustakaan.tampilAnggota();
                        break;

                    case 5:
                        System.out.print("ID Anggota: ");
                        String idAnggota = input.nextLine();
                        Anggota anggota = perpustakaan.cariAnggota(idAnggota);
                        if (anggota == null) {
                            System.out.println("Anggota belum terdaftar.");
                            break;
                        }

                        System.out.print("ID Buku: ");
                        String idPinjam = input.nextLine();
                        Buku buku = perpustakaan.cariBuku(idPinjam);
                        if (buku == null) {
                            System.out.println("Buku tidak tersedia.");
                            break;
                        }

                        Peminjaman p = new Peminjaman(anggota);
                        p.tambahBuku(buku);
                        perpustakaan.hapusBukuById(idPinjam);
                        p.pinjam();
                        break;

                    case 6:
                        System.out.print("ID Buku yang dihapus: ");
                        String idHapusBuku = input.nextLine();
                        if (perpustakaan.hapusBukuById(idHapusBuku)) {
                            System.out.println("Buku dihapus.");
                        } else {
                            System.out.println("Buku tidak ditemukan.");
                        }
                        break;

                    case 7:
                        System.out.print("ID Anggota yang dihapus: ");
                        String idHapusAnggota = input.nextLine();
                        if (perpustakaan.hapusAnggotaById(idHapusAnggota)) {
                            System.out.println("Anggota dihapus.");
                        } else {
                            System.out.println("Anggota tidak ditemukan.");
                        }
                        break;

                    case 8:
                        DataManager.simpanData(perpustakaan, "perpustakaan.dat");
                        System.out.println("Program selesai.");
                        break;

                    default:
                        System.out.println("Menu tidak valid.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka.");
                menu = 0;
            }

        } while (menu != 8);

        input.close();
    }
}


