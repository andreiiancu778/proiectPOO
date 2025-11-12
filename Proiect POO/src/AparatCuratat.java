public class AparatCuratat {
  public static void main (String[] args) {
    Aparat aparat1 = new Aparat("CLEANEXXO", "Einhell", "electric", 741.82);
    Aparat aparat2 = new Aparat("KD425", "Polimat Invest", "electric", 131.74);
    Aparat aparat3 = new Aparat();
    System.out.println("Aparat Pardoseala: " + aparat1.toString());
    System.out.println("Aparat Geamuri: " + aparat2.toString());
  }
}
