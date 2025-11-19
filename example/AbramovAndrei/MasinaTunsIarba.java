package org.example.AbramovAndrei;
import org.example.Aparat;
public class MasinaTunsIarba extends Aparat {

    private String functionalitate;
    private boolean cosColectare;
    private int volumCosLitri;

    // Constructor fara argumente
    public MasinaTunsIarba() {
        super(); // apeleaza constructorul fara argumente din Aparat
        this.functionalitate = "";
        this.cosColectare = false;
        this.volumCosLitri = 0;
    }

    // Constructor cu toate argumentele
    public MasinaTunsIarba(String marca, String model, int putere, double greutate, double pret,
                           String functionalitate, boolean cosColectare, int volumCosLitri) {
        super(marca, model, putere, greutate, pret);
        this.functionalitate = functionalitate;
        this.cosColectare = cosColectare;
        this.volumCosLitri = volumCosLitri;
    }

    // Constructor de copiere
    public MasinaTunsIarba(MasinaTunsIarba other) {
        super(other); // copiaza partea din Aparat
        this.functionalitate = other.functionalitate;
        this.cosColectare = other.cosColectare;
        this.volumCosLitri = other.volumCosLitri;
    }

    @Override
    public String toString() {
        return "MasinaTunsIarba{" +
                "marca='" + getMarca() + '\'' +
                ", model='" + getModel() + '\'' +
                ", putere=" + getPutere() +
                ", greutate=" + getGreutate() +
                ", pret=" + getPret() +
                ", functionalitate='" + functionalitate + '\'' +
                ", cosColectare=" + cosColectare +
                ", volumCosLitri=" + volumCosLitri +
                '}';
    }
}

