package org.example.IancuAndrei;
import org.example.Aparat;

public class Drujba extends Aparat {

    private double capacitateBaterie;  // Capacitatea bateriei in Wh
    private double latimeLama;         // Latimea lamei in cm
    private double notaRecenzii;       // Nota medie a recenziilor
    private String material;           // Materialul din care este facuta lama (ex: otel, titan)
    private int vitezaLant;            // Viteza lantului in m/s

    // Constructor fara argumente
    public Drujba() {
        super();  // Apelează constructorul clasei părinte (Aparat)
        this.capacitateBaterie = 0.0;
        this.latimeLama = 0.0;
        this.notaRecenzii = 0.0;
        this.material = "Necunoscut";
        this.vitezaLant = 0;
    }

    // Constructor cu toate argumentele
    public Drujba(String marca, String model, int putere, double greutate, double pret,
                  double capacitateBaterie, double latimeLama, double notaRecenzii,
                  String material, int vitezaLant) {

        super(marca, model, putere, greutate, pret);  // Apelează constructorul clasei părinte (Aparat)
        this.capacitateBaterie = capacitateBaterie;
        this.latimeLama = latimeLama;
        this.notaRecenzii = notaRecenzii;
        this.material = material;
        this.vitezaLant = vitezaLant;
    }

    // Constructor de copiere
    public Drujba(Drujba other) {
        super(other);  // Apelează constructorul de copiere din Aparat
        this.capacitateBaterie = other.capacitateBaterie;
        this.latimeLama = other.latimeLama;
        this.notaRecenzii = other.notaRecenzii;
        this.material = other.material;
        this.vitezaLant = other.vitezaLant;
    }

    // Getters & Setters
    public double getCapacitateBaterie() { return capacitateBaterie; }
    public void setCapacitateBaterie(double capacitateBaterie) { this.capacitateBaterie = capacitateBaterie; }

    public double getLatimeLama() { return latimeLama; }
    public void setLatimeLama(double latimeLama) { this.latimeLama = latimeLama; }

    public double getNotaRecenzii() { return notaRecenzii; }
    public void setNotaRecenzii(double notaRecenzii) { this.notaRecenzii = notaRecenzii; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public int getVitezaLant() { return vitezaLant; }
    public void setVitezaLant(int vitezaLant) { this.vitezaLant = vitezaLant; }

    @Override
    public String toString() {
        return "Drujba{" +
                "marca='" + getMarca() + '\'' +
                ", model='" + getModel() + '\'' +
                ", putere=" + getPutere() +
                ", greutate=" + getGreutate() +
                ", pret=" + getPret() +
                ", capacitateBaterie=" + capacitateBaterie +
                ", latimeLama=" + latimeLama +
                ", notaRecenzii=" + notaRecenzii +
                ", material='" + material + '\'' +
                ", vitezaLant=" + vitezaLant +
                '}';
    }
}