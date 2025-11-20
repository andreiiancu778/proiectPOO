package org.example.IonelCioromila;
import org.example.Aparat;
// Clasa derivată 2: Suflantă
class Suflanta extends Aparat {
    private int vitezaAer;          // în km/h
    private double debitAer;        // în m3/min
    private boolean functieAspirare;
    private int nivelZgomot;        // în dB
    private String tipAlimentare;   // ex: Electrică, pe benzină

    // Constructor fără argumente
    public Suflanta() {
        super();
        this.vitezaAer = 0;
        this.debitAer = 0.0;
        this.functieAspirare = false;
        this.nivelZgomot = 0;
        this.tipAlimentare = "N/A";
    }

    // Constructor cu toate argumentele
    public Suflanta(String marca, String model, int putere, double greutate, double pret,
                    int vitezaAer, double debitAer, boolean functieAspirare,
                    int nivelZgomot, String tipAlimentare) {
        super(marca, model, putere, greutate, pret);
        this.vitezaAer = vitezaAer;
        this.debitAer = debitAer;
        this.functieAspirare = functieAspirare;
        this.nivelZgomot = nivelZgomot;
        this.tipAlimentare = tipAlimentare;
    }

    // Constructor de copiere
    public Suflanta(Suflanta other) {
        super(other);
        this.vitezaAer = other.vitezaAer;
        this.debitAer = other.debitAer;
        this.functieAspirare = other.functieAspirare;
        this.nivelZgomot = other.nivelZgomot;
        this.tipAlimentare = other.tipAlimentare;
    }

    // Getteri și setteri
    public int getVitezaAer() { return vitezaAer; }
    public void setVitezaAer(int vitezaAer) { this.vitezaAer = vitezaAer; }

    public double getDebitAer() { return debitAer; }
    public void setDebitAer(double debitAer) { this.debitAer = debitAer; }

    public boolean hasFunctieAspirare() { return functieAspirare; }
    public void setFunctieAspirare(boolean functieAspirare) { this.functieAspirare = functieAspirare; }

    public int getNivelZgomot() { return nivelZgomot; }
    public void setNivelZgomot(int nivelZgomot) { this.nivelZgomot = nivelZgomot; }

    public String getTipAlimentare() { return tipAlimentare; }
    public void setTipAlimentare(String tipAlimentare) { this.tipAlimentare = tipAlimentare; }

    @Override
    public String toString() {
        return "[Suflanta] " + super.toString() +
                ", Viteza aer: " + vitezaAer + " km/h" +
                ", Debit aer: " + debitAer + " m3/min" +
                ", Functie aspirare: " + (functieAspirare ? "Da" : "Nu") +
                ", Nivel zgomot: " + nivelZgomot + " dB" +
                ", Tip alimentare: " + tipAlimentare;
    }
}
