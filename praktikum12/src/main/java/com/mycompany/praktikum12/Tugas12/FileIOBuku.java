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

public class FileIOBuku {

    private static final String TEXT_FILE = "buku.txt";

    // Simpan satu buku ke file teks
    public static void simpanKeFile(Buku buku) {
        try (FileWriter writer = new FileWriter(TEXT_FILE, true)) {
            writer.write(buku.toFileString() + "\n");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan buku ke file teks.");
            e.printStackTrace();
        }
    }

    // Baca semua buku dari file teks
    public static List<Buku> bacaDariFile() {

        List<Buku> daftarBuku = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {

            String baris;

            while ((baris = reader.readLine()) != null) {
                String[] data = baris.split(",");

                if (data.length == 3) {
                    String judul = data[0];
                    String pengarang = data[1];
                    int tahun = Integer.parseInt(data[2]);

                    daftarBuku.add(new Buku(judul, pengarang, tahun));
                }
            }

        } catch (IOException e) {
            System.out.println("File buku.txt belum ada atau tidak bisa dibaca.");
        }

        return daftarBuku;
    }
}

