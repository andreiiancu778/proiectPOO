import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interface extends JFrame{
    public Interface() {
        super("Interfață Aparate");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        JButton btnAparat = new JButton("Aparat");
        JButton btnMotosapa = new JButton("Motosapa");
        JButton btnMasina = new JButton("MasinaTunsIarba");

        btnAparat.addActionListener(e -> showAparatWindow());
        btnMotosapa.addActionListener(e -> showMotosapaWindow());
        btnMasina.addActionListener(e -> showMasinaWindow());

        add(btnAparat);
        add(btnMotosapa);
        add(btnMasina);
    }

    private void showAparatWindow() {
        JFrame frame = new JFrame("Aparate - Exemplu");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JTextArea area = new JTextArea(10, 40);
        area.setEditable(false);
        area.append(new Aparat("ModelX", "FirmaX", 199.9).toString() + "\n");
        area.append(new Aparat("ModelY", "FirmaY", 299.9).toString() + "\n");
        frame.add(new JScrollPane(area));
        frame.pack();
        frame.setLocationRelativeTo(this);
        frame.setVisible(true);
    }

    private void showMotosapaWindow() {
        JFrame frame = new JFrame("Motosape - Exemplu");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JTextArea area = new JTextArea(10, 50);
        area.setEditable(false);
        area.append(new Motosapa("PT76016","Grunman",469.00,"benzina",1500,11.5).toString() + "\n");
        area.append(new Motosapa("120RE","RURIS",446.0,"electric",1200,10.9).toString() + "\n");
        frame.add(new JScrollPane(area));
        frame.pack();
        frame.setLocationRelativeTo(this);
        frame.setVisible(true);
    }

    private void showMasinaWindow() {
        JFrame frame = new JFrame("Mașini de tuns iarba - Exemplu");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JTextArea area = new JTextArea(10, 60);
        area.setEditable(false);
        area.append(new MasinaTunsIarba("DZ-M105","Detoolz",658.89,"manual",true,40).toString() + "\n");
        area.append(new MasinaTunsIarba("RoboMower APP 2500m2 PRO","iHunt",1895.00,"automat",false,0).toString() + "\n");
        frame.add(new JScrollPane(area));
        frame.pack();
        frame.setLocationRelativeTo(this);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new Interface().setVisible(true);
        });
    }
}
