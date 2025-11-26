package org.example.IancuAndrei;
import java.util.ArrayList;
import javax.swing.*;
public class Metode
{
    public static void cautaDrujbe(ArrayList<Drujba> lista, double putereMin, double pretMax) {
        StringBuilder rezultat = new StringBuilder();

        for (Drujba d : lista) {
            if (d.getPutere() >= putereMin && d.getPret() <= pretMax) {
                rezultat.append(d.toString()).append("\n");
            }
        }

        if (rezultat.length() == 0) {
            JOptionPane.showMessageDialog(null, "Nici o drujba nu corespunde!");
        } else {
            JOptionPane.showMessageDialog(null, rezultat.toString());
        }
    }
    public static void cautaTrimmere(ArrayList<Trimmer> lista, double putereMin, double pretMax) {
        StringBuilder rezultat = new StringBuilder();

        for (Trimmer t : lista) {
            if (t.getPutere() >= putereMin && t.getPret() <= pretMax) {
                rezultat.append(t.toString()).append("\n");
            }
        }

        if (rezultat.length() == 0) {
            JOptionPane.showMessageDialog(null, "Nici un trimmer nu corespunde!");
        } else {
            JOptionPane.showMessageDialog(null, rezultat.toString());
        }
    }
}