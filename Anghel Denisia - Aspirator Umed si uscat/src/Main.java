public class Main {
    public static void main(String[] args) {
        Aparat aparat = new Aparat();
        AspiratorUscat aspiratorUscat = new AspiratorUscat("Bosch", "B200", 1400, 3.5, true);
        AspiratorUmed aspiratorUmed = new AspiratorUmed("Karcher", "K300", 1600, 5.0, true);

        ArrayList<Object> aparate = new ArrayList<>();

        aparate.add(new Aparat("Aparat multifunctional", "A200", 1200));
        aparate.add(new Aparat("Aparat standard", "A300", 1000));
        aparate.add(new Aparat("Aparat industrial", "A400", 2000));

        aparate.add(new AspiratorUscat("Aspirator Uscat Philips", "P100", 1500, 3, true));
        aparate.add(new AspiratorUscat("Aspirator Uscat Bosch", "B100", 1400, 2, true));
        aparate.add(new AspiratorUscat("Aspirator Uscat Samsung", "S100", 1300, 4, true));

        aparate.add(new AspiratorUmed("Aspirator Umed Karcher", "K100", 1600, 5, true));
        aparate.add(new AspiratorUmed("Aspirator Umed Stanley", "ST100", 1700, 6, true));
        aparate.add(new AspiratorUmed("Aspirator Umed Einhell", "E100", 1550, 4, true));

        aparate.add(new AspiratorUscat("Aspirator Uscat Rowenta", "R100", 1250, 2, true));

        System.out.println("\nLista de aparate:");
        for (Object obj : aparate) {
            System.out.println(obj);
        }
        System.out.println(aparat);
        System.out.println(aspiratorUscat);
        System.out.println(aspiratorUmed);
    }
}