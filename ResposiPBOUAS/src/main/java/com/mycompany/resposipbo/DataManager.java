/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resposipbo;

/**
 *
 * @author aniip
 */
import java.io.*;

public class DataManager {

    public static void simpanData(Object obj, String file) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(obj);
            System.out.println("Data berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data.");
        }
    }

    public static Object bacaData(String file) {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(file))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }
}


