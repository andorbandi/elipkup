/*
* File: Ellipse.java
* Author: Szép Andor
* Copyright: 2026, Szép Andor
* Group: Szoft IN
* Date: 2026-04-21
* Github: https://github.com/andorbandi/
* Licenc: MIT
*/

package com.example;

public class Ellipse {
    public static double calcVolume(double r1, double r2, double height) {
        
        if(r1 <= 0 || r2 <= 0 || height <= 0) {
            throw new IllegalArgumentException("Minden paraméternek pozitívnak kell lennie.");
        }
        return (Math.PI * r1 * r2 * height) / 3;
    }
}
