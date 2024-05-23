import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<String> c1 = TestaExecAdiada.geraComparador(1);
        Comparator<String> c2 =TestaExecAdiada.geraComparador(-1);

       int result1 = c1.compare("linder", "abacaxi");
       System.out.println(result1);
       result1 = c2.compare("linder", "abacaxi");
       System.out.println(result1);
    }
}
