import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Main{
    /*
     Escreva o método public ArrayList<Double> readValues(String filename) 
     throws... que lê um arquivo contendo números em ponto flutuante. Lance 
     exceções apropriadas se o arquivo não poder ser aberto ou se alguma das 
     entradas não forem números em ponto flutuante. Para ler o arquivo use as 
     classes FileReader e BufferedReader.
    */

    public static void main(String[] args) throws FileNotFoundException{

        try{

            ArrayList<Double> value = readValues("src/file.txt");
            
            for(Double f: value){
                System.out.println(f);
            }
        
        }catch(FileNotFoundException ex){
            System.out.println("Arquivo não encontrado: "+ex.getMessage());
            return;
        }catch(NumberFormatException ex){
            System.out.println("String não é convertivel para double: "+ex.getMessage());
            return;
        }catch(IOException ex){
            System.out.println(ex.getMessage());
            return;
        }

        
        
        
    }

    public static ArrayList<Double> readValues(String filename) throws FileNotFoundException, NumberFormatException, IOException{
        ArrayList<Double> values = new ArrayList<>();
        
        
        BufferedReader br = new BufferedReader(new FileReader(filename));
        //String text;   
        String linha = br.readLine();      
        while(linha != null){
            double n = Double.parseDouble(linha);  
            values.add(n);
            linha = br.readLine();

        } 
      
        br.close();
        return values;
    }
}
