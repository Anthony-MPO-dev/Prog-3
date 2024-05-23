import java.util.function.Consumer;

public class TestaExecAdiada {
    //public static void repete(int n, Runnable func){
    public static void repete(int n, Consumer<Integer> func){
        for(int i =1; i<=n; i++){
            //func.run();
            func.accept(i);
        }
    }    
}
