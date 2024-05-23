public class Main {
  
  //Recupere o primeiro, segundo e terceiro 
  //byte do inteiro 235937. Use operadores 
  //lógicos bit a bit e operadores de 
  //deslocamento para resolver o exercício. 
  //Para conferência 235937 = 111001100110100001.
  public static void main(String[] args) {
        int valor = 235937;

        //desloca os bits da variavel valor 
        //em 16 bits
        int a = valor>>16;
        //desloca os bits da variavel valor 
        //em 8 bits
        int b = valor>>8;
        
        //recupera os 8 primeiros bits do valor fornecido
        valor = valor & 255;
        System.out.println(valor);

        //recupera os 8 primeiros bits do valor deslocado 8 bits
        b = b & 255;
        System.out.println(b);

          //recupera os 8 primeiros bits do valor deslocado 16 bits
        a = a & 255;
        System.out.println(a);
    }
}
