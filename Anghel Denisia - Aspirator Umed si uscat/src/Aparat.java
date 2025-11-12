public class Aparat {
    // Date membre
    protected String marca;
    protected String model;
    protected double putere; // în wați

    // Constructor implicit
    public Aparat() {
        this.marca = "Necunoscut";
        this.model = "Standard";
        this.putere = 0.0;
    }

    // Constructor cu parametri
    public Aparat(String marca, String model, double putere) {
        this.marca = marca;
        this.model = model;
        this.putere = putere;
    }

    // Constructor de copiere
    public Aparat(Aparat altAparat) {
        this.marca = altAparat.marca;
        this.model = altAparat.model;
        this.putere = altAparat.putere;
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Aparat [marca=" + marca + ", model=" + model + ", putere=" + putere + "W]";
    }
}
