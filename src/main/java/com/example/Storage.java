/*
* File: Storage.java
* Author: Szép Andor
* Copyright: 2026, Szép Andor
* Group: Szoft IN
* Date: 2026-04-21
* Github: https://github.com/andorbandi/
* Licenc: MIT
*/

package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class Storage {
    public static void save(double r1, double r2, double height, double volume) {
        
        try(FileWriter writer = new FileWriter("adat.txt", true)) {
            writer.write(r1 + ";" + r2 + ";" + height + ";" + volume + "\n");
        } catch(IOException e) {
            System.out.println("Hiba a fájl írásakor: " + e.getMessage());
        }
    }
}
