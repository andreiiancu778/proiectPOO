public class TestAparatCuratat {
  public static void main(String[] args) {
    Object[] pardoseli = new Object[10];
    Object[] geamuri = new Object[10];


    for (int i = 0; i < 10; i++) {
      pardoseli[i] = new AparatCuratatPardoseli("MarcaP" + i, "ModelP" + i, 100 + i, 500 + i);
      geamuri[i] = new AparatCuratatGeamuri("MarcaG" + i, "ModelG" + i, 80 + i, 1.5 + i);
    }


    System.out.println("Aparate Curatat Pardoseli: ");
    for (Object obj : pardoseli) {
      System.out.println(obj);
    }


    System.out.println("Aparate Curatat Geamuri: ");
    for (Object obj : geamuri) {
      System.out.println(obj);
    }
  }
}