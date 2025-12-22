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

public class Anggota implements Serializable {
    private String id;
    private String nama;

    public Anggota(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void tampilInfo() {
        System.out.println("ID Anggota : " + id);
        System.out.println("Nama       : " + nama);
    }
}

