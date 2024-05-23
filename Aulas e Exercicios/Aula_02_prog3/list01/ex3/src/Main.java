import java.util.Scanner;

//Escreva um programa que leia três inteiros e imprima o maior. 

public class Main{
  public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
      int[] n = new int[3];
      int maior=0;

      for (int i = 0; i < 3; i++) {
        n[i] = leitor.nextInt();
      }
      maior = n[0];
      for (int i = 1; i < 3; i++) {
        if (n[i] > maior) {
            maior = n[i];
        }
    }
    System.out.println("Maior = "+ maior);

      
  }
}


