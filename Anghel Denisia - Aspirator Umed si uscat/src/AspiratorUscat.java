public class AspiratorUscat extends Aparat {
    // Date membre
    private double capacitateSac; // în litri
    private boolean areFiltruHEPA;

    // Constructor implicit
    public AspiratorUscat() {
        super();
        this.capacitateSac = 0.0;
        this.areFiltruHEPA = false;
    }

    // Constructor cu parametri
    public AspiratorUscat(String marca, String model, double putere, double capacitateSac, boolean areFiltruHEPA) {
        super(marca, model, putere);
        this.capacitateSac = capacitateSac;
        this.areFiltruHEPA = areFiltruHEPA;
    }

    // Constructor de copiere
    public AspiratorUscat(AspiratorUscat altAspirator) {
        super(altAspirator);
        this.capacitateSac = altAspirator.capacitateSac;
        this.areFiltruHEPA = altAspirator.areFiltruHEPA;
    }

    // Metoda toString
    @Override
    public String toString() {
        return "AspiratorUscat [" + super.toString() +
                ", capacitateSac=" + capacitateSac + "L, filtruHEPA=" + areFiltruHEPA + "]";
    }
}