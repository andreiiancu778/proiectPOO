public class Aparat {
    private String model;
    private String producator;
    private String motorizare;
    private double pret;

    public Aparat() {
        this.model = "";
        this.producator = "";
        this.motorizare = "";
        this.pret = 0.0;
    }
    public Aparat(String model, String producator,String motorizare, double pret) {
        this.model = model;
        this.producator = producator;
        this.motorizare = motorizare;
        this.pret = pret;
    }
    public String getModel() {
        return model;
    }
    public double getPret() {
        return pret;
    }
    public String getMotorizare() {
        return motorizare;
    }
    public String getProducator() {
        return producator;
    }
    public String toString(){
        return "Aparat[model="+getModel()+",producator="+getProducator()+",motorizare="+getMotorizare()+" ,pret="+getPret()+"]";
    }
}
