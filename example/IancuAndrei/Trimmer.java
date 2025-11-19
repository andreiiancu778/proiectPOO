package org.example.IancuAndrei;
import org.example.Aparat;

public class Trimmer extends Aparat {

    private double latimeTaiere;      // latimea lamei in cm
    private int vitezaRulare;         // turatii pe minut
    private int capacitateBaterie;    // Wh
    private double timpIncarcare;     // ore
    private int autonomie;            // minute
    private String tipFir;            // tipul firului: 1.6mm, 2mm etc.

    // Constructor fara argumente
    public Trimmer() {
        super();
        this.latimeTaiere = 0.0;
        this.vitezaRulare = 0;
        this.capacitateBaterie = 0;
        this.timpIncarcare = 0.0;
        this.autonomie = 0;
        this.tipFir = "necunoscut";
    }

    // Constructor complet
    public Trimmer(String marca, String model, int putere, double greutate, double pret,
                   double latimeTaiere, int vitezaRulare, int capacitateBaterie,
                   double timpIncarcare, int autonomie, String tipFir) {

        super(marca, model, putere, greutate, pret);

        this.latimeTaiere = latimeTaiere;
        this.vitezaRulare = vitezaRulare;
        this.capacitateBaterie = capacitateBaterie;
        this.timpIncarcare = timpIncarcare;
        this.autonomie = autonomie;
        this.tipFir = tipFir;
    }

    // Constructor de copiere
    public Trimmer(Trimmer other) {
        super(other);

        this.latimeTaiere = other.latimeTaiere;
        this.vitezaRulare = other.vitezaRulare;
        this.capacitateBaterie = other.capacitateBaterie;
        this.timpIncarcare = other.timpIncarcare;
        this.autonomie = other.autonomie;
        this.tipFir = other.tipFir;
    }

    // Gettere si settere
    public double getLatimeTaiere() { return latimeTaiere; }
    public void setLatimeTaiere(double latimeTaiere) { this.latimeTaiere = latimeTaiere; }

    public int getVitezaRulare() { return vitezaRulare; }
    public void setVitezaRulare(int vitezaRulare) { this.vitezaRulare = vitezaRulare; }

    public int getCapacitateBaterie() { return capacitateBaterie; }
    public void setCapacitateBaterie(int capacitateBaterie) { this.capacitateBaterie = capacitateBaterie; }

    public double getTimpIncarcare() { return timpIncarcare; }
    public void setTimpIncarcare(double timpIncarcare) { this.timpIncarcare = timpIncarcare; }

    public int getAutonomie() { return autonomie; }
    public void setAutonomie(int autonomie) { this.autonomie = autonomie; }

    public String getTipFir() { return tipFir; }
    public void setTipFir(String tipFir) { this.tipFir = tipFir; }

    @Override
    public String toString() {
        return "Trimmer{" +
                "marca='" + getMarca() + '\'' +
                ", model='" + getModel() + '\'' +
                ", putere=" + getPutere() +
                ", greutate=" + getGreutate() +
                ", pret=" + getPret() +
                ", latimeTaiere=" + latimeTaiere +
                ", vitezaRulare=" + vitezaRulare +
                ", capacitateBaterie=" + capacitateBaterie +
                ", timpIncarcare=" + timpIncarcare +
                ", autonomie=" + autonomie +
                ", tipFir='" + tipFir + '\'' +
                '}';
    }
}
