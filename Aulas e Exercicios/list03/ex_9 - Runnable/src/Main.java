public class Main {
    public static void main(String[] args) {

        Runnable obj1 = () -> System.out.println("Ola Universo 1");            

        Runnable obj2 = () -> System.out.println("Ola Universo 2"); 

        Runnable obj3 =  () -> System.out.println("Ola Universo 3"); 
        
        //Exemplo sem Lambda
        Runnable obj4 = new Runnable() {

            @Override
            public void run() {
                System.out.println("Ola Universo 4");
                
            }
            
        };

        
        Runnable[] vet = new Runnable[3];
        vet[0] = obj1;
        vet[1] = obj2;
        vet[2] = obj3;

        Runnable obj4 = executa(vet);
        obj4.run();

    }

    public static Runnable executa(Runnable[] lista){

        return ()->{
            for(int i=0; i<lista.length; i++){
                lista[i].run();
            }
        };

        /*class Auxiliar implements Runnable{

            @Override
            public void run() {
                for(int i =0; i < lista.length; i++){
                    lista[i].run();
                }
                
            }
        }
        
        Auxiliar aux = new Auxiliar();
        
        return aux;
        */

    }
}
