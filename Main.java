interface IAparat {
    void porneste();
    void opreste();
}

class Aparat implements IAparat {
    private String marca;
    private String model;
    private int putere;
    private double greutate;
    private double pret;

    // Constructor fără argumente
    public Aparat() {
        this.marca = "Necunoscut";
        this.model = "N/A";
        this.putere = 0;
        this.greutate = 0.0;
        this.pret = 0.0;
    }

    // Constructor cu toate argumentele
    public Aparat(String marca, String model, int putere, double greutate, double pret) {
        this.marca = marca;
        this.model = model;
        this.putere = putere;
        this.greutate = greutate;
        this.pret = pret;
    }

    // Constructor de copiere
    public Aparat(Aparat other) {
        this.marca = other.marca;
        this.model = other.model;
        this.putere = other.putere;
        this.greutate = other.greutate;
        this.pret = other.pret;
    }

    // Getteri
    public String getMarca() { return marca; }
    public String getModel() { return model; }
    public int getPutere() { return putere; }
    public double getGreutate() { return greutate; }
    public double getPret() { return pret; }

    // Setteri
    public void setMarca(String marca) { this.marca = marca; }
    public void setModel(String model) { this.model = model; }
    public void setPutere(int putere) { this.putere = putere; }
    public void setGreutate(double greutate) { this.greutate = greutate; }
    public void setPret(double pret) { this.pret = pret; }

    // Implementare metode interfață
    @Override
    public void porneste() {
        System.out.println("Aparatul " + marca + " " + model + " a pornit.");
    }

    @Override
    public void opreste() {
        System.out.println("Aparatul " + marca + " " + model + " s-a oprit.");
    }

    @Override
    public String toString() {
        return "Marca: " + marca +
                ", Model: " + model +
                ", Putere: " + putere + " W" +
                ", Greutate: " + greutate + " kg" +
                ", Pret: " + pret + " lei";
    }
}

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


class Main {
    public static void main(String[] args) {
        AparatSpalareCuPresiune aparat1 = new AparatSpalareCuPresiune(
                "Karcher", "K5", 2100, 13.5, 1200.0,
                145, 7.5, true, "Turbo Lance", 10);

        Suflanta suflanta1 = new Suflanta(
                "Bosch", "ALB 36", 1800, 4.5, 850.0,
                250, 13.0, true, 88, "Electrică");

        System.out.println(aparat1.toString());
        System.out.println(suflanta1.toString());
    }
}
