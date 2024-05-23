import java.util.Scanner;
//Escreva um programa que leia uma matriz bidimensional de
//inteiros e determina se é um quadrado mágico. Aceite uma 
//linha de entrada por vez com os valores separados em inteiros
// individuais. Um quadrado mágico é uma matriz onde a soma de 
//todas as linhas, todas as colunas, e todas as diagonais tem os
//mesmo valor.


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int T; // tamanho da matriz TxT
        int scan; // vai receber os valores a serem inseridos na matriz 
        int contador = 0; // variavel auxiliar de impressão da matriz
        int soma =0,valorBase =0; // soma e valorBase seram as variaveis utilizadas durante a verificação
        boolean verificador = true; // vai receber o resultado da verificação se a matriz é um quadrado magico

        //Pede o tamanho da matriz
        System.out.println("Digite um valor N para o tamanho da matriz NxN");
        T = leitor.nextInt();

        int[][] matriz = new int[T][T]; //cria a matriz
       
        
        //Preenche a matriz
        for(int lin = 0; lin < T; lin++){
            for(int col = 0; col < T; col++) {
                
                System.out.println("Digite o "+(contador+1)+"º o um valor para a linha: "+(lin+1)+" e coluna: "+(col+1));
                
                scan = leitor.nextInt();
                matriz[lin][col] = scan;
                contador ++;

                if (contador == T){
                    contador = 0;
                }
            }
        }

        //imprime a matriz
        System.out.print("\n\nMatriz: \n");
        for(int lin = 0; lin < T; lin++){
            for(int col = 0; col < T; col++) {
                System.out.print("["+matriz[lin][col]+"] ");
                contador ++;
            }
            if (contador == T){
                System.out.println("");
                contador = 0;
            }    
        }    

        //Armazena soma da diagonal principal
        for(int lin = 0; lin < T; lin++){
            soma += matriz[lin][lin]; 
            valorBase = soma;
            
        }
        System.out.println("\nValor utilizado para base do calculo: "+valorBase+"\n\n");

        // Verifica diagonal secundaria
        soma = 0;
        for(int lin = 0; lin < T; lin++){
            soma += matriz[lin][T - 1 - lin];
            
        }
        if(valorBase != soma){
            verificador = false;
            System.out.println("Diagonal secundária é diferente!\n");
        }

        // Verifica as linhas da matriz
        for(int lin = 0; lin < T; lin++){
            soma = 0;
            for(int col = 0;  col < T; col++){
                soma += matriz[lin][col];
            }
            if(valorBase != soma){
                verificador = false;
                System.out.println("A linha "+lin+" é diferente!\n");
            }
        }
    
        //Verifica as colunas da matriz
        for(int col  = 0; col < T; col++){
            soma = 0;
            for(int lin = 0; lin < T; lin++){
                soma += matriz[lin][col];
            }

            if(valorBase != soma){
                verificador = false;
                System.out.println("A coluna "+col+" é diferente!\n");
            }
        }
        
        //Informa se a matriz é um quadrado magico ou não
        if(verificador){
            System.out.println("Matriz é um Quadrado Magico\n");
        }else{
            System.out.println("Matriz não é um Quadrado Magico\n");
        }    
    }             
}

        
            

