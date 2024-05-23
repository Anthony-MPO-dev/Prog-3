import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {

    /*
     * Converta todas as strings de  um ArrayList<String> para letras maiúscula. 
     * Faça isso com 
     * (a) um iterador, 
     * (b) um loop sobre os valores de índice 
     * (c) o método replaceAll.
     * 
    */
    public static void main(String[] args) throws Exception {
        ArrayList<String> words = new ArrayList<>(List.of("Caderno", "Lancheira", "Apostilas", "Canetas", "Lapis"));

        // a
        Iterator<String> iterador = words.iterator();

        int i =0;
        while (iterador.hasNext()) {
            words.set(i, iterador.next().toUpperCase());  
            i++;         
        }

        for (String w : words) {
            System.out.println(w);
        }
        System.out.println("\n");

        //b
        ArrayList<String> words2 = new ArrayList<>(List.of("up", "down", "left", "right", "oi"));
        

        for(int j = 0; j < words2.size(); j++){
            words2.set(j, words2.get(j).toUpperCase());  

        }

        for (String w2 : words2) {
            System.out.println(w2);
        }

        System.out.println("\n");

        //c
        ArrayList<String> words3 = new ArrayList<>(List.of("go", "back", "never", "ever", "size", "build"));
           
        words3.replaceAll(w -> w.toUpperCase());    

        for (String w3 : words3) {
            System.out.println(w3);
        }
    }
}
