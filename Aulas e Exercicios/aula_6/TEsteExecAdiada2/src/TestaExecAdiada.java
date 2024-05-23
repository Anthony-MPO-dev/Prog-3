
import java.util.Comparator;

public class TestaExecAdiada {
    //public static void repete(int n, Runnable func){
   
    public static Comparator<String> geraComparador(int direcao){
        
        return (String s1, String s2) -> (direcao)*s1.compareTo(s2);
        /*
        if(direcao ==1){

        }else if (direcao == -1){

        }
        */
    }    
}
