/*interface IAparat {
    void porneste();
    void opreste();
}*/


   /* @Override
    public void porneste() {
        System.out.println("Aparatul " + marca + " " + model + " a pornit.");
    }

    @Override
    public void opreste() {
        System.out.println("Aparatul " + marca + " " + model + " s-a oprit.");
    }
    */



class Main {

    public static void main(String[] args) {
        Object[] lista = new Object[20];

        for (int i = 0; i < 10; i++) {
            lista[i] = new AparatSpalareCuPresiune(
                    "Karcher", "K" + (i + 1),
                    2000 + i * 10, 10 + i * 0.5, 1000 + i * 50,
                    130 + i * 2, 6 + i * 0.2, true,
                    "Lance turbo", 8 + i
            );
        }
        for (int i = 10; i < 20; i++) {
            lista[i] = new Suflanta(
                    "Bosch", "ALB" + (i - 9),
                    1500 + i * 5, 4 + i * 0.1, 700 + i * 40,
                    200 + i * 3, 10 + (i - 10) * 0.5, true,
                    80 + i, "Electrica"
            );
        }
        System.out.println("=== AFISARE ELEMENTE ===");
        for (Object obj : lista) {
            System.out.println(obj.toString());
        }
    }
}
