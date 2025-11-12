public class MasinaTunsIarba extends Aparat{
    private String functionalitate;
    private boolean cosColectare;
    private int volumCosLitri;
    public MasinaTunsIarba() {
        super();
        this.functionalitate = "";
        this.cosColectare = false;
        this.volumCosLitri = 0;
    }
    public MasinaTunsIarba(String model, String producator, double pret, String functionalitate, boolean cosColectare, int volumCosLitri) {
        super(model, producator, pret);
        this.functionalitate = functionalitate;
        this.cosColectare = cosColectare;
        this.volumCosLitri = volumCosLitri;
    }
    public MasinaTunsIarba(MasinaTunsIarba other) {
        super(other);
        this.functionalitate = other.functionalitate;
        this.cosColectare = other.cosColectare;
        this.volumCosLitri = other.volumCosLitri;
    }
    public String toString() {
        if (cosColectare) {
            return "MasinaTunsIarba[model=" + getModel() + ", producator=" + getProducator() + ", functionalitate=" + functionalitate + ", cosColectare=" + cosColectare + ", volumCosLitri=" + volumCosLitri + ", pret=" + getPret() + "]";
        } else {
            return "MasinaTunsIarba[model=" + getModel() + ", producator=" + getProducator() + ", functionalitate=" + functionalitate + ", cosColectare=" + cosColectare + ", pret=" + getPret() + "]";
        }
    }
}
