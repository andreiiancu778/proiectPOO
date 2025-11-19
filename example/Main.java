package org.example;

import org.example.IancuAndrei.Drujba;
import org.example.IancuAndrei.Trimmer;

public class Main {
    public static void main(String[] args) {
        // 10 drujbe
        Object[] drujbe = new Object[10];
        for (int i = 0; i < drujbe.length; i++) drujbe[i] = new Drujba();

        // 10 trimmere
        Object[] trimmere = new Object[10];
        for (int i = 0; i < trimmere.length; i++) trimmere[i] = new Trimmer();

        // afisare
        System.out.println("=== DRUJBE ===");
        for (Object o : drujbe) System.out.println(o);

        System.out.println("\n=== TRIMMER-E ===");
        for (Object o : trimmere) System.out.println(o);
    }
}