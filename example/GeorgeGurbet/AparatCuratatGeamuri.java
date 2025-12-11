package org.example.GeorgeGurbet;

import org.example.Aparat;
import java.util.ArrayList;
import java.util.List;

public class AparatCuratatGeamuri extends Aparat {
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

    public static List<AparatCuratatGeamuri> examples() {
        List<AparatCuratatGeamuri> list = new ArrayList<>();
        list.add(new AparatCuratatGeamuri("GlassMate", "G100", 199.99, 0.5));
        list.add(new AparatCuratatGeamuri("ClearView", "CV200", 249.50, 0.7));
        list.add(new AparatCuratatGeamuri("Sparkle", "S1", 149.00, 0.4));
        list.add(new AparatCuratatGeamuri("WindowPro", "WP300", 299.90, 0.9));
        list.add(new AparatCuratatGeamuri("AquaSwipe", "A50", 129.99, 0.35));
        list.add(new AparatCuratatGeamuri("StormClean", "SC7", 179.00, 0.6));
        list.add(new AparatCuratatGeamuri("Crystal", "C7", 219.50, 0.55));
        list.add(new AparatCuratatGeamuri("PureGlass", "PG8", 189.00, 0.45));
        list.add(new AparatCuratatGeamuri("EcoWipe", "EW9", 99.99, 0.25));
        list.add(new AparatCuratatGeamuri("TurboWipe", "TW10", 349.00, 1.20));
        return list;
    }

    public static void main(String[] args) {
        for (AparatCuratatGeamuri a : examples()) {
            System.out.println(a);
        }
    }
}
