import javax.swing.*;
import java.awt.Color;
import java.awt.*;

public class Interfata extends JFrame {

    private Object[] lista; // referință la array-ul din Main
    boolean mesajAfisat=false;

    public Interfata(Object[] lista) {
        this.lista = lista;

        setTitle("Filtru Aparate");
        setSize(550, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // === Elemente grafice ===
        JLabel lblPresiune = new JLabel("Presiune minimă (bari):");
        JTextField txtPresiune = new JTextField(10);
        JCheckBox verifPresiune = new JCheckBox("Verif presiune");
        verifPresiune.setSelected(true);

        JLabel lblZgomot = new JLabel("Zgomot maxim (dB):");
        JTextField txtZgomot = new JTextField(10);

        JButton btnPresiune = new JButton("Afișează aparate de spălat");
        JButton btnZgomot = new JButton("Afișează suflante");


        JTextArea output = new JTextArea();
        output.setEditable(false);
        JScrollPane scroll = new JScrollPane(output);

        // === Layout ===
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1, 5, 5));

        panel.add(lblPresiune);
        panel.add(txtPresiune);
        panel.add(btnPresiune);
        panel.add(verifPresiune);

        panel.add(lblZgomot);
        panel.add(txtZgomot);
        panel.add(btnZgomot);

        add(panel, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);

        // === Evenimente butoane ===
        btnPresiune.addActionListener(e -> {
            try {
                double minPres = Double.parseDouble(txtPresiune.getText());
                output.setText("");

                output.append("=== APARATE CU PRESIUNE > " + minPres + " bari ===\n\n");

                for (Object obj : lista) {
                    if (obj instanceof AparatSpalareCuPresiune asp) {
                        if (verifPresiune.isSelected()) {
                            if (asp.getPresiune() > minPres) {
                                output.append(asp.toString() + "\n\n");
                            }
                        } else {
                            if (!mesajAfisat)
                            {
                                JOptionPane.showMessageDialog(null, "Nu se pot afisa Aparatele cu presiune minima");
                                mesajAfisat = true;
                            }
                        }
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Introduceți o valoare numerică validă!");
            }
        });

        btnZgomot.addActionListener(e -> {
            try {
                int maxZg = Integer.parseInt(txtZgomot.getText());
                output.setText("");

                output.append("=== SUFLANTE CU ZGOMOT < " + maxZg + " dB ===\n\n");

                for (Object obj : lista) {
                    if (obj instanceof Suflanta s) {
                        if (s.getNivelZgomot() < maxZg) {
                            output.append(s.toString() + "\n\n");
                        }
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Introduceți o valoare numerică validă!");
            }
        });

        setVisible(true);
    }
}