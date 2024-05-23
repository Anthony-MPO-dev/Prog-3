import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Repita o exercício 6 usando ArrayList.

public class Main {
    public static void main(String[] args) {
        String frase = "ola eu sou o irinel";
        ArrayList<String> Ord = new ArrayList<>(List.of(frase.split(" ")));
    
        int tamanho = Ord.size();
        String aux;

        /*
        for (int i=0; i < tamanho; i++){
            for(int j=i+1; j < tamanho; j++){
                if(Ord.get(i).length() > Ord.get(j).length()){
                    aux = Ord.get(i);
                    Ord.set(i,Ord.get(j));
                    Ord.set(j,aux);;
                }
            }
        }
        */
            
        Comparator<Integer> x = (String o1, String o2) -> o1.length() - o2.length();
        Arrays.sort(Ord, x);

        for(int i = 0; i < Ord.size() ; i++){
            System.out.println(Ord.get(i));
        }

    }
}
