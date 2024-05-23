//Faça um programa que extraia as palavras contidas em uma 
//String e coloque-as em um Array de Strings. Em seguida o 
//programa deve percorrer o Array mostrando as palavras em 
//ordem de tamanho. Primeiro as palavras com 1 caracter, depois
// as palavras com 2 caracteres, e assim por diante.
public class Main {
    public static void main(String[] args) {
        String frase = "ola eu sou o irinel";
        String[] fraseArray = frase.split(" ");
      

        
        int tamanho = fraseArray.length;
        String aux;

        
        for (int i=0; i < tamanho; i++){
            for(int j=i+1; j < tamanho; j++){
                if(fraseArray[i].length() > fraseArray[j].length()){
                    aux = fraseArray[i];
                    fraseArray[i] = fraseArray[j];
                    fraseArray[j] = aux;
                }
            }
        }
            
        

        for(int i = 0; i < fraseArray.length; i++){
            System.out.println(fraseArray[i]);
        }
    }

}
