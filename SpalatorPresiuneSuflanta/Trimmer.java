//trimmer
public class Trimmer extends Aparat {
    private double putere; // W
    private double greutate; // kg

    public Trimmer(String model, String marca, String tip, double pret, double putere, double greutate) {
        super(model, marca, tip, pret);
        this.putere = putere;
        this.greutate = greutate;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", putere=" + putere +
                ", greutate=" + greutate;
    }
}