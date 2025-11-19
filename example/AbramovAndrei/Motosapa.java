package org.example.AbramovAndrei;

import org.example.Aparat;

public class Motosapa extends Aparat {

    private String motorizare;

    // Constructor fără argumente
    public Motosapa() {
        super();            // setează marca=N/A, model=N/A etc.
        this.motorizare = "";
    }

    // Constructor complet
    public Motosapa(String marca, String model, int putere, double greutate, double pret,
                    String motorizare) {

        super(marca, model, putere, greutate, pret);
        this.motorizare = motorizare;
    }

    // Constructor de copiere
    public Motosapa(Motosapa other) {
        super(other);
        this.motorizare = other.motorizare;
    }

    @Override
    public String toString() {
        return "Motosapa{" +
                "marca='" + getMarca() + '\'' +
                ", model='" + getModel() + '\'' +
                ", putere=" + getPutere() +
                ", greutate=" + getGreutate() +
                ", pret=" + getPret() +
                ", motorizare='" + motorizare + '\'' +
                '}';
    }
}
