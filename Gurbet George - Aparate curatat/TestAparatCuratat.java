public class TestAparatCuratat {
  public static void filtreaza(Object[] vector, java.util.function.Predicate<Object> c1, java.util.function.Predicate<Object> c2) {
  for (Object obj : vector) {
    if (c1.test(obj) && c2.test(obj)) {
    System.out.println(obj);
    }
  }
}
  public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    Object[] pardoseli = new Object[10];
    Object[] geamuri = new Object[10];


    for (int i = 0; i < 10; i++) {
      pardoseli[i] = new AparatCuratatPardoseli();
      geamuri[i] = new AparatCuratatGeamuri();
    }


  System.out.println("--- Aparate Curatat Pardoseli ---");
  System.out.print("Introduceţi puterea minimă: ");
  int putereMin = sc.nextInt();
  System.out.print("Introduceţi preţul minim: ");
  double pretMinP = sc.nextDouble();


  System.out.println("-- Rezultate filtrate Pardoseli --");
  filtreaza(pardoseli, o -> ((AparatCuratatPardoseli)o).putere >= putereMin, o -> ((AparatCuratatPardoseli)o).pret >= pretMinP);


  System.out.println("--- Aparate Curatat Geamuri ---");
  System.out.print("Introduceţi capacitatea minimă a rezervorului: ");
  double capMin = sc.nextDouble();
  System.out.print("Introduceţi preţul minim: ");
  double pretMinG = sc.nextDouble();


  System.out.println("-- Rezultate filtrate Geamuri --");
  filtreaza(geamuri, o -> ((AparatCuratatGeamuri)o).capacitateRezervor >= capMin, o -> ((AparatCuratatGeamuri)o).pret >= pretMinG);
  }
}
