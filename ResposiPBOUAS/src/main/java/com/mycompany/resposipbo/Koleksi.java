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

public abstract class Koleksi implements Serializable {
    protected String id;
    protected String judul;

    public Koleksi(String id, String judul) {
        this.id = id;
        this.judul = judul;
    }

    public String getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public abstract void tampilInfo();
}


