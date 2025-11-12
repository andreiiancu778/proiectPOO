public class AspiratorUmed extends Aparat {
    // Date membre
    private double capacitateRezervor; // în litri
    private boolean areFunctieSpalare;

    // Constructor implicit
    public AspiratorUmed() {
        super();
        this.capacitateRezervor = 0.0;
        this.areFunctieSpalare = false;
    }

    // Constructor cu parametri
    public AspiratorUmed(String marca, String model, double putere, double capacitateRezervor, boolean areFunctieSpalare) {
        super(marca, model, putere);
        this.capacitateRezervor = capacitateRezervor;
        this.areFunctieSpalare = areFunctieSpalare;
    }

    // Constructor de copiere
    public AspiratorUmed(AspiratorUmed altAspirator) {
        super(altAspirator);
        this.capacitateRezervor = altAspirator.capacitateRezervor;
        this.areFunctieSpalare = altAspirator.areFunctieSpalare;
    }

    // Metoda toString
    @Override
    public String toString() {
        return "AspiratorUmed [" + super.toString() +
                ", capacitateRezervor=" + capacitateRezervor + "L, functieSpalare=" + areFunctieSpalare + "]";
    }
}