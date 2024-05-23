import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Entrada<Integer, String> e1 = new Entrada<>(1, "Prog3");
        Entrada<String, Double> e2 = new Entrada("2", 10.0f);

        System.out.println("e1 chave: "+e1.getChave());
        System.out.println("e1 valor: "+e1.getValor());

        System.out.println("e2 chave: "+e2.getChave());
        System.out.println("e2 valor: "+e2.getValor());

        // ---------------------------------------------

        String[] meuArray = {"Ola", "UFMT", "Anthony", "2020"};
        System.out.println(Arrays.toString(meuArray));
        troca(meuArray, 1,3);
        System.out.println(Arrays.toString(meuArray));

        Integer[] meuArray2 = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(meuArray2));
        troca(meuArray2, 1,3);
        System.out.println(Arrays.toString(meuArray2));
        

    }

    public static<T> void troca(T[] arr, int i, int j){
        T aux = arr[i];
        arr[i] = arr[j];
        arr[j] = aux;
    }

}
