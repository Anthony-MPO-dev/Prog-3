import java.util.Scanner;


//A série de Fibonacci é dada por 1, 1, 2, 3, 5, 8, 13, 21...
//Faça um programa que calcule todos os números da série de 
//Fibonacci menores ou iguais a n, onde n é um número 
//inteiro maior que 1, fornecido pelo usuário.
public class Main{
  public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
      int scan = leitor.nextInt();
      int fibonacci = 1;
      int x=1, y=0;

      if (scan >=1){
          for(int i=0; i <= scan; i++){
              System.out.println(fibonacci);
              fibonacci = x + y;
              y = x;
              x = fibonacci;
              
              
          }
      }else{
        System.out.println("Erro o numero fornecido deve ser maior que 0");
      }
  }
}
