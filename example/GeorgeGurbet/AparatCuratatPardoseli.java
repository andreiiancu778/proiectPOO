package org.example.GeorgeGurbet;

import org.example.Aparat;
import java.util.ArrayList;
import java.util.List;

public class AparatCuratatPardoseli extends Aparat {
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
        return "AparatCuratatPardoseli [" + super.toString() + ", putere=" + putere + "W]";
    }

    public static List<AparatCuratatPardoseli> examples() {
        List<AparatCuratatPardoseli> list = new ArrayList<>();
        list.add(new AparatCuratatPardoseli("FloorMaster", "FM100", 299.99, 1200));
        list.add(new AparatCuratatPardoseli("CleanSweep", "CS200", 399.50, 1500));
        list.add(new AparatCuratatPardoseli("PowerScrub", "PS3", 199.00, 800));
        list.add(new AparatCuratatPardoseli("HeavyDuty", "HD400", 499.90, 2000));
        list.add(new AparatCuratatPardoseli("QuickMop", "QM50", 149.99, 600));
        list.add(new AparatCuratatPardoseli("UltraClean", "UC7", 259.00, 1300));
        list.add(new AparatCuratatPardoseli("SpinWash", "SW8", 329.50, 1600));
        list.add(new AparatCuratatPardoseli("EcoFloor", "EF9", 179.00, 900));
        list.add(new AparatCuratatPardoseli("SilentVac", "SV9", 219.99, 1100));
        list.add(new AparatCuratatPardoseli("MaxSweep", "MX10", 549.00, 2200));
        return list;
    }

    public static void main(String[] args) {
        for (AparatCuratatPardoseli a : examples()) {
            System.out.println(a);
        }
    }
}
