import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//Escreva um programa que imprima uma combinação de loteria, 
//escolhendo seis números diferente entre 1 e 60. Para escolher 
//seis números distintos, comece com um ArrayList preenchido 
//com 1 ... 60. Escolha um índice aleatório e remova o elemento.
//Repita o processo seis vezes. Imprima o resultado em ordem 
//crescente.

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        
        //variavel randomica
        Random R = new Random(); 
        //limite da geração randomica
        int limite = 60;
        //recebe valor aleatorio
        int aleatorio;
        
        
        //preenche arraylist com 60 valores
        for(int i = 1; i <= limite; i++){
            numeros.add(i-1, i);
            System.out.println(i);
        }

        //array que recebe os valores sorteados
        int[] valores = new int[6];
        
        for(int i = 0; i < valores.length; i++){
            //genera valores aleatorios de 0 a 60
            aleatorio = R.nextInt(limite);
            //armazena valores sorteados 
            valores[i] = numeros.get(aleatorio);
            //remove o valor sorteado do arraylist
            numeros.remove(aleatorio);
            limite += -1;
        }
        
        Arrays.sort(valores);

        for(int i = 0; i < valores.length ; i++){
            System.out.println(valores[i]);
        }
    }   
}
