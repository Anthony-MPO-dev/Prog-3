import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> texto = new ArrayList<>(List.of("Prog 3", "Java", "Exceptions", "Cheked Exception"));
        gravaArquivo("registro.txt", texto);
        String linha = lePrimeiraLinha("registro.txt");
        System.out.println("Valor recuperado: "+ linha);
        
    }

    public static void gravaArquivo(String path, ArrayList<String> texto) throws FileNotFoundException{
        PrintWriter out = null;

        try{
            out = new PrintWriter(path);
            for(String linha: texto)
                out.println(linha);
            out.close();
        } catch(FileNotFoundException ex){
            System.out.println("Erro gravando no arquivo");
        }finally{//se rodar e estiver tudo bem - mesmo que ocorra um erro ele ira executar este finally e tratar o problema
            out.close();
        }
    }

    public static String lePrimeiraLinha(String path){
        
        try(FileReader fr = new FileReader(path); 
            BufferedReader br = new BufferedReader(fr);){//befferiza e realiza a leitura            
            
            return br.readLine();
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
            return null;
        }catch(IOException ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

}
