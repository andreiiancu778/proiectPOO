public class Aparat {
    private String model;
    private String producator;
    private double pret;

    public Aparat() {
        this.model = "";
        this.producator = "";
        this.pret = 0.0;
    }
    public Aparat(String model, String producator, double pret) {
        this.model = model;
        this.producator = producator;
        this.pret = pret;
    }
    public Aparat(Aparat other) {
        this.model = other.model;
        this.producator = other.producator;
        this.pret = other.pret;
    }

    public String getModel() {
        return model;
    }
    public double getPret() {
        return pret;
    }
    public String getProducator() {
        return producator;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setProducator(String producator) {
        this.producator = producator;
    }
    public void setPret(double pret) {
        this.pret = pret;
    }
    public String toString(){
        return "Aparat[model="+model+", producator="+producator+", pret="+pret+"]";
    }
}
