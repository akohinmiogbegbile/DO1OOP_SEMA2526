package tempConv;

public class Main {
    public static void main(String[] args) {
        Converter c = new Converter();

        System.out.println(c.celsiusToFahrenheit(0));   
        //System.out.println(c.celsiusToFahrenheit(1222));
        
        Converter n = new Converter();
        System.out.println(n.gbpToNaira(500));
        
        Converter w = new Converter();
        System.out.println(w.kgToLbs(75.0));
    }
}
