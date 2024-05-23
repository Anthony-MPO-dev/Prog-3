import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> meuArray = new ArrayList<>();
        meuArray.add("Anthony Muniz");
        meuArray.add("UFMT CUA");
        meuArray.add("Barra do Garcas");
        meuArray.set(1,null);

        for(String s: meuArray){
           // System.out.println(s);
        }

        meuArray.removeIf(new TesteRemocao());
        //meuArray.removeIf((String s)->s == null);

        for(String s: meuArray){
            System.out.println(s);
        }
    }
}
