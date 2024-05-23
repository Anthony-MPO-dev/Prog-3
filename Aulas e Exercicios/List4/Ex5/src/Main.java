import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main{

    /*
    5. O código abaixo ilustra um exemplo de try-catch-finally com problema. 
    Corrija o código com (a) capturando a exceção na cláusula finally, (b) 
    uma instrução try/catch contendo uma instrução try/finally e (c) uma instrução 
    try-with-resources com uma cláusula catch.

    BufferedReader in = null;
    
    try {
        in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
        //lê do arquivo
    } catch (IOException ex) {
        System.err.println("Caught IOException: " + ex.getMessage());
    } finally {
        if (in != null) {
            in.close(); //pode lançar uma exceção
        }
    }
    */



    public static void main(String[] args){
    
        BufferedReader in = null;
        Path path = Paths.get("src/texto.txt");
        //a
        
        try {
            in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
            //lê do arquivo
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        } finally {
            try{
                if (in != null) {
                    in.close(); //pode lançar uma exceção
                }
            }catch(IOException c){
                System.err.println("Caught IOException: " + c.getMessage());
            }
        }
        

        //b
        
        try{
            try {
                in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
                //lê do arquivo
            } catch (IOException ex) {
                System.err.println("Caught IOException: " + ex.getMessage());
            } finally {    
                if (in != null) {
                    in.close(); //pode lançar uma exceção
                }    
            }
        }catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }

        //c

        try (BufferedReader in2 = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
            
            //lê do arquivo
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }

    }   
}