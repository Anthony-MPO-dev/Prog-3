import java.util.HashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int lim;
        System.out.println("Digite o valor limite para a busca\nOBS: valor > 2");
        lim = ler.nextInt();
        HashSet<Integer> N = Primo(lim);
        ler.close();

        for(Integer l: N){
            System.out.println(l);
        }

    }

    //função que encontra os primos:
    public static HashSet Primo(int limite){
        HashSet<Integer> primos = new HashSet<Integer>(limite-1);

        //coloca valores para a busca de primos
        for(int i = 2; i <= limite; i++){
            primos.add(i);
        }

        //remove valores que não são primos de entro do hashset
        for(int s=2; s <= Math.sqrt(limite); s++){
            if(primos.contains(s)){
                int v = 0;
                while((s*v)<limite){
                    primos.remove(s*(s+v));
                    v++;
                }
            }
        }

        return primos;
        
    }
}
