import java.util.Arrays;

public class copia_e_clone {
    public static void main(String[]args){
        
        int[] primos = {1,2,3,4,5};
        //Clone
        int[] y = primos;
        //Copia sem vinculoou ligação
        int[]  x = Arrays.copyOf(primos, primos.length);
        
        for(int i=0; i<5; i++){
            System.out.print(primos[i]);
        }
        System.out.print("\n");

        Arrays.fill(y,5);
        x[0] = 8;

        for(int i=0; i<5; i++){
            System.out.print(primos[i]);
        }
        System.out.print("\n");

        for(int i=0; i<5; i++){
            System.out.print(x[i]);
    
        }
        System.out.print("\n");
    }
}