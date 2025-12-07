/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum12.Tugas12;

/**
 *
 * @author aniip
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemBuku {

    private static final String SERIAL_FILE = "buku.ser";
    private static List<Buku> daftarBuku = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU SISTEM MANAJEMEN BUKU ===");
            System.out.println("1. Tambah Buku dan Simpan ke File Teks");
            System.out.println("2. Simpan Objek Buku ke File (Serialisasi)");
            System.out.println("3. Tampilkan Buku dari buku.txt");
            System.out.println("4. Tampilkan Buku dari buku.ser");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileSerial();
                case 3 -> tampilkanDariFileTeks();
                case 4 -> tampilkanDariFileSerial();
                case 5 -> {
                    System.out.println("Program selesai.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    // Menu 1
    private static void tambahBuku(Scanner scanner) {

        System.out.print("Masukkan judul buku      : ");
        String judul = scanner.nextLine();

        System.out.print("Masukkan pengarang        : ");
        String pengarang = scanner.nextLine();

        System.out.print("Masukkan tahun terbit      : ");
        int tahun = scanner.nextInt();

        Buku buku = new Buku(judul, pengarang, tahun);
        daftarBuku.add(buku);

        // Simpan ke file buku.txt
        FileIOBuku.simpanKeFile(buku);

        System.out.println("Buku berhasil ditambahkan.");
    }

    // Menu 2
    private static void simpanKeFileSerial() {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {

            oos.writeObject(daftarBuku);
            System.out.println("Daftar buku berhasil disimpan ke buku.ser");

        } catch (IOException e) {
            System.out.println("Gagal menyimpan ke file serial.");
            e.printStackTrace();
        }
    }

    // Menu 3
    private static void tampilkanDariFileTeks() {

        System.out.println("\n=== DAFTAR BUKU (buku.txt) ===");

        List<Buku> bukuList = FileIOBuku.bacaDariFile();

        if (bukuList.isEmpty()) {
            System.out.println("Belum ada data buku.");
        } else {
            for (Buku buku : bukuList) {
                buku.tampilkanInfo();
            }
        }
    }

    // Menu 4
    private static void tampilkanDariFileSerial() {

        System.out.println("\n=== DAFTAR BUKU (buku.ser) ===");

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {

            List<Buku> bukuList = (List<Buku>) ois.readObject();

            if (bukuList.isEmpty()) {
                System.out.println("Belum ada data buku.");
            } else {
                for (Buku buku : bukuList) {
                    buku.tampilkanInfo();
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File serial belum ada atau tidak bisa dibaca.");
        }
    }
}

