class AparatCuratatPardoseli extends Aparat {
    private int putere;

    public AparatCuratatPardoseli() {
        super();
        this.putere = 0;
    }

    public AparatCuratatPardoseli(String marca, String model, int putere) {
        super(marca, model);
        this.putere = putere;
    }

    public AparatCuratatPardoseli(String marca, String model, double pret, int putere) {
        super(marca, model, pret);
        this.putere = putere;
    }

    @Override
    public String toString() {
        return "AparatCuratatPardoseli [" + super.toString() + ", putere=" + putere + "]";
    }
}

class AparatCuratatGeamuri extends Aparat {
    private double capacitateRezervor;

    public AparatCuratatGeamuri() {
        super();
        this.capacitateRezervor = 0.0;
    }

    public AparatCuratatGeamuri(String marca, String model, double capacitateRezervor) {
        super(marca, model);
        this.capacitateRezervor = capacitateRezervor;
    }

    public AparatCuratatGeamuri(String marca, String model, double pret, double capacitateRezervor) {
        super(marca, model, pret);
        this.capacitateRezervor = capacitateRezervor;
    }

    @Override
    public String toString() {
        return "AparatCuratatGeamuri [" + super.toString() + ", capacitateRezervor=" + capacitateRezervor + "]";
    }
}
