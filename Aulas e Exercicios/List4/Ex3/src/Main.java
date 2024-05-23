import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main{

    /*
     Escreva um programa que chame o método anterior e imprima o resultado.
     Capture as exceções e forneça feedback ao usuário sobre quaisquer condições de erro. 
    */

    public static void main(String[] args) throws FileNotFoundException{

        try{

            double n = sumOfValues("src/file.txt");
            System.out.println("Total: "+n);
        
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

    public static double sumOfValues(String filename) throws FileNotFoundException, NumberFormatException, IOException{
        double total =0;
        ArrayList<Double> value = readValues(filename);
        BufferedWriter escritor = new BufferedWriter(new FileWriter(filename, true));   
            for(Double f: value){
                System.out.println(f);
                total += f; 
            }
        String str = Double.toString(total);
        escritor.append("\n"+str);
        escritor.close();

        return total;
    }
}
