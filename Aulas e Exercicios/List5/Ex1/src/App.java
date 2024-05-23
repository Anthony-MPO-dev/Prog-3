import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> Nomes = new ArrayList<>(List.of("Paulo", "Divino", "Paula"));

        ArrayList<String> NEW_1 = Copia(Nomes);

        ArrayList<Integer> Numeros = new ArrayList<>(List.of(4, 8, 40));

        ArrayList<Integer> NEW_2 = Copia2(Numeros);

        print(NEW_1);

        print(NEW_2);

    }


    public static <E> ArrayList<E> Copia(ArrayList<? extends E> origin){
            
        ArrayList<E> copy = new ArrayList<>();
            
            copy.addAll((Collection<? extends E>) origin);   

            return copy;
        }

    public static <E> ArrayList<E> Copia2(ArrayList<? super E> origin){
        ArrayList<E> copy = new ArrayList<>();

        for(int i =0; i < origin.size(); i++){
            copy.add((E) origin.get(i));
        }     

        return copy;
    }

    public static <E> void print(ArrayList<? super E> a){ 
        System.out.println("\n");       
        for(int i =0; i < a.size(); i++){
            System.out.println(a.get(i));
        }
    }
    
}
