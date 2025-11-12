public class Main {
    public static void main(String[] args) {
        Aparat aparat = new Aparat("Philips", "A100", 1200);
        AspiratorUscat aspiratorUscat = new AspiratorUscat("Bosch", "B200", 1400, 3.5, true);
        AspiratorUmed aspiratorUmed = new AspiratorUmed("Karcher", "K300", 1600, 5.0, true);

        System.out.println(aparat);
        System.out.println(aspiratorUscat);
        System.out.println(aspiratorUmed);
    }
}