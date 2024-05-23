import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main{

        /*
        Implemente um método que contenha o código a seguir, porém sem usar try-with-resource:   
       try (Scanner in = new Scanner(Paths.get("words.txt"));
        PrintWriter out = new PrintWriter("output.txt")) 
        {
           while (in.hasNext())
             out.println(in.next().toLowerCase())
        }
        Em vez disso, use apenas cláusulas catch. Certifique-se de fechar ambos os objetos,      
            desde que tenham sido devidamente construídos. Você precisa considerar as seguintes   
            condições:
        • O construtor Scanner lança uma exceção.
        • O construtor PrintWriter lança uma exceção.
        • hasNext(), next() ou println() lançam uma exceção.
        • out.close() lança uma exceção.
        • in.close() lança uma exceção.
    */

    public static void main(String[] args){
        try{
            Scanner in = new Scanner(Paths.get("src/words.txt"));
            PrintWriter out = new PrintWriter("src/output.txt"); 
            try {
                
                while (in.hasNext())
                    out.println(in.next().toLowerCase());

            }finally{
                in.close();
                out.close();
            }
        }catch(FileNotFoundException ex){
                System.out.println("Arquivo não encontrado: "+ex.getMessage());
                return;
        }catch(IOException ex){
            System.out.println(ex.getMessage());
            return;
        }
     
        
    }
}