/*interface IAparat {
    void porneste();
    void opreste();
}*/


   /* @Override
    public void porneste() {
        System.out.println("Aparatul " + marca + " " + model + " a pornit.");
    }

    @Override
    public void opreste() {
        System.out.println("Aparatul " + marca + " " + model + " s-a oprit.");
    }
    */

import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
class Main {

    public static void main(String[] args) {
        Object[] lista = new Object[20];

        // === 10 APARATE SPĂLARE CU PRESIUNE ===marca,model,putere,greutate,pret,presiune,debitApa,rezervorDetergent,tipLance,lungimeFurtun
        lista[0] = new AparatSpalareCuPresiune(
                "Karcher", "K2 Universal", 1400, 4.0, 349.99,
                110, 6.0, true, "Lance Vario", 4
        );
        lista[1] = new AparatSpalareCuPresiune(
                "Karcher", "K3 Power Control", 1600, 6.5, 599.99,
                120, 7.0, true, "Lance Power Control", 6
        );
        lista[2] = new AparatSpalareCuPresiune(
                "Karcher", "K4 Compact", 1800, 11.0, 999.99,
                130, 7.5, true, "Lance Full Control", 6
        );
        lista[3] = new AparatSpalareCuPresiune(
                "Karcher", "K5 Premium Smart Control", 2100, 13.9, 1699.99,
                145, 8.0, true, "Lance Smart", 8
        );
        lista[4] = new AparatSpalareCuPresiune(
                "Bosch", "EasyAquatak 120", 1500, 4.4, 399.99,
                120, 6.5, false, "Lance Jet-Fan", 5
        );
        lista[5] = new AparatSpalareCuPresiune(
                "Bosch", "AdvancedAquatak 160", 2600, 21.0, 1499.99,
                160, 8.0, true, "Lance Metal Jet", 8
        );
        lista[6] = new AparatSpalareCuPresiune(
                "Makita", "HW102", 1300, 3.7, 489.99,
                100, 5.5, false, "Lance Standard", 3
        );
        lista[7] = new AparatSpalareCuPresiune(
                "Makita", "HW1300", 1800, 18.8, 1099.99,
                130, 7.0, true, "Lance Pro", 7
        );
        lista[8] = new AparatSpalareCuPresiune(
                "Black&Decker", "BXPW1700E", 1700, 6.0, 499.99,
                130, 6.0, true, "Lance Turbo", 6
        );
        lista[9] = new AparatSpalareCuPresiune(
                "Stanley", "SXPW22E", 2200, 9.5, 999.99,
                150, 8.0, true, "Lance Heavy Duty", 8
        );

        // === 10 SUFLANTE === marca,model,putere,greutate,pret,vitezaAer,debitAer,functieAspirare,nivelZgomot,tipAlimentare
        lista[10] = new Suflanta(
                "Bosch", "ALB 18 LI", 180, 1.8, 499.99,
                200, 2.5, false, 80, "Acumulator"
        );
        lista[11] = new Suflanta(
                "Bosch", "UniversalGardenTidy", 1800, 3.4, 649.99,
                285, 3.5, true, 99, "Electrica"
        );
        lista[12] = new Suflanta(
                "Makita", "UB1103", 600, 1.9, 359.99,
                290, 4.1, false, 87, "Electrica"
        );
        lista[13] = new Suflanta(
                "Makita", "DUB186Z", 180, 2.0, 419.99,
                210, 3.2, false, 83, "Acumulator"
        );
        lista[14] = new Suflanta(
                "Black&Decker", "GW3030", 3000, 4.8, 459.99,
                418, 14, true, 106, "Electrica"
        );
        lista[15] = new Suflanta(
                "Stihl", "BGA 57", 450, 2.3, 899.99,
                246, 3.6, false, 82, "Acumulator"
        );
        lista[16] = new Suflanta(
                "Stihl", "BG 86", 830, 4.4, 1699.99,
                306, 13, true, 104, "Benzină"
        );
        lista[17] = new Suflanta(
                "Husqvarna", "125BVx", 800, 4.2, 1499.99,
                320, 12.0, true, 107, "Benzina"
        );
        lista[18] = new Suflanta(
                "Einhell", "GE-CL 36", 250, 2.4, 579.99,
                210, 7.2, false, 84, "Acumulator"
        );
        lista[19] = new Suflanta(
                "Ryobi", "RBL36JB", 300, 4.1, 899.99,
                250, 8.0, true, 97, "Acumulator"
        );

        System.out.println("=== AFISARE ELEMENTE ===");
        for (Object obj : lista) {
            System.out.println(obj.toString());
        }
        //CITIRE PRESIUNE MINIMA
        /*String presInput = JOptionPane.showInputDialog(
                null,
                "Introdu presiunea minimă (bari) pentru aparatele de spălat:",
                "Filtru presiune",
                JOptionPane.QUESTION_MESSAGE
        );

        double presiuneMinima = Double.parseDouble(presInput);

        // CITIRE NIVEL ZGOMOT MAXIM
        String zgomotInput = JOptionPane.showInputDialog(
                null,
                "Introdu nivelul maxim de zgomot (dB) pentru suflante:",
                "Filtru zgomot",
                JOptionPane.QUESTION_MESSAGE
        );

        int zgomotMaxim = Integer.parseInt(zgomotInput);
        AparatSpalareCuPresiune.afiseazaCuPresiune(lista, presiuneMinima);
        Suflanta.afiseazaSilentioase(lista, zgomotMaxim);*/
        salveazaAparate(lista, "aparate.txt");
        salveazaSuflante(lista, "suflante.txt");
        new Interfata(lista);
    }
    public static void salveazaAparate(Object[] lista, String numeFisier) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(numeFisier))) {
            for (Object obj : lista) {
                if (obj instanceof AparatSpalareCuPresiune) {
                    writer.write(obj.toString());
                    writer.newLine();
                }
            }
            System.out.println("Aparate salvate în: " + numeFisier);
        } catch (IOException e) {
            System.out.println("Eroare la salvarea aparatelor: " + e.getMessage());
        }
    }

    // === Metoda de salvare a suflantelor ===
    public static void salveazaSuflante(Object[] lista, String numeFisier) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(numeFisier))) {
            for (Object obj : lista) {
                if (obj instanceof Suflanta) {
                    writer.write(obj.toString());
                    writer.newLine();
                }
            }
            System.out.println("Suflante salvate în: " + numeFisier);
        } catch (IOException e) {
            System.out.println("Eroare la salvarea suflantelor: " + e.getMessage());
        }
    }
}
