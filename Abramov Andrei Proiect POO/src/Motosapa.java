public class Motosapa extends Aparat{
    private String motorizare;
    private int putere;
    private double greutate_kg;
    public Motosapa() {
        super();
        this.motorizare = "";
        this.putere = 0;
        this.greutate_kg = 0;
    }

    public Motosapa(String model, String producator, double pret, String motorizare, int putere, double greutate_kg) {
        super(model, producator, pret);
        this.motorizare = motorizare;
        this.putere = putere;
        this.greutate_kg = greutate_kg;
    }

    public Motosapa(Motosapa other) {
        super(other);
        this.motorizare = other.motorizare;
        this.putere = other.putere;
        this.greutate_kg = other.greutate_kg;
    }

    public String toString(){
        return "Motosapa[model="+getModel()+", producator="+getProducator()+", motorizare="+motorizare+", putere_W/CP="+putere+", greutate_kg="+greutate_kg+", pret="+getPret()+"]";
    }
}
