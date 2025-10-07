/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_5.Tugas;

/**
 *
 * @author aniip
 */
public class Main {
    public static void main(String[] args) {

        // Bagian Hewan
        Kucing kucing = new Kucing();
        kucing.nama = "Nimo";
        kucing.jenis = "Kucing Anggora";
        System.out.println("=== Informasi Kucing ===");
        kucing.tampilkaninfo();

        Anjing anjing = new Anjing();
        anjing.nama = "Doggy";
        anjing.jenis = "Bulldog";
        System.out.println("\n=== Informasi Anjing ===");
        anjing.tampilkaninfo();

        // Bagian Kendaraan
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota Avanza";
        mobil.kecepatan = 160;
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 4;
        System.out.println("\n=== Informasi Mobil ===");
        mobil.tampilkaninfo();

        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Honda Supra";
        motor.kecepatan = 120;
        motor.jumlahRoda = 2;
        motor.jenisMesin = "4-Tak";
        System.out.println("\n=== Informasi Sepeda Motor ===");
        motor.tampilkaninfo();
    }
}
