public class Aparat {
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
    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public int getPutere() {
        return putere;
    }

    public double getGreutate() {
        return greutate;
    }

    public double getPret() {
        return pret;
    }

    // Setteri
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public void setPret(double pret) {
        this.pret = pret;
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

