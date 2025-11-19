package org.example.IancuAndrei;
import org.example.Aparat;

public class Drujba extends Aparat {

    private int lungimeLama;        // lungimea lamei in cm
    private int vitezaChain;        // viteza lantului
    private int nivelZgomot;        // nivel de zgomot in dB
    private String tipUlei;         // tipul de ulei folosit
    private double consumUlei;      // consum ulei ml/min
    private double rezervorCombustibil; // litri combustibil

    // Constructor fara argumente
    public Drujba() {
        super();
        this.lungimeLama = 0;
        this.vitezaChain = 0;
        this.nivelZgomot = 0;
        this.tipUlei = "necunoscut";
        this.consumUlei = 0.0;
        this.rezervorCombustibil = 0.0;
    }

    // Constructor cu toate argumentele
    public Drujba(String marca, String model, int putere, double greutate, double pret,
                  int lungimeLama, int vitezaChain, int nivelZgomot,
                  String tipUlei, double consumUlei, double rezervorCombustibil) {

        super(marca, model, putere, greutate, pret);

        this.lungimeLama = lungimeLama;
        this.vitezaChain = vitezaChain;
        this.nivelZgomot = nivelZgomot;
        this.tipUlei = tipUlei;
        this.consumUlei = consumUlei;
        this.rezervorCombustibil = rezervorCombustibil;
    }

    // Constructor de copiere
    public Drujba(Drujba other) {
        super(other);

        this.lungimeLama = other.lungimeLama;
        this.vitezaChain = other.vitezaChain;
        this.nivelZgomot = other.nivelZgomot;
        this.tipUlei = other.tipUlei;
        this.consumUlei = other.consumUlei;
        this.rezervorCombustibil = other.rezervorCombustibil;
    }

    // Getters & Setters
    public int getLungimeLama() { return lungimeLama; }
    public void setLungimeLama(int lungimeLama) { this.lungimeLama = lungimeLama; }

    public int getVitezaChain() { return vitezaChain; }
    public void setVitezaChain(int vitezaChain) { this.vitezaChain = vitezaChain; }

    public int getNivelZgomot() { return nivelZgomot; }
    public void setNivelZgomot(int nivelZgomot) { this.nivelZgomot = nivelZgomot; }

    public String getTipUlei() { return tipUlei; }
    public void setTipUlei(String tipUlei) { this.tipUlei = tipUlei; }

    public double getConsumUlei() { return consumUlei; }
    public void setConsumUlei(double consumUlei) { this.consumUlei = consumUlei; }

    public double getRezervorCombustibil() { return rezervorCombustibil; }
    public void setRezervorCombustibil(double rezervorCombustibil) { this.rezervorCombustibil = rezervorCombustibil; }

    @Override
    public String toString() {
        return "Drujba{" +
                "marca='" + getMarca() + '\'' +
                ", model='" + getModel() + '\'' +
                ", putere=" + getPutere() +
                ", greutate=" + getGreutate() +
                ", pret=" + getPret() +
                ", lungimeLama=" + lungimeLama +
                ", vitezaChain=" + vitezaChain +
                ", nivelZgomot=" + nivelZgomot +
                ", tipUlei='" + tipUlei + '\'' +
                ", consumUlei=" + consumUlei +
                ", rezervorCombustibil=" + rezervorCombustibil +
                '}';
    }
}
