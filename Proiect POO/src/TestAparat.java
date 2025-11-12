public class TestAparat {
    public static void main(String[] args){
        Aparat aparat1 = new Aparat();
        Aparat aparat2 = new Aparat("PRO-TIL1500","Steinhaus","electric",379.99);
        Aparat aparat3 = new Aparat("KD5182","Kraft&Dele","electric",585.53);

        System.out.println("Aparat 1: " + aparat1.toString());
        System.out.println("Aparat 2: " + aparat2.toString());
    }
}
