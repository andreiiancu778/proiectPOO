import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class GUIAparate {
  private static Object[] pardoseli;
  private static Object[] geamuri;
  public static void main(String[] args) {
    pardoseli = new Object[10];
    geamuri = new Object[10];
    for (int i = 0; i < 10; i++) {
      pardoseli[i] = new AparatCuratatPardoseli("MarcaP" + i, "ModelP" + i, 100 + i, 500 + i);
      geamuri[i] = new AparatCuratatGeamuri("MarcaG" + i, "ModelG" + i, 80 + i, 1.5 + i);
      }

    salveazaInFisier("pardoseli.txt", pardoseli);
    salveazaInFisier("geamuri.txt", geamuri);

    JFrame f = new JFrame("Filtrare Aparate");
    f.setSize(500, 400);
    f.setLayout(new FlowLayout());

    JTextField cond1 = new JTextField(10);
    JTextField cond2 = new JTextField(10);
    JTextArea afisare = new JTextArea(15, 40);
    JButton btnP = new JButton("Filtrează Pardoseli");
    JButton btnG = new JButton("Filtrează Geamuri");

    f.add(new JLabel("Condiția 1 (putere/capacitate):"));
    f.add(cond1);
    f.add(new JLabel("Condiția 2 (preț minim):"));
    f.add(cond2);
    f.add(btnP);
    f.add(btnG);
    f.add(new JScrollPane(afisare));

  btnP.addActionListener(e -> {
    int c1 = Integer.parseInt(cond1.getText());
    double c2 = Double.parseDouble(cond2.getText());
    afisare.setText( filtruPardoseli(c1, c2) );
    });

  btnG.addActionListener(e -> {
    double c1 = Double.parseDouble(cond1.getText());
    double c2 = Double.parseDouble(cond2.getText());
    afisare.setText( filtruGeamuri(c1, c2) );
    });


  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f.setVisible(true);
  }

static String filtruPardoseli(int putereMin, double pretMin) {
  StringBuilder sb = new StringBuilder();
  for (Object o : pardoseli) {
    AparatCuratatPardoseli a = (AparatCuratatPardoseli)o;
    if (a.putere >= putereMin && a.pret >= pretMin) sb.append(a).append(" ");
    }
  return sb.toString();
  }


static String filtruGeamuri(double capMin, double pretMin) {
  StringBuilder sb = new StringBuilder();
  for (Object o : geamuri) {
    AparatCuratatGeamuri a = (AparatCuratatGeamuri)o;
    if (a.capacitateRezervor >= capMin && a.pret >= pretMin) sb.append(a).append(" ");
    }
  return sb.toString();
  }

static void salveazaInFisier(String nume, Object[] v) {
  try (PrintWriter pw = new PrintWriter(new FileWriter(nume))) {
    for (Object o : v) pw.println(o.toString());
    }
  catch (IOException e) {
    e.printStackTrace();
    }
  }
}
