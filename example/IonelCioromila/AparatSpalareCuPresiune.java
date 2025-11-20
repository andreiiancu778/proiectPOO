package org.example.IonelCioromila;
import org.example.Aparat;
// Clasa derivată 1: Aparat de spălare cu presiune
class AparatSpalareCuPresiune extends Aparat {
    private double presiune;        // în bari
    private double debitApa;        // în L/min
    private boolean rezervorDetergent;
    private String tipLance;
    private int lungimeFurtun;      // în metri

    // Constructor fără argumente
    public AparatSpalareCuPresiune() {
        super();
        this.presiune = 0.0;
        this.debitApa = 0.0;
        this.rezervorDetergent = false;
        this.tipLance = "Standard";
        this.lungimeFurtun = 0;
    }

    // Constructor cu toate argumentele
    public AparatSpalareCuPresiune(String marca, String model, int putere, double greutate, double pret,
                                   double presiune, double debitApa, boolean rezervorDetergent,
                                   String tipLance, int lungimeFurtun) {
        super(marca, model, putere, greutate, pret);
        this.presiune = presiune;
        this.debitApa = debitApa;
        this.rezervorDetergent = rezervorDetergent;
        this.tipLance = tipLance;
        this.lungimeFurtun = lungimeFurtun;
    }

    // Constructor de copiere
    public AparatSpalareCuPresiune(AparatSpalareCuPresiune other) {
        super(other);
        this.presiune = other.presiune;
        this.debitApa = other.debitApa;
        this.rezervorDetergent = other.rezervorDetergent;
        this.tipLance = other.tipLance;
        this.lungimeFurtun = other.lungimeFurtun;
    }

    // Getteri și Setteri
    public double getPresiune() { return presiune; }
    public void setPresiune(double presiune) { this.presiune = presiune; }

    public double getDebitApa() { return debitApa; }
    public void setDebitApa(double debitApa) { this.debitApa = debitApa; }

    public boolean hasRezervorDetergent() { return rezervorDetergent; }
    public void setRezervorDetergent(boolean rezervorDetergent) { this.rezervorDetergent = rezervorDetergent; }

    public String getTipLance() { return tipLance; }
    public void setTipLance(String tipLance) { this.tipLance = tipLance; }

    public int getLungimeFurtun() { return lungimeFurtun; }
    public void setLungimeFurtun(int lungimeFurtun) { this.lungimeFurtun = lungimeFurtun; }

    @Override
    public String toString() {
        return "[Aparat Spalare cu Presiune] " + super.toString() +
                ", Presiune: " + presiune + " bari" +
                ", Debit apa: " + debitApa + " L/min" +
                ", Rezervor detergent: " + (rezervorDetergent ? "Da" : "Nu") +
                ", Tip lance: " + tipLance +
                ", Lungime furtun: " + lungimeFurtun + " m";
    }

}
