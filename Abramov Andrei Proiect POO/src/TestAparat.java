public class TestAparat {
    public static void main(String[] args){
        Aparat aparat1 = new Aparat();
        Aparat aparat2 = new Motosapa("PT76016","Grunman",469.00,"benzina",1500,11.5);
        Aparat aparat3 = new MasinaTunsIarba("DZ-M105","Detoolz",658.89,"manual",true,40);
        Aparat aparat4 = new MasinaTunsIarba("RoboMower APP 2500m2 PRO","iHunt",1895.00,"electrica",false,0);


        System.out.println("Aparat 1: " + aparat1.toString());
        System.out.println("Aparat 2: " + aparat2.toString());
        System.out.println("Aparat 3: " + aparat3.toString());
        System.out.println("Aparat 4: " + aparat4.toString());
    }
}
