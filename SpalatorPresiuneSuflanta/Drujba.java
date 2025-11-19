//drujba
public class Drujba extends Aparat {
    private double lungimeLama; // cm
    private double capacitateRezervor; // litri

    public Drujba(String model, String marca, String tip, double pret, double lungimeLama, double capacitateRezervor) {
        super(model, marca, tip, pret);
        this.lungimeLama = lungimeLama;
        this.capacitateRezervor = capacitateRezervor;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", lungimeLama=" + lungimeLama +
                ", capacitateRezervor=" + capacitateRezervor;
    }
}