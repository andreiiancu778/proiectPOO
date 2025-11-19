package org.example;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI extends JFrame {

    private ArrayList<Aparat> aparate;

    public GUI() {
        super("Interfata Proiect");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 200);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 15, 20));

        // incarci vectorul din fisier (TODO)
        aparate = loadAparateFromFile();

        JTextField cond1 = new JTextField(10);
        JTextField cond2 = new JTextField(10);
        JButton btnFiltreaza = new JButton("Filtreaza");

        btnFiltreaza.addActionListener(e -> showFilteredWindow(cond1.getText(), cond2.getText()));

        add(new JLabel("Pret maxim:"));
        add(cond1);
        add(new JLabel("Greutate minima:"));
        add(cond2);
        add(btnFiltreaza);
    }

    private void showFilteredWindow(String c1, String c2) {
        double pretMax;
        double greutateMin;

        try {
            pretMax = Double.parseDouble(c1);
            greutateMin = Double.parseDouble(c2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Introdu numere valide.",
                    "Eroare", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JFrame frame = new JFrame("Rezultate filtrare");
        JTextArea area = new JTextArea(15, 40);
        area.setEditable(false);

        boolean found = false;

        for (Aparat a : aparate) {
            if (a.getPret() <= pretMax && a.getGreutate() >= greutateMin) {
                area.append(a.toString() + "\n");
                found = true;
            }
        }

        if (!found) {
            area.append("Nimic nu corespunde filtrelor.\n");
        }

        frame.add(new JScrollPane(area));
        frame.pack();
        frame.setLocationRelativeTo(this);
        frame.setVisible(true);
    }

    private ArrayList<Aparat> loadAparateFromFile() {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        new GUI().setVisible(true);
    }
}
