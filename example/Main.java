package org.example;

import org.example.IancuAndrei.Drujba;
import org.example.IancuAndrei.Metode;
import org.example.IancuAndrei.Trimmer;
import org.example.IonelCioromila.AparatSpalareCuPresiune;
import org.example.IonelCioromila.Suflanta;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 10 drujbe create manual: marca model putere greutate pret capacitate latime lama notaRecenzii, material, viteza lant
        Drujba[] drujbe = new Drujba[10];
        drujbe[0] = new Drujba("Stihl", "MS 170", 1500, 4.5, 700.0, 35.0, 9.0, 98.0, "Sintetic", 2);
        drujbe[1] = new Drujba("Makita", "EA3500", 1400, 4.2, 650.0, 40.0, 8.0, 95.0, "Plastic", 3);
        drujbe[2] = new Drujba("Husqvarna", "T435", 1300, 3.9, 600.0, 36.0, 9.0, 100.0, "Sintetic", 1);
        drujbe[3] = new Drujba("Echo", "CS-310", 1100, 4.0, 550.0, 38.0, 10.0, 90.0, "Otel", 2);
        drujbe[4] = new Drujba("Stihl", "MS 180", 1600, 5.0, 750.0, 45.0, 12.0, 95.0, "Sintetic", 3);
        drujbe[5] = new Drujba("Bosch", "AKE 40S", 1200, 3.8, 600.0, 40.0, 9.0, 90.0, "Sintetic", 2);
        drujbe[6] = new Drujba("Ryobi", "RCS2340", 1400, 4.4, 670.0, 42.0, 11.0, 98.0, "Cupru", 3);
        drujbe[7] = new Drujba("Makita", "UC4051A", 1300, 4.0, 620.0, 40.0, 8.0, 96.0, "Sintetic", 1);
        drujbe[8] = new Drujba("Husqvarna", "562 XP", 1700, 5.5, 800.0, 50.0, 12.0, 99.0, "Carbon", 3);
        drujbe[9] = new Drujba("Echo", "CS-450", 1600, 4.8, 730.0, 45.0, 10.0, 97.0, "Carbon", 3);

        // 10 trimmere create manual: marca model putere greutate pret latimeTaiere, vitezaRulare, capacitateBaterie,timp incarcare, autonomie
        Trimmer[] trimmere = new Trimmer[10];
        trimmere[0] = new Trimmer("Black & Decker", "GL8033", 600, 3.2, 250.0, 30.0, 3500, 500, 2.0, 50);
        trimmere[1] = new Trimmer("Bosch", "ART 35", 450, 2.8, 230.0, 34.0, 3800, 550, 2.5, 55);
        trimmere[2] = new Trimmer("Makita", "UR3000", 500, 3.1, 270.0, 32.0, 4000, 600, 1.8, 60);
        trimmere[3] = new Trimmer("Einhell", "GC-ET 4530", 450, 3.0, 210.0, 36.0, 3700, 520, 2.2, 52);
        trimmere[4] = new Trimmer("Ryobi", "RLT30C", 600, 3.3, 260.0, 30.0, 3500, 480, 2.0, 48);
        trimmere[5] = new Trimmer("Worx", "WG168", 500, 3.0, 240.0, 33.0, 3600, 570, 2.0, 57);
        trimmere[6] = new Trimmer("Gardena", "EasyCut 450/25", 450, 2.9, 220.0, 35.0, 3900, 590, 1.9, 59);
        trimmere[7] = new Trimmer("Stihl", "FSA 45", 450, 2.7, 200.0, 30.0, 4200, 530, 2.1, 53);
        trimmere[8] = new Trimmer("Flymo", "Power Trim 500", 550, 3.2, 250.0, 34.0, 3800, 50, 2.3, 50);
        trimmere[9] = new Trimmer("Einhell", "GE-ET 5027", 500, 3.1, 240.0, 32.0, 4000, 54, 2.0, 54);

        // Afisare pentru Drujbe
        System.out.println("DRUJBE:");
        for (Drujba d : drujbe) {
            System.out.println(d);
        }

        // Afisare pentru Trimmere
        System.out.println("\nTRIMMERE:");
        for (Trimmer t : trimmere) {
            System.out.println(t);
        }

        // Conversie array in ArrayList
        ArrayList<Drujba> listaDrujbe = new ArrayList<>(Arrays.asList(drujbe));

        // Citire conditii cu JOptionPane
        String putereStr = JOptionPane.showInputDialog("Introdu puterea minima:");
        double putereMin = Double.parseDouble(putereStr);

        String pretStr = JOptionPane.showInputDialog("Introdu pretul maxim:");
        double pretMax = Double.parseDouble(pretStr);

        // Apel metoda
        Metode.cautaDrujbe(listaDrujbe, putereMin, pretMax);
        // Conversie array in ArrayList pentru trimmere
        ArrayList<Trimmer> listaTrimmere = new ArrayList<>(Arrays.asList(trimmere));

// Citire conditii cu JOptionPane pentru trimmer
        String putereTrimStr = JOptionPane.showInputDialog("Introdu puterea minima pentru trimmer:");
        double putereTrimMin = Double.parseDouble(putereTrimStr);

        String pretTrimStr = JOptionPane.showInputDialog("Introdu pretul maxim pentru trimmer:");
        double pretTrimMax = Double.parseDouble(pretTrimStr);

// Apel metoda
        Metode.cautaTrimmere(listaTrimmere, putereTrimMin, pretTrimMax);
    }

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
}
