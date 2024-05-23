import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class Main {
    /*
     * Escreva um programa que leia todas as palavras de um arquivo txt e imprima 
     * com que frequência cada palavra ocorreu. Use um TreeMap<String, Integer>.
    */
    public static void main(String[] args) throws Exception {
        TreeMap<String, Integer> arvore = readValues("src/file.txt"); // com base em arvores alocadas dinamicamente
    
        for(Integer v : arvore.values()){
            //Imprimindo os valores encontrados
              System.out.println(v);
           }
    }


    public static TreeMap<String,Integer> readValues(String filename){
        TreeMap<String,Integer> words = new TreeMap<>();
        
        
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
        
            String linha = br.readLine();      
            while(linha != null){ 
                
                if(!linha.equals(null)){
                    words.compute(linha.toLowerCase(), (S,I)-> I==null? 1 : I+1);
                }
                linha = br.readLine();
            } 
            
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        } 

        return words;

    } 
}
