package PF1;

public class App {
    public static void q21(){
        IPaireP<Integer,String> p1 = new PaireP<>(1,"un");
        System.out.println(p1);
        IPaireP<Double,String> p2 =p1.changeFst(1.0);
        System.out.println(p2);

    }
}
