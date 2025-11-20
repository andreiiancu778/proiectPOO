package org.example;

import org.example.IancuAndrei.Drujba;
import org.example.IancuAndrei.Trimmer;
import org.example.IonelCioromila.AparatSpalareCuPresiune;
import org.example.IonelCioromila.Suflanta;

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
        Object[] lista = new Object[20];

        for (int i = 0; i < 10; i++) {
            lista[i] = new AparatSpalareCuPresiune(
                    "Karcher", "K" + (i + 1),
                    2000 + i * 10, 10 + i * 0.5, 1000 + i * 50,
                    130 + i * 2, 6 + i * 0.2, true,
                    "Lance turbo", 8 + i
            );
        }
        for (int i = 10; i < 20; i++) {
            lista[i] = new Suflanta(
                    "Bosch", "ALB" + (i - 9),
                    1500 + i * 5, 4 + i * 0.1, 700 + i * 40,
                    200 + i * 3, 10 + (i - 10) * 0.5, true,
                    80 + i, "Electrica"
            );
        }
        System.out.println("=== APARATSPALARECUPRESIUNE SI SUFLANTA ===");
        for (Object obj : lista) {
            System.out.println(obj.toString());
    }
}