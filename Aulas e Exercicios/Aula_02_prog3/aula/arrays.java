import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrays {
    public static void main(String[]args){
        
        //Criação de Arrays
        int[] meuArray = new int[5];
        
        //Alocação de um valor em espaço 
        //expecifico de um array
        meuArray[4] = 7;

        //Percorrendo Arrays
        for(int i=0; i<5; i++){
            System.out.println(meuArray[i]);
        
        }


        // Trabalhando com Strings e arrays
        String[] nomes = {"Anthony", "Vinicius", "Pedro"};

        for(int i=0; i<3; i++){
            System.out.println(nomes[i]);
        
        }

        //Array Lists sao utilizados para guardar objetos
        //de um tipo
        //ArrayList<Integer> arrayInt = new ArrayList<>();
        ArrayList<String> amigos = new ArrayList<>(List.of("Paulo", "Vinicios", "Deivid", "José"));

        //Adiciona valores em um ArrayList
        amigos.add("Pedro");
        //adiciona depois de
        amigos.add(1,"Laura");
        //imprime arraylist
        System.out.println(amigos);
        //imprime valor expecifico do arraylist
        System.out.println(amigos.get(1));
        //remove valor do arraylist
        amigos.remove(1);
        //muda o ponteiro do valor atual do arraylist para outro
        amigos.set(1,"Vinicius");
        //imprime o tamanho do array
        System.out.println(amigos.size());

        System.out.println(amigos);

    }
}
